# ConversionEventDeviceInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batteryLevel** | **int** | Battery charge level percentage | [optional] 
**brand** | **string** | Device brand | [optional] 
**carrier** | **string** | User device&#39;s mobile carrier. | [optional] 
**cpuCores** | **int** | Number of CPU cores | [optional] 
**externalStorageFreeSpace** | **int** | External storage size in GB | [optional] 
**externalStorageSize** | **int** | External storage size in GB | [optional] 
**formFactor** | **string** | Device form factor | [optional] 
**kernelVersion** | **string** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] 
**languages** | **string** | List of user installed languages. ISO 639-1 format | [optional] 
**locale** | **string** | Device locale BCP-47 format | [optional] 
**model** | **string** | Device model name | [optional] 
**networkType** | **string** | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] 
**osFamily** | **string** | OS Family | [optional] 
**osName** | **string** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] 
**osReleaseName** | **string** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] 
**osVersion** | **string** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] 
**screenDensity** | **int** | Screen density, PPI | [optional] 
**screenHeight** | **int** | Screen height in pixels | [optional] 
**screenWidth** | **int** | Screen width in pixels | [optional] 
**storageFreeSpace** | **int** | Internal storage size in GB | [optional] 
**storageSize** | **int** | Internal storage size in GB | [optional] 
**timezone** | **string** | Device timezone | [optional] 
**timezoneAbbr** | **string** | Timezone abbreviation | [optional] 
**type** | **string** | Device type | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


