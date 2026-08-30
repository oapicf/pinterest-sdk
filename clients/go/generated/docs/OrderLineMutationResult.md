# OrderLineMutationResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | Pointer to [**[]OrderLineMutationError**](OrderLineMutationError.md) | Error list if update(s) fail. | [optional] 
**OrderLine** | Pointer to [**[]OrderLine**](OrderLine.md) | Order Line object array. | [optional] 

## Methods

### NewOrderLineMutationResult

`func NewOrderLineMutationResult() *OrderLineMutationResult`

NewOrderLineMutationResult instantiates a new OrderLineMutationResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderLineMutationResultWithDefaults

`func NewOrderLineMutationResultWithDefaults() *OrderLineMutationResult`

NewOrderLineMutationResultWithDefaults instantiates a new OrderLineMutationResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *OrderLineMutationResult) GetErrors() []OrderLineMutationError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *OrderLineMutationResult) GetErrorsOk() (*[]OrderLineMutationError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *OrderLineMutationResult) SetErrors(v []OrderLineMutationError)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *OrderLineMutationResult) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetOrderLine

`func (o *OrderLineMutationResult) GetOrderLine() []OrderLine`

GetOrderLine returns the OrderLine field if non-nil, zero value otherwise.

### GetOrderLineOk

`func (o *OrderLineMutationResult) GetOrderLineOk() (*[]OrderLine, bool)`

GetOrderLineOk returns a tuple with the OrderLine field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderLine

`func (o *OrderLineMutationResult) SetOrderLine(v []OrderLine)`

SetOrderLine sets OrderLine field to given value.

### HasOrderLine

`func (o *OrderLineMutationResult) HasOrderLine() bool`

HasOrderLine returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


