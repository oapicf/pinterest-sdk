# CatalogsHotelProductGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**Id** | **string** | ID of the hotel product group. | 
**Name** | Pointer to **string** | Name of hotel product group | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**CreatedAt** | Pointer to **int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**UpdatedAt** | Pointer to **int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**CatalogId** | **string** |  | 

## Methods

### NewCatalogsHotelProductGroup

`func NewCatalogsHotelProductGroup(catalogType string, id string, filters CatalogsHotelProductGroupFilters, catalogId string, ) *CatalogsHotelProductGroup`

NewCatalogsHotelProductGroup instantiates a new CatalogsHotelProductGroup object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelProductGroupWithDefaults

`func NewCatalogsHotelProductGroupWithDefaults() *CatalogsHotelProductGroup`

NewCatalogsHotelProductGroupWithDefaults instantiates a new CatalogsHotelProductGroup object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsHotelProductGroup) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsHotelProductGroup) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsHotelProductGroup) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetId

`func (o *CatalogsHotelProductGroup) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CatalogsHotelProductGroup) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CatalogsHotelProductGroup) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *CatalogsHotelProductGroup) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsHotelProductGroup) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsHotelProductGroup) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsHotelProductGroup) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *CatalogsHotelProductGroup) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsHotelProductGroup) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsHotelProductGroup) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsHotelProductGroup) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsHotelProductGroup) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsHotelProductGroup) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *CatalogsHotelProductGroup) GetFilters() CatalogsHotelProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsHotelProductGroup) GetFiltersOk() (*CatalogsHotelProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsHotelProductGroup) SetFilters(v CatalogsHotelProductGroupFilters)`

SetFilters sets Filters field to given value.


### GetCreatedAt

`func (o *CatalogsHotelProductGroup) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *CatalogsHotelProductGroup) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *CatalogsHotelProductGroup) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *CatalogsHotelProductGroup) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *CatalogsHotelProductGroup) GetUpdatedAt() int32`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *CatalogsHotelProductGroup) GetUpdatedAtOk() (*int32, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *CatalogsHotelProductGroup) SetUpdatedAt(v int32)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *CatalogsHotelProductGroup) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.

### GetCatalogId

`func (o *CatalogsHotelProductGroup) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsHotelProductGroup) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsHotelProductGroup) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


