# CatalogsListProductsByFeedBasedFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedId** | **string** | Catalog Feed id pertaining to the catalog product group filter. | 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 

## Methods

### NewCatalogsListProductsByFeedBasedFilter

`func NewCatalogsListProductsByFeedBasedFilter(feedId string, filters CatalogsProductGroupFilters, ) *CatalogsListProductsByFeedBasedFilter`

NewCatalogsListProductsByFeedBasedFilter instantiates a new CatalogsListProductsByFeedBasedFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsListProductsByFeedBasedFilterWithDefaults

`func NewCatalogsListProductsByFeedBasedFilterWithDefaults() *CatalogsListProductsByFeedBasedFilter`

NewCatalogsListProductsByFeedBasedFilterWithDefaults instantiates a new CatalogsListProductsByFeedBasedFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedId

`func (o *CatalogsListProductsByFeedBasedFilter) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsListProductsByFeedBasedFilter) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsListProductsByFeedBasedFilter) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetFilters

`func (o *CatalogsListProductsByFeedBasedFilter) GetFilters() CatalogsProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsListProductsByFeedBasedFilter) GetFiltersOk() (*CatalogsProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsListProductsByFeedBasedFilter) SetFilters(v CatalogsProductGroupFilters)`

SetFilters sets Filters field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


