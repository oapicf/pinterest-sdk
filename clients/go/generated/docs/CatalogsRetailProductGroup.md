# CatalogsRetailProductGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**Id** | **string** | ID of the catalog product group. | 
**Name** | Pointer to **string** | Name of catalog product group | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**IsFeatured** | Pointer to **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**Type** | Pointer to [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] 
**Status** | Pointer to [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] 
**CreatedAt** | Pointer to **int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**UpdatedAt** | Pointer to **int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**FeedId** | **NullableString** |  | 

## Methods

### NewCatalogsRetailProductGroup

`func NewCatalogsRetailProductGroup(catalogType string, id string, filters CatalogsProductGroupFilters, feedId NullableString, ) *CatalogsRetailProductGroup`

NewCatalogsRetailProductGroup instantiates a new CatalogsRetailProductGroup object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailProductGroupWithDefaults

`func NewCatalogsRetailProductGroupWithDefaults() *CatalogsRetailProductGroup`

NewCatalogsRetailProductGroupWithDefaults instantiates a new CatalogsRetailProductGroup object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsRetailProductGroup) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailProductGroup) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailProductGroup) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetId

`func (o *CatalogsRetailProductGroup) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CatalogsRetailProductGroup) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CatalogsRetailProductGroup) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *CatalogsRetailProductGroup) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsRetailProductGroup) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsRetailProductGroup) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsRetailProductGroup) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *CatalogsRetailProductGroup) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsRetailProductGroup) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsRetailProductGroup) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsRetailProductGroup) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsRetailProductGroup) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsRetailProductGroup) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *CatalogsRetailProductGroup) GetFilters() CatalogsProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsRetailProductGroup) GetFiltersOk() (*CatalogsProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsRetailProductGroup) SetFilters(v CatalogsProductGroupFilters)`

SetFilters sets Filters field to given value.


### GetIsFeatured

`func (o *CatalogsRetailProductGroup) GetIsFeatured() bool`

GetIsFeatured returns the IsFeatured field if non-nil, zero value otherwise.

### GetIsFeaturedOk

`func (o *CatalogsRetailProductGroup) GetIsFeaturedOk() (*bool, bool)`

GetIsFeaturedOk returns a tuple with the IsFeatured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeatured

`func (o *CatalogsRetailProductGroup) SetIsFeatured(v bool)`

SetIsFeatured sets IsFeatured field to given value.

### HasIsFeatured

`func (o *CatalogsRetailProductGroup) HasIsFeatured() bool`

HasIsFeatured returns a boolean if a field has been set.

### GetType

`func (o *CatalogsRetailProductGroup) GetType() CatalogsProductGroupType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CatalogsRetailProductGroup) GetTypeOk() (*CatalogsProductGroupType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CatalogsRetailProductGroup) SetType(v CatalogsProductGroupType)`

SetType sets Type field to given value.

### HasType

`func (o *CatalogsRetailProductGroup) HasType() bool`

HasType returns a boolean if a field has been set.

### GetStatus

`func (o *CatalogsRetailProductGroup) GetStatus() CatalogsProductGroupStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsRetailProductGroup) GetStatusOk() (*CatalogsProductGroupStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsRetailProductGroup) SetStatus(v CatalogsProductGroupStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CatalogsRetailProductGroup) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCreatedAt

`func (o *CatalogsRetailProductGroup) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *CatalogsRetailProductGroup) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *CatalogsRetailProductGroup) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *CatalogsRetailProductGroup) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *CatalogsRetailProductGroup) GetUpdatedAt() int32`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *CatalogsRetailProductGroup) GetUpdatedAtOk() (*int32, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *CatalogsRetailProductGroup) SetUpdatedAt(v int32)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *CatalogsRetailProductGroup) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.

### GetFeedId

`func (o *CatalogsRetailProductGroup) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsRetailProductGroup) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsRetailProductGroup) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### SetFeedIdNil

`func (o *CatalogsRetailProductGroup) SetFeedIdNil(b bool)`

 SetFeedIdNil sets the value for FeedId to be an explicit nil

### UnsetFeedId
`func (o *CatalogsRetailProductGroup) UnsetFeedId()`

UnsetFeedId ensures that no value is present for FeedId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


