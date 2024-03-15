# CatalogsItemsFilters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**ItemIds** | **[]string** |  | 
**CatalogId** | Pointer to **string** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 
**HotelIds** | **[]string** |  | 

## Methods

### NewCatalogsItemsFilters

`func NewCatalogsItemsFilters(catalogType CatalogsType, itemIds []string, hotelIds []string, ) *CatalogsItemsFilters`

NewCatalogsItemsFilters instantiates a new CatalogsItemsFilters object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemsFiltersWithDefaults

`func NewCatalogsItemsFiltersWithDefaults() *CatalogsItemsFilters`

NewCatalogsItemsFiltersWithDefaults instantiates a new CatalogsItemsFilters object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsItemsFilters) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsItemsFilters) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsItemsFilters) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetItemIds

`func (o *CatalogsItemsFilters) GetItemIds() []string`

GetItemIds returns the ItemIds field if non-nil, zero value otherwise.

### GetItemIdsOk

`func (o *CatalogsItemsFilters) GetItemIdsOk() (*[]string, bool)`

GetItemIdsOk returns a tuple with the ItemIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemIds

`func (o *CatalogsItemsFilters) SetItemIds(v []string)`

SetItemIds sets ItemIds field to given value.


### GetCatalogId

`func (o *CatalogsItemsFilters) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsItemsFilters) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsItemsFilters) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsItemsFilters) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetHotelIds

`func (o *CatalogsItemsFilters) GetHotelIds() []string`

GetHotelIds returns the HotelIds field if non-nil, zero value otherwise.

### GetHotelIdsOk

`func (o *CatalogsItemsFilters) GetHotelIdsOk() (*[]string, bool)`

GetHotelIdsOk returns a tuple with the HotelIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelIds

`func (o *CatalogsItemsFilters) SetHotelIds(v []string)`

SetHotelIds sets HotelIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


