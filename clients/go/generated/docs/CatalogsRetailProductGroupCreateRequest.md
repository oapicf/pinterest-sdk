# CatalogsRetailProductGroupCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | 
**Name** | **string** |  | 
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**CatalogId** | **string** | Catalog id pertaining to the retail product group. | 
**Country** | [**Country**](Country.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Methods

### NewCatalogsRetailProductGroupCreateRequest

`func NewCatalogsRetailProductGroupCreateRequest(catalogType string, name string, filters CatalogsProductGroupFiltersRequest, catalogId string, country Country, locale CatalogsLocale, ) *CatalogsRetailProductGroupCreateRequest`

NewCatalogsRetailProductGroupCreateRequest instantiates a new CatalogsRetailProductGroupCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailProductGroupCreateRequestWithDefaults

`func NewCatalogsRetailProductGroupCreateRequestWithDefaults() *CatalogsRetailProductGroupCreateRequest`

NewCatalogsRetailProductGroupCreateRequestWithDefaults instantiates a new CatalogsRetailProductGroupCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsRetailProductGroupCreateRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailProductGroupCreateRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailProductGroupCreateRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetName

`func (o *CatalogsRetailProductGroupCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsRetailProductGroupCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsRetailProductGroupCreateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetDescription

`func (o *CatalogsRetailProductGroupCreateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsRetailProductGroupCreateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsRetailProductGroupCreateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsRetailProductGroupCreateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsRetailProductGroupCreateRequest) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsRetailProductGroupCreateRequest) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *CatalogsRetailProductGroupCreateRequest) GetFilters() CatalogsProductGroupFiltersRequest`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsRetailProductGroupCreateRequest) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsRetailProductGroupCreateRequest) SetFilters(v CatalogsProductGroupFiltersRequest)`

SetFilters sets Filters field to given value.


### GetCatalogId

`func (o *CatalogsRetailProductGroupCreateRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsRetailProductGroupCreateRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsRetailProductGroupCreateRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.


### GetCountry

`func (o *CatalogsRetailProductGroupCreateRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsRetailProductGroupCreateRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsRetailProductGroupCreateRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLocale

`func (o *CatalogsRetailProductGroupCreateRequest) GetLocale() CatalogsLocale`

GetLocale returns the Locale field if non-nil, zero value otherwise.

### GetLocaleOk

`func (o *CatalogsRetailProductGroupCreateRequest) GetLocaleOk() (*CatalogsLocale, bool)`

GetLocaleOk returns a tuple with the Locale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocale

`func (o *CatalogsRetailProductGroupCreateRequest) SetLocale(v CatalogsLocale)`

SetLocale sets Locale field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


