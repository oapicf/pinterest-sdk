# GetBusinessMembers200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]UserBusinessRoleBinding**](UserBusinessRoleBinding.md) | List of business members. | 
**Bookmark** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewGetBusinessMembers200Response

`func NewGetBusinessMembers200Response(items []UserBusinessRoleBinding, ) *GetBusinessMembers200Response`

NewGetBusinessMembers200Response instantiates a new GetBusinessMembers200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBusinessMembers200ResponseWithDefaults

`func NewGetBusinessMembers200ResponseWithDefaults() *GetBusinessMembers200Response`

NewGetBusinessMembers200ResponseWithDefaults instantiates a new GetBusinessMembers200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *GetBusinessMembers200Response) GetItems() []UserBusinessRoleBinding`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *GetBusinessMembers200Response) GetItemsOk() (*[]UserBusinessRoleBinding, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *GetBusinessMembers200Response) SetItems(v []UserBusinessRoleBinding)`

SetItems sets Items field to given value.


### GetBookmark

`func (o *GetBusinessMembers200Response) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *GetBusinessMembers200Response) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *GetBusinessMembers200Response) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *GetBusinessMembers200Response) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *GetBusinessMembers200Response) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *GetBusinessMembers200Response) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


