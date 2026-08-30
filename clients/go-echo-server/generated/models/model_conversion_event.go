package models

type ConversionEvent string

// List of ConversionEvent
const (
	PAGE_VISIT ConversionEvent = "PAGE_VISIT"
	SIGNUP ConversionEvent = "SIGNUP"
	CHECKOUT ConversionEvent = "CHECKOUT"
	CUSTOM ConversionEvent = "CUSTOM"
	VIEW_CATEGORY ConversionEvent = "VIEW_CATEGORY"
	SEARCH ConversionEvent = "SEARCH"
	ADD_TO_CART ConversionEvent = "ADD_TO_CART"
	WATCH_VIDEO ConversionEvent = "WATCH_VIDEO"
	LEAD ConversionEvent = "LEAD"
	APP_INSTALL ConversionEvent = "APP_INSTALL"
)
