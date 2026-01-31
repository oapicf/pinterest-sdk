# ConversionEventDeviceInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatteryLevel** | Pointer to **int32** | Battery charge level percentage | [optional] 
**Brand** | Pointer to **string** | Device brand | [optional] 
**Carrier** | Pointer to **string** | User device&#39;s mobile carrier. | [optional] 
**CpuCores** | Pointer to **int32** | Number of CPU cores | [optional] 
**ExternalStorageFreeSpace** | Pointer to **int32** | External storage size in GB | [optional] 
**ExternalStorageSize** | Pointer to **int32** | External storage size in GB | [optional] 
**FormFactor** | Pointer to **string** | Device form factor | [optional] 
**KernelVersion** | Pointer to **string** | Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release | [optional] 
**Languages** | Pointer to **[]string** | List of user installed languages. ISO 639-1 format | [optional] 
**Locale** | Pointer to **string** | Device locale BCP-47 format | [optional] 
**Model** | Pointer to **string** | Device model name | [optional] 
**NetworkType** | Pointer to **string** | Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() | [optional] 
**OsFamily** | Pointer to **string** | OS Family | [optional] 
**OsName** | Pointer to **string** | Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch | [optional] 
**OsReleaseName** | Pointer to **string** | Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin | [optional] 
**OsVersion** | Pointer to **string** | Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 | [optional] 
**ScreenDensity** | Pointer to **int32** | Screen density, PPI | [optional] 
**ScreenHeight** | Pointer to **int32** | Screen height in pixels | [optional] 
**ScreenWidth** | Pointer to **int32** | Screen width in pixels | [optional] 
**StorageFreeSpace** | Pointer to **int32** | Internal storage size in GB | [optional] 
**StorageSize** | Pointer to **int32** | Internal storage size in GB | [optional] 
**Timezone** | Pointer to **string** | Device timezone | [optional] 
**TimezoneAbbr** | Pointer to **string** | Timezone abbreviation | [optional] 
**Type** | Pointer to **string** | Device type | [optional] 

## Methods

### NewConversionEventDeviceInfo

`func NewConversionEventDeviceInfo() *ConversionEventDeviceInfo`

NewConversionEventDeviceInfo instantiates a new ConversionEventDeviceInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventDeviceInfoWithDefaults

`func NewConversionEventDeviceInfoWithDefaults() *ConversionEventDeviceInfo`

NewConversionEventDeviceInfoWithDefaults instantiates a new ConversionEventDeviceInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBatteryLevel

`func (o *ConversionEventDeviceInfo) GetBatteryLevel() int32`

GetBatteryLevel returns the BatteryLevel field if non-nil, zero value otherwise.

### GetBatteryLevelOk

`func (o *ConversionEventDeviceInfo) GetBatteryLevelOk() (*int32, bool)`

GetBatteryLevelOk returns a tuple with the BatteryLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatteryLevel

`func (o *ConversionEventDeviceInfo) SetBatteryLevel(v int32)`

SetBatteryLevel sets BatteryLevel field to given value.

### HasBatteryLevel

`func (o *ConversionEventDeviceInfo) HasBatteryLevel() bool`

HasBatteryLevel returns a boolean if a field has been set.

### GetBrand

`func (o *ConversionEventDeviceInfo) GetBrand() string`

GetBrand returns the Brand field if non-nil, zero value otherwise.

### GetBrandOk

`func (o *ConversionEventDeviceInfo) GetBrandOk() (*string, bool)`

GetBrandOk returns a tuple with the Brand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrand

`func (o *ConversionEventDeviceInfo) SetBrand(v string)`

SetBrand sets Brand field to given value.

### HasBrand

`func (o *ConversionEventDeviceInfo) HasBrand() bool`

HasBrand returns a boolean if a field has been set.

### GetCarrier

`func (o *ConversionEventDeviceInfo) GetCarrier() string`

GetCarrier returns the Carrier field if non-nil, zero value otherwise.

### GetCarrierOk

`func (o *ConversionEventDeviceInfo) GetCarrierOk() (*string, bool)`

GetCarrierOk returns a tuple with the Carrier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarrier

`func (o *ConversionEventDeviceInfo) SetCarrier(v string)`

SetCarrier sets Carrier field to given value.

### HasCarrier

`func (o *ConversionEventDeviceInfo) HasCarrier() bool`

HasCarrier returns a boolean if a field has been set.

### GetCpuCores

`func (o *ConversionEventDeviceInfo) GetCpuCores() int32`

GetCpuCores returns the CpuCores field if non-nil, zero value otherwise.

### GetCpuCoresOk

`func (o *ConversionEventDeviceInfo) GetCpuCoresOk() (*int32, bool)`

GetCpuCoresOk returns a tuple with the CpuCores field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCpuCores

`func (o *ConversionEventDeviceInfo) SetCpuCores(v int32)`

SetCpuCores sets CpuCores field to given value.

### HasCpuCores

`func (o *ConversionEventDeviceInfo) HasCpuCores() bool`

HasCpuCores returns a boolean if a field has been set.

### GetExternalStorageFreeSpace

`func (o *ConversionEventDeviceInfo) GetExternalStorageFreeSpace() int32`

GetExternalStorageFreeSpace returns the ExternalStorageFreeSpace field if non-nil, zero value otherwise.

### GetExternalStorageFreeSpaceOk

`func (o *ConversionEventDeviceInfo) GetExternalStorageFreeSpaceOk() (*int32, bool)`

GetExternalStorageFreeSpaceOk returns a tuple with the ExternalStorageFreeSpace field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalStorageFreeSpace

`func (o *ConversionEventDeviceInfo) SetExternalStorageFreeSpace(v int32)`

SetExternalStorageFreeSpace sets ExternalStorageFreeSpace field to given value.

### HasExternalStorageFreeSpace

`func (o *ConversionEventDeviceInfo) HasExternalStorageFreeSpace() bool`

HasExternalStorageFreeSpace returns a boolean if a field has been set.

### GetExternalStorageSize

`func (o *ConversionEventDeviceInfo) GetExternalStorageSize() int32`

GetExternalStorageSize returns the ExternalStorageSize field if non-nil, zero value otherwise.

### GetExternalStorageSizeOk

`func (o *ConversionEventDeviceInfo) GetExternalStorageSizeOk() (*int32, bool)`

GetExternalStorageSizeOk returns a tuple with the ExternalStorageSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalStorageSize

`func (o *ConversionEventDeviceInfo) SetExternalStorageSize(v int32)`

SetExternalStorageSize sets ExternalStorageSize field to given value.

### HasExternalStorageSize

`func (o *ConversionEventDeviceInfo) HasExternalStorageSize() bool`

HasExternalStorageSize returns a boolean if a field has been set.

### GetFormFactor

`func (o *ConversionEventDeviceInfo) GetFormFactor() string`

GetFormFactor returns the FormFactor field if non-nil, zero value otherwise.

### GetFormFactorOk

`func (o *ConversionEventDeviceInfo) GetFormFactorOk() (*string, bool)`

GetFormFactorOk returns a tuple with the FormFactor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormFactor

`func (o *ConversionEventDeviceInfo) SetFormFactor(v string)`

SetFormFactor sets FormFactor field to given value.

### HasFormFactor

`func (o *ConversionEventDeviceInfo) HasFormFactor() bool`

HasFormFactor returns a boolean if a field has been set.

### GetKernelVersion

`func (o *ConversionEventDeviceInfo) GetKernelVersion() string`

GetKernelVersion returns the KernelVersion field if non-nil, zero value otherwise.

### GetKernelVersionOk

`func (o *ConversionEventDeviceInfo) GetKernelVersionOk() (*string, bool)`

GetKernelVersionOk returns a tuple with the KernelVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKernelVersion

`func (o *ConversionEventDeviceInfo) SetKernelVersion(v string)`

SetKernelVersion sets KernelVersion field to given value.

### HasKernelVersion

`func (o *ConversionEventDeviceInfo) HasKernelVersion() bool`

HasKernelVersion returns a boolean if a field has been set.

### GetLanguages

`func (o *ConversionEventDeviceInfo) GetLanguages() []string`

GetLanguages returns the Languages field if non-nil, zero value otherwise.

### GetLanguagesOk

`func (o *ConversionEventDeviceInfo) GetLanguagesOk() (*[]string, bool)`

GetLanguagesOk returns a tuple with the Languages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguages

`func (o *ConversionEventDeviceInfo) SetLanguages(v []string)`

SetLanguages sets Languages field to given value.

### HasLanguages

`func (o *ConversionEventDeviceInfo) HasLanguages() bool`

HasLanguages returns a boolean if a field has been set.

### GetLocale

`func (o *ConversionEventDeviceInfo) GetLocale() string`

GetLocale returns the Locale field if non-nil, zero value otherwise.

### GetLocaleOk

`func (o *ConversionEventDeviceInfo) GetLocaleOk() (*string, bool)`

GetLocaleOk returns a tuple with the Locale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocale

`func (o *ConversionEventDeviceInfo) SetLocale(v string)`

SetLocale sets Locale field to given value.

### HasLocale

`func (o *ConversionEventDeviceInfo) HasLocale() bool`

HasLocale returns a boolean if a field has been set.

### GetModel

`func (o *ConversionEventDeviceInfo) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *ConversionEventDeviceInfo) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *ConversionEventDeviceInfo) SetModel(v string)`

SetModel sets Model field to given value.

### HasModel

`func (o *ConversionEventDeviceInfo) HasModel() bool`

HasModel returns a boolean if a field has been set.

### GetNetworkType

`func (o *ConversionEventDeviceInfo) GetNetworkType() string`

GetNetworkType returns the NetworkType field if non-nil, zero value otherwise.

### GetNetworkTypeOk

`func (o *ConversionEventDeviceInfo) GetNetworkTypeOk() (*string, bool)`

GetNetworkTypeOk returns a tuple with the NetworkType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetworkType

`func (o *ConversionEventDeviceInfo) SetNetworkType(v string)`

SetNetworkType sets NetworkType field to given value.

### HasNetworkType

`func (o *ConversionEventDeviceInfo) HasNetworkType() bool`

HasNetworkType returns a boolean if a field has been set.

### GetOsFamily

`func (o *ConversionEventDeviceInfo) GetOsFamily() string`

GetOsFamily returns the OsFamily field if non-nil, zero value otherwise.

### GetOsFamilyOk

`func (o *ConversionEventDeviceInfo) GetOsFamilyOk() (*string, bool)`

GetOsFamilyOk returns a tuple with the OsFamily field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOsFamily

`func (o *ConversionEventDeviceInfo) SetOsFamily(v string)`

SetOsFamily sets OsFamily field to given value.

### HasOsFamily

`func (o *ConversionEventDeviceInfo) HasOsFamily() bool`

HasOsFamily returns a boolean if a field has been set.

### GetOsName

`func (o *ConversionEventDeviceInfo) GetOsName() string`

GetOsName returns the OsName field if non-nil, zero value otherwise.

### GetOsNameOk

`func (o *ConversionEventDeviceInfo) GetOsNameOk() (*string, bool)`

GetOsNameOk returns a tuple with the OsName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOsName

`func (o *ConversionEventDeviceInfo) SetOsName(v string)`

SetOsName sets OsName field to given value.

### HasOsName

`func (o *ConversionEventDeviceInfo) HasOsName() bool`

HasOsName returns a boolean if a field has been set.

### GetOsReleaseName

`func (o *ConversionEventDeviceInfo) GetOsReleaseName() string`

GetOsReleaseName returns the OsReleaseName field if non-nil, zero value otherwise.

### GetOsReleaseNameOk

`func (o *ConversionEventDeviceInfo) GetOsReleaseNameOk() (*string, bool)`

GetOsReleaseNameOk returns a tuple with the OsReleaseName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOsReleaseName

`func (o *ConversionEventDeviceInfo) SetOsReleaseName(v string)`

SetOsReleaseName sets OsReleaseName field to given value.

### HasOsReleaseName

`func (o *ConversionEventDeviceInfo) HasOsReleaseName() bool`

HasOsReleaseName returns a boolean if a field has been set.

### GetOsVersion

`func (o *ConversionEventDeviceInfo) GetOsVersion() string`

GetOsVersion returns the OsVersion field if non-nil, zero value otherwise.

### GetOsVersionOk

`func (o *ConversionEventDeviceInfo) GetOsVersionOk() (*string, bool)`

GetOsVersionOk returns a tuple with the OsVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOsVersion

`func (o *ConversionEventDeviceInfo) SetOsVersion(v string)`

SetOsVersion sets OsVersion field to given value.

### HasOsVersion

`func (o *ConversionEventDeviceInfo) HasOsVersion() bool`

HasOsVersion returns a boolean if a field has been set.

### GetScreenDensity

`func (o *ConversionEventDeviceInfo) GetScreenDensity() int32`

GetScreenDensity returns the ScreenDensity field if non-nil, zero value otherwise.

### GetScreenDensityOk

`func (o *ConversionEventDeviceInfo) GetScreenDensityOk() (*int32, bool)`

GetScreenDensityOk returns a tuple with the ScreenDensity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScreenDensity

`func (o *ConversionEventDeviceInfo) SetScreenDensity(v int32)`

SetScreenDensity sets ScreenDensity field to given value.

### HasScreenDensity

`func (o *ConversionEventDeviceInfo) HasScreenDensity() bool`

HasScreenDensity returns a boolean if a field has been set.

### GetScreenHeight

`func (o *ConversionEventDeviceInfo) GetScreenHeight() int32`

GetScreenHeight returns the ScreenHeight field if non-nil, zero value otherwise.

### GetScreenHeightOk

`func (o *ConversionEventDeviceInfo) GetScreenHeightOk() (*int32, bool)`

GetScreenHeightOk returns a tuple with the ScreenHeight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScreenHeight

`func (o *ConversionEventDeviceInfo) SetScreenHeight(v int32)`

SetScreenHeight sets ScreenHeight field to given value.

### HasScreenHeight

`func (o *ConversionEventDeviceInfo) HasScreenHeight() bool`

HasScreenHeight returns a boolean if a field has been set.

### GetScreenWidth

`func (o *ConversionEventDeviceInfo) GetScreenWidth() int32`

GetScreenWidth returns the ScreenWidth field if non-nil, zero value otherwise.

### GetScreenWidthOk

`func (o *ConversionEventDeviceInfo) GetScreenWidthOk() (*int32, bool)`

GetScreenWidthOk returns a tuple with the ScreenWidth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScreenWidth

`func (o *ConversionEventDeviceInfo) SetScreenWidth(v int32)`

SetScreenWidth sets ScreenWidth field to given value.

### HasScreenWidth

`func (o *ConversionEventDeviceInfo) HasScreenWidth() bool`

HasScreenWidth returns a boolean if a field has been set.

### GetStorageFreeSpace

`func (o *ConversionEventDeviceInfo) GetStorageFreeSpace() int32`

GetStorageFreeSpace returns the StorageFreeSpace field if non-nil, zero value otherwise.

### GetStorageFreeSpaceOk

`func (o *ConversionEventDeviceInfo) GetStorageFreeSpaceOk() (*int32, bool)`

GetStorageFreeSpaceOk returns a tuple with the StorageFreeSpace field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStorageFreeSpace

`func (o *ConversionEventDeviceInfo) SetStorageFreeSpace(v int32)`

SetStorageFreeSpace sets StorageFreeSpace field to given value.

### HasStorageFreeSpace

`func (o *ConversionEventDeviceInfo) HasStorageFreeSpace() bool`

HasStorageFreeSpace returns a boolean if a field has been set.

### GetStorageSize

`func (o *ConversionEventDeviceInfo) GetStorageSize() int32`

GetStorageSize returns the StorageSize field if non-nil, zero value otherwise.

### GetStorageSizeOk

`func (o *ConversionEventDeviceInfo) GetStorageSizeOk() (*int32, bool)`

GetStorageSizeOk returns a tuple with the StorageSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStorageSize

`func (o *ConversionEventDeviceInfo) SetStorageSize(v int32)`

SetStorageSize sets StorageSize field to given value.

### HasStorageSize

`func (o *ConversionEventDeviceInfo) HasStorageSize() bool`

HasStorageSize returns a boolean if a field has been set.

### GetTimezone

`func (o *ConversionEventDeviceInfo) GetTimezone() string`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *ConversionEventDeviceInfo) GetTimezoneOk() (*string, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *ConversionEventDeviceInfo) SetTimezone(v string)`

SetTimezone sets Timezone field to given value.

### HasTimezone

`func (o *ConversionEventDeviceInfo) HasTimezone() bool`

HasTimezone returns a boolean if a field has been set.

### GetTimezoneAbbr

`func (o *ConversionEventDeviceInfo) GetTimezoneAbbr() string`

GetTimezoneAbbr returns the TimezoneAbbr field if non-nil, zero value otherwise.

### GetTimezoneAbbrOk

`func (o *ConversionEventDeviceInfo) GetTimezoneAbbrOk() (*string, bool)`

GetTimezoneAbbrOk returns a tuple with the TimezoneAbbr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezoneAbbr

`func (o *ConversionEventDeviceInfo) SetTimezoneAbbr(v string)`

SetTimezoneAbbr sets TimezoneAbbr field to given value.

### HasTimezoneAbbr

`func (o *ConversionEventDeviceInfo) HasTimezoneAbbr() bool`

HasTimezoneAbbr returns a boolean if a field has been set.

### GetType

`func (o *ConversionEventDeviceInfo) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ConversionEventDeviceInfo) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ConversionEventDeviceInfo) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *ConversionEventDeviceInfo) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


