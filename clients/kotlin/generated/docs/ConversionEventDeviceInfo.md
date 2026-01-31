
# ConversionEventDeviceInfo

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **batteryLevel** | **kotlin.Int** | Battery charge level percentage |  [optional] |
| **brand** | **kotlin.String** | Device brand |  [optional] |
| **carrier** | **kotlin.String** | User device&#39;s mobile carrier. |  [optional] |
| **cpuCores** | **kotlin.Int** | Number of CPU cores |  [optional] |
| **externalStorageFreeSpace** | **kotlin.Int** | External storage size in GB |  [optional] |
| **externalStorageSize** | **kotlin.Int** | External storage size in GB |  [optional] |
| **formFactor** | [**inline**](#FormFactor) | Device form factor |  [optional] |
| **kernelVersion** | **kotlin.String** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release |  [optional] |
| **languages** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of user installed languages. ISO 639-1 format |  [optional] |
| **locale** | **kotlin.String** | Device locale BCP-47 format |  [optional] |
| **model** | **kotlin.String** | Device model name |  [optional] |
| **networkType** | [**inline**](#NetworkType) | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() |  [optional] |
| **osFamily** | [**inline**](#OsFamily) | OS Family |  [optional] |
| **osName** | **kotlin.String** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch |  [optional] |
| **osReleaseName** | **kotlin.String** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin |  [optional] |
| **osVersion** | **kotlin.String** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 |  [optional] |
| **screenDensity** | **kotlin.Int** | Screen density, PPI |  [optional] |
| **screenHeight** | **kotlin.Int** | Screen height in pixels |  [optional] |
| **screenWidth** | **kotlin.Int** | Screen width in pixels |  [optional] |
| **storageFreeSpace** | **kotlin.Int** | Internal storage size in GB |  [optional] |
| **storageSize** | **kotlin.Int** | Internal storage size in GB |  [optional] |
| **timezone** | **kotlin.String** | Device timezone |  [optional] |
| **timezoneAbbr** | **kotlin.String** | Timezone abbreviation |  [optional] |
| **type** | **kotlin.String** | Device type |  [optional] |


<a id="FormFactor"></a>
## Enum: form_factor
| Name | Value |
| ---- | ----- |
| formFactor | desktop, laptop, cellphone, tablet, smartwatch, tv, vr, console, other |


<a id="NetworkType"></a>
## Enum: network_type
| Name | Value |
| ---- | ----- |
| networkType | wifi, cellular_2g, cellular_3g, cellular_4g, cellular_5g, cellular_6g, ethernet, unknown |


<a id="OsFamily"></a>
## Enum: os_family
| Name | Value |
| ---- | ----- |
| osFamily | ios, android, macos, windows, linux, bsd, other |



