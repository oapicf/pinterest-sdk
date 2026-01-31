# PinMediaSourceImagesURL

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | Pointer to **int32** |  | [optional] 
**Items** | [**[]PinMediaSourceImagesURLItem**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**SourceType** | **string** | The source type of the media. | 

## Methods

### NewPinMediaSourceImagesURL

`func NewPinMediaSourceImagesURL(items []PinMediaSourceImagesURLItem, sourceType string, ) *PinMediaSourceImagesURL`

NewPinMediaSourceImagesURL instantiates a new PinMediaSourceImagesURL object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinMediaSourceImagesURLWithDefaults

`func NewPinMediaSourceImagesURLWithDefaults() *PinMediaSourceImagesURL`

NewPinMediaSourceImagesURLWithDefaults instantiates a new PinMediaSourceImagesURL object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *PinMediaSourceImagesURL) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *PinMediaSourceImagesURL) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *PinMediaSourceImagesURL) SetIndex(v int32)`

SetIndex sets Index field to given value.

### HasIndex

`func (o *PinMediaSourceImagesURL) HasIndex() bool`

HasIndex returns a boolean if a field has been set.

### GetItems

`func (o *PinMediaSourceImagesURL) GetItems() []PinMediaSourceImagesURLItem`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *PinMediaSourceImagesURL) GetItemsOk() (*[]PinMediaSourceImagesURLItem, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *PinMediaSourceImagesURL) SetItems(v []PinMediaSourceImagesURLItem)`

SetItems sets Items field to given value.


### GetSourceType

`func (o *PinMediaSourceImagesURL) GetSourceType() string`

GetSourceType returns the SourceType field if non-nil, zero value otherwise.

### GetSourceTypeOk

`func (o *PinMediaSourceImagesURL) GetSourceTypeOk() (*string, bool)`

GetSourceTypeOk returns a tuple with the SourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceType

`func (o *PinMediaSourceImagesURL) SetSourceType(v string)`

SetSourceType sets SourceType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


