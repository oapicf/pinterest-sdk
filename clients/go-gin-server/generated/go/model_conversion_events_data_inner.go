/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type ConversionEventsDataInner struct {

	// <p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p> 
	EventName string `json:"event_name"`

	// <p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p> 
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

	UserData ConversionEventsUserData `json:"user_data"`

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
