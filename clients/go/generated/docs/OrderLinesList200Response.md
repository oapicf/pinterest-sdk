# OrderLinesList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]OrderLine**](OrderLine.md) |  | 
**Bookmark** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewOrderLinesList200Response

`func NewOrderLinesList200Response(items []OrderLine, ) *OrderLinesList200Response`

NewOrderLinesList200Response instantiates a new OrderLinesList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderLinesList200ResponseWithDefaults

`func NewOrderLinesList200ResponseWithDefaults() *OrderLinesList200Response`

NewOrderLinesList200ResponseWithDefaults instantiates a new OrderLinesList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *OrderLinesList200Response) GetItems() []OrderLine`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *OrderLinesList200Response) GetItemsOk() (*[]OrderLine, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *OrderLinesList200Response) SetItems(v []OrderLine)`

SetItems sets Items field to given value.


### GetBookmark

`func (o *OrderLinesList200Response) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *OrderLinesList200Response) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *OrderLinesList200Response) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *OrderLinesList200Response) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *OrderLinesList200Response) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *OrderLinesList200Response) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


