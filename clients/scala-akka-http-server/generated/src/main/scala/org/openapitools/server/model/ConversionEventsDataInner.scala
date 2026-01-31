package org.openapitools.server.model


/**
 * @param actionSource <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline` for example: ''app_ios''
 * @param appId The app store app ID. for example: ''429047995''
 * @param appInfo  for example: ''null''
 * @param appName Name of the app. for example: ''Pinterest''
 * @param appVersion Version of the app. for example: ''7.9''
 * @param customData  for example: ''null''
 * @param deviceBrand Brand of the user device. for example: ''Apple''
 * @param deviceCarrier User device's mobile carrier. for example: ''T-Mobile''
 * @param deviceInfo  for example: ''null''
 * @param deviceModel Model of the user device. for example: ''iPhone X''
 * @param deviceType Type of the user device. for example: ''iPhone''
 * @param eventId A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. for example: ''eventId0001''
 * @param eventName <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video` for example: ''checkout''
 * @param eventSourceUrl URL of the web conversion event. for example: ''https://www.my-clothing-shop.org/''
 * @param eventTime The time when the event happened. Unix timestamp in seconds. for example: ''1451431341''
 * @param language Two-character ISO-639-1 language code indicating the user's language. for example: ''en''
 * @param optOut When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. for example: ''false''
 * @param osVersion Version of the device operating system. for example: ''12.1.4''
 * @param partnerName The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’ for example: ''ss-partnername''
 * @param userData  for example: ''null''
 * @param wifi Whether the event occurred when the user device was connected to wifi. for example: ''false''
*/
final case class ConversionEventsDataInner (
  actionSource: String,
  appId: Option[String] = None,
  appInfo: Option[ConversionEventAppInfo] = None,
  appName: Option[String] = None,
  appVersion: Option[String] = None,
  customData: Option[ConversionEventsDataInnerCustomData] = None,
  deviceBrand: Option[String] = None,
  deviceCarrier: Option[String] = None,
  deviceInfo: Option[ConversionEventDeviceInfo] = None,
  deviceModel: Option[String] = None,
  deviceType: Option[String] = None,
  eventId: String,
  eventName: String,
  eventSourceUrl: Option[String] = None,
  eventTime: Long,
  language: Option[String] = None,
  optOut: Option[Boolean] = None,
  osVersion: Option[String] = None,
  partnerName: Option[String] = None,
  userData: ConversionEventsUserData,
  wifi: Option[Boolean] = None
)

