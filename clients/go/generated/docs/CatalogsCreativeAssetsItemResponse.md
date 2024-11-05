# CatalogsCreativeAssetsItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**CreativeAssetsId** | Pointer to **string** | The catalog creative assets id in the merchant namespace | [optional] 
**Pins** | Pointer to [**[]Pin**](Pin.md) | The pins mapped to the item | [optional] 
**Attributes** | Pointer to [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 

## Methods

### NewCatalogsCreativeAssetsItemResponse

`func NewCatalogsCreativeAssetsItemResponse(catalogType CatalogsType, ) *CatalogsCreativeAssetsItemResponse`

NewCatalogsCreativeAssetsItemResponse instantiates a new CatalogsCreativeAssetsItemResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreativeAssetsItemResponseWithDefaults

`func NewCatalogsCreativeAssetsItemResponseWithDefaults() *CatalogsCreativeAssetsItemResponse`

NewCatalogsCreativeAssetsItemResponseWithDefaults instantiates a new CatalogsCreativeAssetsItemResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsCreativeAssetsItemResponse) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsCreativeAssetsItemResponse) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsCreativeAssetsItemResponse) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetCreativeAssetsId

`func (o *CatalogsCreativeAssetsItemResponse) GetCreativeAssetsId() string`

GetCreativeAssetsId returns the CreativeAssetsId field if non-nil, zero value otherwise.

### GetCreativeAssetsIdOk

`func (o *CatalogsCreativeAssetsItemResponse) GetCreativeAssetsIdOk() (*string, bool)`

GetCreativeAssetsIdOk returns a tuple with the CreativeAssetsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeAssetsId

`func (o *CatalogsCreativeAssetsItemResponse) SetCreativeAssetsId(v string)`

SetCreativeAssetsId sets CreativeAssetsId field to given value.

### HasCreativeAssetsId

`func (o *CatalogsCreativeAssetsItemResponse) HasCreativeAssetsId() bool`

HasCreativeAssetsId returns a boolean if a field has been set.

### GetPins

`func (o *CatalogsCreativeAssetsItemResponse) GetPins() []Pin`

GetPins returns the Pins field if non-nil, zero value otherwise.

### GetPinsOk

`func (o *CatalogsCreativeAssetsItemResponse) GetPinsOk() (*[]Pin, bool)`

GetPinsOk returns a tuple with the Pins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPins

`func (o *CatalogsCreativeAssetsItemResponse) SetPins(v []Pin)`

SetPins sets Pins field to given value.

### HasPins

`func (o *CatalogsCreativeAssetsItemResponse) HasPins() bool`

HasPins returns a boolean if a field has been set.

### SetPinsNil

`func (o *CatalogsCreativeAssetsItemResponse) SetPinsNil(b bool)`

 SetPinsNil sets the value for Pins to be an explicit nil

### UnsetPins
`func (o *CatalogsCreativeAssetsItemResponse) UnsetPins()`

UnsetPins ensures that no value is present for Pins, not even an explicit nil
### GetAttributes

`func (o *CatalogsCreativeAssetsItemResponse) GetAttributes() CatalogsCreativeAssetsAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsCreativeAssetsItemResponse) GetAttributesOk() (*CatalogsCreativeAssetsAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsCreativeAssetsItemResponse) SetAttributes(v CatalogsCreativeAssetsAttributes)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *CatalogsCreativeAssetsItemResponse) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


