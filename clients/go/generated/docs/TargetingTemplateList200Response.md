# TargetingTemplateList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | Pointer to **NullableString** |  | [optional] 
**Items** | [**[]TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md) |  | 

## Methods

### NewTargetingTemplateList200Response

`func NewTargetingTemplateList200Response(items []TargetingTemplateGetResponseData, ) *TargetingTemplateList200Response`

NewTargetingTemplateList200Response instantiates a new TargetingTemplateList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTargetingTemplateList200ResponseWithDefaults

`func NewTargetingTemplateList200ResponseWithDefaults() *TargetingTemplateList200Response`

NewTargetingTemplateList200ResponseWithDefaults instantiates a new TargetingTemplateList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBookmark

`func (o *TargetingTemplateList200Response) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *TargetingTemplateList200Response) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *TargetingTemplateList200Response) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *TargetingTemplateList200Response) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *TargetingTemplateList200Response) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *TargetingTemplateList200Response) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil
### GetItems

`func (o *TargetingTemplateList200Response) GetItems() []TargetingTemplateGetResponseData`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *TargetingTemplateList200Response) GetItemsOk() (*[]TargetingTemplateGetResponseData, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *TargetingTemplateList200Response) SetItems(v []TargetingTemplateGetResponseData)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


