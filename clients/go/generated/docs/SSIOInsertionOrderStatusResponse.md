# SSIOInsertionOrderStatusResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PinOrderId** | Pointer to **string** | Salesforce order id | [optional] 
**Status** | Pointer to **string** | Salesforce insertion order status | [optional] 
**CreationTime** | Pointer to **NullableString** | Salesforce insertion order creation time | [optional] 

## Methods

### NewSSIOInsertionOrderStatusResponse

`func NewSSIOInsertionOrderStatusResponse() *SSIOInsertionOrderStatusResponse`

NewSSIOInsertionOrderStatusResponse instantiates a new SSIOInsertionOrderStatusResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSSIOInsertionOrderStatusResponseWithDefaults

`func NewSSIOInsertionOrderStatusResponseWithDefaults() *SSIOInsertionOrderStatusResponse`

NewSSIOInsertionOrderStatusResponseWithDefaults instantiates a new SSIOInsertionOrderStatusResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPinOrderId

`func (o *SSIOInsertionOrderStatusResponse) GetPinOrderId() string`

GetPinOrderId returns the PinOrderId field if non-nil, zero value otherwise.

### GetPinOrderIdOk

`func (o *SSIOInsertionOrderStatusResponse) GetPinOrderIdOk() (*string, bool)`

GetPinOrderIdOk returns a tuple with the PinOrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinOrderId

`func (o *SSIOInsertionOrderStatusResponse) SetPinOrderId(v string)`

SetPinOrderId sets PinOrderId field to given value.

### HasPinOrderId

`func (o *SSIOInsertionOrderStatusResponse) HasPinOrderId() bool`

HasPinOrderId returns a boolean if a field has been set.

### GetStatus

`func (o *SSIOInsertionOrderStatusResponse) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *SSIOInsertionOrderStatusResponse) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *SSIOInsertionOrderStatusResponse) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *SSIOInsertionOrderStatusResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCreationTime

`func (o *SSIOInsertionOrderStatusResponse) GetCreationTime() string`

GetCreationTime returns the CreationTime field if non-nil, zero value otherwise.

### GetCreationTimeOk

`func (o *SSIOInsertionOrderStatusResponse) GetCreationTimeOk() (*string, bool)`

GetCreationTimeOk returns a tuple with the CreationTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationTime

`func (o *SSIOInsertionOrderStatusResponse) SetCreationTime(v string)`

SetCreationTime sets CreationTime field to given value.

### HasCreationTime

`func (o *SSIOInsertionOrderStatusResponse) HasCreationTime() bool`

HasCreationTime returns a boolean if a field has been set.

### SetCreationTimeNil

`func (o *SSIOInsertionOrderStatusResponse) SetCreationTimeNil(b bool)`

 SetCreationTimeNil sets the value for CreationTime to be an explicit nil

### UnsetCreationTime
`func (o *SSIOInsertionOrderStatusResponse) UnsetCreationTime()`

UnsetCreationTime ensures that no value is present for CreationTime, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


