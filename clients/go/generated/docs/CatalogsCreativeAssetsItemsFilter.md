# CatalogsCreativeAssetsItemsFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**CreativeAssetsIds** | **[]string** |  | 
**CatalogId** | Pointer to **string** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 

## Methods

### NewCatalogsCreativeAssetsItemsFilter

`func NewCatalogsCreativeAssetsItemsFilter(catalogType string, creativeAssetsIds []string, ) *CatalogsCreativeAssetsItemsFilter`

NewCatalogsCreativeAssetsItemsFilter instantiates a new CatalogsCreativeAssetsItemsFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreativeAssetsItemsFilterWithDefaults

`func NewCatalogsCreativeAssetsItemsFilterWithDefaults() *CatalogsCreativeAssetsItemsFilter`

NewCatalogsCreativeAssetsItemsFilterWithDefaults instantiates a new CatalogsCreativeAssetsItemsFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsCreativeAssetsItemsFilter) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsCreativeAssetsItemsFilter) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsCreativeAssetsItemsFilter) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetCreativeAssetsIds

`func (o *CatalogsCreativeAssetsItemsFilter) GetCreativeAssetsIds() []string`

GetCreativeAssetsIds returns the CreativeAssetsIds field if non-nil, zero value otherwise.

### GetCreativeAssetsIdsOk

`func (o *CatalogsCreativeAssetsItemsFilter) GetCreativeAssetsIdsOk() (*[]string, bool)`

GetCreativeAssetsIdsOk returns a tuple with the CreativeAssetsIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeAssetsIds

`func (o *CatalogsCreativeAssetsItemsFilter) SetCreativeAssetsIds(v []string)`

SetCreativeAssetsIds sets CreativeAssetsIds field to given value.


### GetCatalogId

`func (o *CatalogsCreativeAssetsItemsFilter) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsCreativeAssetsItemsFilter) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsCreativeAssetsItemsFilter) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsCreativeAssetsItemsFilter) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


