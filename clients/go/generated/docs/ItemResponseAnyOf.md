# ItemResponseAnyOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**ItemId** | Pointer to **string** | The catalog retail item id in the merchant namespace | [optional] 
**Pins** | Pointer to [**[]Pin**](Pin.md) | The pins mapped to the item | [optional] 
**Attributes** | Pointer to [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | [optional] 
**HotelId** | Pointer to **string** | The catalog hotel id in the merchant namespace | [optional] 

## Methods

### NewItemResponseAnyOf

`func NewItemResponseAnyOf(catalogType CatalogsType, ) *ItemResponseAnyOf`

NewItemResponseAnyOf instantiates a new ItemResponseAnyOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemResponseAnyOfWithDefaults

`func NewItemResponseAnyOfWithDefaults() *ItemResponseAnyOf`

NewItemResponseAnyOfWithDefaults instantiates a new ItemResponseAnyOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *ItemResponseAnyOf) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *ItemResponseAnyOf) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *ItemResponseAnyOf) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetItemId

`func (o *ItemResponseAnyOf) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *ItemResponseAnyOf) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *ItemResponseAnyOf) SetItemId(v string)`

SetItemId sets ItemId field to given value.

### HasItemId

`func (o *ItemResponseAnyOf) HasItemId() bool`

HasItemId returns a boolean if a field has been set.

### GetPins

`func (o *ItemResponseAnyOf) GetPins() []Pin`

GetPins returns the Pins field if non-nil, zero value otherwise.

### GetPinsOk

`func (o *ItemResponseAnyOf) GetPinsOk() (*[]Pin, bool)`

GetPinsOk returns a tuple with the Pins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPins

`func (o *ItemResponseAnyOf) SetPins(v []Pin)`

SetPins sets Pins field to given value.

### HasPins

`func (o *ItemResponseAnyOf) HasPins() bool`

HasPins returns a boolean if a field has been set.

### SetPinsNil

`func (o *ItemResponseAnyOf) SetPinsNil(b bool)`

 SetPinsNil sets the value for Pins to be an explicit nil

### UnsetPins
`func (o *ItemResponseAnyOf) UnsetPins()`

UnsetPins ensures that no value is present for Pins, not even an explicit nil
### GetAttributes

`func (o *ItemResponseAnyOf) GetAttributes() CatalogsHotelAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *ItemResponseAnyOf) GetAttributesOk() (*CatalogsHotelAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *ItemResponseAnyOf) SetAttributes(v CatalogsHotelAttributes)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *ItemResponseAnyOf) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.

### GetHotelId

`func (o *ItemResponseAnyOf) GetHotelId() string`

GetHotelId returns the HotelId field if non-nil, zero value otherwise.

### GetHotelIdOk

`func (o *ItemResponseAnyOf) GetHotelIdOk() (*string, bool)`

GetHotelIdOk returns a tuple with the HotelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelId

`func (o *ItemResponseAnyOf) SetHotelId(v string)`

SetHotelId sets HotelId field to given value.

### HasHotelId

`func (o *ItemResponseAnyOf) HasHotelId() bool`

HasHotelId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


