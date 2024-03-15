# FeedsList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]CatalogsFeed**](CatalogsFeed.md) |  | 
**Bookmark** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewFeedsList200Response

`func NewFeedsList200Response(items []CatalogsFeed, ) *FeedsList200Response`

NewFeedsList200Response instantiates a new FeedsList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedsList200ResponseWithDefaults

`func NewFeedsList200ResponseWithDefaults() *FeedsList200Response`

NewFeedsList200ResponseWithDefaults instantiates a new FeedsList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *FeedsList200Response) GetItems() []CatalogsFeed`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *FeedsList200Response) GetItemsOk() (*[]CatalogsFeed, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *FeedsList200Response) SetItems(v []CatalogsFeed)`

SetItems sets Items field to given value.


### GetBookmark

`func (o *FeedsList200Response) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *FeedsList200Response) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *FeedsList200Response) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *FeedsList200Response) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *FeedsList200Response) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *FeedsList200Response) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


