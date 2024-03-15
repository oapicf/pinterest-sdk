# PinMediaWithVideo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Images** | Pointer to [**ImageMetadataImages**](ImageMetadataImages.md) |  | [optional] 
**CoverImageUrl** | Pointer to **string** |  | [optional] 
**VideoUrl** | Pointer to **NullableString** | Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps. | [optional] 
**Duration** | Pointer to **float32** | Duration (in milliseconds) | [optional] 
**Height** | Pointer to **int32** | Height (in pixels) | [optional] 
**Width** | Pointer to **int32** | Width (in pixels) | [optional] 

## Methods

### NewPinMediaWithVideo

`func NewPinMediaWithVideo() *PinMediaWithVideo`

NewPinMediaWithVideo instantiates a new PinMediaWithVideo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinMediaWithVideoWithDefaults

`func NewPinMediaWithVideoWithDefaults() *PinMediaWithVideo`

NewPinMediaWithVideoWithDefaults instantiates a new PinMediaWithVideo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetImages

`func (o *PinMediaWithVideo) GetImages() ImageMetadataImages`

GetImages returns the Images field if non-nil, zero value otherwise.

### GetImagesOk

`func (o *PinMediaWithVideo) GetImagesOk() (*ImageMetadataImages, bool)`

GetImagesOk returns a tuple with the Images field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImages

`func (o *PinMediaWithVideo) SetImages(v ImageMetadataImages)`

SetImages sets Images field to given value.

### HasImages

`func (o *PinMediaWithVideo) HasImages() bool`

HasImages returns a boolean if a field has been set.

### GetCoverImageUrl

`func (o *PinMediaWithVideo) GetCoverImageUrl() string`

GetCoverImageUrl returns the CoverImageUrl field if non-nil, zero value otherwise.

### GetCoverImageUrlOk

`func (o *PinMediaWithVideo) GetCoverImageUrlOk() (*string, bool)`

GetCoverImageUrlOk returns a tuple with the CoverImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageUrl

`func (o *PinMediaWithVideo) SetCoverImageUrl(v string)`

SetCoverImageUrl sets CoverImageUrl field to given value.

### HasCoverImageUrl

`func (o *PinMediaWithVideo) HasCoverImageUrl() bool`

HasCoverImageUrl returns a boolean if a field has been set.

### GetVideoUrl

`func (o *PinMediaWithVideo) GetVideoUrl() string`

GetVideoUrl returns the VideoUrl field if non-nil, zero value otherwise.

### GetVideoUrlOk

`func (o *PinMediaWithVideo) GetVideoUrlOk() (*string, bool)`

GetVideoUrlOk returns a tuple with the VideoUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideoUrl

`func (o *PinMediaWithVideo) SetVideoUrl(v string)`

SetVideoUrl sets VideoUrl field to given value.

### HasVideoUrl

`func (o *PinMediaWithVideo) HasVideoUrl() bool`

HasVideoUrl returns a boolean if a field has been set.

### SetVideoUrlNil

`func (o *PinMediaWithVideo) SetVideoUrlNil(b bool)`

 SetVideoUrlNil sets the value for VideoUrl to be an explicit nil

### UnsetVideoUrl
`func (o *PinMediaWithVideo) UnsetVideoUrl()`

UnsetVideoUrl ensures that no value is present for VideoUrl, not even an explicit nil
### GetDuration

`func (o *PinMediaWithVideo) GetDuration() float32`

GetDuration returns the Duration field if non-nil, zero value otherwise.

### GetDurationOk

`func (o *PinMediaWithVideo) GetDurationOk() (*float32, bool)`

GetDurationOk returns a tuple with the Duration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuration

`func (o *PinMediaWithVideo) SetDuration(v float32)`

SetDuration sets Duration field to given value.

### HasDuration

`func (o *PinMediaWithVideo) HasDuration() bool`

HasDuration returns a boolean if a field has been set.

### GetHeight

`func (o *PinMediaWithVideo) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *PinMediaWithVideo) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *PinMediaWithVideo) SetHeight(v int32)`

SetHeight sets Height field to given value.

### HasHeight

`func (o *PinMediaWithVideo) HasHeight() bool`

HasHeight returns a boolean if a field has been set.

### GetWidth

`func (o *PinMediaWithVideo) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *PinMediaWithVideo) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *PinMediaWithVideo) SetWidth(v int32)`

SetWidth sets Width field to given value.

### HasWidth

`func (o *PinMediaWithVideo) HasWidth() bool`

HasWidth returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


