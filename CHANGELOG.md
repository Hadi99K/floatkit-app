# Floatkit Changelog

- Latest Production Version: v1.7.1 (30)

## [1.7.1] - 2026-10-06
### Added
- **Minimal On-Demand Permissions:** Floatkit now only requires the Overlay permission (`SYSTEM_ALERT_WINDOW`) to start. Microphone, Storage, and Notification permissions are requested on-demand only when accessing corresponding tools, removing all upfront permission blocking waterfalls.
- **4-Way Sidebar Dock Positioning:** Configure the expanded dock position to Left, Right, Top, or Bottom in Customization settings, while the collapsed pill stays anchored on your screen's side edge.

### Fixed
- **Fatal Foreground Service Crash:**
Fixed app crashing on android 12+ due to strict background restrictions.

## [1.7.0] - 2026-10-05
### Added
- **Feedback & Feature Requests:** In-app community feedback board in Settings powered by Fedo.
  - Suggest new features and improvements.
  - Report bugs directly inside the companion app.
  - Upvote community ideas to shape the Floatkit roadmap (Planned, In Progress, Shipped).
  - 100% free and open to all users with anonymous privacy protection (no account or login required).
  - Clean offline state and direct email fallback if disconnected.
- **App Launcher Pinned Apps Tab:** Added a persistent segmented tab bar in the App Launcher overlay to easily switch between "All Apps" and "Pinned".

### Fixed
- **Global Search Auto-Keyboard Toggle Persistence:** Fixed an issue where the "Auto-open Keyboard" toggle in Global Search settings did not persist on back-navigation and failed to hide the keyboard when disabled.
- **Sidebar Tools Customization Toggles Persistence:** Fixed a bug where toggling visibility of sidebar tools failed to persist or reverted when navigating away.

## [1.6.0] - 2026-09-11
### Added
- **Mini Games Panel:** An overlay arcade hub integrated directly into the floating sidebar with four games:
  - **Floaty:** Flap through dynamic pylons with (100% Free to Play).
  - **Stacker (Tower Drop):** Precision tower stacking.
  - **Retro Neon Snake:** Classic neon grid snake .
  - **Lane Racer:** High-speed 3-lane highway dodge.

## [1.5.0] - 2026-08-30
### Added
- **Quick Reminders Panel:** A brand-new overlay panel for setting time-sensitive reminders directly from the floating sidebar without interrupting your current app.

## [1.4.1] - 2026-08-29
### Added
- **Clipboard Auto-Save:** Automated clipboard history capturing with configurable retention settings.
- **Sidebar Tools Management:** Dedicated settings screen to reorder, enable, and disable sidebar tools with reordering ability.

## [1.4.0] - 2026-08-01
### Added
- **Bookmarks Manager:** A brand new native panel for organizing your favorite web links into custom-colored folders directly within the Floatkit overlay.
- **System Share Integration:** Save links to Floatkit effortlessly from any other app via the native Android Share menu.
- **Built-in Browser:** Tap "Open in Floatkit" on a bookmark to quickly view the webpage inside Floatkit's integrated WebView without leaving your current app.

## [1.3.10] - 2026-07-25
### Changed
- **Billing Library Update:** Upgraded Google Play Billing Library to v9.1.0 for better reliability and restricted device mode support.

## [1.3.9] - 2026-07-19
### Fixed
- **One-Time Product Offers:** Fixed a small error in the purchase page.

## [1.3.8] - 2026-07-16
### Fixed
- **Discount Purchase Option:** Resolved an issue where the payment page showed the original price product rather than the discounted launch offer.

## [1.3.7] - 2026-07-06
### Added
- **Customization Settings Screen:** Rebranded "Appearance & Behavior" into a dedicated screen with Sidebar Pill, Panel Layout, Reset, and Touch Area sections.
- **Sidebar Pill Customization:** Option to change the color of pill, adjust width (4–12dp), height (40–140dp), edge spacing (0–20dp), opacity (0.2–1.0), and touch area padding (0–24dp).
- **Panel Layout Settings:** Control panel background opacity (0.6–1.0), size preset (Compact / Standard / Expanded), and idle opacity (0.3–1.0) when the overlay is collapsed.
- **Touch Area Padding:** Manually expand the pill touch target up to 24dp for easier activation.

### Fixed
- **Category Color Selection:** Fixed a small bug for the category color selection.

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
