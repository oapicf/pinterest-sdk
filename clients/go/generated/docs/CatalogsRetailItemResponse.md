# CatalogsRetailItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**ItemId** | Pointer to **string** | The catalog retail item id in the merchant namespace | [optional] 
**Pins** | Pointer to [**[]Pin**](Pin.md) | The pins mapped to the item | [optional] 
**Attributes** | Pointer to [**ItemAttributes**](ItemAttributes.md) |  | [optional] 

## Methods

### NewCatalogsRetailItemResponse

`func NewCatalogsRetailItemResponse(catalogType CatalogsType, ) *CatalogsRetailItemResponse`

NewCatalogsRetailItemResponse instantiates a new CatalogsRetailItemResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailItemResponseWithDefaults

`func NewCatalogsRetailItemResponseWithDefaults() *CatalogsRetailItemResponse`

NewCatalogsRetailItemResponseWithDefaults instantiates a new CatalogsRetailItemResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsRetailItemResponse) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailItemResponse) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailItemResponse) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetItemId

`func (o *CatalogsRetailItemResponse) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *CatalogsRetailItemResponse) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *CatalogsRetailItemResponse) SetItemId(v string)`

SetItemId sets ItemId field to given value.

### HasItemId

`func (o *CatalogsRetailItemResponse) HasItemId() bool`

HasItemId returns a boolean if a field has been set.

### GetPins

`func (o *CatalogsRetailItemResponse) GetPins() []Pin`

GetPins returns the Pins field if non-nil, zero value otherwise.

### GetPinsOk

`func (o *CatalogsRetailItemResponse) GetPinsOk() (*[]Pin, bool)`

GetPinsOk returns a tuple with the Pins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPins

`func (o *CatalogsRetailItemResponse) SetPins(v []Pin)`

SetPins sets Pins field to given value.

### HasPins

`func (o *CatalogsRetailItemResponse) HasPins() bool`

HasPins returns a boolean if a field has been set.

### SetPinsNil

`func (o *CatalogsRetailItemResponse) SetPinsNil(b bool)`

 SetPinsNil sets the value for Pins to be an explicit nil

### UnsetPins
`func (o *CatalogsRetailItemResponse) UnsetPins()`

UnsetPins ensures that no value is present for Pins, not even an explicit nil
### GetAttributes

`func (o *CatalogsRetailItemResponse) GetAttributes() ItemAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsRetailItemResponse) GetAttributesOk() (*ItemAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsRetailItemResponse) SetAttributes(v ItemAttributes)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *CatalogsRetailItemResponse) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


