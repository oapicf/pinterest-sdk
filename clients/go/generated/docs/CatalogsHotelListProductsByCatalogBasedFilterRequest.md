# CatalogsHotelListProductsByCatalogBasedFilterRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**CatalogId** | **string** | Catalog id pertaining to the hotel product group. | 
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 

## Methods

### NewCatalogsHotelListProductsByCatalogBasedFilterRequest

`func NewCatalogsHotelListProductsByCatalogBasedFilterRequest(catalogType string, catalogId string, filters CatalogsHotelProductGroupFilters, ) *CatalogsHotelListProductsByCatalogBasedFilterRequest`

NewCatalogsHotelListProductsByCatalogBasedFilterRequest instantiates a new CatalogsHotelListProductsByCatalogBasedFilterRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelListProductsByCatalogBasedFilterRequestWithDefaults

`func NewCatalogsHotelListProductsByCatalogBasedFilterRequestWithDefaults() *CatalogsHotelListProductsByCatalogBasedFilterRequest`

NewCatalogsHotelListProductsByCatalogBasedFilterRequestWithDefaults instantiates a new CatalogsHotelListProductsByCatalogBasedFilterRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsHotelListProductsByCatalogBasedFilterRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsHotelListProductsByCatalogBasedFilterRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsHotelListProductsByCatalogBasedFilterRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetCatalogId

`func (o *CatalogsHotelListProductsByCatalogBasedFilterRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsHotelListProductsByCatalogBasedFilterRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsHotelListProductsByCatalogBasedFilterRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.


### GetFilters

`func (o *CatalogsHotelListProductsByCatalogBasedFilterRequest) GetFilters() CatalogsHotelProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsHotelListProductsByCatalogBasedFilterRequest) GetFiltersOk() (*CatalogsHotelProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsHotelListProductsByCatalogBasedFilterRequest) SetFilters(v CatalogsHotelProductGroupFilters)`

SetFilters sets Filters field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


