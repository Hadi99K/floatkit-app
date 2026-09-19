package com.faridev.floatkit.ui.settings

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

private val Context.sidebarToolsDataStore by preferencesDataStore(name = "sidebar_tools_prefs")

private val sidebarToolsOrderKey = stringPreferencesKey("sidebar_tools_order")
private val sidebarToolsEnabledKey = stringPreferencesKey("sidebar_tools_enabled")

@Composable
fun <T> rememberSidebarToolsState(
    default: List<T>,
    id: (T) -> String,
    enabled: (T) -> Boolean,
    updateEnabled: (T, Boolean) -> T
): MutableState<List<T>> {
    val context = LocalContext.current
    val dataStore = context.sidebarToolsDataStore
    var loaded by remember { mutableStateOf(false) }
    var tools by remember { mutableStateOf(default) }

    LaunchedEffect(Unit) {
        try {
            val prefs = dataStore.data.first()
            val savedOrder = prefs[sidebarToolsOrderKey]?.split(",")?.filter { it.isNotBlank() } ?: emptyList()
            val savedEnabled = prefs[sidebarToolsEnabledKey]?.split(",")?.filter { it.isNotBlank() } ?: emptyList()
            val enabledIds = savedEnabled.toSet()

            if (savedOrder.isEmpty() && savedEnabled.isEmpty()) {
                loaded = true
                return@LaunchedEffect
            }

            val ordered = savedOrder.mapNotNull { itemId ->
                default.firstOrNull { id(it) == itemId }
                    ?.let { updateEnabled(it, itemId in enabledIds) }
            }
            val remaining = default.filter { id(it) !in savedOrder }
                .map { updateEnabled(it, id(it) in enabledIds) }

            tools = ordered + remaining
            loaded = true
        } catch (_: Exception) {
            loaded = true
        }
    }

    LaunchedEffect(tools) {
        if (!loaded) return@LaunchedEffect

        try {
            dataStore.edit {
                put(sidebarToolsOrderKey, tools.joinToString(",") { id(it) })
                put(sidebarToolsEnabledKey, tools.filter { enabled(it) }.joinToString(",") { id(it) })
            }
        } catch (_: Exception) {
        }
    }

    return tools
}
