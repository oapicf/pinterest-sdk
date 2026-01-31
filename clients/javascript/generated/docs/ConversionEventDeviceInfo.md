# PinterestSdk.ConversionEventDeviceInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batteryLevel** | **Number** | Battery charge level percentage | [optional] 
**brand** | **String** | Device brand | [optional] 
**carrier** | **String** | User device&#39;s mobile carrier. | [optional] 
**cpuCores** | **Number** | Number of CPU cores | [optional] 
**externalStorageFreeSpace** | **Number** | External storage size in GB | [optional] 
**externalStorageSize** | **Number** | External storage size in GB | [optional] 
**formFactor** | **String** | Device form factor | [optional] 
**kernelVersion** | **String** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] 
**languages** | **[String]** | List of user installed languages. ISO 639-1 format | [optional] 
**locale** | **String** | Device locale BCP-47 format | [optional] 
**model** | **String** | Device model name | [optional] 
**networkType** | **String** | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] 
**osFamily** | **String** | OS Family | [optional] 
**osName** | **String** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] 
**osReleaseName** | **String** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] 
**osVersion** | **String** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] 
**screenDensity** | **Number** | Screen density, PPI | [optional] 
**screenHeight** | **Number** | Screen height in pixels | [optional] 
**screenWidth** | **Number** | Screen width in pixels | [optional] 
**storageFreeSpace** | **Number** | Internal storage size in GB | [optional] 
**storageSize** | **Number** | Internal storage size in GB | [optional] 
**timezone** | **String** | Device timezone | [optional] 
**timezoneAbbr** | **String** | Timezone abbreviation | [optional] 
**type** | **String** | Device type | [optional] 



## Enum: FormFactorEnum


* `desktop` (value: `"desktop"`)

* `laptop` (value: `"laptop"`)

* `cellphone` (value: `"cellphone"`)

* `tablet` (value: `"tablet"`)

* `smartwatch` (value: `"smartwatch"`)

* `tv` (value: `"tv"`)

* `vr` (value: `"vr"`)

* `console` (value: `"console"`)

* `other` (value: `"other"`)





## Enum: NetworkTypeEnum


* `wifi` (value: `"wifi"`)

* `cellular_2g` (value: `"cellular_2g"`)

* `cellular_3g` (value: `"cellular_3g"`)

* `cellular_4g` (value: `"cellular_4g"`)

* `cellular_5g` (value: `"cellular_5g"`)

* `cellular_6g` (value: `"cellular_6g"`)

* `ethernet` (value: `"ethernet"`)

* `unknown` (value: `"unknown"`)





## Enum: OsFamilyEnum


* `ios` (value: `"ios"`)

* `android` (value: `"android"`)

* `macos` (value: `"macos"`)

* `windows` (value: `"windows"`)

* `linux` (value: `"linux"`)

* `bsd` (value: `"bsd"`)

* `other` (value: `"other"`)




