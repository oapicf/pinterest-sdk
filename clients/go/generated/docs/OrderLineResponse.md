# OrderLineResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | Pointer to [**[]OrderLineError**](OrderLineError.md) | Error list if update(s) fail. | [optional] 
**OrderLine** | Pointer to [**[]OrderLine**](OrderLine.md) | Order Line object array. | [optional] 

## Methods

### NewOrderLineResponse

`func NewOrderLineResponse() *OrderLineResponse`

NewOrderLineResponse instantiates a new OrderLineResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderLineResponseWithDefaults

`func NewOrderLineResponseWithDefaults() *OrderLineResponse`

NewOrderLineResponseWithDefaults instantiates a new OrderLineResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *OrderLineResponse) GetErrors() []OrderLineError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *OrderLineResponse) GetErrorsOk() (*[]OrderLineError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *OrderLineResponse) SetErrors(v []OrderLineError)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *OrderLineResponse) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetOrderLine

`func (o *OrderLineResponse) GetOrderLine() []OrderLine`

GetOrderLine returns the OrderLine field if non-nil, zero value otherwise.

### GetOrderLineOk

`func (o *OrderLineResponse) GetOrderLineOk() (*[]OrderLine, bool)`

GetOrderLineOk returns a tuple with the OrderLine field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderLine

`func (o *OrderLineResponse) SetOrderLine(v []OrderLine)`

SetOrderLine sets OrderLine field to given value.

### HasOrderLine

`func (o *OrderLineResponse) HasOrderLine() bool`

HasOrderLine returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


