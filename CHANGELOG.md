# Floatkit Changelog

- Latest Production Version: v1.3.6 (20)

## [1.3.6] - 2026-06-07
### Fixed
- **Purchase Screen Crash Fix:** Resolved an `AEADBadTagException` crash caused by an invalidated or corrupted Android Keystore. The app now detects the corrupt encrypted preferences file, clears it automatically, and recovers gracefully without crashing.
- **Backup Import Instructions:** Added a clear requirements notice in the Restore Data screen informing users to grant all permissions and start the Floatkit service before importing a backup.

## [1.3.5] - 2026-06-06
### Added
- **Category Management System:** Create color-coded categories from a Material palette and assign them across Tasks, Notes, Clipboard items, and Voice Notes. A horizontally scrollable `CategoryHeaderRow` with an expanding pill animation is now available in all major tool panels, and newly created items are automatically tagged to the active category.
- **Quick Settings Tile:** Start and stop Floatkit directly from the notification shade via a native Quick Settings tile that live-syncs with the service state.
- **Stop Service Toggle:** The main home screen button is now a full toggle — tap to start, tap again to stop.
- **Changelog Link:** A "Changelog" entry has been added to Settings → About, pointing to the public release history on GitHub.

### Fixed
- Added "Starting Floatkit..." and "Stopping Floatkit..." toasts on tile click to clarify the brief startup/shutdown delay.

## [1.3.4] - 2026-06-03
### Fixed
- Resolved a crash issue in the App Launcher related to icon rendering.

### Changed
- Simplified the Premium Pricing screen to display only product tier names.

## [1.3.3] - 2026-06-01
### Added
- Fully implemented Backup & Restore system for app data and media files.
- Introduced automated daily background backups for Premium users.
- Added social media links (X, Threads, Medium) to the About section in Settings.

### Fixed
- Fixed Scoped Storage constraints for Global Search on Android 11+ devices.

## [1.3.2]
### Added
- Global Search panel integration with Installed Apps, Files/Media, Web Search, Settings, App Shortcuts, and Floatkit Data.
- Expanded App Launcher features including App List, Search, Edit List, and reordering.
- Added System Tools: Volume control and Brightness control.
