package org.openapitools.server.model


/**
 * @param eventName <p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p>  for example: ''checkout''
 * @param actionSource <p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p>  for example: ''app_ios''
 * @param eventTime The time when the event happened. Unix timestamp in seconds. for example: ''1451431341''
 * @param eventId A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. for example: ''eventId0001''
 * @param eventSourceUrl URL of the web conversion event. for example: ''https://www.my-clothing-shop.org/''
 * @param optOut When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. for example: ''false''
 * @param partnerName The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’ for example: ''ss-partnername''
 * @param userData  for example: ''null''
 * @param customData  for example: ''null''
 * @param appId The app store app ID. for example: ''429047995''
 * @param appName Name of the app. for example: ''Pinterest''
 * @param appVersion Version of the app. for example: ''7.9''
 * @param deviceBrand Brand of the user device. for example: ''Apple''
 * @param deviceCarrier User device's mobile carrier. for example: ''T-Mobile''
 * @param deviceModel Model of the user device. for example: ''iPhone X''
 * @param deviceType Type of the user device. for example: ''iPhone''
 * @param osVersion Version of the device operating system. for example: ''12.1.4''
 * @param wifi Whether the event occurred when the user device was connected to wifi. for example: ''false''
 * @param language Two-character ISO-639-1 language code indicating the user's language. for example: ''en''
*/
final case class ConversionEventsDataInner (
  eventName: String,
  actionSource: String,
  eventTime: Long,
  eventId: String,
  eventSourceUrl: Option[String] = None,
  optOut: Option[Boolean] = None,
  partnerName: Option[String] = None,
  userData: ConversionEventsUserData,
  customData: Option[ConversionEventsDataInnerCustomData] = None,
  appId: Option[String] = None,
  appName: Option[String] = None,
  appVersion: Option[String] = None,
  deviceBrand: Option[String] = None,
  deviceCarrier: Option[String] = None,
  deviceModel: Option[String] = None,
  deviceType: Option[String] = None,
  osVersion: Option[String] = None,
  wifi: Option[Boolean] = None,
  language: Option[String] = None
)

