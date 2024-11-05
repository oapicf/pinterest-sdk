# CatalogsRetailProductGroupUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | Pointer to **string** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | Pointer to [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 
**Country** | Pointer to [**Country**](Country.md) |  | [optional] 
**Locale** | Pointer to [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] 

## Methods

### NewCatalogsRetailProductGroupUpdateRequest

`func NewCatalogsRetailProductGroupUpdateRequest() *CatalogsRetailProductGroupUpdateRequest`

NewCatalogsRetailProductGroupUpdateRequest instantiates a new CatalogsRetailProductGroupUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailProductGroupUpdateRequestWithDefaults

`func NewCatalogsRetailProductGroupUpdateRequestWithDefaults() *CatalogsRetailProductGroupUpdateRequest`

NewCatalogsRetailProductGroupUpdateRequestWithDefaults instantiates a new CatalogsRetailProductGroupUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsRetailProductGroupUpdateRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailProductGroupUpdateRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailProductGroupUpdateRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.

### HasCatalogType

`func (o *CatalogsRetailProductGroupUpdateRequest) HasCatalogType() bool`

HasCatalogType returns a boolean if a field has been set.

### GetName

`func (o *CatalogsRetailProductGroupUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsRetailProductGroupUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsRetailProductGroupUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsRetailProductGroupUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *CatalogsRetailProductGroupUpdateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsRetailProductGroupUpdateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsRetailProductGroupUpdateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsRetailProductGroupUpdateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsRetailProductGroupUpdateRequest) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsRetailProductGroupUpdateRequest) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *CatalogsRetailProductGroupUpdateRequest) GetFilters() CatalogsProductGroupFiltersRequest`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsRetailProductGroupUpdateRequest) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsRetailProductGroupUpdateRequest) SetFilters(v CatalogsProductGroupFiltersRequest)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CatalogsRetailProductGroupUpdateRequest) HasFilters() bool`

HasFilters returns a boolean if a field has been set.

### GetCountry

`func (o *CatalogsRetailProductGroupUpdateRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsRetailProductGroupUpdateRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsRetailProductGroupUpdateRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *CatalogsRetailProductGroupUpdateRequest) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetLocale

`func (o *CatalogsRetailProductGroupUpdateRequest) GetLocale() CatalogsLocale`

GetLocale returns the Locale field if non-nil, zero value otherwise.

### GetLocaleOk

`func (o *CatalogsRetailProductGroupUpdateRequest) GetLocaleOk() (*CatalogsLocale, bool)`

GetLocaleOk returns a tuple with the Locale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocale

`func (o *CatalogsRetailProductGroupUpdateRequest) SetLocale(v CatalogsLocale)`

SetLocale sets Locale field to given value.

### HasLocale

`func (o *CatalogsRetailProductGroupUpdateRequest) HasLocale() bool`

HasLocale returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


