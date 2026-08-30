# openapi::ConversionEventDeviceInfo

Object containing information about the device where event occurred.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**battery_level** | **integer** | Battery charge level percentage | [optional] [Max: 100] [Min: 0] 
**brand** | **character** | Device brand | [optional] [Max. length: 100] 
**carrier** | **character** | User device&#39;s mobile carrier. | [optional] [Max. length: 100] 
**cpu_cores** | **integer** | Number of CPU cores | [optional] [Max: 1152] [Min: 0] 
**external_storage_free_space** | **integer** | External storage size in GB | [optional] [Max: 1048576] [Min: 0] 
**external_storage_size** | **integer** | External storage size in GB | [optional] [Max: 1048576] [Min: 0] 
**form_factor** | [**FormFactor**](FormFactor.md) | Device form factor | [optional] [Enum: ] 
**kernel_version** | **character** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] [Max. length: 100] 
**languages** | **array[character]** | List of user installed languages. ISO 639-1 format | [optional] [Max. items: 100] [Min. items: 0] 
**locale** | **character** | Device locale BCP-47 format | [optional] [Max. length: 35] 
**model** | **character** | Device model name | [optional] [Max. length: 100] 
**network_type** | [**NetworkType**](NetworkType.md) | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] [Enum: ] 
**os_family** | [**OsFamily**](OsFamily.md) | OS Family | [optional] [Enum: ] 
**os_name** | **character** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] [Max. length: 100] 
**os_release_name** | **character** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] [Max. length: 100] 
**os_version** | **character** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] [Max. length: 100] 
**screen_density** | **integer** | Screen density, PPI | [optional] [Max: 100000] [Min: 0] 
**screen_height** | **integer** | Screen height in pixels | [optional] [Max: 30720] [Min: 0] 
**screen_width** | **integer** | Screen width in pixels | [optional] [Max: 30720] [Min: 0] 
**storage_free_space** | **integer** | Internal storage size in GB | [optional] [Max: 1048576] [Min: 0] 
**storage_size** | **integer** | Internal storage size in GB | [optional] [Max: 1048576] [Min: 0] 
**timezone** | **character** | Device timezone | [optional] [Max. length: 40] 
**timezone_abbr** | **character** | Timezone abbreviation | [optional] [Max. length: 5] 
**type** | **character** | Device type | [optional] [Max. length: 100] 


