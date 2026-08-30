# IntegrationLogsInvalidLogResponseRejectedLogsItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Field** | **string** | The field name containing an invalid value. | 
**LogIndex** | Pointer to **int32** | Index of the log in the batch. | [optional] 
**Reason** | **string** | The reason the value is invalid. | 
**Value** | **string** | The value that is invalid. | 

## Methods

### NewIntegrationLogsInvalidLogResponseRejectedLogsItems

`func NewIntegrationLogsInvalidLogResponseRejectedLogsItems(field string, reason string, value string, ) *IntegrationLogsInvalidLogResponseRejectedLogsItems`

NewIntegrationLogsInvalidLogResponseRejectedLogsItems instantiates a new IntegrationLogsInvalidLogResponseRejectedLogsItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIntegrationLogsInvalidLogResponseRejectedLogsItemsWithDefaults

`func NewIntegrationLogsInvalidLogResponseRejectedLogsItemsWithDefaults() *IntegrationLogsInvalidLogResponseRejectedLogsItems`

NewIntegrationLogsInvalidLogResponseRejectedLogsItemsWithDefaults instantiates a new IntegrationLogsInvalidLogResponseRejectedLogsItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetField

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) GetField() string`

GetField returns the Field field if non-nil, zero value otherwise.

### GetFieldOk

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) GetFieldOk() (*string, bool)`

GetFieldOk returns a tuple with the Field field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetField

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) SetField(v string)`

SetField sets Field field to given value.


### GetLogIndex

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) GetLogIndex() int32`

GetLogIndex returns the LogIndex field if non-nil, zero value otherwise.

### GetLogIndexOk

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) GetLogIndexOk() (*int32, bool)`

GetLogIndexOk returns a tuple with the LogIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogIndex

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) SetLogIndex(v int32)`

SetLogIndex sets LogIndex field to given value.

### HasLogIndex

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) HasLogIndex() bool`

HasLogIndex returns a boolean if a field has been set.

### GetReason

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) GetReason() string`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) GetReasonOk() (*string, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) SetReason(v string)`

SetReason sets Reason field to given value.


### GetValue

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsItems) SetValue(v string)`

SetValue sets Value field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


