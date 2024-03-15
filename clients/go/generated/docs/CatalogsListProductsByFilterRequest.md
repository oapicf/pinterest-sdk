# CatalogsListProductsByFilterRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedId** | **string** | Catalog Feed id pertaining to the catalog product group filter. | 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 

## Methods

### NewCatalogsListProductsByFilterRequest

`func NewCatalogsListProductsByFilterRequest(feedId string, filters CatalogsProductGroupFilters, ) *CatalogsListProductsByFilterRequest`

NewCatalogsListProductsByFilterRequest instantiates a new CatalogsListProductsByFilterRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsListProductsByFilterRequestWithDefaults

`func NewCatalogsListProductsByFilterRequestWithDefaults() *CatalogsListProductsByFilterRequest`

NewCatalogsListProductsByFilterRequestWithDefaults instantiates a new CatalogsListProductsByFilterRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedId

`func (o *CatalogsListProductsByFilterRequest) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsListProductsByFilterRequest) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsListProductsByFilterRequest) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetFilters

`func (o *CatalogsListProductsByFilterRequest) GetFilters() CatalogsProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsListProductsByFilterRequest) GetFiltersOk() (*CatalogsProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsListProductsByFilterRequest) SetFilters(v CatalogsProductGroupFilters)`

SetFilters sets Filters field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


