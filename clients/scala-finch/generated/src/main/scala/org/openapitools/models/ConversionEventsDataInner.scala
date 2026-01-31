package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConversionEventAppInfo
import org.openapitools.models.ConversionEventDeviceInfo
import org.openapitools.models.ConversionEventsDataInnerCustomData
import org.openapitools.models.ConversionEventsUserData

/**
 * 
 * @param actionUnderscoresource <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline`
 * @param appUnderscoreid The app store app ID.
 * @param appUnderscoreinfo 
 * @param appUnderscorename Name of the app.
 * @param appUnderscoreversion Version of the app.
 * @param customUnderscoredata 
 * @param deviceUnderscorebrand Brand of the user device.
 * @param deviceUnderscorecarrier User device's mobile carrier.
 * @param deviceUnderscoreinfo 
 * @param deviceUnderscoremodel Model of the user device.
 * @param deviceUnderscoretype Type of the user device.
 * @param eventUnderscoreid A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
 * @param eventUnderscorename <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video`
 * @param eventUnderscoresourceUnderscoreurl URL of the web conversion event.
 * @param eventUnderscoretime The time when the event happened. Unix timestamp in seconds.
 * @param language Two-character ISO-639-1 language code indicating the user's language.
 * @param optUnderscoreout When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
 * @param osUnderscoreversion Version of the device operating system.
 * @param partnerUnderscorename The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
 * @param userUnderscoredata 
 * @param wifi Whether the event occurred when the user device was connected to wifi.
 */
case class ConversionEventsDataInner(actionUnderscoresource: String,
                appUnderscoreid: Option[String],
                appUnderscoreinfo: Option[ConversionEventAppInfo],
                appUnderscorename: Option[String],
                appUnderscoreversion: Option[String],
                customUnderscoredata: Option[ConversionEventsDataInnerCustomData],
                deviceUnderscorebrand: Option[String],
                deviceUnderscorecarrier: Option[String],
                deviceUnderscoreinfo: Option[ConversionEventDeviceInfo],
                deviceUnderscoremodel: Option[String],
                deviceUnderscoretype: Option[String],
                eventUnderscoreid: String,
                eventUnderscorename: String,
                eventUnderscoresourceUnderscoreurl: Option[String],
                eventUnderscoretime: Long,
                language: Option[String],
                optUnderscoreout: Option[Boolean],
                osUnderscoreversion: Option[String],
                partnerUnderscorename: Option[String],
                userUnderscoredata: ConversionEventsUserData,
                wifi: Option[Boolean]
                )

object ConversionEventsDataInner {
    /**
     * Creates the codec for converting ConversionEventsDataInner from and to JSON.
     */
    implicit val decoder: Decoder[ConversionEventsDataInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionEventsDataInner] = deriveEncoder
}
