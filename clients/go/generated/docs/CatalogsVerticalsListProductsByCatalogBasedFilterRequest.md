# CatalogsVerticalsListProductsByCatalogBasedFilterRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**CatalogId** | **string** | Catalog id pertaining to the creative assets product group. | 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**Country** | [**Country**](Country.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Methods

### NewCatalogsVerticalsListProductsByCatalogBasedFilterRequest

`func NewCatalogsVerticalsListProductsByCatalogBasedFilterRequest(catalogType string, catalogId string, filters CatalogsCreativeAssetsProductGroupFilters, country Country, locale CatalogsLocale, ) *CatalogsVerticalsListProductsByCatalogBasedFilterRequest`

NewCatalogsVerticalsListProductsByCatalogBasedFilterRequest instantiates a new CatalogsVerticalsListProductsByCatalogBasedFilterRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsVerticalsListProductsByCatalogBasedFilterRequestWithDefaults

`func NewCatalogsVerticalsListProductsByCatalogBasedFilterRequestWithDefaults() *CatalogsVerticalsListProductsByCatalogBasedFilterRequest`

NewCatalogsVerticalsListProductsByCatalogBasedFilterRequestWithDefaults instantiates a new CatalogsVerticalsListProductsByCatalogBasedFilterRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetCatalogId

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.


### GetFilters

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) GetFilters() CatalogsCreativeAssetsProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) GetFiltersOk() (*CatalogsCreativeAssetsProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) SetFilters(v CatalogsCreativeAssetsProductGroupFilters)`

SetFilters sets Filters field to given value.


### GetCountry

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLocale

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) GetLocale() CatalogsLocale`

GetLocale returns the Locale field if non-nil, zero value otherwise.

### GetLocaleOk

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) GetLocaleOk() (*CatalogsLocale, bool)`

GetLocaleOk returns a tuple with the Locale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocale

`func (o *CatalogsVerticalsListProductsByCatalogBasedFilterRequest) SetLocale(v CatalogsLocale)`

SetLocale sets Locale field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


