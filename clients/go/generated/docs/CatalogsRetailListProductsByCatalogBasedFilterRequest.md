# CatalogsRetailListProductsByCatalogBasedFilterRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | 
**CatalogId** | **string** | Catalog id pertaining to the retail product group. | 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**Country** | [**Country**](Country.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Methods

### NewCatalogsRetailListProductsByCatalogBasedFilterRequest

`func NewCatalogsRetailListProductsByCatalogBasedFilterRequest(catalogType string, catalogId string, filters CatalogsProductGroupFilters, country Country, locale CatalogsLocale, ) *CatalogsRetailListProductsByCatalogBasedFilterRequest`

NewCatalogsRetailListProductsByCatalogBasedFilterRequest instantiates a new CatalogsRetailListProductsByCatalogBasedFilterRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailListProductsByCatalogBasedFilterRequestWithDefaults

`func NewCatalogsRetailListProductsByCatalogBasedFilterRequestWithDefaults() *CatalogsRetailListProductsByCatalogBasedFilterRequest`

NewCatalogsRetailListProductsByCatalogBasedFilterRequestWithDefaults instantiates a new CatalogsRetailListProductsByCatalogBasedFilterRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetCatalogId

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.


### GetFilters

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetFilters() CatalogsProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetFiltersOk() (*CatalogsProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) SetFilters(v CatalogsProductGroupFilters)`

SetFilters sets Filters field to given value.


### GetCountry

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLocale

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetLocale() CatalogsLocale`

GetLocale returns the Locale field if non-nil, zero value otherwise.

### GetLocaleOk

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetLocaleOk() (*CatalogsLocale, bool)`

GetLocaleOk returns a tuple with the Locale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocale

`func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) SetLocale(v CatalogsLocale)`

SetLocale sets Locale field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


