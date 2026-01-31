package models

type ConversionEventsDataInner struct {

	// <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline`
	ActionSource string `json:"action_source"`

	// The app store app ID.
	AppId *string `json:"app_id,omitempty"`

	AppInfo ConversionEventAppInfo `json:"app_info,omitempty"`

	// Name of the app.
	AppName *string `json:"app_name,omitempty"`

	// Version of the app.
	AppVersion *string `json:"app_version,omitempty"`

	CustomData ConversionEventsDataInnerCustomData `json:"custom_data,omitempty"`

	// Brand of the user device.
	DeviceBrand *string `json:"device_brand,omitempty"`

	// User device's mobile carrier.
	DeviceCarrier *string `json:"device_carrier,omitempty"`

	DeviceInfo ConversionEventDeviceInfo `json:"device_info,omitempty"`

	// Model of the user device.
	DeviceModel *string `json:"device_model,omitempty"`

	// Type of the user device.
	DeviceType *string `json:"device_type,omitempty"`

	// A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
	EventId string `json:"event_id"`

	// <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video`
	EventName string `json:"event_name"`

	// URL of the web conversion event.
	EventSourceUrl *string `json:"event_source_url,omitempty"`

	// The time when the event happened. Unix timestamp in seconds.
	EventTime int64 `json:"event_time"`

	// Two-character ISO-639-1 language code indicating the user's language.
	Language *string `json:"language,omitempty"`

	// When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
	OptOut bool `json:"opt_out,omitempty"`

	// Version of the device operating system.
	OsVersion *string `json:"os_version,omitempty"`

	// The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
	PartnerName *string `json:"partner_name,omitempty"`

	UserData ConversionEventsUserData `json:"user_data"`

	// Whether the event occurred when the user device was connected to wifi.
	Wifi bool `json:"wifi,omitempty"`
}
