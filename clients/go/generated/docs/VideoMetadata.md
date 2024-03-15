# VideoMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemType** | Pointer to **string** |  | [optional] 
**CoverImageUrl** | Pointer to **string** |  | [optional] 
**VideoUrl** | Pointer to **NullableString** | Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps. | [optional] 
**Duration** | Pointer to **float32** | Duration (in milliseconds) | [optional] 
**Height** | Pointer to **int32** | Height (in pixels) | [optional] 
**Width** | Pointer to **int32** | Width (in pixels) | [optional] 

## Methods

### NewVideoMetadata

`func NewVideoMetadata() *VideoMetadata`

NewVideoMetadata instantiates a new VideoMetadata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVideoMetadataWithDefaults

`func NewVideoMetadataWithDefaults() *VideoMetadata`

NewVideoMetadataWithDefaults instantiates a new VideoMetadata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemType

`func (o *VideoMetadata) GetItemType() string`

GetItemType returns the ItemType field if non-nil, zero value otherwise.

### GetItemTypeOk

`func (o *VideoMetadata) GetItemTypeOk() (*string, bool)`

GetItemTypeOk returns a tuple with the ItemType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemType

`func (o *VideoMetadata) SetItemType(v string)`

SetItemType sets ItemType field to given value.

### HasItemType

`func (o *VideoMetadata) HasItemType() bool`

HasItemType returns a boolean if a field has been set.

### GetCoverImageUrl

`func (o *VideoMetadata) GetCoverImageUrl() string`

GetCoverImageUrl returns the CoverImageUrl field if non-nil, zero value otherwise.

### GetCoverImageUrlOk

`func (o *VideoMetadata) GetCoverImageUrlOk() (*string, bool)`

GetCoverImageUrlOk returns a tuple with the CoverImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageUrl

`func (o *VideoMetadata) SetCoverImageUrl(v string)`

SetCoverImageUrl sets CoverImageUrl field to given value.

### HasCoverImageUrl

`func (o *VideoMetadata) HasCoverImageUrl() bool`

HasCoverImageUrl returns a boolean if a field has been set.

### GetVideoUrl

`func (o *VideoMetadata) GetVideoUrl() string`

GetVideoUrl returns the VideoUrl field if non-nil, zero value otherwise.

### GetVideoUrlOk

`func (o *VideoMetadata) GetVideoUrlOk() (*string, bool)`

GetVideoUrlOk returns a tuple with the VideoUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideoUrl

`func (o *VideoMetadata) SetVideoUrl(v string)`

SetVideoUrl sets VideoUrl field to given value.

### HasVideoUrl

`func (o *VideoMetadata) HasVideoUrl() bool`

HasVideoUrl returns a boolean if a field has been set.

### SetVideoUrlNil

`func (o *VideoMetadata) SetVideoUrlNil(b bool)`

 SetVideoUrlNil sets the value for VideoUrl to be an explicit nil

### UnsetVideoUrl
`func (o *VideoMetadata) UnsetVideoUrl()`

UnsetVideoUrl ensures that no value is present for VideoUrl, not even an explicit nil
### GetDuration

`func (o *VideoMetadata) GetDuration() float32`

GetDuration returns the Duration field if non-nil, zero value otherwise.

### GetDurationOk

`func (o *VideoMetadata) GetDurationOk() (*float32, bool)`

GetDurationOk returns a tuple with the Duration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuration

`func (o *VideoMetadata) SetDuration(v float32)`

SetDuration sets Duration field to given value.

### HasDuration

`func (o *VideoMetadata) HasDuration() bool`

HasDuration returns a boolean if a field has been set.

### GetHeight

`func (o *VideoMetadata) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *VideoMetadata) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *VideoMetadata) SetHeight(v int32)`

SetHeight sets Height field to given value.

### HasHeight

`func (o *VideoMetadata) HasHeight() bool`

HasHeight returns a boolean if a field has been set.

### GetWidth

`func (o *VideoMetadata) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *VideoMetadata) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *VideoMetadata) SetWidth(v int32)`

SetWidth sets Width field to given value.

### HasWidth

`func (o *VideoMetadata) HasWidth() bool`

HasWidth returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


