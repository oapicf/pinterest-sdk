# PinMediaSourceImagesBase64

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceType** | Pointer to **string** |  | [optional] 
**Items** | [**[]PinMediaSourceImagesBase64ItemsInner**](PinMediaSourceImagesBase64ItemsInner.md) | Array with image objects. | 
**Index** | Pointer to **int32** |  | [optional] 

## Methods

### NewPinMediaSourceImagesBase64

`func NewPinMediaSourceImagesBase64(items []PinMediaSourceImagesBase64ItemsInner, ) *PinMediaSourceImagesBase64`

NewPinMediaSourceImagesBase64 instantiates a new PinMediaSourceImagesBase64 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinMediaSourceImagesBase64WithDefaults

`func NewPinMediaSourceImagesBase64WithDefaults() *PinMediaSourceImagesBase64`

NewPinMediaSourceImagesBase64WithDefaults instantiates a new PinMediaSourceImagesBase64 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSourceType

`func (o *PinMediaSourceImagesBase64) GetSourceType() string`

GetSourceType returns the SourceType field if non-nil, zero value otherwise.

### GetSourceTypeOk

`func (o *PinMediaSourceImagesBase64) GetSourceTypeOk() (*string, bool)`

GetSourceTypeOk returns a tuple with the SourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceType

`func (o *PinMediaSourceImagesBase64) SetSourceType(v string)`

SetSourceType sets SourceType field to given value.

### HasSourceType

`func (o *PinMediaSourceImagesBase64) HasSourceType() bool`

HasSourceType returns a boolean if a field has been set.

### GetItems

`func (o *PinMediaSourceImagesBase64) GetItems() []PinMediaSourceImagesBase64ItemsInner`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *PinMediaSourceImagesBase64) GetItemsOk() (*[]PinMediaSourceImagesBase64ItemsInner, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *PinMediaSourceImagesBase64) SetItems(v []PinMediaSourceImagesBase64ItemsInner)`

SetItems sets Items field to given value.


### GetIndex

`func (o *PinMediaSourceImagesBase64) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *PinMediaSourceImagesBase64) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *PinMediaSourceImagesBase64) SetIndex(v int32)`

SetIndex sets Index field to given value.

### HasIndex

`func (o *PinMediaSourceImagesBase64) HasIndex() bool`

HasIndex returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


