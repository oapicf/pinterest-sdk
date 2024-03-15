# IntegrationLogsInvalidLogResponseRejectedLogsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LogIndex** | Pointer to **int32** | Index of the log in the batch. | [optional] 
**Field** | **string** | The field name containing an invalid value. | 
**Value** | **string** | The value that is invalid. | 
**Reason** | **string** | The reason the value is invalid. | 

## Methods

### NewIntegrationLogsInvalidLogResponseRejectedLogsInner

`func NewIntegrationLogsInvalidLogResponseRejectedLogsInner(field string, value string, reason string, ) *IntegrationLogsInvalidLogResponseRejectedLogsInner`

NewIntegrationLogsInvalidLogResponseRejectedLogsInner instantiates a new IntegrationLogsInvalidLogResponseRejectedLogsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIntegrationLogsInvalidLogResponseRejectedLogsInnerWithDefaults

`func NewIntegrationLogsInvalidLogResponseRejectedLogsInnerWithDefaults() *IntegrationLogsInvalidLogResponseRejectedLogsInner`

NewIntegrationLogsInvalidLogResponseRejectedLogsInnerWithDefaults instantiates a new IntegrationLogsInvalidLogResponseRejectedLogsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLogIndex

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) GetLogIndex() int32`

GetLogIndex returns the LogIndex field if non-nil, zero value otherwise.

### GetLogIndexOk

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) GetLogIndexOk() (*int32, bool)`

GetLogIndexOk returns a tuple with the LogIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogIndex

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) SetLogIndex(v int32)`

SetLogIndex sets LogIndex field to given value.

### HasLogIndex

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) HasLogIndex() bool`

HasLogIndex returns a boolean if a field has been set.

### GetField

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) GetField() string`

GetField returns the Field field if non-nil, zero value otherwise.

### GetFieldOk

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) GetFieldOk() (*string, bool)`

GetFieldOk returns a tuple with the Field field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetField

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) SetField(v string)`

SetField sets Field field to given value.


### GetValue

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) SetValue(v string)`

SetValue sets Value field to given value.


### GetReason

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) GetReason() string`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) GetReasonOk() (*string, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *IntegrationLogsInvalidLogResponseRejectedLogsInner) SetReason(v string)`

SetReason sets Reason field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


