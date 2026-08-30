# CatalogsProductGroupsCreateManyRequestItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **NullableString** |  | [optional] 
**FeedId** | **string** | Catalog Feed id pertaining to the catalog product group. | 
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**IsFeatured** | Pointer to **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**Name** | **string** |  | 

## Methods

### NewCatalogsProductGroupsCreateManyRequestItems

`func NewCatalogsProductGroupsCreateManyRequestItems(feedId string, filters CatalogsProductGroupFiltersRequest, name string, ) *CatalogsProductGroupsCreateManyRequestItems`

NewCatalogsProductGroupsCreateManyRequestItems instantiates a new CatalogsProductGroupsCreateManyRequestItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupsCreateManyRequestItemsWithDefaults

`func NewCatalogsProductGroupsCreateManyRequestItemsWithDefaults() *CatalogsProductGroupsCreateManyRequestItems`

NewCatalogsProductGroupsCreateManyRequestItemsWithDefaults instantiates a new CatalogsProductGroupsCreateManyRequestItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *CatalogsProductGroupsCreateManyRequestItems) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsProductGroupsCreateManyRequestItems) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsProductGroupsCreateManyRequestItems) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsProductGroupsCreateManyRequestItems) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsProductGroupsCreateManyRequestItems) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsProductGroupsCreateManyRequestItems) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFeedId

`func (o *CatalogsProductGroupsCreateManyRequestItems) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsProductGroupsCreateManyRequestItems) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsProductGroupsCreateManyRequestItems) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetFilters

`func (o *CatalogsProductGroupsCreateManyRequestItems) GetFilters() CatalogsProductGroupFiltersRequest`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsProductGroupsCreateManyRequestItems) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsProductGroupsCreateManyRequestItems) SetFilters(v CatalogsProductGroupFiltersRequest)`

SetFilters sets Filters field to given value.


### GetIsFeatured

`func (o *CatalogsProductGroupsCreateManyRequestItems) GetIsFeatured() bool`

GetIsFeatured returns the IsFeatured field if non-nil, zero value otherwise.

### GetIsFeaturedOk

`func (o *CatalogsProductGroupsCreateManyRequestItems) GetIsFeaturedOk() (*bool, bool)`

GetIsFeaturedOk returns a tuple with the IsFeatured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeatured

`func (o *CatalogsProductGroupsCreateManyRequestItems) SetIsFeatured(v bool)`

SetIsFeatured sets IsFeatured field to given value.

### HasIsFeatured

`func (o *CatalogsProductGroupsCreateManyRequestItems) HasIsFeatured() bool`

HasIsFeatured returns a boolean if a field has been set.

### GetName

`func (o *CatalogsProductGroupsCreateManyRequestItems) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsProductGroupsCreateManyRequestItems) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsProductGroupsCreateManyRequestItems) SetName(v string)`

SetName sets Name field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


