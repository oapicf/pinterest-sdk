# conversion_event_device_info_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**battery_level** | **int** | Battery charge level percentage | [optional] 
**brand** | **char \*** | Device brand | [optional] 
**carrier** | **char \*** | User device&#39;s mobile carrier. | [optional] 
**cpu_cores** | **int** | Number of CPU cores | [optional] 
**external_storage_free_space** | **int** | External storage size in GB | [optional] 
**external_storage_size** | **int** | External storage size in GB | [optional] 
**form_factor** | **pinterest_rest_api_conversion_event_device_info_FORMFACTOR_e** | Device form factor | [optional] 
**kernel_version** | **char \*** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] 
**languages** | **list_t \*** | List of user installed languages. ISO 639-1 format | [optional] 
**locale** | **char \*** | Device locale BCP-47 format | [optional] 
**model** | **char \*** | Device model name | [optional] 
**network_type** | **pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_e** | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] 
**os_family** | **pinterest_rest_api_conversion_event_device_info_OSFAMILY_e** | OS Family | [optional] 
**os_name** | **char \*** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] 
**os_release_name** | **char \*** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] 
**os_version** | **char \*** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] 
**screen_density** | **int** | Screen density, PPI | [optional] 
**screen_height** | **int** | Screen height in pixels | [optional] 
**screen_width** | **int** | Screen width in pixels | [optional] 
**storage_free_space** | **int** | Internal storage size in GB | [optional] 
**storage_size** | **int** | Internal storage size in GB | [optional] 
**timezone** | **char \*** | Device timezone | [optional] 
**timezone_abbr** | **char \*** | Timezone abbreviation | [optional] 
**type** | **char \*** | Device type | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


