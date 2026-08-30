package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionEventAppInfo
import org.openapitools.server.api.model.ConversionEventDeviceInfo
import org.openapitools.server.api.model.ConversionEventsDataItemsCustomData
import org.openapitools.server.api.model.ConversionEventsUserDataProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionEventsDataItems(
    /** The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60; */
    val actionSource: kotlin.String,
    /** A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. */
    val eventId: kotlin.String,
    /** The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60; */
    val eventName: kotlin.String,
    /** The time when the event happened. Unix timestamp in seconds. */
    val eventTime: kotlin.Long,
    /** Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent. */
    val userData: ConversionEventsUserDataProperties,
    /** The app store app ID. */
    val appId: kotlin.String? = null,
    val appInfo: ConversionEventAppInfo? = null,
    /** Name of the app. */
    val appName: kotlin.String? = null,
    /** Version of the app. */
    val appVersion: kotlin.String? = null,
    val customData: ConversionEventsDataItemsCustomData? = null,
    /** Brand of the user device. */
    val deviceBrand: kotlin.String? = null,
    /** User device&#39;s mobile carrier. */
    val deviceCarrier: kotlin.String? = null,
    val deviceInfo: ConversionEventDeviceInfo? = null,
    /** Model of the user device. */
    val deviceModel: kotlin.String? = null,
    /** Type of the user device. */
    val deviceType: kotlin.String? = null,
    /** URL of the web conversion event. */
    val eventSourceUrl: kotlin.String? = null,
    /** Two-character ISO-639-1 language code indicating the user&#39;s language. */
    val language: kotlin.String? = null,
    /** When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. */
    val optOut: kotlin.Boolean? = null,
    /** Version of the device operating system. */
    val osVersion: kotlin.String? = null,
    /** The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39; */
    val partnerName: kotlin.String? = null,
    /** Whether the event occurred when the user device was connected to wifi. */
    val wifi: kotlin.Boolean? = null
)
