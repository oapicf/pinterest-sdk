@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionEventDeviceInfo(
    @field:JsonProperty("battery_level")
    val batteryLevel: kotlin.Int? = null,

    @field:JsonProperty("brand")
    val brand: kotlin.String? = null,

    @field:JsonProperty("carrier")
    val carrier: kotlin.String? = null,

    @field:JsonProperty("cpu_cores")
    val cpuCores: kotlin.Int? = null,

    @field:JsonProperty("external_storage_free_space")
    val externalStorageFreeSpace: kotlin.Int? = null,

    @field:JsonProperty("external_storage_size")
    val externalStorageSize: kotlin.Int? = null,

    @field:JsonProperty("form_factor")
    val formFactor: FormFactor? = null,

    @field:JsonProperty("kernel_version")
    val kernelVersion: kotlin.String? = null,

    @field:JsonProperty("languages")
    val languages: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("locale")
    val locale: kotlin.String? = null,

    @field:JsonProperty("model")
    val model: kotlin.String? = null,

    @field:JsonProperty("network_type")
    val networkType: NetworkType? = null,

    @field:JsonProperty("os_family")
    val osFamily: OsFamily? = null,

    @field:JsonProperty("os_name")
    val osName: kotlin.String? = null,

    @field:JsonProperty("os_release_name")
    val osReleaseName: kotlin.String? = null,

    @field:JsonProperty("os_version")
    val osVersion: kotlin.String? = null,

    @field:JsonProperty("screen_density")
    val screenDensity: kotlin.Int? = null,

    @field:JsonProperty("screen_height")
    val screenHeight: kotlin.Int? = null,

    @field:JsonProperty("screen_width")
    val screenWidth: kotlin.Int? = null,

    @field:JsonProperty("storage_free_space")
    val storageFreeSpace: kotlin.Int? = null,

    @field:JsonProperty("storage_size")
    val storageSize: kotlin.Int? = null,

    @field:JsonProperty("timezone")
    val timezone: kotlin.String? = null,

    @field:JsonProperty("timezone_abbr")
    val timezoneAbbr: kotlin.String? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

)
