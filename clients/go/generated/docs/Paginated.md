# Paginated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | **[]map[string]interface{}** |  | 
**Bookmark** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewPaginated

`func NewPaginated(items []map[string]interface{}, ) *Paginated`

NewPaginated instantiates a new Paginated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaginatedWithDefaults

`func NewPaginatedWithDefaults() *Paginated`

NewPaginatedWithDefaults instantiates a new Paginated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *Paginated) GetItems() []map[string]interface{}`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *Paginated) GetItemsOk() (*[]map[string]interface{}, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *Paginated) SetItems(v []map[string]interface{})`

SetItems sets Items field to given value.


### GetBookmark

`func (o *Paginated) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *Paginated) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *Paginated) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *Paginated) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *Paginated) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *Paginated) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


