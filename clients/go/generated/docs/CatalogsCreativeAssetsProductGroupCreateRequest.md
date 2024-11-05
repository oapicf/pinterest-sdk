# CatalogsCreativeAssetsProductGroupCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**Name** | **string** |  | 
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**CatalogId** | **string** | Catalog id pertaining to the creative assets product group. | 

## Methods

### NewCatalogsCreativeAssetsProductGroupCreateRequest

`func NewCatalogsCreativeAssetsProductGroupCreateRequest(catalogType string, name string, filters CatalogsCreativeAssetsProductGroupFilters, catalogId string, ) *CatalogsCreativeAssetsProductGroupCreateRequest`

NewCatalogsCreativeAssetsProductGroupCreateRequest instantiates a new CatalogsCreativeAssetsProductGroupCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreativeAssetsProductGroupCreateRequestWithDefaults

`func NewCatalogsCreativeAssetsProductGroupCreateRequestWithDefaults() *CatalogsCreativeAssetsProductGroupCreateRequest`

NewCatalogsCreativeAssetsProductGroupCreateRequestWithDefaults instantiates a new CatalogsCreativeAssetsProductGroupCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetName

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetDescription

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) GetFilters() CatalogsCreativeAssetsProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) GetFiltersOk() (*CatalogsCreativeAssetsProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) SetFilters(v CatalogsCreativeAssetsProductGroupFilters)`

SetFilters sets Filters field to given value.


### GetCatalogId

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsCreativeAssetsProductGroupCreateRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


