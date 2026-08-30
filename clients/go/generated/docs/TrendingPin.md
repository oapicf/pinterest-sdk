# TrendingPin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Color** | **string** | Dominant color of the pin image in hex format | 
**Height** | **int32** | Height of the pin image in pixels | 
**Id** | **string** | Unique identifier for the pin | 
**Src** | **string** | URL of the pin image | 
**VerticalOffset** | Pointer to **float64** | The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom. | [optional] 
**Width** | **int32** | Width of the pin image in pixels | 

## Methods

### NewTrendingPin

`func NewTrendingPin(color string, height int32, id string, src string, width int32, ) *TrendingPin`

NewTrendingPin instantiates a new TrendingPin object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTrendingPinWithDefaults

`func NewTrendingPinWithDefaults() *TrendingPin`

NewTrendingPinWithDefaults instantiates a new TrendingPin object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetColor

`func (o *TrendingPin) GetColor() string`

GetColor returns the Color field if non-nil, zero value otherwise.

### GetColorOk

`func (o *TrendingPin) GetColorOk() (*string, bool)`

GetColorOk returns a tuple with the Color field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColor

`func (o *TrendingPin) SetColor(v string)`

SetColor sets Color field to given value.


### GetHeight

`func (o *TrendingPin) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *TrendingPin) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *TrendingPin) SetHeight(v int32)`

SetHeight sets Height field to given value.


### GetId

`func (o *TrendingPin) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TrendingPin) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TrendingPin) SetId(v string)`

SetId sets Id field to given value.


### GetSrc

`func (o *TrendingPin) GetSrc() string`

GetSrc returns the Src field if non-nil, zero value otherwise.

### GetSrcOk

`func (o *TrendingPin) GetSrcOk() (*string, bool)`

GetSrcOk returns a tuple with the Src field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSrc

`func (o *TrendingPin) SetSrc(v string)`

SetSrc sets Src field to given value.


### GetVerticalOffset

`func (o *TrendingPin) GetVerticalOffset() float64`

GetVerticalOffset returns the VerticalOffset field if non-nil, zero value otherwise.

### GetVerticalOffsetOk

`func (o *TrendingPin) GetVerticalOffsetOk() (*float64, bool)`

GetVerticalOffsetOk returns a tuple with the VerticalOffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVerticalOffset

`func (o *TrendingPin) SetVerticalOffset(v float64)`

SetVerticalOffset sets VerticalOffset field to given value.

### HasVerticalOffset

`func (o *TrendingPin) HasVerticalOffset() bool`

HasVerticalOffset returns a boolean if a field has been set.

### GetWidth

`func (o *TrendingPin) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *TrendingPin) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *TrendingPin) SetWidth(v int32)`

SetWidth sets Width field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


