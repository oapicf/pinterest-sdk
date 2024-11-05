# CatalogsVerticalProductGroupCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**Name** | **string** |  | 
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**CatalogId** | **string** | Catalog id pertaining to the creative assets product group. | 
**Country** | [**Country**](Country.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Methods

### NewCatalogsVerticalProductGroupCreateRequest

`func NewCatalogsVerticalProductGroupCreateRequest(catalogType string, name string, filters CatalogsCreativeAssetsProductGroupFilters, catalogId string, country Country, locale CatalogsLocale, ) *CatalogsVerticalProductGroupCreateRequest`

NewCatalogsVerticalProductGroupCreateRequest instantiates a new CatalogsVerticalProductGroupCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsVerticalProductGroupCreateRequestWithDefaults

`func NewCatalogsVerticalProductGroupCreateRequestWithDefaults() *CatalogsVerticalProductGroupCreateRequest`

NewCatalogsVerticalProductGroupCreateRequestWithDefaults instantiates a new CatalogsVerticalProductGroupCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsVerticalProductGroupCreateRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsVerticalProductGroupCreateRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsVerticalProductGroupCreateRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetName

`func (o *CatalogsVerticalProductGroupCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsVerticalProductGroupCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsVerticalProductGroupCreateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetDescription

`func (o *CatalogsVerticalProductGroupCreateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsVerticalProductGroupCreateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsVerticalProductGroupCreateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsVerticalProductGroupCreateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsVerticalProductGroupCreateRequest) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsVerticalProductGroupCreateRequest) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *CatalogsVerticalProductGroupCreateRequest) GetFilters() CatalogsCreativeAssetsProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsVerticalProductGroupCreateRequest) GetFiltersOk() (*CatalogsCreativeAssetsProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsVerticalProductGroupCreateRequest) SetFilters(v CatalogsCreativeAssetsProductGroupFilters)`

SetFilters sets Filters field to given value.


### GetCatalogId

`func (o *CatalogsVerticalProductGroupCreateRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsVerticalProductGroupCreateRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsVerticalProductGroupCreateRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.


### GetCountry

`func (o *CatalogsVerticalProductGroupCreateRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsVerticalProductGroupCreateRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsVerticalProductGroupCreateRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLocale

`func (o *CatalogsVerticalProductGroupCreateRequest) GetLocale() CatalogsLocale`

GetLocale returns the Locale field if non-nil, zero value otherwise.

### GetLocaleOk

`func (o *CatalogsVerticalProductGroupCreateRequest) GetLocaleOk() (*CatalogsLocale, bool)`

GetLocaleOk returns a tuple with the Locale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocale

`func (o *CatalogsVerticalProductGroupCreateRequest) SetLocale(v CatalogsLocale)`

SetLocale sets Locale field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


