package models
// AdvertiserDefinedEventMappingType : Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
type AdvertiserDefinedEventMappingType string

// List of AdvertiserDefinedEventMappingType
const (
	SIGNUP AdvertiserDefinedEventMappingType = "SIGNUP"
	ADD_TO_CART AdvertiserDefinedEventMappingType = "ADD_TO_CART"
	LEAD AdvertiserDefinedEventMappingType = "LEAD"
	CHECKOUT AdvertiserDefinedEventMappingType = "CHECKOUT"
	SUBSCRIBE AdvertiserDefinedEventMappingType = "SUBSCRIBE"
	ADD_TO_WISHLIST AdvertiserDefinedEventMappingType = "ADD_TO_WISHLIST"
	ADD_PAYMENT_INFO AdvertiserDefinedEventMappingType = "ADD_PAYMENT_INFO"
	INITIATE_CHECKOUT AdvertiserDefinedEventMappingType = "INITIATE_CHECKOUT"
	CONTACT AdvertiserDefinedEventMappingType = "CONTACT"
	CUSTOMIZE_PRODUCT AdvertiserDefinedEventMappingType = "CUSTOMIZE_PRODUCT"
	FIND_LOCATION AdvertiserDefinedEventMappingType = "FIND_LOCATION"
	SCHEDULE AdvertiserDefinedEventMappingType = "SCHEDULE"
	SUBMIT_APPLICATION AdvertiserDefinedEventMappingType = "SUBMIT_APPLICATION"
	START_TRIAL AdvertiserDefinedEventMappingType = "START_TRIAL"
	PAGE_VISIT AdvertiserDefinedEventMappingType = "PAGE_VISIT"
	VIEW_CATEGORY AdvertiserDefinedEventMappingType = "VIEW_CATEGORY"
	VIEW_CONTENT AdvertiserDefinedEventMappingType = "VIEW_CONTENT"
	SEARCH AdvertiserDefinedEventMappingType = "SEARCH"
	WATCH_VIDEO AdvertiserDefinedEventMappingType = "WATCH_VIDEO"
)
