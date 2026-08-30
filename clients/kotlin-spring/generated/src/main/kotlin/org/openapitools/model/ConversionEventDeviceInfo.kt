package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.FormFactor
import org.openapitools.model.NetworkType
import org.openapitools.model.OsFamily
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
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("battery_level")
    @get:JsonProperty("battery_level") val batteryLevel: kotlin.Int? = null,

    @get:Size(max=100)
    @Schema(example = "Apple, Samsung, Motorola", description = "Device brand")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("brand")
    @get:JsonProperty("brand") val brand: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "T-Mobile", description = "User device's mobile carrier.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("carrier")
    @get:JsonProperty("carrier") val carrier: kotlin.String? = null,

    @get:Min(value=0)
    @get:Max(value=1152)
    @Schema(example = "8", description = "Number of CPU cores")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cpu_cores")
    @get:JsonProperty("cpu_cores") val cpuCores: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=1048576)
    @Schema(example = "126", description = "External storage size in GB")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("external_storage_free_space")
    @get:JsonProperty("external_storage_free_space") val externalStorageFreeSpace: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=1048576)
    @Schema(example = "512", description = "External storage size in GB")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("external_storage_size")
    @get:JsonProperty("external_storage_size") val externalStorageSize: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "cellphone", description = "Device form factor")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("form_factor")
    @get:JsonProperty("form_factor") val formFactor: FormFactor? = null,

    @get:Size(max=100)
    @Schema(example = "6.15", description = "Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("kernel_version")
    @get:JsonProperty("kernel_version") val kernelVersion: kotlin.String? = null,

    @get:Size(min=0,max=100) 
    @Schema(example = "[\"en\",\"de\",\"lt\"]", description = "List of user installed languages. ISO 639-1 format")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("languages")
    @get:JsonProperty("languages") val languages: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(max=35)
    @Schema(example = "en-us", description = "Device locale BCP-47 format")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("locale")
    @get:JsonProperty("locale") val locale: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(description = "Device model name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("model")
    @get:JsonProperty("model") val model: kotlin.String? = null,

    @field:Valid
    @Schema(example = "wifi", description = "Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("network_type")
    @get:JsonProperty("network_type") val networkType: NetworkType? = null,

    @field:Valid
    @Schema(example = "ios", description = "OS Family")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("os_family")
    @get:JsonProperty("os_family") val osFamily: OsFamily? = null,

    @get:Size(max=100)
    @Schema(example = "10", description = "Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("os_name")
    @get:JsonProperty("os_name") val osName: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "18.3", description = "Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("os_release_name")
    @get:JsonProperty("os_release_name") val osReleaseName: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "18.3", description = "Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("os_version")
    @get:JsonProperty("os_version") val osVersion: kotlin.String? = null,

    @get:Min(value=0)
    @get:Max(value=100000)
    @Schema(example = "460", description = "Screen density, PPI")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("screen_density")
    @get:JsonProperty("screen_density") val screenDensity: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=30720)
    @Schema(example = "2868", description = "Screen height in pixels")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("screen_height")
    @get:JsonProperty("screen_height") val screenHeight: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=30720)
    @Schema(example = "1320", description = "Screen width in pixels")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("screen_width")
    @get:JsonProperty("screen_width") val screenWidth: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=1048576)
    @Schema(example = "184", description = "Internal storage size in GB")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("storage_free_space")
    @get:JsonProperty("storage_free_space") val storageFreeSpace: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=1048576)
    @Schema(example = "256", description = "Internal storage size in GB")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("storage_size")
    @get:JsonProperty("storage_size") val storageSize: kotlin.Int? = null,

    @get:Size(max=40)
    @Schema(example = "USA/New York", description = "Device timezone")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("timezone")
    @get:JsonProperty("timezone") val timezone: kotlin.String? = null,

    @get:Size(max=5)
    @Schema(example = "PDT", description = "Timezone abbreviation")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("timezone_abbr")
    @get:JsonProperty("timezone_abbr") val timezoneAbbr: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "iPhone, Android", description = "Device type")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: kotlin.String? = null
) {

}

