# ConversionEventDeviceInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**battery_level** | Option<**i32**> | Battery charge level percentage | [optional]
**brand** | Option<**String**> | Device brand | [optional]
**carrier** | Option<**String**> | User device's mobile carrier. | [optional]
**cpu_cores** | Option<**i32**> | Number of CPU cores | [optional]
**external_storage_free_space** | Option<**i32**> | External storage size in GB | [optional]
**external_storage_size** | Option<**i32**> | External storage size in GB | [optional]
**form_factor** | Option<**String**> | Device form factor | [optional]
**kernel_version** | Option<**String**> | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional]
**languages** | Option<**Vec<String>**> | List of user installed languages. ISO 639-1 format | [optional]
**locale** | Option<**String**> | Device locale BCP-47 format | [optional]
**model** | Option<**String**> | Device model name | [optional]
**network_type** | Option<**String**> | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional]
**os_family** | Option<**String**> | OS Family | [optional]
**os_name** | Option<**String**> | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional]
**os_release_name** | Option<**String**> | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional]
**os_version** | Option<**String**> | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional]
**screen_density** | Option<**i32**> | Screen density, PPI | [optional]
**screen_height** | Option<**i32**> | Screen height in pixels | [optional]
**screen_width** | Option<**i32**> | Screen width in pixels | [optional]
**storage_free_space** | Option<**i32**> | Internal storage size in GB | [optional]
**storage_size** | Option<**i32**> | Internal storage size in GB | [optional]
**timezone** | Option<**String**> | Device timezone | [optional]
**timezone_abbr** | Option<**String**> | Timezone abbreviation | [optional]
**r#type** | Option<**String**> | Device type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


