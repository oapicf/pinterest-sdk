
# Table `ConversionEventDeviceInfo`
(mapped from: ConversionEventDeviceInfo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**batteryLevel** | battery_level | int UNSIGNED |  | **kotlin.Int** | Battery charge level percentage |  [optional]
**brand** | brand | text |  | **kotlin.String** | Device brand |  [optional]
**carrier** | carrier | text |  | **kotlin.String** | User device&#39;s mobile carrier. |  [optional]
**cpuCores** | cpu_cores | int UNSIGNED |  | **kotlin.Int** | Number of CPU cores |  [optional]
**externalStorageFreeSpace** | external_storage_free_space | int UNSIGNED |  | **kotlin.Int** | External storage size in GB |  [optional]
**externalStorageSize** | external_storage_size | int UNSIGNED |  | **kotlin.Int** | External storage size in GB |  [optional]
**formFactor** | form_factor | long |  | [**FormFactor**](FormFactor.md) | Device form factor |  [optional] [foreignkey]
**kernelVersion** | kernel_version | text |  | **kotlin.String** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release |  [optional]
**languages** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of user installed languages. ISO 639-1 format |  [optional]
**locale** | locale | text |  | **kotlin.String** | Device locale BCP-47 format |  [optional]
**model** | model | text |  | **kotlin.String** | Device model name |  [optional]
**networkType** | network_type | long |  | [**NetworkType**](NetworkType.md) | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() |  [optional] [foreignkey]
**osFamily** | os_family | long |  | [**OsFamily**](OsFamily.md) | OS Family |  [optional] [foreignkey]
**osName** | os_name | text |  | **kotlin.String** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch |  [optional]
**osReleaseName** | os_release_name | text |  | **kotlin.String** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin |  [optional]
**osVersion** | os_version | text |  | **kotlin.String** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 |  [optional]
**screenDensity** | screen_density | int UNSIGNED |  | **kotlin.Int** | Screen density, PPI |  [optional]
**screenHeight** | screen_height | int UNSIGNED |  | **kotlin.Int** | Screen height in pixels |  [optional]
**screenWidth** | screen_width | int UNSIGNED |  | **kotlin.Int** | Screen width in pixels |  [optional]
**storageFreeSpace** | storage_free_space | int UNSIGNED |  | **kotlin.Int** | Internal storage size in GB |  [optional]
**storageSize** | storage_size | int UNSIGNED |  | **kotlin.Int** | Internal storage size in GB |  [optional]
**timezone** | timezone | text |  | **kotlin.String** | Device timezone |  [optional]
**timezoneAbbr** | timezone_abbr | text |  | **kotlin.String** | Timezone abbreviation |  [optional]
**type** | type | text |  | **kotlin.String** | Device type |  [optional]










# **Table `ConversionEventDeviceInfoLanguages`**
(mapped from: ConversionEventDeviceInfoLanguages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventDeviceInfo | conversionEventDeviceInfo | long | | kotlin.Long | Primary Key | *one*
languages | languages | text | | kotlin.String | Foreign Key | *many*


















