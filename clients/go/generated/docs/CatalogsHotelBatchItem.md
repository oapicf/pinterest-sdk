# CatalogsHotelBatchItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HotelId** | **string** | The catalog hotel id in the merchant namespace | 
**Operation** | **string** |  | 
**Attributes** | [**CatalogsUpdatableHotelAttributes**](CatalogsUpdatableHotelAttributes.md) |  | 

## Methods

### NewCatalogsHotelBatchItem

`func NewCatalogsHotelBatchItem(hotelId string, operation string, attributes CatalogsUpdatableHotelAttributes, ) *CatalogsHotelBatchItem`

NewCatalogsHotelBatchItem instantiates a new CatalogsHotelBatchItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelBatchItemWithDefaults

`func NewCatalogsHotelBatchItemWithDefaults() *CatalogsHotelBatchItem`

NewCatalogsHotelBatchItemWithDefaults instantiates a new CatalogsHotelBatchItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHotelId

`func (o *CatalogsHotelBatchItem) GetHotelId() string`

GetHotelId returns the HotelId field if non-nil, zero value otherwise.

### GetHotelIdOk

`func (o *CatalogsHotelBatchItem) GetHotelIdOk() (*string, bool)`

GetHotelIdOk returns a tuple with the HotelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelId

`func (o *CatalogsHotelBatchItem) SetHotelId(v string)`

SetHotelId sets HotelId field to given value.


### GetOperation

`func (o *CatalogsHotelBatchItem) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsHotelBatchItem) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsHotelBatchItem) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetAttributes

`func (o *CatalogsHotelBatchItem) GetAttributes() CatalogsUpdatableHotelAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsHotelBatchItem) GetAttributesOk() (*CatalogsUpdatableHotelAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsHotelBatchItem) SetAttributes(v CatalogsUpdatableHotelAttributes)`

SetAttributes sets Attributes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


