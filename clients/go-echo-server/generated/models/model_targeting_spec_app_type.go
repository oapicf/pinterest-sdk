package models

type TargetingSpecAppType string

// List of TargetingSpecAppType
const (
	ANDROID_MOBILE TargetingSpecAppType = "android_mobile"
	ANDROID_TABLET TargetingSpecAppType = "android_tablet"
	IPAD TargetingSpecAppType = "ipad"
	IPHONE TargetingSpecAppType = "iphone"
	WEB TargetingSpecAppType = "web"
	WEB_MOBILE TargetingSpecAppType = "web_mobile"
)
