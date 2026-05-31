# Floatkit 🚀

**Floatkit** is a high-performance, multitasking productivity suite for Android. It provides a non-intrusive floating sidebar (overlay) that stays accessible over any app, allowing users to manage notes, tasks, clipboard items, and voice memos without ever leaving their current activity.

## 🌟 Key Features

*   **Global Search (Core Feature):** Instantly search through your local files, media, contacts, calendar, notes, tasks, and the web—all from a single unified floating search bar.
*   **Floating Sidebar Dock:** A minimal, draggable dock that expands into a full productivity panel.
*   **Quick Notes:** Create and manage rich text notes instantly.
*   **Task Manager:** A built-in To-Do list to track your progress across different apps.
*   **Manual Clipboard Manager:** Save and organize important copied text for quick access later.
*   **Voice Memos:** Record high-quality audio notes (44.1 kHz) while multitasking.
*   **Screenshot Access:** Quickly view and manage recent captures directly from the panel.
*   **App Launcher:** Instantly search, launch, and pin your favorite apps to the sidebar dock. Supports drag-and-drop reordering and edit mode for managing pinned apps.
*   **Tools Panel:** Quick system controls including media volume and display brightness sliders, instant screenshot capture, and power menu access—all without leaving your current app.
*   **Privacy-First:** Your privacy is our priority. All your notes, tasks, recordings, and settings are stored locally on your device. We never collect or transmit your data to external servers, though features like Web Search may require an internet connection.
*   **Premium Ready:** Integrated with Google Play Billing for subscriptions and lifetime unlocks.

## 🛠️ Tech Stack

*   **Language:** Kotlin
*   **UI Framework:** Jetpack Compose (100%)
*   **Database:** Room Persistence Library (Offline-first)
*   **Local Storage:** EncryptedSharedPreferences (Security) & DataStore (Preferences)
*   **Image Loading:** Coil
*   **Billing:** Google Play Billing Library 6.1.0
*   **Updates:** Google Play In-App Updates API
*   **Design:** Material 3 (M3) with Adaptive Icon support

## 🔒 Security & Privacy

Floatkit is built with security as a core mandate:
*   **Anti-Tamper:** Validates the app's SHA-256 signature against the Google Play production key to prevent cloning.
*   **Environment Check:** Detects root, emulators, debuggers, and Xposed hooks to protect premium features and user data.
*   **Offline Data:** All notes, tasks, audio files, pinned apps, and system settings are stored in the app's private internal storage.

## 🚀 Getting Started

1.  **Clone the Repo:** `git clone https://github.com/Hadi99K/Floatkit.git`
2.  **Open in Android Studio:** Use the latest version of Hedgehog or newer.
3.  **Build Variant:** Switch to `release` to test the full security suite (requires your own Keystore).
4.  **Google Play Setup:** Update `EXPECTED_SIGNATURE_HASH` in `app/build.gradle.kts` with your specific Play Console hash.

## 📄 License

Copyright © 2026 Fari Ji. All rights reserved.

---
**Contact Support:** fari.dev.contact@gmail.com
