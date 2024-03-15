package models

type ConversionEventsDataInner struct {

	// The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. <li><code>add_to_cart</code> <li><code>checkout</code> <li><code>custom</code> <li><code>lead</code> <li><code>page_visit</code> <li><code>search</code> <li><code>signup</code> <li><code>view_category</code> <li><code>watch_video</code>
	EventName string `json:"event_name"`

	// The source indicating where the conversion event occurred. <li><code>app_android</code> <li><code>app_ios</code> <li><code>web</code> <li><code>offline</code>
	ActionSource string `json:"action_source"`

	// The time when the event happened. Unix timestamp in seconds.
	EventTime int64 `json:"event_time"`

	// A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
	EventId string `json:"event_id"`

	// URL of the web conversion event.
	EventSourceUrl *string `json:"event_source_url,omitempty"`

	// When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
	OptOut bool `json:"opt_out,omitempty"`

	// The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
	PartnerName *string `json:"partner_name,omitempty"`

	UserData *ConversionEventsUserData `json:"user_data"`

	CustomData ConversionEventsDataInnerCustomData `json:"custom_data,omitempty"`

	// The app store app ID.
	AppId *string `json:"app_id,omitempty"`

	// Name of the app.
	AppName *string `json:"app_name,omitempty"`

	// Version of the app.
	AppVersion *string `json:"app_version,omitempty"`

	// Brand of the user device.
	DeviceBrand *string `json:"device_brand,omitempty"`

	// User device's mobile carrier.
	DeviceCarrier *string `json:"device_carrier,omitempty"`

	// Model of the user device.
	DeviceModel *string `json:"device_model,omitempty"`

	// Type of the user device.
	DeviceType *string `json:"device_type,omitempty"`

	// Version of the device operating system.
	OsVersion *string `json:"os_version,omitempty"`

	// Whether the event occurred when the user device was connected to wifi.
	Wifi bool `json:"wifi,omitempty"`

	// Two-character ISO-639-1 language code indicating the user's language.
	Language *string `json:"language,omitempty"`
}
