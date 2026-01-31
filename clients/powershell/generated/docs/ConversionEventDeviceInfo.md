# ConversionEventDeviceInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatteryLevel** | **Int32** | Battery charge level percentage | [optional] 
**Brand** | **String** | Device brand | [optional] 
**Carrier** | **String** | User device&#39;s mobile carrier. | [optional] 
**CpuCores** | **Int32** | Number of CPU cores | [optional] 
**ExternalStorageFreeSpace** | **Int32** | External storage size in GB | [optional] 
**ExternalStorageSize** | **Int32** | External storage size in GB | [optional] 
**FormFactor** | **String** | Device form factor | [optional] 
**KernelVersion** | **String** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] 
**Languages** | **String[]** | List of user installed languages. ISO 639-1 format | [optional] 
**Locale** | **String** | Device locale BCP-47 format | [optional] 
**Model** | **String** | Device model name | [optional] 
**NetworkType** | **String** | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] 
**OsFamily** | **String** | OS Family | [optional] 
**OsName** | **String** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] 
**OsReleaseName** | **String** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] 
**OsVersion** | **String** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] 
**ScreenDensity** | **Int32** | Screen density, PPI | [optional] 
**ScreenHeight** | **Int32** | Screen height in pixels | [optional] 
**ScreenWidth** | **Int32** | Screen width in pixels | [optional] 
**StorageFreeSpace** | **Int32** | Internal storage size in GB | [optional] 
**StorageSize** | **Int32** | Internal storage size in GB | [optional] 
**Timezone** | **String** | Device timezone | [optional] 
**TimezoneAbbr** | **String** | Timezone abbreviation | [optional] 
**Type** | **String** | Device type | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionEventDeviceInfo = Initialize-PSOpenAPIToolsConversionEventDeviceInfo  -BatteryLevel 78 `
 -Brand Apple, Samsung, Motorola `
 -Carrier T-Mobile `
 -CpuCores 8 `
 -ExternalStorageFreeSpace 126 `
 -ExternalStorageSize 512 `
 -FormFactor cellphone `
 -KernelVersion 6.15 `
 -Languages [&quot;en&quot;,&quot;de&quot;,&quot;lt&quot;] `
 -Locale en-us `
 -Model 16 Pro, Galaxy S25 Ultra `
 -NetworkType wifi `
 -OsFamily ios `
 -OsName 10 `
 -OsReleaseName 18.3 `
 -OsVersion 18.3 `
 -ScreenDensity 460 `
 -ScreenHeight 2868 `
 -ScreenWidth 1320 `
 -StorageFreeSpace 184 `
 -StorageSize 256 `
 -Timezone USA/New York `
 -TimezoneAbbr PDT `
 -Type iPhone, Android
```

- Convert the resource to JSON
```powershell
$ConversionEventDeviceInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

