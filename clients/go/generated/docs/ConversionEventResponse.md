# ConversionEventResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConversionEvent** | Pointer to [**ConversionTagType**](ConversionTagType.md) |  | [optional] 
**ConversionTagId** | Pointer to **string** | Id of the tag. | [optional] 
**AdAccountId** | Pointer to **string** | Id of the ad account. | [optional] 
**CreatedTime** | Pointer to **int32** | Creation date in epoch format. | [optional] 

## Methods

### NewConversionEventResponse

`func NewConversionEventResponse() *ConversionEventResponse`

NewConversionEventResponse instantiates a new ConversionEventResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventResponseWithDefaults

`func NewConversionEventResponseWithDefaults() *ConversionEventResponse`

NewConversionEventResponseWithDefaults instantiates a new ConversionEventResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConversionEvent

`func (o *ConversionEventResponse) GetConversionEvent() ConversionTagType`

GetConversionEvent returns the ConversionEvent field if non-nil, zero value otherwise.

### GetConversionEventOk

`func (o *ConversionEventResponse) GetConversionEventOk() (*ConversionTagType, bool)`

GetConversionEventOk returns a tuple with the ConversionEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionEvent

`func (o *ConversionEventResponse) SetConversionEvent(v ConversionTagType)`

SetConversionEvent sets ConversionEvent field to given value.

### HasConversionEvent

`func (o *ConversionEventResponse) HasConversionEvent() bool`

HasConversionEvent returns a boolean if a field has been set.

### GetConversionTagId

`func (o *ConversionEventResponse) GetConversionTagId() string`

GetConversionTagId returns the ConversionTagId field if non-nil, zero value otherwise.

### GetConversionTagIdOk

`func (o *ConversionEventResponse) GetConversionTagIdOk() (*string, bool)`

GetConversionTagIdOk returns a tuple with the ConversionTagId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionTagId

`func (o *ConversionEventResponse) SetConversionTagId(v string)`

SetConversionTagId sets ConversionTagId field to given value.

### HasConversionTagId

`func (o *ConversionEventResponse) HasConversionTagId() bool`

HasConversionTagId returns a boolean if a field has been set.

### GetAdAccountId

`func (o *ConversionEventResponse) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *ConversionEventResponse) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *ConversionEventResponse) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *ConversionEventResponse) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetCreatedTime

`func (o *ConversionEventResponse) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *ConversionEventResponse) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *ConversionEventResponse) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *ConversionEventResponse) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


