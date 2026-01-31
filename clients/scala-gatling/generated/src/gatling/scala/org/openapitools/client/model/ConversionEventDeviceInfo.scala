
package org.openapitools.client.model


case class ConversionEventDeviceInfo (
    /* Battery charge level percentage */
    _batteryLevel: Option[Integer],
    /* Device brand */
    _brand: Option[String],
    /* User device's mobile carrier. */
    _carrier: Option[String],
    /* Number of CPU cores */
    _cpuCores: Option[Integer],
    /* External storage size in GB */
    _externalStorageFreeSpace: Option[Integer],
    /* External storage size in GB */
    _externalStorageSize: Option[Integer],
    /* Device form factor */
    _formFactor: Option[String],
    /* Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release */
    _kernelVersion: Option[String],
    /* List of user installed languages. ISO 639-1 format */
    _languages: Option[List[String]],
    /* Device locale BCP-47 format */
    _locale: Option[String],
    /* Device model name */
    _model: Option[String],
    /* Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() */
    _networkType: Option[String],
    /* OS Family */
    _osFamily: Option[String],
    /* Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch */
    _osName: Option[String],
    /* Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin */
    _osReleaseName: Option[String],
    /* Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 */
    _osVersion: Option[String],
    /* Screen density, PPI */
    _screenDensity: Option[Integer],
    /* Screen height in pixels */
    _screenHeight: Option[Integer],
    /* Screen width in pixels */
    _screenWidth: Option[Integer],
    /* Internal storage size in GB */
    _storageFreeSpace: Option[Integer],
    /* Internal storage size in GB */
    _storageSize: Option[Integer],
    /* Device timezone */
    _timezone: Option[String],
    /* Timezone abbreviation */
    _timezoneAbbr: Option[String],
    /* Device type */
    _type: Option[String]
)
object ConversionEventDeviceInfo {
    def toStringBody(var_batteryLevel: Object, var_brand: Object, var_carrier: Object, var_cpuCores: Object, var_externalStorageFreeSpace: Object, var_externalStorageSize: Object, var_formFactor: Object, var_kernelVersion: Object, var_languages: Object, var_locale: Object, var_model: Object, var_networkType: Object, var_osFamily: Object, var_osName: Object, var_osReleaseName: Object, var_osVersion: Object, var_screenDensity: Object, var_screenHeight: Object, var_screenWidth: Object, var_storageFreeSpace: Object, var_storageSize: Object, var_timezone: Object, var_timezoneAbbr: Object, var_type: Object) =
        s"""
        | {
        | "batteryLevel":$var_batteryLevel,"brand":$var_brand,"carrier":$var_carrier,"cpuCores":$var_cpuCores,"externalStorageFreeSpace":$var_externalStorageFreeSpace,"externalStorageSize":$var_externalStorageSize,"formFactor":$var_formFactor,"kernelVersion":$var_kernelVersion,"languages":$var_languages,"locale":$var_locale,"model":$var_model,"networkType":$var_networkType,"osFamily":$var_osFamily,"osName":$var_osName,"osReleaseName":$var_osReleaseName,"osVersion":$var_osVersion,"screenDensity":$var_screenDensity,"screenHeight":$var_screenHeight,"screenWidth":$var_screenWidth,"storageFreeSpace":$var_storageFreeSpace,"storageSize":$var_storageSize,"timezone":$var_timezone,"timezoneAbbr":$var_timezoneAbbr,"type":$var_type
        | }
        """.stripMargin
}
