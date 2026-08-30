package models
// MobileAppPlatform : [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an `APP_INSTALL` campaign.
type MobileAppPlatform string

// List of MobileAppPlatform
const (
	IOS MobileAppPlatform = "IOS"
	ANDROID MobileAppPlatform = "ANDROID"
)
