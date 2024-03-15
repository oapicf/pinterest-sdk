# CatalogsHotelItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**HotelId** | Pointer to **string** | The catalog hotel id in the merchant namespace | [optional] 
**Pins** | Pointer to [**[]Pin**](Pin.md) | The pins mapped to the item | [optional] 
**Attributes** | Pointer to [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | [optional] 

## Methods

### NewCatalogsHotelItemResponse

`func NewCatalogsHotelItemResponse(catalogType CatalogsType, ) *CatalogsHotelItemResponse`

NewCatalogsHotelItemResponse instantiates a new CatalogsHotelItemResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelItemResponseWithDefaults

`func NewCatalogsHotelItemResponseWithDefaults() *CatalogsHotelItemResponse`

NewCatalogsHotelItemResponseWithDefaults instantiates a new CatalogsHotelItemResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsHotelItemResponse) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsHotelItemResponse) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsHotelItemResponse) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetHotelId

`func (o *CatalogsHotelItemResponse) GetHotelId() string`

GetHotelId returns the HotelId field if non-nil, zero value otherwise.

### GetHotelIdOk

`func (o *CatalogsHotelItemResponse) GetHotelIdOk() (*string, bool)`

GetHotelIdOk returns a tuple with the HotelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelId

`func (o *CatalogsHotelItemResponse) SetHotelId(v string)`

SetHotelId sets HotelId field to given value.

### HasHotelId

`func (o *CatalogsHotelItemResponse) HasHotelId() bool`

HasHotelId returns a boolean if a field has been set.

### GetPins

`func (o *CatalogsHotelItemResponse) GetPins() []Pin`

GetPins returns the Pins field if non-nil, zero value otherwise.

### GetPinsOk

`func (o *CatalogsHotelItemResponse) GetPinsOk() (*[]Pin, bool)`

GetPinsOk returns a tuple with the Pins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPins

`func (o *CatalogsHotelItemResponse) SetPins(v []Pin)`

SetPins sets Pins field to given value.

### HasPins

`func (o *CatalogsHotelItemResponse) HasPins() bool`

HasPins returns a boolean if a field has been set.

### SetPinsNil

`func (o *CatalogsHotelItemResponse) SetPinsNil(b bool)`

 SetPinsNil sets the value for Pins to be an explicit nil

### UnsetPins
`func (o *CatalogsHotelItemResponse) UnsetPins()`

UnsetPins ensures that no value is present for Pins, not even an explicit nil
### GetAttributes

`func (o *CatalogsHotelItemResponse) GetAttributes() CatalogsHotelAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsHotelItemResponse) GetAttributesOk() (*CatalogsHotelAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsHotelItemResponse) SetAttributes(v CatalogsHotelAttributes)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *CatalogsHotelItemResponse) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


