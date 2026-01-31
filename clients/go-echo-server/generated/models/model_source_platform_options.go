package models
// SourcePlatformOptions : List of source platforms for a conversion event.
type SourcePlatformOptions string

// List of SourcePlatformOptions
const (
	WEB SourcePlatformOptions = "WEB"
	MOBILE SourcePlatformOptions = "MOBILE"
	MOBILE_ANDROID SourcePlatformOptions = "MOBILE_ANDROID"
	MOBILE_IOS SourcePlatformOptions = "MOBILE_IOS"
	OFFLINE SourcePlatformOptions = "OFFLINE"
	PINTEREST_WEB SourcePlatformOptions = "PINTEREST_WEB"
	PINTEREST_ANDROID SourcePlatformOptions = "PINTEREST_ANDROID"
	PINTEREST_IOS SourcePlatformOptions = "PINTEREST_IOS"
	POINT_OF_SALE SourcePlatformOptions = "POINT_OF_SALE"
)
