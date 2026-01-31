# ConversionEventAppInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppId** | Pointer to **string** | App ID in Google Play Store, AppStore or other stores. | [optional] 
**AppName** | Pointer to **string** | Name of the app. Primarily used for Mobile Apps. | [optional] 
**AppPackageName** | Pointer to **string** | App package name | [optional] 
**AppStore** | Pointer to **string** | The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps | [optional] 
**AppVersion** | Pointer to **string** | App version. Primarily used for mobile apps | [optional] 
**InstallTime** | Pointer to **int32** | App install time. Unix timestamp in seconds | [optional] 
**UserAgent** | Pointer to **string** | User Agent request header. Primarily used for Web events | [optional] 
**WindowHeight** | Pointer to **int32** | Inner height of the window or viewport. | [optional] 
**WindowWidth** | Pointer to **int32** | Inner width of the window or viewport. | [optional] 

## Methods

### NewConversionEventAppInfo

`func NewConversionEventAppInfo() *ConversionEventAppInfo`

NewConversionEventAppInfo instantiates a new ConversionEventAppInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventAppInfoWithDefaults

`func NewConversionEventAppInfoWithDefaults() *ConversionEventAppInfo`

NewConversionEventAppInfoWithDefaults instantiates a new ConversionEventAppInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppId

`func (o *ConversionEventAppInfo) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *ConversionEventAppInfo) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *ConversionEventAppInfo) SetAppId(v string)`

SetAppId sets AppId field to given value.

### HasAppId

`func (o *ConversionEventAppInfo) HasAppId() bool`

HasAppId returns a boolean if a field has been set.

### GetAppName

`func (o *ConversionEventAppInfo) GetAppName() string`

GetAppName returns the AppName field if non-nil, zero value otherwise.

### GetAppNameOk

`func (o *ConversionEventAppInfo) GetAppNameOk() (*string, bool)`

GetAppNameOk returns a tuple with the AppName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppName

`func (o *ConversionEventAppInfo) SetAppName(v string)`

SetAppName sets AppName field to given value.

### HasAppName

`func (o *ConversionEventAppInfo) HasAppName() bool`

HasAppName returns a boolean if a field has been set.

### GetAppPackageName

`func (o *ConversionEventAppInfo) GetAppPackageName() string`

GetAppPackageName returns the AppPackageName field if non-nil, zero value otherwise.

### GetAppPackageNameOk

`func (o *ConversionEventAppInfo) GetAppPackageNameOk() (*string, bool)`

GetAppPackageNameOk returns a tuple with the AppPackageName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppPackageName

`func (o *ConversionEventAppInfo) SetAppPackageName(v string)`

SetAppPackageName sets AppPackageName field to given value.

### HasAppPackageName

`func (o *ConversionEventAppInfo) HasAppPackageName() bool`

HasAppPackageName returns a boolean if a field has been set.

### GetAppStore

`func (o *ConversionEventAppInfo) GetAppStore() string`

GetAppStore returns the AppStore field if non-nil, zero value otherwise.

### GetAppStoreOk

`func (o *ConversionEventAppInfo) GetAppStoreOk() (*string, bool)`

GetAppStoreOk returns a tuple with the AppStore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppStore

`func (o *ConversionEventAppInfo) SetAppStore(v string)`

SetAppStore sets AppStore field to given value.

### HasAppStore

`func (o *ConversionEventAppInfo) HasAppStore() bool`

HasAppStore returns a boolean if a field has been set.

### GetAppVersion

`func (o *ConversionEventAppInfo) GetAppVersion() string`

GetAppVersion returns the AppVersion field if non-nil, zero value otherwise.

### GetAppVersionOk

`func (o *ConversionEventAppInfo) GetAppVersionOk() (*string, bool)`

GetAppVersionOk returns a tuple with the AppVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppVersion

`func (o *ConversionEventAppInfo) SetAppVersion(v string)`

SetAppVersion sets AppVersion field to given value.

### HasAppVersion

`func (o *ConversionEventAppInfo) HasAppVersion() bool`

HasAppVersion returns a boolean if a field has been set.

### GetInstallTime

`func (o *ConversionEventAppInfo) GetInstallTime() int32`

GetInstallTime returns the InstallTime field if non-nil, zero value otherwise.

### GetInstallTimeOk

`func (o *ConversionEventAppInfo) GetInstallTimeOk() (*int32, bool)`

GetInstallTimeOk returns a tuple with the InstallTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallTime

`func (o *ConversionEventAppInfo) SetInstallTime(v int32)`

SetInstallTime sets InstallTime field to given value.

### HasInstallTime

`func (o *ConversionEventAppInfo) HasInstallTime() bool`

HasInstallTime returns a boolean if a field has been set.

### GetUserAgent

`func (o *ConversionEventAppInfo) GetUserAgent() string`

GetUserAgent returns the UserAgent field if non-nil, zero value otherwise.

### GetUserAgentOk

`func (o *ConversionEventAppInfo) GetUserAgentOk() (*string, bool)`

GetUserAgentOk returns a tuple with the UserAgent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserAgent

`func (o *ConversionEventAppInfo) SetUserAgent(v string)`

SetUserAgent sets UserAgent field to given value.

### HasUserAgent

`func (o *ConversionEventAppInfo) HasUserAgent() bool`

HasUserAgent returns a boolean if a field has been set.

### GetWindowHeight

`func (o *ConversionEventAppInfo) GetWindowHeight() int32`

GetWindowHeight returns the WindowHeight field if non-nil, zero value otherwise.

### GetWindowHeightOk

`func (o *ConversionEventAppInfo) GetWindowHeightOk() (*int32, bool)`

GetWindowHeightOk returns a tuple with the WindowHeight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWindowHeight

`func (o *ConversionEventAppInfo) SetWindowHeight(v int32)`

SetWindowHeight sets WindowHeight field to given value.

### HasWindowHeight

`func (o *ConversionEventAppInfo) HasWindowHeight() bool`

HasWindowHeight returns a boolean if a field has been set.

### GetWindowWidth

`func (o *ConversionEventAppInfo) GetWindowWidth() int32`

GetWindowWidth returns the WindowWidth field if non-nil, zero value otherwise.

### GetWindowWidthOk

`func (o *ConversionEventAppInfo) GetWindowWidthOk() (*int32, bool)`

GetWindowWidthOk returns a tuple with the WindowWidth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWindowWidth

`func (o *ConversionEventAppInfo) SetWindowWidth(v int32)`

SetWindowWidth sets WindowWidth field to given value.

### HasWindowWidth

`func (o *ConversionEventAppInfo) HasWindowWidth() bool`

HasWindowWidth returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


