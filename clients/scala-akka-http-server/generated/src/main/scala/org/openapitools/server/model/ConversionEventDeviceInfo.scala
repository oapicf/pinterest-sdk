package org.openapitools.server.model


/**
 * Object containing information about the device where event occurred.
 *
 * @param batteryLevel Battery charge level percentage for example: ''78''
 * @param brand Device brand for example: ''Apple, Samsung, Motorola''
 * @param carrier User device's mobile carrier. for example: ''T-Mobile''
 * @param cpuCores Number of CPU cores for example: ''8''
 * @param externalStorageFreeSpace External storage size in GB for example: ''126''
 * @param externalStorageSize External storage size in GB for example: ''512''
 * @param formFactor Device form factor for example: ''cellphone''
 * @param kernelVersion Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release for example: ''6.15''
 * @param languages List of user installed languages. ISO 639-1 format for example: ''["en","de","lt"]''
 * @param locale Device locale BCP-47 format for example: ''en-us''
 * @param model Device model name for example: ''null''
 * @param networkType Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() for example: ''wifi''
 * @param osFamily OS Family for example: ''ios''
 * @param osName Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch for example: ''10''
 * @param osReleaseName Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin for example: ''18.3''
 * @param osVersion Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 for example: ''18.3''
 * @param screenDensity Screen density, PPI for example: ''460''
 * @param screenHeight Screen height in pixels for example: ''2868''
 * @param screenWidth Screen width in pixels for example: ''1320''
 * @param storageFreeSpace Internal storage size in GB for example: ''184''
 * @param storageSize Internal storage size in GB for example: ''256''
 * @param timezone Device timezone for example: ''USA/New York''
 * @param timezoneAbbr Timezone abbreviation for example: ''PDT''
 * @param `type` Device type for example: ''iPhone, Android''
*/
final case class ConversionEventDeviceInfo (
  batteryLevel: Option[Int] = None,
  brand: Option[String] = None,
  carrier: Option[String] = None,
  cpuCores: Option[Int] = None,
  externalStorageFreeSpace: Option[Int] = None,
  externalStorageSize: Option[Int] = None,
  formFactor: Option[FormFactor] = None,
  kernelVersion: Option[String] = None,
  languages: Option[Seq[String]] = None,
  locale: Option[String] = None,
  model: Option[String] = None,
  networkType: Option[NetworkType] = None,
  osFamily: Option[OsFamily] = None,
  osName: Option[String] = None,
  osReleaseName: Option[String] = None,
  osVersion: Option[String] = None,
  screenDensity: Option[Int] = None,
  screenHeight: Option[Int] = None,
  screenWidth: Option[Int] = None,
  storageFreeSpace: Option[Int] = None,
  storageSize: Option[Int] = None,
  timezone: Option[String] = None,
  timezoneAbbr: Option[String] = None,
  `type`: Option[String] = None
)

