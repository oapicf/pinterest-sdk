# ConversionEventDeviceInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**battery_level** | **u8** | Battery charge level percentage | [optional] [default to None]
**brand** | **String** | Device brand | [optional] [default to None]
**carrier** | **String** | User device's mobile carrier. | [optional] [default to None]
**cpu_cores** | **u16** | Number of CPU cores | [optional] [default to None]
**external_storage_free_space** | **u32** | External storage size in GB | [optional] [default to None]
**external_storage_size** | **u32** | External storage size in GB | [optional] [default to None]
**form_factor** | [***models::FormFactor**](FormFactor.md) | Device form factor | [optional] [default to None]
**kernel_version** | **String** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] [default to None]
**languages** | **Vec<String>** | List of user installed languages. ISO 639-1 format | [optional] [default to None]
**locale** | **String** | Device locale BCP-47 format | [optional] [default to None]
**model** | **String** | Device model name | [optional] [default to None]
**network_type** | [***models::NetworkType**](NetworkType.md) | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] [default to None]
**os_family** | [***models::OsFamily**](OsFamily.md) | OS Family | [optional] [default to None]
**os_name** | **String** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] [default to None]
**os_release_name** | **String** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] [default to None]
**os_version** | **String** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] [default to None]
**screen_density** | **u32** | Screen density, PPI | [optional] [default to None]
**screen_height** | **u16** | Screen height in pixels | [optional] [default to None]
**screen_width** | **u16** | Screen width in pixels | [optional] [default to None]
**storage_free_space** | **u32** | Internal storage size in GB | [optional] [default to None]
**storage_size** | **u32** | Internal storage size in GB | [optional] [default to None]
**timezone** | **String** | Device timezone | [optional] [default to None]
**timezone_abbr** | **String** | Timezone abbreviation | [optional] [default to None]
**r#type** | **String** | Device type | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


