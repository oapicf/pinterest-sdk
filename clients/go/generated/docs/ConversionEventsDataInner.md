# ConversionEventsDataInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventName** | **string** | The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt; &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt; &lt;li&gt;&lt;code&gt;custom&lt;/code&gt; &lt;li&gt;&lt;code&gt;lead&lt;/code&gt; &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt; &lt;li&gt;&lt;code&gt;search&lt;/code&gt; &lt;li&gt;&lt;code&gt;signup&lt;/code&gt; &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt; &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt; | 
**ActionSource** | **string** | The source indicating where the conversion event occurred. &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt; &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt; &lt;li&gt;&lt;code&gt;web&lt;/code&gt; &lt;li&gt;&lt;code&gt;offline&lt;/code&gt; | 
**EventTime** | **int64** | The time when the event happened. Unix timestamp in seconds. | 
**EventId** | **string** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**EventSourceUrl** | Pointer to **NullableString** | URL of the web conversion event. | [optional] 
**OptOut** | Pointer to **bool** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] 
**PartnerName** | Pointer to **NullableString** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ | [optional] 
**UserData** | [**NullableConversionEventsUserData**](ConversionEventsUserData.md) |  | 
**CustomData** | Pointer to [**ConversionEventsDataInnerCustomData**](ConversionEventsDataInnerCustomData.md) |  | [optional] 
**AppId** | Pointer to **NullableString** | The app store app ID. | [optional] 
**AppName** | Pointer to **NullableString** | Name of the app. | [optional] 
**AppVersion** | Pointer to **NullableString** | Version of the app. | [optional] 
**DeviceBrand** | Pointer to **NullableString** | Brand of the user device. | [optional] 
**DeviceCarrier** | Pointer to **NullableString** | User device&#39;s mobile carrier. | [optional] 
**DeviceModel** | Pointer to **NullableString** | Model of the user device. | [optional] 
**DeviceType** | Pointer to **NullableString** | Type of the user device. | [optional] 
**OsVersion** | Pointer to **NullableString** | Version of the device operating system. | [optional] 
**Wifi** | Pointer to **bool** | Whether the event occurred when the user device was connected to wifi. | [optional] 
**Language** | Pointer to **NullableString** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] 

## Methods

### NewConversionEventsDataInner

`func NewConversionEventsDataInner(eventName string, actionSource string, eventTime int64, eventId string, userData NullableConversionEventsUserData, ) *ConversionEventsDataInner`

NewConversionEventsDataInner instantiates a new ConversionEventsDataInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventsDataInnerWithDefaults

`func NewConversionEventsDataInnerWithDefaults() *ConversionEventsDataInner`

NewConversionEventsDataInnerWithDefaults instantiates a new ConversionEventsDataInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventName

`func (o *ConversionEventsDataInner) GetEventName() string`

GetEventName returns the EventName field if non-nil, zero value otherwise.

### GetEventNameOk

`func (o *ConversionEventsDataInner) GetEventNameOk() (*string, bool)`

GetEventNameOk returns a tuple with the EventName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventName

`func (o *ConversionEventsDataInner) SetEventName(v string)`

SetEventName sets EventName field to given value.


### GetActionSource

`func (o *ConversionEventsDataInner) GetActionSource() string`

GetActionSource returns the ActionSource field if non-nil, zero value otherwise.

### GetActionSourceOk

`func (o *ConversionEventsDataInner) GetActionSourceOk() (*string, bool)`

GetActionSourceOk returns a tuple with the ActionSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActionSource

`func (o *ConversionEventsDataInner) SetActionSource(v string)`

SetActionSource sets ActionSource field to given value.


### GetEventTime

`func (o *ConversionEventsDataInner) GetEventTime() int64`

GetEventTime returns the EventTime field if non-nil, zero value otherwise.

### GetEventTimeOk

`func (o *ConversionEventsDataInner) GetEventTimeOk() (*int64, bool)`

GetEventTimeOk returns a tuple with the EventTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventTime

`func (o *ConversionEventsDataInner) SetEventTime(v int64)`

SetEventTime sets EventTime field to given value.


### GetEventId

`func (o *ConversionEventsDataInner) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *ConversionEventsDataInner) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *ConversionEventsDataInner) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetEventSourceUrl

`func (o *ConversionEventsDataInner) GetEventSourceUrl() string`

GetEventSourceUrl returns the EventSourceUrl field if non-nil, zero value otherwise.

### GetEventSourceUrlOk

`func (o *ConversionEventsDataInner) GetEventSourceUrlOk() (*string, bool)`

GetEventSourceUrlOk returns a tuple with the EventSourceUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventSourceUrl

`func (o *ConversionEventsDataInner) SetEventSourceUrl(v string)`

SetEventSourceUrl sets EventSourceUrl field to given value.

### HasEventSourceUrl

`func (o *ConversionEventsDataInner) HasEventSourceUrl() bool`

HasEventSourceUrl returns a boolean if a field has been set.

### SetEventSourceUrlNil

`func (o *ConversionEventsDataInner) SetEventSourceUrlNil(b bool)`

 SetEventSourceUrlNil sets the value for EventSourceUrl to be an explicit nil

### UnsetEventSourceUrl
`func (o *ConversionEventsDataInner) UnsetEventSourceUrl()`

UnsetEventSourceUrl ensures that no value is present for EventSourceUrl, not even an explicit nil
### GetOptOut

`func (o *ConversionEventsDataInner) GetOptOut() bool`

GetOptOut returns the OptOut field if non-nil, zero value otherwise.

### GetOptOutOk

`func (o *ConversionEventsDataInner) GetOptOutOk() (*bool, bool)`

GetOptOutOk returns a tuple with the OptOut field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptOut

`func (o *ConversionEventsDataInner) SetOptOut(v bool)`

SetOptOut sets OptOut field to given value.

### HasOptOut

`func (o *ConversionEventsDataInner) HasOptOut() bool`

HasOptOut returns a boolean if a field has been set.

### GetPartnerName

`func (o *ConversionEventsDataInner) GetPartnerName() string`

GetPartnerName returns the PartnerName field if non-nil, zero value otherwise.

### GetPartnerNameOk

`func (o *ConversionEventsDataInner) GetPartnerNameOk() (*string, bool)`

GetPartnerNameOk returns a tuple with the PartnerName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerName

`func (o *ConversionEventsDataInner) SetPartnerName(v string)`

SetPartnerName sets PartnerName field to given value.

### HasPartnerName

`func (o *ConversionEventsDataInner) HasPartnerName() bool`

HasPartnerName returns a boolean if a field has been set.

### SetPartnerNameNil

`func (o *ConversionEventsDataInner) SetPartnerNameNil(b bool)`

 SetPartnerNameNil sets the value for PartnerName to be an explicit nil

### UnsetPartnerName
`func (o *ConversionEventsDataInner) UnsetPartnerName()`

UnsetPartnerName ensures that no value is present for PartnerName, not even an explicit nil
### GetUserData

`func (o *ConversionEventsDataInner) GetUserData() ConversionEventsUserData`

GetUserData returns the UserData field if non-nil, zero value otherwise.

### GetUserDataOk

`func (o *ConversionEventsDataInner) GetUserDataOk() (*ConversionEventsUserData, bool)`

GetUserDataOk returns a tuple with the UserData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserData

`func (o *ConversionEventsDataInner) SetUserData(v ConversionEventsUserData)`

SetUserData sets UserData field to given value.


### SetUserDataNil

`func (o *ConversionEventsDataInner) SetUserDataNil(b bool)`

 SetUserDataNil sets the value for UserData to be an explicit nil

### UnsetUserData
`func (o *ConversionEventsDataInner) UnsetUserData()`

UnsetUserData ensures that no value is present for UserData, not even an explicit nil
### GetCustomData

`func (o *ConversionEventsDataInner) GetCustomData() ConversionEventsDataInnerCustomData`

GetCustomData returns the CustomData field if non-nil, zero value otherwise.

### GetCustomDataOk

`func (o *ConversionEventsDataInner) GetCustomDataOk() (*ConversionEventsDataInnerCustomData, bool)`

GetCustomDataOk returns a tuple with the CustomData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomData

`func (o *ConversionEventsDataInner) SetCustomData(v ConversionEventsDataInnerCustomData)`

SetCustomData sets CustomData field to given value.

### HasCustomData

`func (o *ConversionEventsDataInner) HasCustomData() bool`

HasCustomData returns a boolean if a field has been set.

### GetAppId

`func (o *ConversionEventsDataInner) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *ConversionEventsDataInner) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *ConversionEventsDataInner) SetAppId(v string)`

SetAppId sets AppId field to given value.

### HasAppId

`func (o *ConversionEventsDataInner) HasAppId() bool`

HasAppId returns a boolean if a field has been set.

### SetAppIdNil

`func (o *ConversionEventsDataInner) SetAppIdNil(b bool)`

 SetAppIdNil sets the value for AppId to be an explicit nil

### UnsetAppId
`func (o *ConversionEventsDataInner) UnsetAppId()`

UnsetAppId ensures that no value is present for AppId, not even an explicit nil
### GetAppName

`func (o *ConversionEventsDataInner) GetAppName() string`

GetAppName returns the AppName field if non-nil, zero value otherwise.

### GetAppNameOk

`func (o *ConversionEventsDataInner) GetAppNameOk() (*string, bool)`

GetAppNameOk returns a tuple with the AppName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppName

`func (o *ConversionEventsDataInner) SetAppName(v string)`

SetAppName sets AppName field to given value.

### HasAppName

`func (o *ConversionEventsDataInner) HasAppName() bool`

HasAppName returns a boolean if a field has been set.

### SetAppNameNil

`func (o *ConversionEventsDataInner) SetAppNameNil(b bool)`

 SetAppNameNil sets the value for AppName to be an explicit nil

### UnsetAppName
`func (o *ConversionEventsDataInner) UnsetAppName()`

UnsetAppName ensures that no value is present for AppName, not even an explicit nil
### GetAppVersion

`func (o *ConversionEventsDataInner) GetAppVersion() string`

GetAppVersion returns the AppVersion field if non-nil, zero value otherwise.

### GetAppVersionOk

`func (o *ConversionEventsDataInner) GetAppVersionOk() (*string, bool)`

GetAppVersionOk returns a tuple with the AppVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppVersion

`func (o *ConversionEventsDataInner) SetAppVersion(v string)`

SetAppVersion sets AppVersion field to given value.

### HasAppVersion

`func (o *ConversionEventsDataInner) HasAppVersion() bool`

HasAppVersion returns a boolean if a field has been set.

### SetAppVersionNil

`func (o *ConversionEventsDataInner) SetAppVersionNil(b bool)`

 SetAppVersionNil sets the value for AppVersion to be an explicit nil

### UnsetAppVersion
`func (o *ConversionEventsDataInner) UnsetAppVersion()`

UnsetAppVersion ensures that no value is present for AppVersion, not even an explicit nil
### GetDeviceBrand

`func (o *ConversionEventsDataInner) GetDeviceBrand() string`

GetDeviceBrand returns the DeviceBrand field if non-nil, zero value otherwise.

### GetDeviceBrandOk

`func (o *ConversionEventsDataInner) GetDeviceBrandOk() (*string, bool)`

GetDeviceBrandOk returns a tuple with the DeviceBrand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeviceBrand

`func (o *ConversionEventsDataInner) SetDeviceBrand(v string)`

SetDeviceBrand sets DeviceBrand field to given value.

### HasDeviceBrand

`func (o *ConversionEventsDataInner) HasDeviceBrand() bool`

HasDeviceBrand returns a boolean if a field has been set.

### SetDeviceBrandNil

`func (o *ConversionEventsDataInner) SetDeviceBrandNil(b bool)`

 SetDeviceBrandNil sets the value for DeviceBrand to be an explicit nil

### UnsetDeviceBrand
`func (o *ConversionEventsDataInner) UnsetDeviceBrand()`

UnsetDeviceBrand ensures that no value is present for DeviceBrand, not even an explicit nil
### GetDeviceCarrier

`func (o *ConversionEventsDataInner) GetDeviceCarrier() string`

GetDeviceCarrier returns the DeviceCarrier field if non-nil, zero value otherwise.

### GetDeviceCarrierOk

`func (o *ConversionEventsDataInner) GetDeviceCarrierOk() (*string, bool)`

GetDeviceCarrierOk returns a tuple with the DeviceCarrier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeviceCarrier

`func (o *ConversionEventsDataInner) SetDeviceCarrier(v string)`

SetDeviceCarrier sets DeviceCarrier field to given value.

### HasDeviceCarrier

`func (o *ConversionEventsDataInner) HasDeviceCarrier() bool`

HasDeviceCarrier returns a boolean if a field has been set.

### SetDeviceCarrierNil

`func (o *ConversionEventsDataInner) SetDeviceCarrierNil(b bool)`

 SetDeviceCarrierNil sets the value for DeviceCarrier to be an explicit nil

### UnsetDeviceCarrier
`func (o *ConversionEventsDataInner) UnsetDeviceCarrier()`

UnsetDeviceCarrier ensures that no value is present for DeviceCarrier, not even an explicit nil
### GetDeviceModel

`func (o *ConversionEventsDataInner) GetDeviceModel() string`

GetDeviceModel returns the DeviceModel field if non-nil, zero value otherwise.

### GetDeviceModelOk

`func (o *ConversionEventsDataInner) GetDeviceModelOk() (*string, bool)`

GetDeviceModelOk returns a tuple with the DeviceModel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeviceModel

`func (o *ConversionEventsDataInner) SetDeviceModel(v string)`

SetDeviceModel sets DeviceModel field to given value.

### HasDeviceModel

`func (o *ConversionEventsDataInner) HasDeviceModel() bool`

HasDeviceModel returns a boolean if a field has been set.

### SetDeviceModelNil

`func (o *ConversionEventsDataInner) SetDeviceModelNil(b bool)`

 SetDeviceModelNil sets the value for DeviceModel to be an explicit nil

### UnsetDeviceModel
`func (o *ConversionEventsDataInner) UnsetDeviceModel()`

UnsetDeviceModel ensures that no value is present for DeviceModel, not even an explicit nil
### GetDeviceType

`func (o *ConversionEventsDataInner) GetDeviceType() string`

GetDeviceType returns the DeviceType field if non-nil, zero value otherwise.

### GetDeviceTypeOk

`func (o *ConversionEventsDataInner) GetDeviceTypeOk() (*string, bool)`

GetDeviceTypeOk returns a tuple with the DeviceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeviceType

`func (o *ConversionEventsDataInner) SetDeviceType(v string)`

SetDeviceType sets DeviceType field to given value.

### HasDeviceType

`func (o *ConversionEventsDataInner) HasDeviceType() bool`

HasDeviceType returns a boolean if a field has been set.

### SetDeviceTypeNil

`func (o *ConversionEventsDataInner) SetDeviceTypeNil(b bool)`

 SetDeviceTypeNil sets the value for DeviceType to be an explicit nil

### UnsetDeviceType
`func (o *ConversionEventsDataInner) UnsetDeviceType()`

UnsetDeviceType ensures that no value is present for DeviceType, not even an explicit nil
### GetOsVersion

`func (o *ConversionEventsDataInner) GetOsVersion() string`

GetOsVersion returns the OsVersion field if non-nil, zero value otherwise.

### GetOsVersionOk

`func (o *ConversionEventsDataInner) GetOsVersionOk() (*string, bool)`

GetOsVersionOk returns a tuple with the OsVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOsVersion

`func (o *ConversionEventsDataInner) SetOsVersion(v string)`

SetOsVersion sets OsVersion field to given value.

### HasOsVersion

`func (o *ConversionEventsDataInner) HasOsVersion() bool`

HasOsVersion returns a boolean if a field has been set.

### SetOsVersionNil

`func (o *ConversionEventsDataInner) SetOsVersionNil(b bool)`

 SetOsVersionNil sets the value for OsVersion to be an explicit nil

### UnsetOsVersion
`func (o *ConversionEventsDataInner) UnsetOsVersion()`

UnsetOsVersion ensures that no value is present for OsVersion, not even an explicit nil
### GetWifi

`func (o *ConversionEventsDataInner) GetWifi() bool`

GetWifi returns the Wifi field if non-nil, zero value otherwise.

### GetWifiOk

`func (o *ConversionEventsDataInner) GetWifiOk() (*bool, bool)`

GetWifiOk returns a tuple with the Wifi field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWifi

`func (o *ConversionEventsDataInner) SetWifi(v bool)`

SetWifi sets Wifi field to given value.

### HasWifi

`func (o *ConversionEventsDataInner) HasWifi() bool`

HasWifi returns a boolean if a field has been set.

### GetLanguage

`func (o *ConversionEventsDataInner) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *ConversionEventsDataInner) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *ConversionEventsDataInner) SetLanguage(v string)`

SetLanguage sets Language field to given value.

### HasLanguage

`func (o *ConversionEventsDataInner) HasLanguage() bool`

HasLanguage returns a boolean if a field has been set.

### SetLanguageNil

`func (o *ConversionEventsDataInner) SetLanguageNil(b bool)`

 SetLanguageNil sets the value for Language to be an explicit nil

### UnsetLanguage
`func (o *ConversionEventsDataInner) UnsetLanguage()`

UnsetLanguage ensures that no value is present for Language, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


