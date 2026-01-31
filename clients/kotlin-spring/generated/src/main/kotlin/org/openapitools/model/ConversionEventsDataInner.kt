package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConversionEventAppInfo
import org.openapitools.model.ConversionEventDeviceInfo
import org.openapitools.model.ConversionEventsDataInnerCustomData
import org.openapitools.model.ConversionEventsUserData
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param actionSource <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline`
 * @param eventId A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
 * @param eventName <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video`
 * @param eventTime The time when the event happened. Unix timestamp in seconds.
 * @param userData 
 * @param appId The app store app ID.
 * @param appInfo 
 * @param appName Name of the app.
 * @param appVersion Version of the app.
 * @param customData 
 * @param deviceBrand Brand of the user device.
 * @param deviceCarrier User device's mobile carrier.
 * @param deviceInfo 
 * @param deviceModel Model of the user device.
 * @param deviceType Type of the user device.
 * @param eventSourceUrl URL of the web conversion event.
 * @param language Two-character ISO-639-1 language code indicating the user's language.
 * @param optOut When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
 * @param osVersion Version of the device operating system.
 * @param partnerName The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
 * @param wifi Whether the event occurred when the user device was connected to wifi.
 */
data class ConversionEventsDataInner(

    @Schema(example = "app_ios", required = true, description = "<p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline`")
    @get:JsonProperty("action_source", required = true) val actionSource: kotlin.String,

    @Schema(example = "eventId0001", required = true, description = "A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "checkout", required = true, description = "<p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video`")
    @get:JsonProperty("event_name", required = true) val eventName: kotlin.String,

    @Schema(example = "1451431341", required = true, description = "The time when the event happened. Unix timestamp in seconds.")
    @get:JsonProperty("event_time", required = true) val eventTime: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("user_data", required = true) val userData: ConversionEventsUserData,

    @Schema(example = "429047995", description = "The app store app ID.")
    @get:JsonProperty("app_id") val appId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("app_info") val appInfo: ConversionEventAppInfo? = null,

    @Schema(example = "Pinterest", description = "Name of the app.")
    @get:JsonProperty("app_name") val appName: kotlin.String? = null,

    @Schema(example = "7.9", description = "Version of the app.")
    @get:JsonProperty("app_version") val appVersion: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_data") val customData: ConversionEventsDataInnerCustomData? = null,

    @Schema(example = "Apple", description = "Brand of the user device.")
    @get:JsonProperty("device_brand") val deviceBrand: kotlin.String? = null,

    @Schema(example = "T-Mobile", description = "User device's mobile carrier.")
    @get:JsonProperty("device_carrier") val deviceCarrier: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("device_info") val deviceInfo: ConversionEventDeviceInfo? = null,

    @Schema(example = "iPhone X", description = "Model of the user device.")
    @get:JsonProperty("device_model") val deviceModel: kotlin.String? = null,

    @Schema(example = "iPhone", description = "Type of the user device.")
    @get:JsonProperty("device_type") val deviceType: kotlin.String? = null,

    @Schema(example = "https://www.my-clothing-shop.org/", description = "URL of the web conversion event.")
    @get:JsonProperty("event_source_url") val eventSourceUrl: kotlin.String? = null,

    @Schema(example = "en", description = "Two-character ISO-639-1 language code indicating the user's language.")
    @get:JsonProperty("language") val language: kotlin.String? = null,

    @Schema(example = "false", description = "When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.")
    @get:JsonProperty("opt_out") val optOut: kotlin.Boolean? = null,

    @Schema(example = "12.1.4", description = "Version of the device operating system.")
    @get:JsonProperty("os_version") val osVersion: kotlin.String? = null,

    @Schema(example = "ss-partnername", description = "The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’")
    @get:JsonProperty("partner_name") val partnerName: kotlin.String? = null,

    @Schema(example = "false", description = "Whether the event occurred when the user device was connected to wifi.")
    @get:JsonProperty("wifi") val wifi: kotlin.Boolean? = null
) {

}

