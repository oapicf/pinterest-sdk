# CatalogsUpdateHotelItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HotelId** | **string** | The catalog hotel item id in the merchant namespace | 
**Operation** | **string** |  | 
**Attributes** | [**CatalogsUpdatableHotelAttributes**](CatalogsUpdatableHotelAttributes.md) |  | 

## Methods

### NewCatalogsUpdateHotelItem

`func NewCatalogsUpdateHotelItem(hotelId string, operation string, attributes CatalogsUpdatableHotelAttributes, ) *CatalogsUpdateHotelItem`

NewCatalogsUpdateHotelItem instantiates a new CatalogsUpdateHotelItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsUpdateHotelItemWithDefaults

`func NewCatalogsUpdateHotelItemWithDefaults() *CatalogsUpdateHotelItem`

NewCatalogsUpdateHotelItemWithDefaults instantiates a new CatalogsUpdateHotelItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHotelId

`func (o *CatalogsUpdateHotelItem) GetHotelId() string`

GetHotelId returns the HotelId field if non-nil, zero value otherwise.

### GetHotelIdOk

`func (o *CatalogsUpdateHotelItem) GetHotelIdOk() (*string, bool)`

GetHotelIdOk returns a tuple with the HotelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelId

`func (o *CatalogsUpdateHotelItem) SetHotelId(v string)`

SetHotelId sets HotelId field to given value.


### GetOperation

`func (o *CatalogsUpdateHotelItem) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsUpdateHotelItem) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsUpdateHotelItem) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetAttributes

`func (o *CatalogsUpdateHotelItem) GetAttributes() CatalogsUpdatableHotelAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsUpdateHotelItem) GetAttributesOk() (*CatalogsUpdatableHotelAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsUpdateHotelItem) SetAttributes(v CatalogsUpdatableHotelAttributes)`

SetAttributes sets Attributes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


