package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConversionEventAppInfo
import org.openapitools.model.ConversionEventDeviceInfo
import org.openapitools.model.ConversionEventsDataItemsCustomData
import org.openapitools.model.ConversionEventsUserDataProperties
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
 * @param actionSource The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`
 * @param eventId A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
 * @param eventName The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`
 * @param eventTime The time when the event happened. Unix timestamp in seconds.
 * @param userData Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
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
 * @param partnerName The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'
 * @param wifi Whether the event occurred when the user device was connected to wifi.
 */
data class ConversionEventsDataItems(

    @Schema(required = true, description = "The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`")
    @param:JsonProperty("action_source")
    @get:JsonProperty("action_source", required = true) val actionSource: kotlin.String,

    @Schema(required = true, description = "A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.")
    @param:JsonProperty("event_id")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(required = true, description = "The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`")
    @param:JsonProperty("event_name")
    @get:JsonProperty("event_name", required = true) val eventName: kotlin.String,

    @Schema(required = true, description = "The time when the event happened. Unix timestamp in seconds.")
    @param:JsonProperty("event_time")
    @get:JsonProperty("event_time", required = true) val eventTime: kotlin.Long,

    @field:Valid
    @Schema(required = true, description = "Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.")
    @param:JsonProperty("user_data")
    @get:JsonProperty("user_data", required = true) val userData: ConversionEventsUserDataProperties,

    @Schema(description = "The app store app ID.")
    @param:JsonProperty("app_id")
    @get:JsonProperty("app_id") val appId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("app_info")
    @get:JsonProperty("app_info") val appInfo: ConversionEventAppInfo? = null,

    @Schema(description = "Name of the app.")
    @param:JsonProperty("app_name")
    @get:JsonProperty("app_name") val appName: kotlin.String? = null,

    @Schema(description = "Version of the app.")
    @param:JsonProperty("app_version")
    @get:JsonProperty("app_version") val appVersion: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("custom_data")
    @get:JsonProperty("custom_data") val customData: ConversionEventsDataItemsCustomData? = null,

    @Schema(description = "Brand of the user device.")
    @param:JsonProperty("device_brand")
    @get:JsonProperty("device_brand") val deviceBrand: kotlin.String? = null,

    @Schema(description = "User device's mobile carrier.")
    @param:JsonProperty("device_carrier")
    @get:JsonProperty("device_carrier") val deviceCarrier: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("device_info")
    @get:JsonProperty("device_info") val deviceInfo: ConversionEventDeviceInfo? = null,

    @Schema(description = "Model of the user device.")
    @param:JsonProperty("device_model")
    @get:JsonProperty("device_model") val deviceModel: kotlin.String? = null,

    @Schema(description = "Type of the user device.")
    @param:JsonProperty("device_type")
    @get:JsonProperty("device_type") val deviceType: kotlin.String? = null,

    @Schema(description = "URL of the web conversion event.")
    @param:JsonProperty("event_source_url")
    @get:JsonProperty("event_source_url") val eventSourceUrl: kotlin.String? = null,

    @Schema(description = "Two-character ISO-639-1 language code indicating the user's language.")
    @param:JsonProperty("language")
    @get:JsonProperty("language") val language: kotlin.String? = null,

    @Schema(description = "When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("opt_out")
    @get:JsonProperty("opt_out") val optOut: kotlin.Boolean? = null,

    @Schema(description = "Version of the device operating system.")
    @param:JsonProperty("os_version")
    @get:JsonProperty("os_version") val osVersion: kotlin.String? = null,

    @Schema(description = "The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'")
    @param:JsonProperty("partner_name")
    @get:JsonProperty("partner_name") val partnerName: kotlin.String? = null,

    @Schema(description = "Whether the event occurred when the user device was connected to wifi.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("wifi")
    @get:JsonProperty("wifi") val wifi: kotlin.Boolean? = null
) {

}

