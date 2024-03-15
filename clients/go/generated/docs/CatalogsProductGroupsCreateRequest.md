# CatalogsProductGroupsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** |  | 
**Description** | Pointer to **NullableString** |  | [optional] 
**IsFeatured** | Pointer to **bool** | boolean indicator of whether the product group is being featured or not | [optional] [default to false]
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**FeedId** | **string** | Catalog Feed id pertaining to the catalog product group. | 

## Methods

### NewCatalogsProductGroupsCreateRequest

`func NewCatalogsProductGroupsCreateRequest(name string, filters CatalogsProductGroupFiltersRequest, feedId string, ) *CatalogsProductGroupsCreateRequest`

NewCatalogsProductGroupsCreateRequest instantiates a new CatalogsProductGroupsCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupsCreateRequestWithDefaults

`func NewCatalogsProductGroupsCreateRequestWithDefaults() *CatalogsProductGroupsCreateRequest`

NewCatalogsProductGroupsCreateRequestWithDefaults instantiates a new CatalogsProductGroupsCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CatalogsProductGroupsCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsProductGroupsCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsProductGroupsCreateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetDescription

`func (o *CatalogsProductGroupsCreateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsProductGroupsCreateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsProductGroupsCreateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsProductGroupsCreateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsProductGroupsCreateRequest) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsProductGroupsCreateRequest) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetIsFeatured

`func (o *CatalogsProductGroupsCreateRequest) GetIsFeatured() bool`

GetIsFeatured returns the IsFeatured field if non-nil, zero value otherwise.

### GetIsFeaturedOk

`func (o *CatalogsProductGroupsCreateRequest) GetIsFeaturedOk() (*bool, bool)`

GetIsFeaturedOk returns a tuple with the IsFeatured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeatured

`func (o *CatalogsProductGroupsCreateRequest) SetIsFeatured(v bool)`

SetIsFeatured sets IsFeatured field to given value.

### HasIsFeatured

`func (o *CatalogsProductGroupsCreateRequest) HasIsFeatured() bool`

HasIsFeatured returns a boolean if a field has been set.

### GetFilters

`func (o *CatalogsProductGroupsCreateRequest) GetFilters() CatalogsProductGroupFiltersRequest`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsProductGroupsCreateRequest) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsProductGroupsCreateRequest) SetFilters(v CatalogsProductGroupFiltersRequest)`

SetFilters sets Filters field to given value.


### GetFeedId

`func (o *CatalogsProductGroupsCreateRequest) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsProductGroupsCreateRequest) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsProductGroupsCreateRequest) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


