# CatalogsItemsPostFilters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**ItemIds** | **[]string** |  | 
**CatalogId** | Pointer to **string** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**HotelIds** | **[]string** |  | 
**CreativeAssetsIds** | **[]string** |  | 

## Methods

### NewCatalogsItemsPostFilters

`func NewCatalogsItemsPostFilters(catalogType CatalogsType, itemIds []string, hotelIds []string, creativeAssetsIds []string, ) *CatalogsItemsPostFilters`

NewCatalogsItemsPostFilters instantiates a new CatalogsItemsPostFilters object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemsPostFiltersWithDefaults

`func NewCatalogsItemsPostFiltersWithDefaults() *CatalogsItemsPostFilters`

NewCatalogsItemsPostFiltersWithDefaults instantiates a new CatalogsItemsPostFilters object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsItemsPostFilters) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsItemsPostFilters) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsItemsPostFilters) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetItemIds

`func (o *CatalogsItemsPostFilters) GetItemIds() []string`

GetItemIds returns the ItemIds field if non-nil, zero value otherwise.

### GetItemIdsOk

`func (o *CatalogsItemsPostFilters) GetItemIdsOk() (*[]string, bool)`

GetItemIdsOk returns a tuple with the ItemIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemIds

`func (o *CatalogsItemsPostFilters) SetItemIds(v []string)`

SetItemIds sets ItemIds field to given value.


### GetCatalogId

`func (o *CatalogsItemsPostFilters) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsItemsPostFilters) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsItemsPostFilters) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsItemsPostFilters) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetHotelIds

`func (o *CatalogsItemsPostFilters) GetHotelIds() []string`

GetHotelIds returns the HotelIds field if non-nil, zero value otherwise.

### GetHotelIdsOk

`func (o *CatalogsItemsPostFilters) GetHotelIdsOk() (*[]string, bool)`

GetHotelIdsOk returns a tuple with the HotelIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelIds

`func (o *CatalogsItemsPostFilters) SetHotelIds(v []string)`

SetHotelIds sets HotelIds field to given value.


### GetCreativeAssetsIds

`func (o *CatalogsItemsPostFilters) GetCreativeAssetsIds() []string`

GetCreativeAssetsIds returns the CreativeAssetsIds field if non-nil, zero value otherwise.

### GetCreativeAssetsIdsOk

`func (o *CatalogsItemsPostFilters) GetCreativeAssetsIdsOk() (*[]string, bool)`

GetCreativeAssetsIdsOk returns a tuple with the CreativeAssetsIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeAssetsIds

`func (o *CatalogsItemsPostFilters) SetCreativeAssetsIds(v []string)`

SetCreativeAssetsIds sets CreativeAssetsIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


