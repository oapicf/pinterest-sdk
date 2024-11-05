# CatalogsCreativeAssetsProductGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**Id** | **string** | ID of the creative assets product group. | 
**Name** | Pointer to **string** | Name of creative assets product group | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**CreatedAt** | Pointer to **int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**UpdatedAt** | Pointer to **int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**CatalogId** | **string** | Catalog id pertaining to the creative assets product group. | 

## Methods

### NewCatalogsCreativeAssetsProductGroup

`func NewCatalogsCreativeAssetsProductGroup(catalogType string, id string, filters CatalogsCreativeAssetsProductGroupFilters, catalogId string, ) *CatalogsCreativeAssetsProductGroup`

NewCatalogsCreativeAssetsProductGroup instantiates a new CatalogsCreativeAssetsProductGroup object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreativeAssetsProductGroupWithDefaults

`func NewCatalogsCreativeAssetsProductGroupWithDefaults() *CatalogsCreativeAssetsProductGroup`

NewCatalogsCreativeAssetsProductGroupWithDefaults instantiates a new CatalogsCreativeAssetsProductGroup object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsCreativeAssetsProductGroup) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsCreativeAssetsProductGroup) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsCreativeAssetsProductGroup) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetId

`func (o *CatalogsCreativeAssetsProductGroup) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CatalogsCreativeAssetsProductGroup) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CatalogsCreativeAssetsProductGroup) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *CatalogsCreativeAssetsProductGroup) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsCreativeAssetsProductGroup) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsCreativeAssetsProductGroup) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsCreativeAssetsProductGroup) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *CatalogsCreativeAssetsProductGroup) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsCreativeAssetsProductGroup) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsCreativeAssetsProductGroup) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsCreativeAssetsProductGroup) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsCreativeAssetsProductGroup) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsCreativeAssetsProductGroup) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *CatalogsCreativeAssetsProductGroup) GetFilters() CatalogsCreativeAssetsProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsCreativeAssetsProductGroup) GetFiltersOk() (*CatalogsCreativeAssetsProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsCreativeAssetsProductGroup) SetFilters(v CatalogsCreativeAssetsProductGroupFilters)`

SetFilters sets Filters field to given value.


### GetCreatedAt

`func (o *CatalogsCreativeAssetsProductGroup) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *CatalogsCreativeAssetsProductGroup) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *CatalogsCreativeAssetsProductGroup) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *CatalogsCreativeAssetsProductGroup) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *CatalogsCreativeAssetsProductGroup) GetUpdatedAt() int32`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *CatalogsCreativeAssetsProductGroup) GetUpdatedAtOk() (*int32, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *CatalogsCreativeAssetsProductGroup) SetUpdatedAt(v int32)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *CatalogsCreativeAssetsProductGroup) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.

### GetCatalogId

`func (o *CatalogsCreativeAssetsProductGroup) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsCreativeAssetsProductGroup) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsCreativeAssetsProductGroup) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


