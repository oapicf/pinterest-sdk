# PinMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Images** | Pointer to [**ImageSize**](ImageSize.md) |  | [optional] 
**MediaType** | **string** |  | 
**CoverImageUrl** | Pointer to **string** |  | [optional] 
**Duration** | Pointer to **NullableFloat32** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**Height** | Pointer to **NullableInt32** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**VideoUrl** | Pointer to **NullableString** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**Width** | Pointer to **NullableInt32** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**Items** | Pointer to [**[]PinMediaMetadata**](PinMediaMetadata.md) |  | [optional] 

## Methods

### NewPinMedia

`func NewPinMedia(mediaType string, ) *PinMedia`

NewPinMedia instantiates a new PinMedia object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinMediaWithDefaults

`func NewPinMediaWithDefaults() *PinMedia`

NewPinMediaWithDefaults instantiates a new PinMedia object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetImages

`func (o *PinMedia) GetImages() ImageSize`

GetImages returns the Images field if non-nil, zero value otherwise.

### GetImagesOk

`func (o *PinMedia) GetImagesOk() (*ImageSize, bool)`

GetImagesOk returns a tuple with the Images field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImages

`func (o *PinMedia) SetImages(v ImageSize)`

SetImages sets Images field to given value.

### HasImages

`func (o *PinMedia) HasImages() bool`

HasImages returns a boolean if a field has been set.

### GetMediaType

`func (o *PinMedia) GetMediaType() string`

GetMediaType returns the MediaType field if non-nil, zero value otherwise.

### GetMediaTypeOk

`func (o *PinMedia) GetMediaTypeOk() (*string, bool)`

GetMediaTypeOk returns a tuple with the MediaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaType

`func (o *PinMedia) SetMediaType(v string)`

SetMediaType sets MediaType field to given value.


### GetCoverImageUrl

`func (o *PinMedia) GetCoverImageUrl() string`

GetCoverImageUrl returns the CoverImageUrl field if non-nil, zero value otherwise.

### GetCoverImageUrlOk

`func (o *PinMedia) GetCoverImageUrlOk() (*string, bool)`

GetCoverImageUrlOk returns a tuple with the CoverImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageUrl

`func (o *PinMedia) SetCoverImageUrl(v string)`

SetCoverImageUrl sets CoverImageUrl field to given value.

### HasCoverImageUrl

`func (o *PinMedia) HasCoverImageUrl() bool`

HasCoverImageUrl returns a boolean if a field has been set.

### GetDuration

`func (o *PinMedia) GetDuration() float32`

GetDuration returns the Duration field if non-nil, zero value otherwise.

### GetDurationOk

`func (o *PinMedia) GetDurationOk() (*float32, bool)`

GetDurationOk returns a tuple with the Duration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuration

`func (o *PinMedia) SetDuration(v float32)`

SetDuration sets Duration field to given value.

### HasDuration

`func (o *PinMedia) HasDuration() bool`

HasDuration returns a boolean if a field has been set.

### SetDurationNil

`func (o *PinMedia) SetDurationNil(b bool)`

 SetDurationNil sets the value for Duration to be an explicit nil

### UnsetDuration
`func (o *PinMedia) UnsetDuration()`

UnsetDuration ensures that no value is present for Duration, not even an explicit nil
### GetHeight

`func (o *PinMedia) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *PinMedia) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *PinMedia) SetHeight(v int32)`

SetHeight sets Height field to given value.

### HasHeight

`func (o *PinMedia) HasHeight() bool`

HasHeight returns a boolean if a field has been set.

### SetHeightNil

`func (o *PinMedia) SetHeightNil(b bool)`

 SetHeightNil sets the value for Height to be an explicit nil

### UnsetHeight
`func (o *PinMedia) UnsetHeight()`

UnsetHeight ensures that no value is present for Height, not even an explicit nil
### GetVideoUrl

`func (o *PinMedia) GetVideoUrl() string`

GetVideoUrl returns the VideoUrl field if non-nil, zero value otherwise.

### GetVideoUrlOk

`func (o *PinMedia) GetVideoUrlOk() (*string, bool)`

GetVideoUrlOk returns a tuple with the VideoUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideoUrl

`func (o *PinMedia) SetVideoUrl(v string)`

SetVideoUrl sets VideoUrl field to given value.

### HasVideoUrl

`func (o *PinMedia) HasVideoUrl() bool`

HasVideoUrl returns a boolean if a field has been set.

### SetVideoUrlNil

`func (o *PinMedia) SetVideoUrlNil(b bool)`

 SetVideoUrlNil sets the value for VideoUrl to be an explicit nil

### UnsetVideoUrl
`func (o *PinMedia) UnsetVideoUrl()`

UnsetVideoUrl ensures that no value is present for VideoUrl, not even an explicit nil
### GetWidth

`func (o *PinMedia) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *PinMedia) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *PinMedia) SetWidth(v int32)`

SetWidth sets Width field to given value.

### HasWidth

`func (o *PinMedia) HasWidth() bool`

HasWidth returns a boolean if a field has been set.

### SetWidthNil

`func (o *PinMedia) SetWidthNil(b bool)`

 SetWidthNil sets the value for Width to be an explicit nil

### UnsetWidth
`func (o *PinMedia) UnsetWidth()`

UnsetWidth ensures that no value is present for Width, not even an explicit nil
### GetItems

`func (o *PinMedia) GetItems() []PinMediaMetadata`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *PinMedia) GetItemsOk() (*[]PinMediaMetadata, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *PinMedia) SetItems(v []PinMediaMetadata)`

SetItems sets Items field to given value.

### HasItems

`func (o *PinMedia) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


