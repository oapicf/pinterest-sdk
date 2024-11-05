# CatalogsRetailItemsPostFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**ItemIds** | **[]string** |  | 
**CatalogId** | Pointer to **string** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] 

## Methods

### NewCatalogsRetailItemsPostFilter

`func NewCatalogsRetailItemsPostFilter(catalogType string, itemIds []string, ) *CatalogsRetailItemsPostFilter`

NewCatalogsRetailItemsPostFilter instantiates a new CatalogsRetailItemsPostFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailItemsPostFilterWithDefaults

`func NewCatalogsRetailItemsPostFilterWithDefaults() *CatalogsRetailItemsPostFilter`

NewCatalogsRetailItemsPostFilterWithDefaults instantiates a new CatalogsRetailItemsPostFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsRetailItemsPostFilter) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailItemsPostFilter) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailItemsPostFilter) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetItemIds

`func (o *CatalogsRetailItemsPostFilter) GetItemIds() []string`

GetItemIds returns the ItemIds field if non-nil, zero value otherwise.

### GetItemIdsOk

`func (o *CatalogsRetailItemsPostFilter) GetItemIdsOk() (*[]string, bool)`

GetItemIdsOk returns a tuple with the ItemIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemIds

`func (o *CatalogsRetailItemsPostFilter) SetItemIds(v []string)`

SetItemIds sets ItemIds field to given value.


### GetCatalogId

`func (o *CatalogsRetailItemsPostFilter) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsRetailItemsPostFilter) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsRetailItemsPostFilter) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsRetailItemsPostFilter) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


