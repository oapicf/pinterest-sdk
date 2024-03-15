package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionEvents_data_inner.
  * @param eventName The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. <li><code>add_to_cart</code> <li><code>checkout</code> <li><code>custom</code> <li><code>lead</code> <li><code>page_visit</code> <li><code>search</code> <li><code>signup</code> <li><code>view_category</code> <li><code>watch_video</code>
  * @param actionSource The source indicating where the conversion event occurred. <li><code>app_android</code> <li><code>app_ios</code> <li><code>web</code> <li><code>offline</code>
  * @param eventTime The time when the event happened. Unix timestamp in seconds.
  * @param eventId A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
  * @param eventSourceUrl URL of the web conversion event.
  * @param optOut When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
  * @param partnerName The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
  * @param appId The app store app ID.
  * @param appName Name of the app.
  * @param appVersion Version of the app.
  * @param deviceBrand Brand of the user device.
  * @param deviceCarrier User device's mobile carrier.
  * @param deviceModel Model of the user device.
  * @param deviceType Type of the user device.
  * @param osVersion Version of the device operating system.
  * @param wifi Whether the event occurred when the user device was connected to wifi.
  * @param language Two-character ISO-639-1 language code indicating the user's language.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ConversionEventsDataInner(
  eventName: String,
  actionSource: String,
  eventTime: Long,
  eventId: String,
  eventSourceUrl: Option[String],
  optOut: Option[Boolean],
  partnerName: Option[String],
  userData: ConversionEventsUserData,
  customData: Option[ConversionEventsDataInnerCustomData],
  appId: Option[String],
  appName: Option[String],
  appVersion: Option[String],
  deviceBrand: Option[String],
  deviceCarrier: Option[String],
  deviceModel: Option[String],
  deviceType: Option[String],
  osVersion: Option[String],
  wifi: Option[Boolean],
  language: Option[String]
)

object ConversionEventsDataInner {
  implicit lazy val conversionEventsDataInnerJsonFormat: Format[ConversionEventsDataInner] = Json.format[ConversionEventsDataInner]
}

