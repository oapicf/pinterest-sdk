# PinterestSdkClient::ConversionEventDeviceInfo

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **battery_level** | **Integer** | Battery charge level percentage | [optional] |
| **brand** | **String** | Device brand | [optional] |
| **carrier** | **String** | User device&#39;s mobile carrier. | [optional] |
| **cpu_cores** | **Integer** | Number of CPU cores | [optional] |
| **external_storage_free_space** | **Integer** | External storage size in GB | [optional] |
| **external_storage_size** | **Integer** | External storage size in GB | [optional] |
| **form_factor** | **String** | Device form factor | [optional] |
| **kernel_version** | **String** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] |
| **languages** | **Array&lt;String&gt;** | List of user installed languages. ISO 639-1 format | [optional] |
| **locale** | **String** | Device locale BCP-47 format | [optional] |
| **model** | **String** | Device model name | [optional] |
| **network_type** | **String** | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] |
| **os_family** | **String** | OS Family | [optional] |
| **os_name** | **String** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] |
| **os_release_name** | **String** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] |
| **os_version** | **String** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] |
| **screen_density** | **Integer** | Screen density, PPI | [optional] |
| **screen_height** | **Integer** | Screen height in pixels | [optional] |
| **screen_width** | **Integer** | Screen width in pixels | [optional] |
| **storage_free_space** | **Integer** | Internal storage size in GB | [optional] |
| **storage_size** | **Integer** | Internal storage size in GB | [optional] |
| **timezone** | **String** | Device timezone | [optional] |
| **timezone_abbr** | **String** | Timezone abbreviation | [optional] |
| **type** | **String** | Device type | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionEventDeviceInfo.new(
  battery_level: 78,
  brand: Apple, Samsung, Motorola,
  carrier: T-Mobile,
  cpu_cores: 8,
  external_storage_free_space: 126,
  external_storage_size: 512,
  form_factor: cellphone,
  kernel_version: 6.15,
  languages: [&quot;en&quot;,&quot;de&quot;,&quot;lt&quot;],
  locale: en-us,
  model: 16 Pro, Galaxy S25 Ultra,
  network_type: wifi,
  os_family: ios,
  os_name: 10,
  os_release_name: 18.3,
  os_version: 18.3,
  screen_density: 460,
  screen_height: 2868,
  screen_width: 1320,
  storage_free_space: 184,
  storage_size: 256,
  timezone: USA/New York,
  timezone_abbr: PDT,
  type: iPhone, Android
)
```

