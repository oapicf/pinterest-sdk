package org.openapitools.server.api.model

import org.openapitools.server.api.model.FormFactor
import org.openapitools.server.api.model.NetworkType
import org.openapitools.server.api.model.OsFamily
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionEventDeviceInfo(
    /** Battery charge level percentage */
    val batteryLevel: kotlin.Int? = null,
    /** Device brand */
    val brand: kotlin.String? = null,
    /** User device&#39;s mobile carrier. */
    val carrier: kotlin.String? = null,
    /** Number of CPU cores */
    val cpuCores: kotlin.Int? = null,
    /** External storage size in GB */
    val externalStorageFreeSpace: kotlin.Int? = null,
    /** External storage size in GB */
    val externalStorageSize: kotlin.Int? = null,
    /** Device form factor */
    val formFactor: FormFactor? = null,
    /** Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release */
    val kernelVersion: kotlin.String? = null,
    /** List of user installed languages. ISO 639-1 format */
    val languages: kotlin.collections.List<kotlin.String>? = null,
    /** Device locale BCP-47 format */
    val locale: kotlin.String? = null,
    /** Device model name */
    val model: kotlin.String? = null,
    /** Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() */
    val networkType: NetworkType? = null,
    /** OS Family */
    val osFamily: OsFamily? = null,
    /** Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch */
    val osName: kotlin.String? = null,
    /** Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin */
    val osReleaseName: kotlin.String? = null,
    /** Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 */
    val osVersion: kotlin.String? = null,
    /** Screen density, PPI */
    val screenDensity: kotlin.Int? = null,
    /** Screen height in pixels */
    val screenHeight: kotlin.Int? = null,
    /** Screen width in pixels */
    val screenWidth: kotlin.Int? = null,
    /** Internal storage size in GB */
    val storageFreeSpace: kotlin.Int? = null,
    /** Internal storage size in GB */
    val storageSize: kotlin.Int? = null,
    /** Device timezone */
    val timezone: kotlin.String? = null,
    /** Timezone abbreviation */
    val timezoneAbbr: kotlin.String? = null,
    /** Device type */
    val type: kotlin.String? = null
)
