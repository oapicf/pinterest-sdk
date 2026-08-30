

# ConversionEventDeviceInfo

Object containing information about the device where event occurred.

The class is defined in **[ConversionEventDeviceInfo.java](../../src/main/java/org/openapitools/model/ConversionEventDeviceInfo.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batteryLevel** | `Integer` | Battery charge level percentage |  [optional property]
**brand** | `String` | Device brand |  [optional property]
**carrier** | `String` | User device&#39;s mobile carrier. |  [optional property]
**cpuCores** | `Integer` | Number of CPU cores |  [optional property]
**externalStorageFreeSpace** | `Integer` | External storage size in GB |  [optional property]
**externalStorageSize** | `Integer` | External storage size in GB |  [optional property]
**formFactor** | `FormFactor` | Device form factor |  [optional property]
**kernelVersion** | `String` | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release |  [optional property]
**languages** | `List&lt;String&gt;` | List of user installed languages. ISO 639-1 format |  [optional property]
**locale** | `String` | Device locale BCP-47 format |  [optional property]
**model** | `String` | Device model name |  [optional property]
**networkType** | `NetworkType` | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() |  [optional property]
**osFamily** | `OsFamily` | OS Family |  [optional property]
**osName** | `String` | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch |  [optional property]
**osReleaseName** | `String` | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin |  [optional property]
**osVersion** | `String` | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 |  [optional property]
**screenDensity** | `Integer` | Screen density, PPI |  [optional property]
**screenHeight** | `Integer` | Screen height in pixels |  [optional property]
**screenWidth** | `Integer` | Screen width in pixels |  [optional property]
**storageFreeSpace** | `Integer` | Internal storage size in GB |  [optional property]
**storageSize** | `Integer` | Internal storage size in GB |  [optional property]
**timezone** | `String` | Device timezone |  [optional property]
**timezoneAbbr** | `String` | Timezone abbreviation |  [optional property]
**type** | `String` | Device type |  [optional property]


























