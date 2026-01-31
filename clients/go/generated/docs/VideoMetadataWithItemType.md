# VideoMetadataWithItemType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CoverImageUrl** | Pointer to **string** |  | [optional] 
**Duration** | Pointer to **NullableFloat32** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**Height** | Pointer to **NullableInt32** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**ItemType** | Pointer to **string** |  | [optional] 
**VideoUrl** | Pointer to **NullableString** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**Width** | Pointer to **NullableInt32** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 

## Methods

### NewVideoMetadataWithItemType

`func NewVideoMetadataWithItemType() *VideoMetadataWithItemType`

NewVideoMetadataWithItemType instantiates a new VideoMetadataWithItemType object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVideoMetadataWithItemTypeWithDefaults

`func NewVideoMetadataWithItemTypeWithDefaults() *VideoMetadataWithItemType`

NewVideoMetadataWithItemTypeWithDefaults instantiates a new VideoMetadataWithItemType object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCoverImageUrl

`func (o *VideoMetadataWithItemType) GetCoverImageUrl() string`

GetCoverImageUrl returns the CoverImageUrl field if non-nil, zero value otherwise.

### GetCoverImageUrlOk

`func (o *VideoMetadataWithItemType) GetCoverImageUrlOk() (*string, bool)`

GetCoverImageUrlOk returns a tuple with the CoverImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageUrl

`func (o *VideoMetadataWithItemType) SetCoverImageUrl(v string)`

SetCoverImageUrl sets CoverImageUrl field to given value.

### HasCoverImageUrl

`func (o *VideoMetadataWithItemType) HasCoverImageUrl() bool`

HasCoverImageUrl returns a boolean if a field has been set.

### GetDuration

`func (o *VideoMetadataWithItemType) GetDuration() float32`

GetDuration returns the Duration field if non-nil, zero value otherwise.

### GetDurationOk

`func (o *VideoMetadataWithItemType) GetDurationOk() (*float32, bool)`

GetDurationOk returns a tuple with the Duration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuration

`func (o *VideoMetadataWithItemType) SetDuration(v float32)`

SetDuration sets Duration field to given value.

### HasDuration

`func (o *VideoMetadataWithItemType) HasDuration() bool`

HasDuration returns a boolean if a field has been set.

### SetDurationNil

`func (o *VideoMetadataWithItemType) SetDurationNil(b bool)`

 SetDurationNil sets the value for Duration to be an explicit nil

### UnsetDuration
`func (o *VideoMetadataWithItemType) UnsetDuration()`

UnsetDuration ensures that no value is present for Duration, not even an explicit nil
### GetHeight

`func (o *VideoMetadataWithItemType) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *VideoMetadataWithItemType) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *VideoMetadataWithItemType) SetHeight(v int32)`

SetHeight sets Height field to given value.

### HasHeight

`func (o *VideoMetadataWithItemType) HasHeight() bool`

HasHeight returns a boolean if a field has been set.

### SetHeightNil

`func (o *VideoMetadataWithItemType) SetHeightNil(b bool)`

 SetHeightNil sets the value for Height to be an explicit nil

### UnsetHeight
`func (o *VideoMetadataWithItemType) UnsetHeight()`

UnsetHeight ensures that no value is present for Height, not even an explicit nil
### GetItemType

`func (o *VideoMetadataWithItemType) GetItemType() string`

GetItemType returns the ItemType field if non-nil, zero value otherwise.

### GetItemTypeOk

`func (o *VideoMetadataWithItemType) GetItemTypeOk() (*string, bool)`

GetItemTypeOk returns a tuple with the ItemType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemType

`func (o *VideoMetadataWithItemType) SetItemType(v string)`

SetItemType sets ItemType field to given value.

### HasItemType

`func (o *VideoMetadataWithItemType) HasItemType() bool`

HasItemType returns a boolean if a field has been set.

### GetVideoUrl

`func (o *VideoMetadataWithItemType) GetVideoUrl() string`

GetVideoUrl returns the VideoUrl field if non-nil, zero value otherwise.

### GetVideoUrlOk

`func (o *VideoMetadataWithItemType) GetVideoUrlOk() (*string, bool)`

GetVideoUrlOk returns a tuple with the VideoUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideoUrl

`func (o *VideoMetadataWithItemType) SetVideoUrl(v string)`

SetVideoUrl sets VideoUrl field to given value.

### HasVideoUrl

`func (o *VideoMetadataWithItemType) HasVideoUrl() bool`

HasVideoUrl returns a boolean if a field has been set.

### SetVideoUrlNil

`func (o *VideoMetadataWithItemType) SetVideoUrlNil(b bool)`

 SetVideoUrlNil sets the value for VideoUrl to be an explicit nil

### UnsetVideoUrl
`func (o *VideoMetadataWithItemType) UnsetVideoUrl()`

UnsetVideoUrl ensures that no value is present for VideoUrl, not even an explicit nil
### GetWidth

`func (o *VideoMetadataWithItemType) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *VideoMetadataWithItemType) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *VideoMetadataWithItemType) SetWidth(v int32)`

SetWidth sets Width field to given value.

### HasWidth

`func (o *VideoMetadataWithItemType) HasWidth() bool`

HasWidth returns a boolean if a field has been set.

### SetWidthNil

`func (o *VideoMetadataWithItemType) SetWidthNil(b bool)`

 SetWidthNil sets the value for Width to be an explicit nil

### UnsetWidth
`func (o *VideoMetadataWithItemType) UnsetWidth()`

UnsetWidth ensures that no value is present for Width, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


