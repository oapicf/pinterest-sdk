package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConversionEventsDataInnerCustomData
import org.openapitools.models.ConversionEventsUserData

/**
 * 
 * @param eventUnderscorename <p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p> 
 * @param actionUnderscoresource <p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p> 
 * @param eventUnderscoretime The time when the event happened. Unix timestamp in seconds.
 * @param eventUnderscoreid A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
 * @param eventUnderscoresourceUnderscoreurl URL of the web conversion event.
 * @param optUnderscoreout When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
 * @param partnerUnderscorename The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
 * @param userUnderscoredata 
 * @param customUnderscoredata 
 * @param appUnderscoreid The app store app ID.
 * @param appUnderscorename Name of the app.
 * @param appUnderscoreversion Version of the app.
 * @param deviceUnderscorebrand Brand of the user device.
 * @param deviceUnderscorecarrier User device's mobile carrier.
 * @param deviceUnderscoremodel Model of the user device.
 * @param deviceUnderscoretype Type of the user device.
 * @param osUnderscoreversion Version of the device operating system.
 * @param wifi Whether the event occurred when the user device was connected to wifi.
 * @param language Two-character ISO-639-1 language code indicating the user's language.
 */
case class ConversionEventsDataInner(eventUnderscorename: String,
                actionUnderscoresource: String,
                eventUnderscoretime: Long,
                eventUnderscoreid: String,
                eventUnderscoresourceUnderscoreurl: Option[String],
                optUnderscoreout: Option[Boolean],
                partnerUnderscorename: Option[String],
                userUnderscoredata: ConversionEventsUserData,
                customUnderscoredata: Option[ConversionEventsDataInnerCustomData],
                appUnderscoreid: Option[String],
                appUnderscorename: Option[String],
                appUnderscoreversion: Option[String],
                deviceUnderscorebrand: Option[String],
                deviceUnderscorecarrier: Option[String],
                deviceUnderscoremodel: Option[String],
                deviceUnderscoretype: Option[String],
                osUnderscoreversion: Option[String],
                wifi: Option[Boolean],
                language: Option[String]
                )

object ConversionEventsDataInner {
    /**
     * Creates the codec for converting ConversionEventsDataInner from and to JSON.
     */
    implicit val decoder: Decoder[ConversionEventsDataInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionEventsDataInner] = deriveEncoder
}
