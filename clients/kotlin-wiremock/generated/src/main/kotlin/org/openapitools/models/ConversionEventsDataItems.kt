@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionEventsDataItems(
    @field:JsonProperty("action_source")
    val actionSource: kotlin.String,

    @field:JsonProperty("event_id")
    val eventId: kotlin.String,

    @field:JsonProperty("event_name")
    val eventName: kotlin.String,

    @field:JsonProperty("event_time")
    val eventTime: kotlin.Long,

    @field:JsonProperty("user_data")
    val userData: ConversionEventsUserDataProperties,

    @field:JsonProperty("app_id")
    val appId: kotlin.String? = null,

    @field:JsonProperty("app_info")
    val appInfo: ConversionEventAppInfo? = null,

    @field:JsonProperty("app_name")
    val appName: kotlin.String? = null,

    @field:JsonProperty("app_version")
    val appVersion: kotlin.String? = null,

    @field:JsonProperty("custom_data")
    val customData: ConversionEventsDataItemsCustomData? = null,

    @field:JsonProperty("device_brand")
    val deviceBrand: kotlin.String? = null,

    @field:JsonProperty("device_carrier")
    val deviceCarrier: kotlin.String? = null,

    @field:JsonProperty("device_info")
    val deviceInfo: ConversionEventDeviceInfo? = null,

    @field:JsonProperty("device_model")
    val deviceModel: kotlin.String? = null,

    @field:JsonProperty("device_type")
    val deviceType: kotlin.String? = null,

    @field:JsonProperty("event_source_url")
    val eventSourceUrl: kotlin.String? = null,

    @field:JsonProperty("language")
    val language: kotlin.String? = null,

    @field:JsonProperty("opt_out")
    val optOut: kotlin.Boolean? = null,

    @field:JsonProperty("os_version")
    val osVersion: kotlin.String? = null,

    @field:JsonProperty("partner_name")
    val partnerName: kotlin.String? = null,

    @field:JsonProperty("wifi")
    val wifi: kotlin.Boolean? = null,

)
