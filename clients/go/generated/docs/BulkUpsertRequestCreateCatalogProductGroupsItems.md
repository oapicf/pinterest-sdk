# BulkUpsertRequestCreateCatalogProductGroupsItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **NullableString** |  | [optional] 
**FeedId** | **string** | Catalog Feed id pertaining to the catalog product group. | 
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**IsFeatured** | Pointer to **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**Name** | **string** |  | 

## Methods

### NewBulkUpsertRequestCreateCatalogProductGroupsItems

`func NewBulkUpsertRequestCreateCatalogProductGroupsItems(feedId string, filters CatalogsProductGroupFiltersRequest, name string, ) *BulkUpsertRequestCreateCatalogProductGroupsItems`

NewBulkUpsertRequestCreateCatalogProductGroupsItems instantiates a new BulkUpsertRequestCreateCatalogProductGroupsItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkUpsertRequestCreateCatalogProductGroupsItemsWithDefaults

`func NewBulkUpsertRequestCreateCatalogProductGroupsItemsWithDefaults() *BulkUpsertRequestCreateCatalogProductGroupsItems`

NewBulkUpsertRequestCreateCatalogProductGroupsItemsWithDefaults instantiates a new BulkUpsertRequestCreateCatalogProductGroupsItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFeedId

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetFilters

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) GetFilters() CatalogsProductGroupFiltersRequest`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) SetFilters(v CatalogsProductGroupFiltersRequest)`

SetFilters sets Filters field to given value.


### GetIsFeatured

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) GetIsFeatured() bool`

GetIsFeatured returns the IsFeatured field if non-nil, zero value otherwise.

### GetIsFeaturedOk

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) GetIsFeaturedOk() (*bool, bool)`

GetIsFeaturedOk returns a tuple with the IsFeatured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeatured

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) SetIsFeatured(v bool)`

SetIsFeatured sets IsFeatured field to given value.

### HasIsFeatured

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) HasIsFeatured() bool`

HasIsFeatured returns a boolean if a field has been set.

### GetName

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BulkUpsertRequestCreateCatalogProductGroupsItems) SetName(v string)`

SetName sets Name field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


