# ConversionEventDeviceInfo

Object containing information about the device where event occurred.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**battery_level** | **number** | Battery charge level percentage | [optional] [default to undefined]
**brand** | **string** | Device brand | [optional] [default to undefined]
**carrier** | **string** | User device\&#39;s mobile carrier. | [optional] [default to undefined]
**cpu_cores** | **number** | Number of CPU cores | [optional] [default to undefined]
**external_storage_free_space** | **number** | External storage size in GB | [optional] [default to undefined]
**external_storage_size** | **number** | External storage size in GB | [optional] [default to undefined]
**form_factor** | [**FormFactor**](FormFactor.md) | Device form factor | [optional] [default to undefined]
**kernel_version** | **string** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] [default to undefined]
**languages** | **Array&lt;string&gt;** | List of user installed languages. ISO 639-1 format | [optional] [default to undefined]
**locale** | **string** | Device locale BCP-47 format | [optional] [default to undefined]
**model** | **string** | Device model name | [optional] [default to undefined]
**network_type** | [**NetworkType**](NetworkType.md) | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] [default to undefined]
**os_family** | [**OsFamily**](OsFamily.md) | OS Family | [optional] [default to undefined]
**os_name** | **string** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] [default to undefined]
**os_release_name** | **string** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] [default to undefined]
**os_version** | **string** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] [default to undefined]
**screen_density** | **number** | Screen density, PPI | [optional] [default to undefined]
**screen_height** | **number** | Screen height in pixels | [optional] [default to undefined]
**screen_width** | **number** | Screen width in pixels | [optional] [default to undefined]
**storage_free_space** | **number** | Internal storage size in GB | [optional] [default to undefined]
**storage_size** | **number** | Internal storage size in GB | [optional] [default to undefined]
**timezone** | **string** | Device timezone | [optional] [default to undefined]
**timezone_abbr** | **string** | Timezone abbreviation | [optional] [default to undefined]
**type** | **string** | Device type | [optional] [default to undefined]

## Example

```typescript
import { ConversionEventDeviceInfo } from './api';

const instance: ConversionEventDeviceInfo = {
    battery_level,
    brand,
    carrier,
    cpu_cores,
    external_storage_free_space,
    external_storage_size,
    form_factor,
    kernel_version,
    languages,
    locale,
    model,
    network_type,
    os_family,
    os_name,
    os_release_name,
    os_version,
    screen_density,
    screen_height,
    screen_width,
    storage_free_space,
    storage_size,
    timezone,
    timezone_abbr,
    type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
