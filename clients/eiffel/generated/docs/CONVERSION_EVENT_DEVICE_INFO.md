# CONVERSION_EVENT_DEVICE_INFO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**battery_level** | **INTEGER_32** | Battery charge level percentage | [optional] [default to null]
**brand** | [**STRING_32**](STRING_32.md) | Device brand | [optional] [default to null]
**carrier** | [**STRING_32**](STRING_32.md) | User device&#39;s mobile carrier. | [optional] [default to null]
**cpu_cores** | **INTEGER_32** | Number of CPU cores | [optional] [default to null]
**external_storage_free_space** | **INTEGER_32** | External storage size in GB | [optional] [default to null]
**external_storage_size** | **INTEGER_32** | External storage size in GB | [optional] [default to null]
**form_factor** | [**STRING_32**](STRING_32.md) | Device form factor | [optional] [default to null]
**kernel_version** | [**STRING_32**](STRING_32.md) | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] [default to null]
**languages** | [**LIST [STRING_32]**](STRING_32.md) | List of user installed languages. ISO 639-1 format | [optional] [default to null]
**locale** | [**STRING_32**](STRING_32.md) | Device locale BCP-47 format | [optional] [default to null]
**model** | [**STRING_32**](STRING_32.md) | Device model name | [optional] [default to null]
**network_type** | [**STRING_32**](STRING_32.md) | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] [default to null]
**os_family** | [**STRING_32**](STRING_32.md) | OS Family | [optional] [default to null]
**os_name** | [**STRING_32**](STRING_32.md) | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] [default to null]
**os_release_name** | [**STRING_32**](STRING_32.md) | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] [default to null]
**os_version** | [**STRING_32**](STRING_32.md) | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] [default to null]
**screen_density** | **INTEGER_32** | Screen density, PPI | [optional] [default to null]
**screen_height** | **INTEGER_32** | Screen height in pixels | [optional] [default to null]
**screen_width** | **INTEGER_32** | Screen width in pixels | [optional] [default to null]
**storage_free_space** | **INTEGER_32** | Internal storage size in GB | [optional] [default to null]
**storage_size** | **INTEGER_32** | Internal storage size in GB | [optional] [default to null]
**timezone** | [**STRING_32**](STRING_32.md) | Device timezone | [optional] [default to null]
**timezone_abbr** | [**STRING_32**](STRING_32.md) | Timezone abbreviation | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Device type | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


