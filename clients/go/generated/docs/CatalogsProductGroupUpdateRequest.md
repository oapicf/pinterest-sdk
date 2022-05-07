# CatalogsProductGroupUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedId** | **string** | Catalog Feed id pertaining to the catalog product group. | 
**Name** | **string** |  | 
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 

## Methods

### NewCatalogsProductGroupUpdateRequest

`func NewCatalogsProductGroupUpdateRequest(feedId string, name string, filters CatalogsProductGroupFilters, ) *CatalogsProductGroupUpdateRequest`

NewCatalogsProductGroupUpdateRequest instantiates a new CatalogsProductGroupUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupUpdateRequestWithDefaults

`func NewCatalogsProductGroupUpdateRequestWithDefaults() *CatalogsProductGroupUpdateRequest`

NewCatalogsProductGroupUpdateRequestWithDefaults instantiates a new CatalogsProductGroupUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedId

`func (o *CatalogsProductGroupUpdateRequest) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsProductGroupUpdateRequest) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsProductGroupUpdateRequest) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetName

`func (o *CatalogsProductGroupUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsProductGroupUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsProductGroupUpdateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetDescription

`func (o *CatalogsProductGroupUpdateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsProductGroupUpdateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsProductGroupUpdateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsProductGroupUpdateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsProductGroupUpdateRequest) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsProductGroupUpdateRequest) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *CatalogsProductGroupUpdateRequest) GetFilters() CatalogsProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsProductGroupUpdateRequest) GetFiltersOk() (*CatalogsProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsProductGroupUpdateRequest) SetFilters(v CatalogsProductGroupFilters)`

SetFilters sets Filters field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


