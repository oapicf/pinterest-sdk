# BulkUpsertRequestUpdateCatalogProductGroupsItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | Pointer to [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 
**IsFeatured** | Pointer to **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**Name** | Pointer to **string** |  | [optional] 

## Methods

### NewBulkUpsertRequestUpdateCatalogProductGroupsItems

`func NewBulkUpsertRequestUpdateCatalogProductGroupsItems() *BulkUpsertRequestUpdateCatalogProductGroupsItems`

NewBulkUpsertRequestUpdateCatalogProductGroupsItems instantiates a new BulkUpsertRequestUpdateCatalogProductGroupsItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkUpsertRequestUpdateCatalogProductGroupsItemsWithDefaults

`func NewBulkUpsertRequestUpdateCatalogProductGroupsItemsWithDefaults() *BulkUpsertRequestUpdateCatalogProductGroupsItems`

NewBulkUpsertRequestUpdateCatalogProductGroupsItemsWithDefaults instantiates a new BulkUpsertRequestUpdateCatalogProductGroupsItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) GetFilters() CatalogsProductGroupFiltersRequest`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) SetFilters(v CatalogsProductGroupFiltersRequest)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) HasFilters() bool`

HasFilters returns a boolean if a field has been set.

### GetIsFeatured

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) GetIsFeatured() bool`

GetIsFeatured returns the IsFeatured field if non-nil, zero value otherwise.

### GetIsFeaturedOk

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) GetIsFeaturedOk() (*bool, bool)`

GetIsFeaturedOk returns a tuple with the IsFeatured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeatured

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) SetIsFeatured(v bool)`

SetIsFeatured sets IsFeatured field to given value.

### HasIsFeatured

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) HasIsFeatured() bool`

HasIsFeatured returns a boolean if a field has been set.

### GetName

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BulkUpsertRequestUpdateCatalogProductGroupsItems) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


