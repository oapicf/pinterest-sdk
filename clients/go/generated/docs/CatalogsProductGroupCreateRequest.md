# CatalogsProductGroupCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** |  | 
**Description** | Pointer to **NullableString** |  | [optional] 
**IsFeatured** | Pointer to **bool** | boolean indicator of whether the product group is being featured or not | [optional] [default to false]
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**FeedId** | **string** | Catalog Feed id pertaining to the catalog product group. | 

## Methods

### NewCatalogsProductGroupCreateRequest

`func NewCatalogsProductGroupCreateRequest(name string, filters CatalogsProductGroupFiltersRequest, feedId string, ) *CatalogsProductGroupCreateRequest`

NewCatalogsProductGroupCreateRequest instantiates a new CatalogsProductGroupCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupCreateRequestWithDefaults

`func NewCatalogsProductGroupCreateRequestWithDefaults() *CatalogsProductGroupCreateRequest`

NewCatalogsProductGroupCreateRequestWithDefaults instantiates a new CatalogsProductGroupCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CatalogsProductGroupCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsProductGroupCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsProductGroupCreateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetDescription

`func (o *CatalogsProductGroupCreateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsProductGroupCreateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsProductGroupCreateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsProductGroupCreateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsProductGroupCreateRequest) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsProductGroupCreateRequest) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetIsFeatured

`func (o *CatalogsProductGroupCreateRequest) GetIsFeatured() bool`

GetIsFeatured returns the IsFeatured field if non-nil, zero value otherwise.

### GetIsFeaturedOk

`func (o *CatalogsProductGroupCreateRequest) GetIsFeaturedOk() (*bool, bool)`

GetIsFeaturedOk returns a tuple with the IsFeatured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeatured

`func (o *CatalogsProductGroupCreateRequest) SetIsFeatured(v bool)`

SetIsFeatured sets IsFeatured field to given value.

### HasIsFeatured

`func (o *CatalogsProductGroupCreateRequest) HasIsFeatured() bool`

HasIsFeatured returns a boolean if a field has been set.

### GetFilters

`func (o *CatalogsProductGroupCreateRequest) GetFilters() CatalogsProductGroupFiltersRequest`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsProductGroupCreateRequest) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsProductGroupCreateRequest) SetFilters(v CatalogsProductGroupFiltersRequest)`

SetFilters sets Filters field to given value.


### GetFeedId

`func (o *CatalogsProductGroupCreateRequest) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsProductGroupCreateRequest) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsProductGroupCreateRequest) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


