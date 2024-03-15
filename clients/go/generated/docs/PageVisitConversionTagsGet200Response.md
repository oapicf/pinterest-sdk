# PageVisitConversionTagsGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]ConversionEventResponse**](ConversionEventResponse.md) |  | 
**Bookmark** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewPageVisitConversionTagsGet200Response

`func NewPageVisitConversionTagsGet200Response(items []ConversionEventResponse, ) *PageVisitConversionTagsGet200Response`

NewPageVisitConversionTagsGet200Response instantiates a new PageVisitConversionTagsGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPageVisitConversionTagsGet200ResponseWithDefaults

`func NewPageVisitConversionTagsGet200ResponseWithDefaults() *PageVisitConversionTagsGet200Response`

NewPageVisitConversionTagsGet200ResponseWithDefaults instantiates a new PageVisitConversionTagsGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *PageVisitConversionTagsGet200Response) GetItems() []ConversionEventResponse`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *PageVisitConversionTagsGet200Response) GetItemsOk() (*[]ConversionEventResponse, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *PageVisitConversionTagsGet200Response) SetItems(v []ConversionEventResponse)`

SetItems sets Items field to given value.


### GetBookmark

`func (o *PageVisitConversionTagsGet200Response) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *PageVisitConversionTagsGet200Response) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *PageVisitConversionTagsGet200Response) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *PageVisitConversionTagsGet200Response) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *PageVisitConversionTagsGet200Response) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *PageVisitConversionTagsGet200Response) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


