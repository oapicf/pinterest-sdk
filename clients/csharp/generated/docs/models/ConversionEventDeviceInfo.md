# Org.OpenAPITools.Model.ConversionEventDeviceInfo
Object containing information about the device where event occurred.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatteryLevel** | **int** | Battery charge level percentage | [optional] 
**Brand** | **string** | Device brand | [optional] 
**Carrier** | **string** | User device&#39;s mobile carrier. | [optional] 
**CpuCores** | **int** | Number of CPU cores | [optional] 
**ExternalStorageFreeSpace** | **int** | External storage size in GB | [optional] 
**ExternalStorageSize** | **int** | External storage size in GB | [optional] 
**FormFactor** | **string** | Device form factor | [optional] 
**KernelVersion** | **string** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] 
**Languages** | **List&lt;string&gt;** | List of user installed languages. ISO 639-1 format | [optional] 
**Locale** | **string** | Device locale BCP-47 format | [optional] 
**Model** | **string** | Device model name | [optional] 
**NetworkType** | **string** | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] 
**OsFamily** | **string** | OS Family | [optional] 
**OsName** | **string** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] 
**OsReleaseName** | **string** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] 
**OsVersion** | **string** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] 
**ScreenDensity** | **int** | Screen density, PPI | [optional] 
**ScreenHeight** | **int** | Screen height in pixels | [optional] 
**ScreenWidth** | **int** | Screen width in pixels | [optional] 
**StorageFreeSpace** | **int** | Internal storage size in GB | [optional] 
**StorageSize** | **int** | Internal storage size in GB | [optional] 
**Timezone** | **string** | Device timezone | [optional] 
**TimezoneAbbr** | **string** | Timezone abbreviation | [optional] 
**Type** | **string** | Device type | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

