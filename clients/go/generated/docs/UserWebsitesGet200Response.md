# UserWebsitesGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | Pointer to **NullableString** |  | [optional] 
**Items** | [**[]UserWebsite**](UserWebsite.md) |  | 

## Methods

### NewUserWebsitesGet200Response

`func NewUserWebsitesGet200Response(items []UserWebsite, ) *UserWebsitesGet200Response`

NewUserWebsitesGet200Response instantiates a new UserWebsitesGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserWebsitesGet200ResponseWithDefaults

`func NewUserWebsitesGet200ResponseWithDefaults() *UserWebsitesGet200Response`

NewUserWebsitesGet200ResponseWithDefaults instantiates a new UserWebsitesGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBookmark

`func (o *UserWebsitesGet200Response) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *UserWebsitesGet200Response) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *UserWebsitesGet200Response) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *UserWebsitesGet200Response) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *UserWebsitesGet200Response) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *UserWebsitesGet200Response) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil
### GetItems

`func (o *UserWebsitesGet200Response) GetItems() []UserWebsite`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *UserWebsitesGet200Response) GetItemsOk() (*[]UserWebsite, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *UserWebsitesGet200Response) SetItems(v []UserWebsite)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


