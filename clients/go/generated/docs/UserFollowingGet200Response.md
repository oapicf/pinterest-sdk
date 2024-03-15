# UserFollowingGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]UserSummary**](UserSummary.md) | Users | 
**Bookmark** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewUserFollowingGet200Response

`func NewUserFollowingGet200Response(items []UserSummary, ) *UserFollowingGet200Response`

NewUserFollowingGet200Response instantiates a new UserFollowingGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserFollowingGet200ResponseWithDefaults

`func NewUserFollowingGet200ResponseWithDefaults() *UserFollowingGet200Response`

NewUserFollowingGet200ResponseWithDefaults instantiates a new UserFollowingGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *UserFollowingGet200Response) GetItems() []UserSummary`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *UserFollowingGet200Response) GetItemsOk() (*[]UserSummary, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *UserFollowingGet200Response) SetItems(v []UserSummary)`

SetItems sets Items field to given value.


### GetBookmark

`func (o *UserFollowingGet200Response) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *UserFollowingGet200Response) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *UserFollowingGet200Response) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *UserFollowingGet200Response) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *UserFollowingGet200Response) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *UserFollowingGet200Response) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


