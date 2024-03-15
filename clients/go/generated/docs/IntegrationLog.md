# IntegrationLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClientTimestamp** | **int32** | Timestamp in milliseconds of when the log was executed at the client. | 
**EventType** | **string** | Log event type | 
**LogLevel** | **string** | Log level type | 
**ExternalBusinessId** | Pointer to **NullableString** |  | [optional] 
**AdvertiserId** | Pointer to **NullableString** |  | [optional] 
**MerchantId** | Pointer to **NullableString** |  | [optional] 
**TagId** | Pointer to **NullableString** |  | [optional] 
**FeedProfileId** | Pointer to **NullableString** |  | [optional] 
**Message** | Pointer to **string** | Explanation of the event that occured. | [optional] 
**AppVersionNumber** | Pointer to **string** | Version number of the integration application. | [optional] 
**PlatformVersionNumber** | Pointer to **string** | Version number of the platform the integration application is running on. | [optional] 
**Error** | Pointer to [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**Request** | Pointer to [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 

## Methods

### NewIntegrationLog

`func NewIntegrationLog(clientTimestamp int32, eventType string, logLevel string, ) *IntegrationLog`

NewIntegrationLog instantiates a new IntegrationLog object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIntegrationLogWithDefaults

`func NewIntegrationLogWithDefaults() *IntegrationLog`

NewIntegrationLogWithDefaults instantiates a new IntegrationLog object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClientTimestamp

`func (o *IntegrationLog) GetClientTimestamp() int32`

GetClientTimestamp returns the ClientTimestamp field if non-nil, zero value otherwise.

### GetClientTimestampOk

`func (o *IntegrationLog) GetClientTimestampOk() (*int32, bool)`

GetClientTimestampOk returns a tuple with the ClientTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientTimestamp

`func (o *IntegrationLog) SetClientTimestamp(v int32)`

SetClientTimestamp sets ClientTimestamp field to given value.


### GetEventType

`func (o *IntegrationLog) GetEventType() string`

GetEventType returns the EventType field if non-nil, zero value otherwise.

### GetEventTypeOk

`func (o *IntegrationLog) GetEventTypeOk() (*string, bool)`

GetEventTypeOk returns a tuple with the EventType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventType

`func (o *IntegrationLog) SetEventType(v string)`

SetEventType sets EventType field to given value.


### GetLogLevel

`func (o *IntegrationLog) GetLogLevel() string`

GetLogLevel returns the LogLevel field if non-nil, zero value otherwise.

### GetLogLevelOk

`func (o *IntegrationLog) GetLogLevelOk() (*string, bool)`

GetLogLevelOk returns a tuple with the LogLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogLevel

`func (o *IntegrationLog) SetLogLevel(v string)`

SetLogLevel sets LogLevel field to given value.


### GetExternalBusinessId

`func (o *IntegrationLog) GetExternalBusinessId() string`

GetExternalBusinessId returns the ExternalBusinessId field if non-nil, zero value otherwise.

### GetExternalBusinessIdOk

`func (o *IntegrationLog) GetExternalBusinessIdOk() (*string, bool)`

GetExternalBusinessIdOk returns a tuple with the ExternalBusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalBusinessId

`func (o *IntegrationLog) SetExternalBusinessId(v string)`

SetExternalBusinessId sets ExternalBusinessId field to given value.

### HasExternalBusinessId

`func (o *IntegrationLog) HasExternalBusinessId() bool`

HasExternalBusinessId returns a boolean if a field has been set.

### SetExternalBusinessIdNil

`func (o *IntegrationLog) SetExternalBusinessIdNil(b bool)`

 SetExternalBusinessIdNil sets the value for ExternalBusinessId to be an explicit nil

### UnsetExternalBusinessId
`func (o *IntegrationLog) UnsetExternalBusinessId()`

UnsetExternalBusinessId ensures that no value is present for ExternalBusinessId, not even an explicit nil
### GetAdvertiserId

`func (o *IntegrationLog) GetAdvertiserId() string`

GetAdvertiserId returns the AdvertiserId field if non-nil, zero value otherwise.

### GetAdvertiserIdOk

`func (o *IntegrationLog) GetAdvertiserIdOk() (*string, bool)`

GetAdvertiserIdOk returns a tuple with the AdvertiserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvertiserId

`func (o *IntegrationLog) SetAdvertiserId(v string)`

SetAdvertiserId sets AdvertiserId field to given value.

### HasAdvertiserId

`func (o *IntegrationLog) HasAdvertiserId() bool`

HasAdvertiserId returns a boolean if a field has been set.

### SetAdvertiserIdNil

`func (o *IntegrationLog) SetAdvertiserIdNil(b bool)`

 SetAdvertiserIdNil sets the value for AdvertiserId to be an explicit nil

### UnsetAdvertiserId
`func (o *IntegrationLog) UnsetAdvertiserId()`

UnsetAdvertiserId ensures that no value is present for AdvertiserId, not even an explicit nil
### GetMerchantId

`func (o *IntegrationLog) GetMerchantId() string`

GetMerchantId returns the MerchantId field if non-nil, zero value otherwise.

### GetMerchantIdOk

`func (o *IntegrationLog) GetMerchantIdOk() (*string, bool)`

GetMerchantIdOk returns a tuple with the MerchantId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMerchantId

`func (o *IntegrationLog) SetMerchantId(v string)`

SetMerchantId sets MerchantId field to given value.

### HasMerchantId

`func (o *IntegrationLog) HasMerchantId() bool`

HasMerchantId returns a boolean if a field has been set.

### SetMerchantIdNil

`func (o *IntegrationLog) SetMerchantIdNil(b bool)`

 SetMerchantIdNil sets the value for MerchantId to be an explicit nil

### UnsetMerchantId
`func (o *IntegrationLog) UnsetMerchantId()`

UnsetMerchantId ensures that no value is present for MerchantId, not even an explicit nil
### GetTagId

`func (o *IntegrationLog) GetTagId() string`

GetTagId returns the TagId field if non-nil, zero value otherwise.

### GetTagIdOk

`func (o *IntegrationLog) GetTagIdOk() (*string, bool)`

GetTagIdOk returns a tuple with the TagId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTagId

`func (o *IntegrationLog) SetTagId(v string)`

SetTagId sets TagId field to given value.

### HasTagId

`func (o *IntegrationLog) HasTagId() bool`

HasTagId returns a boolean if a field has been set.

### SetTagIdNil

`func (o *IntegrationLog) SetTagIdNil(b bool)`

 SetTagIdNil sets the value for TagId to be an explicit nil

### UnsetTagId
`func (o *IntegrationLog) UnsetTagId()`

UnsetTagId ensures that no value is present for TagId, not even an explicit nil
### GetFeedProfileId

`func (o *IntegrationLog) GetFeedProfileId() string`

GetFeedProfileId returns the FeedProfileId field if non-nil, zero value otherwise.

### GetFeedProfileIdOk

`func (o *IntegrationLog) GetFeedProfileIdOk() (*string, bool)`

GetFeedProfileIdOk returns a tuple with the FeedProfileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedProfileId

`func (o *IntegrationLog) SetFeedProfileId(v string)`

SetFeedProfileId sets FeedProfileId field to given value.

### HasFeedProfileId

`func (o *IntegrationLog) HasFeedProfileId() bool`

HasFeedProfileId returns a boolean if a field has been set.

### SetFeedProfileIdNil

`func (o *IntegrationLog) SetFeedProfileIdNil(b bool)`

 SetFeedProfileIdNil sets the value for FeedProfileId to be an explicit nil

### UnsetFeedProfileId
`func (o *IntegrationLog) UnsetFeedProfileId()`

UnsetFeedProfileId ensures that no value is present for FeedProfileId, not even an explicit nil
### GetMessage

`func (o *IntegrationLog) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *IntegrationLog) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *IntegrationLog) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *IntegrationLog) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetAppVersionNumber

`func (o *IntegrationLog) GetAppVersionNumber() string`

GetAppVersionNumber returns the AppVersionNumber field if non-nil, zero value otherwise.

### GetAppVersionNumberOk

`func (o *IntegrationLog) GetAppVersionNumberOk() (*string, bool)`

GetAppVersionNumberOk returns a tuple with the AppVersionNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppVersionNumber

`func (o *IntegrationLog) SetAppVersionNumber(v string)`

SetAppVersionNumber sets AppVersionNumber field to given value.

### HasAppVersionNumber

`func (o *IntegrationLog) HasAppVersionNumber() bool`

HasAppVersionNumber returns a boolean if a field has been set.

### GetPlatformVersionNumber

`func (o *IntegrationLog) GetPlatformVersionNumber() string`

GetPlatformVersionNumber returns the PlatformVersionNumber field if non-nil, zero value otherwise.

### GetPlatformVersionNumberOk

`func (o *IntegrationLog) GetPlatformVersionNumberOk() (*string, bool)`

GetPlatformVersionNumberOk returns a tuple with the PlatformVersionNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatformVersionNumber

`func (o *IntegrationLog) SetPlatformVersionNumber(v string)`

SetPlatformVersionNumber sets PlatformVersionNumber field to given value.

### HasPlatformVersionNumber

`func (o *IntegrationLog) HasPlatformVersionNumber() bool`

HasPlatformVersionNumber returns a boolean if a field has been set.

### GetError

`func (o *IntegrationLog) GetError() IntegrationLogClientError`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *IntegrationLog) GetErrorOk() (*IntegrationLogClientError, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *IntegrationLog) SetError(v IntegrationLogClientError)`

SetError sets Error field to given value.

### HasError

`func (o *IntegrationLog) HasError() bool`

HasError returns a boolean if a field has been set.

### GetRequest

`func (o *IntegrationLog) GetRequest() IntegrationLogClientRequest`

GetRequest returns the Request field if non-nil, zero value otherwise.

### GetRequestOk

`func (o *IntegrationLog) GetRequestOk() (*IntegrationLogClientRequest, bool)`

GetRequestOk returns a tuple with the Request field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequest

`func (o *IntegrationLog) SetRequest(v IntegrationLogClientRequest)`

SetRequest sets Request field to given value.

### HasRequest

`func (o *IntegrationLog) HasRequest() bool`

HasRequest returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


