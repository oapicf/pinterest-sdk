package model

import play.api.libs.json._

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
  * @param `type` Device type
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionEventDeviceInfo(
  batteryLevel: Option[Int],
  brand: Option[String],
  carrier: Option[String],
  cpuCores: Option[Int],
  externalStorageFreeSpace: Option[Int],
  externalStorageSize: Option[Int],
  formFactor: Option[ConversionEventDeviceInfo.FormFactor.Value],
  kernelVersion: Option[String],
  languages: Option[List[String]],
  locale: Option[String],
  model: Option[String],
  networkType: Option[ConversionEventDeviceInfo.NetworkType.Value],
  osFamily: Option[ConversionEventDeviceInfo.OsFamily.Value],
  osName: Option[String],
  osReleaseName: Option[String],
  osVersion: Option[String],
  screenDensity: Option[Int],
  screenHeight: Option[Int],
  screenWidth: Option[Int],
  storageFreeSpace: Option[Int],
  storageSize: Option[Int],
  timezone: Option[String],
  timezoneAbbr: Option[String],
  `type`: Option[String]
)

object ConversionEventDeviceInfo {
  implicit lazy val conversionEventDeviceInfoJsonFormat: Format[ConversionEventDeviceInfo] = Json.format[ConversionEventDeviceInfo]

  // noinspection TypeAnnotation
  object FormFactor extends Enumeration {
    val Desktop = Value("desktop")
    val Laptop = Value("laptop")
    val Cellphone = Value("cellphone")
    val Tablet = Value("tablet")
    val Smartwatch = Value("smartwatch")
    val Tv = Value("tv")
    val Vr = Value("vr")
    val Console = Value("console")
    val Other = Value("other")

    type FormFactor = Value
    implicit lazy val FormFactorJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object NetworkType extends Enumeration {
    val Wifi = Value("wifi")
    val Cellular2g = Value("cellular_2g")
    val Cellular3g = Value("cellular_3g")
    val Cellular4g = Value("cellular_4g")
    val Cellular5g = Value("cellular_5g")
    val Cellular6g = Value("cellular_6g")
    val Ethernet = Value("ethernet")
    val Unknown = Value("unknown")

    type NetworkType = Value
    implicit lazy val NetworkTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object OsFamily extends Enumeration {
    val Ios = Value("ios")
    val Android = Value("android")
    val Macos = Value("macos")
    val Windows = Value("windows")
    val Linux = Value("linux")
    val Bsd = Value("bsd")
    val Other = Value("other")

    type OsFamily = Value
    implicit lazy val OsFamilyJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

