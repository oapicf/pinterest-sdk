# ConversionEventDeviceInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`battery_level`** | **`Int64`** | Battery charge level percentage | [optional] [default to nothing]
**`brand`** | **`String`** | Device brand | [optional] [default to nothing]
**`carrier`** | **`String`** | User device&#39;s mobile carrier. | [optional] [default to nothing]
**`cpu_cores`** | **`Int64`** | Number of CPU cores | [optional] [default to nothing]
**`external_storage_free_space`** | **`Int64`** | External storage size in GB | [optional] [default to nothing]
**`external_storage_size`** | **`Int64`** | External storage size in GB | [optional] [default to nothing]
**`form_factor`** | [**`*FormFactor`**](FormFactor.md) | Device form factor | [optional] [default to nothing]
**`kernel_version`** | **`String`** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] [default to nothing]
**`languages`** | **`Vector{String}`** | List of user installed languages. ISO 639-1 format | [optional] [default to nothing]
**`locale`** | **`String`** | Device locale BCP-47 format | [optional] [default to nothing]
**`model`** | **`String`** | Device model name | [optional] [default to nothing]
**`network_type`** | [**`*NetworkType`**](NetworkType.md) | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] [default to nothing]
**`os_family`** | [**`*OsFamily`**](OsFamily.md) | OS Family | [optional] [default to nothing]
**`os_name`** | **`String`** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] [default to nothing]
**`os_release_name`** | **`String`** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] [default to nothing]
**`os_version`** | **`String`** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] [default to nothing]
**`screen_density`** | **`Int64`** | Screen density, PPI | [optional] [default to nothing]
**`screen_height`** | **`Int64`** | Screen height in pixels | [optional] [default to nothing]
**`screen_width`** | **`Int64`** | Screen width in pixels | [optional] [default to nothing]
**`storage_free_space`** | **`Int64`** | Internal storage size in GB | [optional] [default to nothing]
**`storage_size`** | **`Int64`** | Internal storage size in GB | [optional] [default to nothing]
**`timezone`** | **`String`** | Device timezone | [optional] [default to nothing]
**`timezone_abbr`** | **`String`** | Timezone abbreviation | [optional] [default to nothing]
**`type`** | **`String`** | Device type | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


