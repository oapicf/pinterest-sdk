package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionEvents_data_inner.
  * @param actionSource <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline`
  * @param appId The app store app ID.
  * @param appName Name of the app.
  * @param appVersion Version of the app.
  * @param deviceBrand Brand of the user device.
  * @param deviceCarrier User device's mobile carrier.
  * @param deviceModel Model of the user device.
  * @param deviceType Type of the user device.
  * @param eventId A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
  * @param eventName <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video`
  * @param eventSourceUrl URL of the web conversion event.
  * @param eventTime The time when the event happened. Unix timestamp in seconds.
  * @param language Two-character ISO-639-1 language code indicating the user's language.
  * @param optOut When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
  * @param osVersion Version of the device operating system.
  * @param partnerName The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
  * @param wifi Whether the event occurred when the user device was connected to wifi.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionEventsDataInner(
  actionSource: String,
  appId: Option[String],
  appInfo: Option[ConversionEventAppInfo],
  appName: Option[String],
  appVersion: Option[String],
  customData: Option[ConversionEventsDataInnerCustomData],
  deviceBrand: Option[String],
  deviceCarrier: Option[String],
  deviceInfo: Option[ConversionEventDeviceInfo],
  deviceModel: Option[String],
  deviceType: Option[String],
  eventId: String,
  eventName: String,
  eventSourceUrl: Option[String],
  eventTime: Long,
  language: Option[String],
  optOut: Option[Boolean],
  osVersion: Option[String],
  partnerName: Option[String],
  userData: ConversionEventsUserData,
  wifi: Option[Boolean]
)

object ConversionEventsDataInner {
  implicit lazy val conversionEventsDataInnerJsonFormat: Format[ConversionEventsDataInner] = Json.format[ConversionEventsDataInner]
}

