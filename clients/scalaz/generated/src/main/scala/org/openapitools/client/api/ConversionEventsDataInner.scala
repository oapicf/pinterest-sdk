package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEventsDataInner._

case class ConversionEventsDataInner (
  /* <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline` */
  actionSource: String,
/* The app store app ID. */
  appId: Option[String],
appInfo: Option[ConversionEventAppInfo],
/* Name of the app. */
  appName: Option[String],
/* Version of the app. */
  appVersion: Option[String],
customData: Option[ConversionEventsDataInnerCustomData],
/* Brand of the user device. */
  deviceBrand: Option[String],
/* User device's mobile carrier. */
  deviceCarrier: Option[String],
deviceInfo: Option[ConversionEventDeviceInfo],
/* Model of the user device. */
  deviceModel: Option[String],
/* Type of the user device. */
  deviceType: Option[String],
/* A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. */
  eventId: String,
/* <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video` */
  eventName: String,
/* URL of the web conversion event. */
  eventSourceUrl: Option[String],
/* The time when the event happened. Unix timestamp in seconds. */
  eventTime: Long,
/* Two-character ISO-639-1 language code indicating the user's language. */
  language: Option[String],
/* When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. */
  optOut: Option[Boolean],
/* Version of the device operating system. */
  osVersion: Option[String],
/* The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’ */
  partnerName: Option[String],
userData: ConversionEventsUserData,
/* Whether the event occurred when the user device was connected to wifi. */
  wifi: Option[Boolean])

object ConversionEventsDataInner {
  import DateTimeCodecs._

  implicit val ConversionEventsDataInnerCodecJson: CodecJson[ConversionEventsDataInner] = CodecJson.derive[ConversionEventsDataInner]
  implicit val ConversionEventsDataInnerDecoder: EntityDecoder[ConversionEventsDataInner] = jsonOf[ConversionEventsDataInner]
  implicit val ConversionEventsDataInnerEncoder: EntityEncoder[ConversionEventsDataInner] = jsonEncoderOf[ConversionEventsDataInner]
}
