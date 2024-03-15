# SSIOInsertionOrderStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PinOrderId** | Pointer to **string** | Salesforce order id | [optional] 
**Status** | Pointer to **string** | Salesforce insertion order status | [optional] 
**CreationTime** | Pointer to **NullableString** | Salesforce insertion order creation time | [optional] 

## Methods

### NewSSIOInsertionOrderStatus

`func NewSSIOInsertionOrderStatus() *SSIOInsertionOrderStatus`

NewSSIOInsertionOrderStatus instantiates a new SSIOInsertionOrderStatus object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSSIOInsertionOrderStatusWithDefaults

`func NewSSIOInsertionOrderStatusWithDefaults() *SSIOInsertionOrderStatus`

NewSSIOInsertionOrderStatusWithDefaults instantiates a new SSIOInsertionOrderStatus object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPinOrderId

`func (o *SSIOInsertionOrderStatus) GetPinOrderId() string`

GetPinOrderId returns the PinOrderId field if non-nil, zero value otherwise.

### GetPinOrderIdOk

`func (o *SSIOInsertionOrderStatus) GetPinOrderIdOk() (*string, bool)`

GetPinOrderIdOk returns a tuple with the PinOrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinOrderId

`func (o *SSIOInsertionOrderStatus) SetPinOrderId(v string)`

SetPinOrderId sets PinOrderId field to given value.

### HasPinOrderId

`func (o *SSIOInsertionOrderStatus) HasPinOrderId() bool`

HasPinOrderId returns a boolean if a field has been set.

### GetStatus

`func (o *SSIOInsertionOrderStatus) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *SSIOInsertionOrderStatus) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *SSIOInsertionOrderStatus) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *SSIOInsertionOrderStatus) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCreationTime

`func (o *SSIOInsertionOrderStatus) GetCreationTime() string`

GetCreationTime returns the CreationTime field if non-nil, zero value otherwise.

### GetCreationTimeOk

`func (o *SSIOInsertionOrderStatus) GetCreationTimeOk() (*string, bool)`

GetCreationTimeOk returns a tuple with the CreationTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationTime

`func (o *SSIOInsertionOrderStatus) SetCreationTime(v string)`

SetCreationTime sets CreationTime field to given value.

### HasCreationTime

`func (o *SSIOInsertionOrderStatus) HasCreationTime() bool`

HasCreationTime returns a boolean if a field has been set.

### SetCreationTimeNil

`func (o *SSIOInsertionOrderStatus) SetCreationTimeNil(b bool)`

 SetCreationTimeNil sets the value for CreationTime to be an explicit nil

### UnsetCreationTime
`func (o *SSIOInsertionOrderStatus) UnsetCreationTime()`

UnsetCreationTime ensures that no value is present for CreationTime, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


