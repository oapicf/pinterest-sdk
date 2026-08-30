

# ConversionEventDeviceInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batteryLevel** | **Integer** | Battery charge level percentage |  [optional]
**brand** | **String** | Device brand |  [optional]
**carrier** | **String** | User device&#39;s mobile carrier. |  [optional]
**cpuCores** | **Integer** | Number of CPU cores |  [optional]
**externalStorageFreeSpace** | **Integer** | External storage size in GB |  [optional]
**externalStorageSize** | **Integer** | External storage size in GB |  [optional]
**formFactor** | [**FormFactor**](FormFactor.md) | Device form factor |  [optional]
**kernelVersion** | **String** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release |  [optional]
**languages** | **List&lt;String&gt;** | List of user installed languages. ISO 639-1 format |  [optional]
**locale** | **String** | Device locale BCP-47 format |  [optional]
**model** | **String** | Device model name |  [optional]
**networkType** | [**NetworkType**](NetworkType.md) | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() |  [optional]
**osFamily** | [**OsFamily**](OsFamily.md) | OS Family |  [optional]
**osName** | **String** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch |  [optional]
**osReleaseName** | **String** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin |  [optional]
**osVersion** | **String** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 |  [optional]
**screenDensity** | **Integer** | Screen density, PPI |  [optional]
**screenHeight** | **Integer** | Screen height in pixels |  [optional]
**screenWidth** | **Integer** | Screen width in pixels |  [optional]
**storageFreeSpace** | **Integer** | Internal storage size in GB |  [optional]
**storageSize** | **Integer** | Internal storage size in GB |  [optional]
**timezone** | **String** | Device timezone |  [optional]
**timezoneAbbr** | **String** | Timezone abbreviation |  [optional]
**type** | **String** | Device type |  [optional]




