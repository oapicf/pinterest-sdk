# BoardsList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]Board**](Board.md) | Boards | 
**Bookmark** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewBoardsList200Response

`func NewBoardsList200Response(items []Board, ) *BoardsList200Response`

NewBoardsList200Response instantiates a new BoardsList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBoardsList200ResponseWithDefaults

`func NewBoardsList200ResponseWithDefaults() *BoardsList200Response`

NewBoardsList200ResponseWithDefaults instantiates a new BoardsList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *BoardsList200Response) GetItems() []Board`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *BoardsList200Response) GetItemsOk() (*[]Board, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *BoardsList200Response) SetItems(v []Board)`

SetItems sets Items field to given value.


### GetBookmark

`func (o *BoardsList200Response) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *BoardsList200Response) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *BoardsList200Response) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *BoardsList200Response) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *BoardsList200Response) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *BoardsList200Response) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


