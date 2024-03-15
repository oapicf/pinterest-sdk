# CatalogsVerticalProductGroupCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**Name** | **string** |  | 
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**CatalogId** | **string** | Catalog id pertaining to the hotel product group. | 

## Methods

### NewCatalogsVerticalProductGroupCreateRequest

`func NewCatalogsVerticalProductGroupCreateRequest(catalogType string, name string, filters CatalogsHotelProductGroupFilters, catalogId string, ) *CatalogsVerticalProductGroupCreateRequest`

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

`func (o *CatalogsVerticalProductGroupCreateRequest) GetFilters() CatalogsHotelProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsVerticalProductGroupCreateRequest) GetFiltersOk() (*CatalogsHotelProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsVerticalProductGroupCreateRequest) SetFilters(v CatalogsHotelProductGroupFilters)`

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



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


