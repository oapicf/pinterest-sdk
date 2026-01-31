# ConversionEventDeviceInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batteryLevel** | **Int!** | Battery charge level percentage | [optional] [default to null]
**brand** | **String!** | Device brand | [optional] [default to null]
**carrier** | **String!** | User device&#39;s mobile carrier. | [optional] [default to null]
**cpuCores** | **Int!** | Number of CPU cores | [optional] [default to null]
**externalStorageFreeSpace** | **Int!** | External storage size in GB | [optional] [default to null]
**externalStorageSize** | **Int!** | External storage size in GB | [optional] [default to null]
**formFactor** | **String!** | Device form factor | [optional] [default to null]
**kernelVersion** | **String!** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] [default to null]
**languages** | **String!** | List of user installed languages. ISO 639-1 format | [optional] [default to null]
**locale** | **String!** | Device locale BCP-47 format | [optional] [default to null]
**model** | **String!** | Device model name | [optional] [default to null]
**networkType** | **String!** | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] [default to null]
**osFamily** | **String!** | OS Family | [optional] [default to null]
**osName** | **String!** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] [default to null]
**osReleaseName** | **String!** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] [default to null]
**osVersion** | **String!** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] [default to null]
**screenDensity** | **Int!** | Screen density, PPI | [optional] [default to null]
**screenHeight** | **Int!** | Screen height in pixels | [optional] [default to null]
**screenWidth** | **Int!** | Screen width in pixels | [optional] [default to null]
**storageFreeSpace** | **Int!** | Internal storage size in GB | [optional] [default to null]
**storageSize** | **Int!** | Internal storage size in GB | [optional] [default to null]
**timezone** | **String!** | Device timezone | [optional] [default to null]
**timezoneAbbr** | **String!** | Timezone abbreviation | [optional] [default to null]
**Type_** | **String!** | Device type | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


