# OrderLineMutationError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**OrderLine**](OrderLine.md) |  | [optional] 
**ErrorMessages** | Pointer to **[]string** | Error messages. | [optional] 

## Methods

### NewOrderLineMutationError

`func NewOrderLineMutationError() *OrderLineMutationError`

NewOrderLineMutationError instantiates a new OrderLineMutationError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderLineMutationErrorWithDefaults

`func NewOrderLineMutationErrorWithDefaults() *OrderLineMutationError`

NewOrderLineMutationErrorWithDefaults instantiates a new OrderLineMutationError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *OrderLineMutationError) GetData() OrderLine`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *OrderLineMutationError) GetDataOk() (*OrderLine, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *OrderLineMutationError) SetData(v OrderLine)`

SetData sets Data field to given value.

### HasData

`func (o *OrderLineMutationError) HasData() bool`

HasData returns a boolean if a field has been set.

### GetErrorMessages

`func (o *OrderLineMutationError) GetErrorMessages() []string`

GetErrorMessages returns the ErrorMessages field if non-nil, zero value otherwise.

### GetErrorMessagesOk

`func (o *OrderLineMutationError) GetErrorMessagesOk() (*[]string, bool)`

GetErrorMessagesOk returns a tuple with the ErrorMessages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrorMessages

`func (o *OrderLineMutationError) SetErrorMessages(v []string)`

SetErrorMessages sets ErrorMessages field to given value.

### HasErrorMessages

`func (o *OrderLineMutationError) HasErrorMessages() bool`

HasErrorMessages returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


