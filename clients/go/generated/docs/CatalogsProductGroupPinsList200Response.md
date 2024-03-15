# CatalogsProductGroupPinsList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]CatalogsProduct**](CatalogsProduct.md) | Pins | 
**Bookmark** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewCatalogsProductGroupPinsList200Response

`func NewCatalogsProductGroupPinsList200Response(items []CatalogsProduct, ) *CatalogsProductGroupPinsList200Response`

NewCatalogsProductGroupPinsList200Response instantiates a new CatalogsProductGroupPinsList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupPinsList200ResponseWithDefaults

`func NewCatalogsProductGroupPinsList200ResponseWithDefaults() *CatalogsProductGroupPinsList200Response`

NewCatalogsProductGroupPinsList200ResponseWithDefaults instantiates a new CatalogsProductGroupPinsList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *CatalogsProductGroupPinsList200Response) GetItems() []CatalogsProduct`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsProductGroupPinsList200Response) GetItemsOk() (*[]CatalogsProduct, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsProductGroupPinsList200Response) SetItems(v []CatalogsProduct)`

SetItems sets Items field to given value.


### GetBookmark

`func (o *CatalogsProductGroupPinsList200Response) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *CatalogsProductGroupPinsList200Response) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *CatalogsProductGroupPinsList200Response) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *CatalogsProductGroupPinsList200Response) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *CatalogsProductGroupPinsList200Response) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *CatalogsProductGroupPinsList200Response) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


