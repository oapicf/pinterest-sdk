# ImageDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Width** | **int32** |  | 
**Height** | **NullableInt32** |  | 
**Url** | **string** |  | 

## Methods

### NewImageDetails

`func NewImageDetails(width int32, height NullableInt32, url string, ) *ImageDetails`

NewImageDetails instantiates a new ImageDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewImageDetailsWithDefaults

`func NewImageDetailsWithDefaults() *ImageDetails`

NewImageDetailsWithDefaults instantiates a new ImageDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWidth

`func (o *ImageDetails) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *ImageDetails) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *ImageDetails) SetWidth(v int32)`

SetWidth sets Width field to given value.


### GetHeight

`func (o *ImageDetails) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *ImageDetails) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *ImageDetails) SetHeight(v int32)`

SetHeight sets Height field to given value.


### SetHeightNil

`func (o *ImageDetails) SetHeightNil(b bool)`

 SetHeightNil sets the value for Height to be an explicit nil

### UnsetHeight
`func (o *ImageDetails) UnsetHeight()`

UnsetHeight ensures that no value is present for Height, not even an explicit nil
### GetUrl

`func (o *ImageDetails) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *ImageDetails) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *ImageDetails) SetUrl(v string)`

SetUrl sets Url field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


