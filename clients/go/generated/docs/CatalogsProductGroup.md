# CatalogsProductGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | ID of the catalog product group. | 
**Name** | Pointer to **string** | Name of catalog product group | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**IsFeatured** | Pointer to **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**Type** | Pointer to [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] 
**Status** | Pointer to [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] 
**CreatedAt** | Pointer to **int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**UpdatedAt** | Pointer to **int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**FeedId** | **string** | id of the catalogs feed belonging to this catalog product group | 
**CatalogType** | Pointer to **string** |  | [optional] 

## Methods

### NewCatalogsProductGroup

`func NewCatalogsProductGroup(id string, filters CatalogsProductGroupFilters, feedId string, ) *CatalogsProductGroup`

NewCatalogsProductGroup instantiates a new CatalogsProductGroup object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupWithDefaults

`func NewCatalogsProductGroupWithDefaults() *CatalogsProductGroup`

NewCatalogsProductGroupWithDefaults instantiates a new CatalogsProductGroup object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CatalogsProductGroup) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CatalogsProductGroup) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CatalogsProductGroup) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *CatalogsProductGroup) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsProductGroup) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsProductGroup) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsProductGroup) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *CatalogsProductGroup) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsProductGroup) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsProductGroup) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsProductGroup) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsProductGroup) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsProductGroup) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *CatalogsProductGroup) GetFilters() CatalogsProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsProductGroup) GetFiltersOk() (*CatalogsProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsProductGroup) SetFilters(v CatalogsProductGroupFilters)`

SetFilters sets Filters field to given value.


### GetIsFeatured

`func (o *CatalogsProductGroup) GetIsFeatured() bool`

GetIsFeatured returns the IsFeatured field if non-nil, zero value otherwise.

### GetIsFeaturedOk

`func (o *CatalogsProductGroup) GetIsFeaturedOk() (*bool, bool)`

GetIsFeaturedOk returns a tuple with the IsFeatured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeatured

`func (o *CatalogsProductGroup) SetIsFeatured(v bool)`

SetIsFeatured sets IsFeatured field to given value.

### HasIsFeatured

`func (o *CatalogsProductGroup) HasIsFeatured() bool`

HasIsFeatured returns a boolean if a field has been set.

### GetType

`func (o *CatalogsProductGroup) GetType() CatalogsProductGroupType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CatalogsProductGroup) GetTypeOk() (*CatalogsProductGroupType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CatalogsProductGroup) SetType(v CatalogsProductGroupType)`

SetType sets Type field to given value.

### HasType

`func (o *CatalogsProductGroup) HasType() bool`

HasType returns a boolean if a field has been set.

### GetStatus

`func (o *CatalogsProductGroup) GetStatus() CatalogsProductGroupStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsProductGroup) GetStatusOk() (*CatalogsProductGroupStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsProductGroup) SetStatus(v CatalogsProductGroupStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CatalogsProductGroup) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCreatedAt

`func (o *CatalogsProductGroup) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *CatalogsProductGroup) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *CatalogsProductGroup) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *CatalogsProductGroup) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *CatalogsProductGroup) GetUpdatedAt() int32`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *CatalogsProductGroup) GetUpdatedAtOk() (*int32, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *CatalogsProductGroup) SetUpdatedAt(v int32)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *CatalogsProductGroup) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.

### GetFeedId

`func (o *CatalogsProductGroup) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsProductGroup) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsProductGroup) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetCatalogType

`func (o *CatalogsProductGroup) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsProductGroup) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsProductGroup) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.

### HasCatalogType

`func (o *CatalogsProductGroup) HasCatalogType() bool`

HasCatalogType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


