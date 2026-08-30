# ConversionEventDeviceInfo

Object containing information about the device where event occurred.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**battery_level** | **int** | Battery charge level percentage | [optional] 
**brand** | **str** | Device brand | [optional] 
**carrier** | **str** | User device&#39;s mobile carrier. | [optional] 
**cpu_cores** | **int** | Number of CPU cores | [optional] 
**external_storage_free_space** | **int** | External storage size in GB | [optional] 
**external_storage_size** | **int** | External storage size in GB | [optional] 
**form_factor** | [**FormFactor**](FormFactor.md) | Device form factor | [optional] 
**kernel_version** | **str** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] 
**languages** | **List[str]** | List of user installed languages. ISO 639-1 format | [optional] 
**locale** | **str** | Device locale BCP-47 format | [optional] 
**model** | **str** | Device model name | [optional] 
**network_type** | [**NetworkType**](NetworkType.md) | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] 
**os_family** | [**OsFamily**](OsFamily.md) | OS Family | [optional] 
**os_name** | **str** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] 
**os_release_name** | **str** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] 
**os_version** | **str** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] 
**screen_density** | **int** | Screen density, PPI | [optional] 
**screen_height** | **int** | Screen height in pixels | [optional] 
**screen_width** | **int** | Screen width in pixels | [optional] 
**storage_free_space** | **int** | Internal storage size in GB | [optional] 
**storage_size** | **int** | Internal storage size in GB | [optional] 
**timezone** | **str** | Device timezone | [optional] 
**timezone_abbr** | **str** | Timezone abbreviation | [optional] 
**type** | **str** | Device type | [optional] 

## Example

```python
from openapi_client.models.conversion_event_device_info import ConversionEventDeviceInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionEventDeviceInfo from a JSON string
conversion_event_device_info_instance = ConversionEventDeviceInfo.from_json(json)
# print the JSON string representation of the object
print ConversionEventDeviceInfo.to_json()

# convert the object into a dict
conversion_event_device_info_dict = conversion_event_device_info_instance.to_dict()
# create an instance of ConversionEventDeviceInfo from a dict
conversion_event_device_info_from_dict = ConversionEventDeviceInfo.from_dict(conversion_event_device_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


