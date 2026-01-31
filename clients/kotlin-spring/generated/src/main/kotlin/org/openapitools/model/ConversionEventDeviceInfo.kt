package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Object containing information about the device where event occurred.
 * @param batteryLevel Battery charge level percentage
 * @param brand Device brand
 * @param carrier User device's mobile carrier.
 * @param cpuCores Number of CPU cores
 * @param externalStorageFreeSpace External storage size in GB
 * @param externalStorageSize External storage size in GB
 * @param formFactor Device form factor
 * @param kernelVersion Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
 * @param languages List of user installed languages. ISO 639-1 format
 * @param locale Device locale BCP-47 format
 * @param model Device model name
 * @param networkType Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
 * @param osFamily OS Family
 * @param osName Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
 * @param osReleaseName Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
 * @param osVersion Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
 * @param screenDensity Screen density, PPI
 * @param screenHeight Screen height in pixels
 * @param screenWidth Screen width in pixels
 * @param storageFreeSpace Internal storage size in GB
 * @param storageSize Internal storage size in GB
 * @param timezone Device timezone
 * @param timezoneAbbr Timezone abbreviation
 * @param type Device type
 */
data class ConversionEventDeviceInfo(

    @get:Min(value=0)
    @get:Max(value=100)
    @Schema(example = "78", description = "Battery charge level percentage")
    @get:JsonProperty("battery_level") val batteryLevel: kotlin.Int? = null,

    @get:Size(max=100)
    @Schema(example = "Apple, Samsung, Motorola", description = "Device brand")
    @get:JsonProperty("brand") val brand: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "T-Mobile", description = "User device's mobile carrier.")
    @get:JsonProperty("carrier") val carrier: kotlin.String? = null,

    @get:Min(value=0)
    @get:Max(value=1152)
    @Schema(example = "8", description = "Number of CPU cores")
    @get:JsonProperty("cpu_cores") val cpuCores: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=1048576)
    @Schema(example = "126", description = "External storage size in GB")
    @get:JsonProperty("external_storage_free_space") val externalStorageFreeSpace: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=1048576)
    @Schema(example = "512", description = "External storage size in GB")
    @get:JsonProperty("external_storage_size") val externalStorageSize: kotlin.Int? = null,

    @Schema(example = "cellphone", description = "Device form factor")
    @get:JsonProperty("form_factor") val formFactor: ConversionEventDeviceInfo.FormFactor? = null,

    @get:Size(max=100)
    @Schema(example = "6.15", description = "Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release")
    @get:JsonProperty("kernel_version") val kernelVersion: kotlin.String? = null,

    @get:Size(min=0,max=100) 
    @Schema(example = "[\"en\",\"de\",\"lt\"]", description = "List of user installed languages. ISO 639-1 format")
    @get:JsonProperty("languages") val languages: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(max=35)
    @Schema(example = "en-us", description = "Device locale BCP-47 format")
    @get:JsonProperty("locale") val locale: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "16 Pro, Galaxy S25 Ultra", description = "Device model name")
    @get:JsonProperty("model") val model: kotlin.String? = null,

    @Schema(example = "wifi", description = "Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()")
    @get:JsonProperty("network_type") val networkType: ConversionEventDeviceInfo.NetworkType? = null,

    @Schema(example = "ios", description = "OS Family")
    @get:JsonProperty("os_family") val osFamily: ConversionEventDeviceInfo.OsFamily? = null,

    @get:Size(max=100)
    @Schema(example = "10", description = "Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch")
    @get:JsonProperty("os_name") val osName: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "18.3", description = "Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin")
    @get:JsonProperty("os_release_name") val osReleaseName: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "18.3", description = "Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04")
    @get:JsonProperty("os_version") val osVersion: kotlin.String? = null,

    @get:Min(value=0)
    @get:Max(value=100000)
    @Schema(example = "460", description = "Screen density, PPI")
    @get:JsonProperty("screen_density") val screenDensity: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=30720)
    @Schema(example = "2868", description = "Screen height in pixels")
    @get:JsonProperty("screen_height") val screenHeight: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=30720)
    @Schema(example = "1320", description = "Screen width in pixels")
    @get:JsonProperty("screen_width") val screenWidth: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=1048576)
    @Schema(example = "184", description = "Internal storage size in GB")
    @get:JsonProperty("storage_free_space") val storageFreeSpace: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=1048576)
    @Schema(example = "256", description = "Internal storage size in GB")
    @get:JsonProperty("storage_size") val storageSize: kotlin.Int? = null,

    @get:Size(max=40)
    @Schema(example = "USA/New York", description = "Device timezone")
    @get:JsonProperty("timezone") val timezone: kotlin.String? = null,

    @get:Size(max=5)
    @Schema(example = "PDT", description = "Timezone abbreviation")
    @get:JsonProperty("timezone_abbr") val timezoneAbbr: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "iPhone, Android", description = "Device type")
    @get:JsonProperty("type") val type: kotlin.String? = null
) {

    /**
    * Device form factor
    * Values: desktop,laptop,cellphone,tablet,smartwatch,tv,vr,console,other
    */
    enum class FormFactor(@get:JsonValue val value: kotlin.String) {

        desktop("desktop"),
        laptop("laptop"),
        cellphone("cellphone"),
        tablet("tablet"),
        smartwatch("smartwatch"),
        tv("tv"),
        vr("vr"),
        console("console"),
        other("other");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): FormFactor {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionEventDeviceInfo'")
            }
        }
    }

    /**
    * Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
    * Values: wifi,cellular_2g,cellular_3g,cellular_4g,cellular_5g,cellular_6g,ethernet,unknown
    */
    enum class NetworkType(@get:JsonValue val value: kotlin.String) {

        wifi("wifi"),
        cellular_2g("cellular_2g"),
        cellular_3g("cellular_3g"),
        cellular_4g("cellular_4g"),
        cellular_5g("cellular_5g"),
        cellular_6g("cellular_6g"),
        ethernet("ethernet"),
        unknown("unknown");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): NetworkType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionEventDeviceInfo'")
            }
        }
    }

    /**
    * OS Family
    * Values: ios,android,macos,windows,linux,bsd,other
    */
    enum class OsFamily(@get:JsonValue val value: kotlin.String) {

        ios("ios"),
        android("android"),
        macos("macos"),
        windows("windows"),
        linux("linux"),
        bsd("bsd"),
        other("other");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): OsFamily {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionEventDeviceInfo'")
            }
        }
    }

}

