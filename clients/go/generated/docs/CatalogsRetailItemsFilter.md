# CatalogsRetailItemsFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**ItemIds** | **[]string** |  | 
**CatalogId** | Pointer to **string** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] 

## Methods

### NewCatalogsRetailItemsFilter

`func NewCatalogsRetailItemsFilter(catalogType string, itemIds []string, ) *CatalogsRetailItemsFilter`

NewCatalogsRetailItemsFilter instantiates a new CatalogsRetailItemsFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailItemsFilterWithDefaults

`func NewCatalogsRetailItemsFilterWithDefaults() *CatalogsRetailItemsFilter`

NewCatalogsRetailItemsFilterWithDefaults instantiates a new CatalogsRetailItemsFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsRetailItemsFilter) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailItemsFilter) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailItemsFilter) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetItemIds

`func (o *CatalogsRetailItemsFilter) GetItemIds() []string`

GetItemIds returns the ItemIds field if non-nil, zero value otherwise.

### GetItemIdsOk

`func (o *CatalogsRetailItemsFilter) GetItemIdsOk() (*[]string, bool)`

GetItemIdsOk returns a tuple with the ItemIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemIds

`func (o *CatalogsRetailItemsFilter) SetItemIds(v []string)`

SetItemIds sets ItemIds field to given value.


### GetCatalogId

`func (o *CatalogsRetailItemsFilter) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsRetailItemsFilter) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsRetailItemsFilter) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsRetailItemsFilter) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


