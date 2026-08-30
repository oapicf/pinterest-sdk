# ConversionEventsDataItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActionSource** | **string** | The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60; | 
**AppId** | Pointer to **NullableString** | The app store app ID. | [optional] 
**AppInfo** | Pointer to [**ConversionEventAppInfo**](ConversionEventAppInfo.md) |  | [optional] 
**AppName** | Pointer to **NullableString** | Name of the app. | [optional] 
**AppVersion** | Pointer to **NullableString** | Version of the app. | [optional] 
**CustomData** | Pointer to [**ConversionEventsDataItemsCustomData**](ConversionEventsDataItemsCustomData.md) |  | [optional] 
**DeviceBrand** | Pointer to **NullableString** | Brand of the user device. | [optional] 
**DeviceCarrier** | Pointer to **NullableString** | User device&#39;s mobile carrier. | [optional] 
**DeviceInfo** | Pointer to [**ConversionEventDeviceInfo**](ConversionEventDeviceInfo.md) |  | [optional] 
**DeviceModel** | Pointer to **NullableString** | Model of the user device. | [optional] 
**DeviceType** | Pointer to **NullableString** | Type of the user device. | [optional] 
**EventId** | **string** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**EventName** | **string** | The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60; | 
**EventSourceUrl** | Pointer to **NullableString** | URL of the web conversion event. | [optional] 
**EventTime** | **int64** | The time when the event happened. Unix timestamp in seconds. | 
**Language** | Pointer to **NullableString** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] 
**OptOut** | Pointer to **bool** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] 
**OsVersion** | Pointer to **NullableString** | Version of the device operating system. | [optional] 
**PartnerName** | Pointer to **NullableString** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39; | [optional] 
**UserData** | [**ConversionEventsUserDataProperties**](ConversionEventsUserDataProperties.md) | Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent. | 
**Wifi** | Pointer to **bool** | Whether the event occurred when the user device was connected to wifi. | [optional] 

## Methods

### NewConversionEventsDataItems

`func NewConversionEventsDataItems(actionSource string, eventId string, eventName string, eventTime int64, userData ConversionEventsUserDataProperties, ) *ConversionEventsDataItems`

NewConversionEventsDataItems instantiates a new ConversionEventsDataItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventsDataItemsWithDefaults

`func NewConversionEventsDataItemsWithDefaults() *ConversionEventsDataItems`

NewConversionEventsDataItemsWithDefaults instantiates a new ConversionEventsDataItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActionSource

`func (o *ConversionEventsDataItems) GetActionSource() string`

GetActionSource returns the ActionSource field if non-nil, zero value otherwise.

### GetActionSourceOk

`func (o *ConversionEventsDataItems) GetActionSourceOk() (*string, bool)`

GetActionSourceOk returns a tuple with the ActionSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActionSource

`func (o *ConversionEventsDataItems) SetActionSource(v string)`

SetActionSource sets ActionSource field to given value.


### GetAppId

`func (o *ConversionEventsDataItems) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *ConversionEventsDataItems) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *ConversionEventsDataItems) SetAppId(v string)`

SetAppId sets AppId field to given value.

### HasAppId

`func (o *ConversionEventsDataItems) HasAppId() bool`

HasAppId returns a boolean if a field has been set.

### SetAppIdNil

`func (o *ConversionEventsDataItems) SetAppIdNil(b bool)`

 SetAppIdNil sets the value for AppId to be an explicit nil

### UnsetAppId
`func (o *ConversionEventsDataItems) UnsetAppId()`

UnsetAppId ensures that no value is present for AppId, not even an explicit nil
### GetAppInfo

`func (o *ConversionEventsDataItems) GetAppInfo() ConversionEventAppInfo`

GetAppInfo returns the AppInfo field if non-nil, zero value otherwise.

### GetAppInfoOk

`func (o *ConversionEventsDataItems) GetAppInfoOk() (*ConversionEventAppInfo, bool)`

GetAppInfoOk returns a tuple with the AppInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppInfo

`func (o *ConversionEventsDataItems) SetAppInfo(v ConversionEventAppInfo)`

SetAppInfo sets AppInfo field to given value.

### HasAppInfo

`func (o *ConversionEventsDataItems) HasAppInfo() bool`

HasAppInfo returns a boolean if a field has been set.

### GetAppName

`func (o *ConversionEventsDataItems) GetAppName() string`

GetAppName returns the AppName field if non-nil, zero value otherwise.

### GetAppNameOk

`func (o *ConversionEventsDataItems) GetAppNameOk() (*string, bool)`

GetAppNameOk returns a tuple with the AppName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppName

`func (o *ConversionEventsDataItems) SetAppName(v string)`

SetAppName sets AppName field to given value.

### HasAppName

`func (o *ConversionEventsDataItems) HasAppName() bool`

HasAppName returns a boolean if a field has been set.

### SetAppNameNil

`func (o *ConversionEventsDataItems) SetAppNameNil(b bool)`

 SetAppNameNil sets the value for AppName to be an explicit nil

### UnsetAppName
`func (o *ConversionEventsDataItems) UnsetAppName()`

UnsetAppName ensures that no value is present for AppName, not even an explicit nil
### GetAppVersion

`func (o *ConversionEventsDataItems) GetAppVersion() string`

GetAppVersion returns the AppVersion field if non-nil, zero value otherwise.

### GetAppVersionOk

`func (o *ConversionEventsDataItems) GetAppVersionOk() (*string, bool)`

GetAppVersionOk returns a tuple with the AppVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppVersion

`func (o *ConversionEventsDataItems) SetAppVersion(v string)`

SetAppVersion sets AppVersion field to given value.

### HasAppVersion

`func (o *ConversionEventsDataItems) HasAppVersion() bool`

HasAppVersion returns a boolean if a field has been set.

### SetAppVersionNil

`func (o *ConversionEventsDataItems) SetAppVersionNil(b bool)`

 SetAppVersionNil sets the value for AppVersion to be an explicit nil

### UnsetAppVersion
`func (o *ConversionEventsDataItems) UnsetAppVersion()`

UnsetAppVersion ensures that no value is present for AppVersion, not even an explicit nil
### GetCustomData

`func (o *ConversionEventsDataItems) GetCustomData() ConversionEventsDataItemsCustomData`

GetCustomData returns the CustomData field if non-nil, zero value otherwise.

### GetCustomDataOk

`func (o *ConversionEventsDataItems) GetCustomDataOk() (*ConversionEventsDataItemsCustomData, bool)`

GetCustomDataOk returns a tuple with the CustomData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomData

`func (o *ConversionEventsDataItems) SetCustomData(v ConversionEventsDataItemsCustomData)`

SetCustomData sets CustomData field to given value.

### HasCustomData

`func (o *ConversionEventsDataItems) HasCustomData() bool`

HasCustomData returns a boolean if a field has been set.

### GetDeviceBrand

`func (o *ConversionEventsDataItems) GetDeviceBrand() string`

GetDeviceBrand returns the DeviceBrand field if non-nil, zero value otherwise.

### GetDeviceBrandOk

`func (o *ConversionEventsDataItems) GetDeviceBrandOk() (*string, bool)`

GetDeviceBrandOk returns a tuple with the DeviceBrand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeviceBrand

`func (o *ConversionEventsDataItems) SetDeviceBrand(v string)`

SetDeviceBrand sets DeviceBrand field to given value.

### HasDeviceBrand

`func (o *ConversionEventsDataItems) HasDeviceBrand() bool`

HasDeviceBrand returns a boolean if a field has been set.

### SetDeviceBrandNil

`func (o *ConversionEventsDataItems) SetDeviceBrandNil(b bool)`

 SetDeviceBrandNil sets the value for DeviceBrand to be an explicit nil

### UnsetDeviceBrand
`func (o *ConversionEventsDataItems) UnsetDeviceBrand()`

UnsetDeviceBrand ensures that no value is present for DeviceBrand, not even an explicit nil
### GetDeviceCarrier

`func (o *ConversionEventsDataItems) GetDeviceCarrier() string`

GetDeviceCarrier returns the DeviceCarrier field if non-nil, zero value otherwise.

### GetDeviceCarrierOk

`func (o *ConversionEventsDataItems) GetDeviceCarrierOk() (*string, bool)`

GetDeviceCarrierOk returns a tuple with the DeviceCarrier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeviceCarrier

`func (o *ConversionEventsDataItems) SetDeviceCarrier(v string)`

SetDeviceCarrier sets DeviceCarrier field to given value.

### HasDeviceCarrier

`func (o *ConversionEventsDataItems) HasDeviceCarrier() bool`

HasDeviceCarrier returns a boolean if a field has been set.

### SetDeviceCarrierNil

`func (o *ConversionEventsDataItems) SetDeviceCarrierNil(b bool)`

 SetDeviceCarrierNil sets the value for DeviceCarrier to be an explicit nil

### UnsetDeviceCarrier
`func (o *ConversionEventsDataItems) UnsetDeviceCarrier()`

UnsetDeviceCarrier ensures that no value is present for DeviceCarrier, not even an explicit nil
### GetDeviceInfo

`func (o *ConversionEventsDataItems) GetDeviceInfo() ConversionEventDeviceInfo`

GetDeviceInfo returns the DeviceInfo field if non-nil, zero value otherwise.

### GetDeviceInfoOk

`func (o *ConversionEventsDataItems) GetDeviceInfoOk() (*ConversionEventDeviceInfo, bool)`

GetDeviceInfoOk returns a tuple with the DeviceInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeviceInfo

`func (o *ConversionEventsDataItems) SetDeviceInfo(v ConversionEventDeviceInfo)`

SetDeviceInfo sets DeviceInfo field to given value.

### HasDeviceInfo

`func (o *ConversionEventsDataItems) HasDeviceInfo() bool`

HasDeviceInfo returns a boolean if a field has been set.

### GetDeviceModel

`func (o *ConversionEventsDataItems) GetDeviceModel() string`

GetDeviceModel returns the DeviceModel field if non-nil, zero value otherwise.

### GetDeviceModelOk

`func (o *ConversionEventsDataItems) GetDeviceModelOk() (*string, bool)`

GetDeviceModelOk returns a tuple with the DeviceModel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeviceModel

`func (o *ConversionEventsDataItems) SetDeviceModel(v string)`

SetDeviceModel sets DeviceModel field to given value.

### HasDeviceModel

`func (o *ConversionEventsDataItems) HasDeviceModel() bool`

HasDeviceModel returns a boolean if a field has been set.

### SetDeviceModelNil

`func (o *ConversionEventsDataItems) SetDeviceModelNil(b bool)`

 SetDeviceModelNil sets the value for DeviceModel to be an explicit nil

### UnsetDeviceModel
`func (o *ConversionEventsDataItems) UnsetDeviceModel()`

UnsetDeviceModel ensures that no value is present for DeviceModel, not even an explicit nil
### GetDeviceType

`func (o *ConversionEventsDataItems) GetDeviceType() string`

GetDeviceType returns the DeviceType field if non-nil, zero value otherwise.

### GetDeviceTypeOk

`func (o *ConversionEventsDataItems) GetDeviceTypeOk() (*string, bool)`

GetDeviceTypeOk returns a tuple with the DeviceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeviceType

`func (o *ConversionEventsDataItems) SetDeviceType(v string)`

SetDeviceType sets DeviceType field to given value.

### HasDeviceType

`func (o *ConversionEventsDataItems) HasDeviceType() bool`

HasDeviceType returns a boolean if a field has been set.

### SetDeviceTypeNil

`func (o *ConversionEventsDataItems) SetDeviceTypeNil(b bool)`

 SetDeviceTypeNil sets the value for DeviceType to be an explicit nil

### UnsetDeviceType
`func (o *ConversionEventsDataItems) UnsetDeviceType()`

UnsetDeviceType ensures that no value is present for DeviceType, not even an explicit nil
### GetEventId

`func (o *ConversionEventsDataItems) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *ConversionEventsDataItems) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *ConversionEventsDataItems) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetEventName

`func (o *ConversionEventsDataItems) GetEventName() string`

GetEventName returns the EventName field if non-nil, zero value otherwise.

### GetEventNameOk

`func (o *ConversionEventsDataItems) GetEventNameOk() (*string, bool)`

GetEventNameOk returns a tuple with the EventName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventName

`func (o *ConversionEventsDataItems) SetEventName(v string)`

SetEventName sets EventName field to given value.


### GetEventSourceUrl

`func (o *ConversionEventsDataItems) GetEventSourceUrl() string`

GetEventSourceUrl returns the EventSourceUrl field if non-nil, zero value otherwise.

### GetEventSourceUrlOk

`func (o *ConversionEventsDataItems) GetEventSourceUrlOk() (*string, bool)`

GetEventSourceUrlOk returns a tuple with the EventSourceUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventSourceUrl

`func (o *ConversionEventsDataItems) SetEventSourceUrl(v string)`

SetEventSourceUrl sets EventSourceUrl field to given value.

### HasEventSourceUrl

`func (o *ConversionEventsDataItems) HasEventSourceUrl() bool`

HasEventSourceUrl returns a boolean if a field has been set.

### SetEventSourceUrlNil

`func (o *ConversionEventsDataItems) SetEventSourceUrlNil(b bool)`

 SetEventSourceUrlNil sets the value for EventSourceUrl to be an explicit nil

### UnsetEventSourceUrl
`func (o *ConversionEventsDataItems) UnsetEventSourceUrl()`

UnsetEventSourceUrl ensures that no value is present for EventSourceUrl, not even an explicit nil
### GetEventTime

`func (o *ConversionEventsDataItems) GetEventTime() int64`

GetEventTime returns the EventTime field if non-nil, zero value otherwise.

### GetEventTimeOk

`func (o *ConversionEventsDataItems) GetEventTimeOk() (*int64, bool)`

GetEventTimeOk returns a tuple with the EventTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventTime

`func (o *ConversionEventsDataItems) SetEventTime(v int64)`

SetEventTime sets EventTime field to given value.


### GetLanguage

`func (o *ConversionEventsDataItems) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *ConversionEventsDataItems) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *ConversionEventsDataItems) SetLanguage(v string)`

SetLanguage sets Language field to given value.

### HasLanguage

`func (o *ConversionEventsDataItems) HasLanguage() bool`

HasLanguage returns a boolean if a field has been set.

### SetLanguageNil

`func (o *ConversionEventsDataItems) SetLanguageNil(b bool)`

 SetLanguageNil sets the value for Language to be an explicit nil

### UnsetLanguage
`func (o *ConversionEventsDataItems) UnsetLanguage()`

UnsetLanguage ensures that no value is present for Language, not even an explicit nil
### GetOptOut

`func (o *ConversionEventsDataItems) GetOptOut() bool`

GetOptOut returns the OptOut field if non-nil, zero value otherwise.

### GetOptOutOk

`func (o *ConversionEventsDataItems) GetOptOutOk() (*bool, bool)`

GetOptOutOk returns a tuple with the OptOut field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptOut

`func (o *ConversionEventsDataItems) SetOptOut(v bool)`

SetOptOut sets OptOut field to given value.

### HasOptOut

`func (o *ConversionEventsDataItems) HasOptOut() bool`

HasOptOut returns a boolean if a field has been set.

### GetOsVersion

`func (o *ConversionEventsDataItems) GetOsVersion() string`

GetOsVersion returns the OsVersion field if non-nil, zero value otherwise.

### GetOsVersionOk

`func (o *ConversionEventsDataItems) GetOsVersionOk() (*string, bool)`

GetOsVersionOk returns a tuple with the OsVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOsVersion

`func (o *ConversionEventsDataItems) SetOsVersion(v string)`

SetOsVersion sets OsVersion field to given value.

### HasOsVersion

`func (o *ConversionEventsDataItems) HasOsVersion() bool`

HasOsVersion returns a boolean if a field has been set.

### SetOsVersionNil

`func (o *ConversionEventsDataItems) SetOsVersionNil(b bool)`

 SetOsVersionNil sets the value for OsVersion to be an explicit nil

### UnsetOsVersion
`func (o *ConversionEventsDataItems) UnsetOsVersion()`

UnsetOsVersion ensures that no value is present for OsVersion, not even an explicit nil
### GetPartnerName

`func (o *ConversionEventsDataItems) GetPartnerName() string`

GetPartnerName returns the PartnerName field if non-nil, zero value otherwise.

### GetPartnerNameOk

`func (o *ConversionEventsDataItems) GetPartnerNameOk() (*string, bool)`

GetPartnerNameOk returns a tuple with the PartnerName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerName

`func (o *ConversionEventsDataItems) SetPartnerName(v string)`

SetPartnerName sets PartnerName field to given value.

### HasPartnerName

`func (o *ConversionEventsDataItems) HasPartnerName() bool`

HasPartnerName returns a boolean if a field has been set.

### SetPartnerNameNil

`func (o *ConversionEventsDataItems) SetPartnerNameNil(b bool)`

 SetPartnerNameNil sets the value for PartnerName to be an explicit nil

### UnsetPartnerName
`func (o *ConversionEventsDataItems) UnsetPartnerName()`

UnsetPartnerName ensures that no value is present for PartnerName, not even an explicit nil
### GetUserData

`func (o *ConversionEventsDataItems) GetUserData() ConversionEventsUserDataProperties`

GetUserData returns the UserData field if non-nil, zero value otherwise.

### GetUserDataOk

`func (o *ConversionEventsDataItems) GetUserDataOk() (*ConversionEventsUserDataProperties, bool)`

GetUserDataOk returns a tuple with the UserData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserData

`func (o *ConversionEventsDataItems) SetUserData(v ConversionEventsUserDataProperties)`

SetUserData sets UserData field to given value.


### GetWifi

`func (o *ConversionEventsDataItems) GetWifi() bool`

GetWifi returns the Wifi field if non-nil, zero value otherwise.

### GetWifiOk

`func (o *ConversionEventsDataItems) GetWifiOk() (*bool, bool)`

GetWifiOk returns a tuple with the Wifi field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWifi

`func (o *ConversionEventsDataItems) SetWifi(v bool)`

SetWifi sets Wifi field to given value.

### HasWifi

`func (o *ConversionEventsDataItems) HasWifi() bool`

HasWifi returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


