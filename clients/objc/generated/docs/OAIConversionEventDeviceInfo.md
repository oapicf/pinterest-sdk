# OAIConversionEventDeviceInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batteryLevel** | **NSNumber*** | Battery charge level percentage | [optional] 
**brand** | **NSString*** | Device brand | [optional] 
**carrier** | **NSString*** | User device&#39;s mobile carrier. | [optional] 
**cpuCores** | **NSNumber*** | Number of CPU cores | [optional] 
**externalStorageFreeSpace** | **NSNumber*** | External storage size in GB | [optional] 
**externalStorageSize** | **NSNumber*** | External storage size in GB | [optional] 
**formFactor** | **NSString*** | Device form factor | [optional] 
**kernelVersion** | **NSString*** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] 
**languages** | **NSArray&lt;NSString*&gt;*** | List of user installed languages. ISO 639-1 format | [optional] 
**locale** | **NSString*** | Device locale BCP-47 format | [optional] 
**model** | **NSString*** | Device model name | [optional] 
**networkType** | **NSString*** | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] 
**osFamily** | **NSString*** | OS Family | [optional] 
**osName** | **NSString*** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] 
**osReleaseName** | **NSString*** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] 
**osVersion** | **NSString*** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] 
**screenDensity** | **NSNumber*** | Screen density, PPI | [optional] 
**screenHeight** | **NSNumber*** | Screen height in pixels | [optional] 
**screenWidth** | **NSNumber*** | Screen width in pixels | [optional] 
**storageFreeSpace** | **NSNumber*** | Internal storage size in GB | [optional] 
**storageSize** | **NSNumber*** | Internal storage size in GB | [optional] 
**timezone** | **NSString*** | Device timezone | [optional] 
**timezoneAbbr** | **NSString*** | Timezone abbreviation | [optional] 
**type** | **NSString*** | Device type | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


