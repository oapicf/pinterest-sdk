# PinMediaMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemType** | Pointer to **string** |  | [optional] 
**Title** | Pointer to **NullableString** |  | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**Link** | Pointer to **NullableString** |  | [optional] 
**Images** | Pointer to [**ImageMetadataImages**](ImageMetadataImages.md) |  | [optional] 
**CoverImageUrl** | Pointer to **string** |  | [optional] 
**VideoUrl** | Pointer to **NullableString** | Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps. | [optional] 
**Duration** | Pointer to **float32** | Duration (in milliseconds) | [optional] 
**Height** | Pointer to **int32** | Height (in pixels) | [optional] 
**Width** | Pointer to **int32** | Width (in pixels) | [optional] 

## Methods

### NewPinMediaMetadata

`func NewPinMediaMetadata() *PinMediaMetadata`

NewPinMediaMetadata instantiates a new PinMediaMetadata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinMediaMetadataWithDefaults

`func NewPinMediaMetadataWithDefaults() *PinMediaMetadata`

NewPinMediaMetadataWithDefaults instantiates a new PinMediaMetadata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemType

`func (o *PinMediaMetadata) GetItemType() string`

GetItemType returns the ItemType field if non-nil, zero value otherwise.

### GetItemTypeOk

`func (o *PinMediaMetadata) GetItemTypeOk() (*string, bool)`

GetItemTypeOk returns a tuple with the ItemType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemType

`func (o *PinMediaMetadata) SetItemType(v string)`

SetItemType sets ItemType field to given value.

### HasItemType

`func (o *PinMediaMetadata) HasItemType() bool`

HasItemType returns a boolean if a field has been set.

### GetTitle

`func (o *PinMediaMetadata) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *PinMediaMetadata) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *PinMediaMetadata) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *PinMediaMetadata) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### SetTitleNil

`func (o *PinMediaMetadata) SetTitleNil(b bool)`

 SetTitleNil sets the value for Title to be an explicit nil

### UnsetTitle
`func (o *PinMediaMetadata) UnsetTitle()`

UnsetTitle ensures that no value is present for Title, not even an explicit nil
### GetDescription

`func (o *PinMediaMetadata) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *PinMediaMetadata) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *PinMediaMetadata) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *PinMediaMetadata) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *PinMediaMetadata) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *PinMediaMetadata) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetLink

`func (o *PinMediaMetadata) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *PinMediaMetadata) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *PinMediaMetadata) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *PinMediaMetadata) HasLink() bool`

HasLink returns a boolean if a field has been set.

### SetLinkNil

`func (o *PinMediaMetadata) SetLinkNil(b bool)`

 SetLinkNil sets the value for Link to be an explicit nil

### UnsetLink
`func (o *PinMediaMetadata) UnsetLink()`

UnsetLink ensures that no value is present for Link, not even an explicit nil
### GetImages

`func (o *PinMediaMetadata) GetImages() ImageMetadataImages`

GetImages returns the Images field if non-nil, zero value otherwise.

### GetImagesOk

`func (o *PinMediaMetadata) GetImagesOk() (*ImageMetadataImages, bool)`

GetImagesOk returns a tuple with the Images field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImages

`func (o *PinMediaMetadata) SetImages(v ImageMetadataImages)`

SetImages sets Images field to given value.

### HasImages

`func (o *PinMediaMetadata) HasImages() bool`

HasImages returns a boolean if a field has been set.

### GetCoverImageUrl

`func (o *PinMediaMetadata) GetCoverImageUrl() string`

GetCoverImageUrl returns the CoverImageUrl field if non-nil, zero value otherwise.

### GetCoverImageUrlOk

`func (o *PinMediaMetadata) GetCoverImageUrlOk() (*string, bool)`

GetCoverImageUrlOk returns a tuple with the CoverImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageUrl

`func (o *PinMediaMetadata) SetCoverImageUrl(v string)`

SetCoverImageUrl sets CoverImageUrl field to given value.

### HasCoverImageUrl

`func (o *PinMediaMetadata) HasCoverImageUrl() bool`

HasCoverImageUrl returns a boolean if a field has been set.

### GetVideoUrl

`func (o *PinMediaMetadata) GetVideoUrl() string`

GetVideoUrl returns the VideoUrl field if non-nil, zero value otherwise.

### GetVideoUrlOk

`func (o *PinMediaMetadata) GetVideoUrlOk() (*string, bool)`

GetVideoUrlOk returns a tuple with the VideoUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideoUrl

`func (o *PinMediaMetadata) SetVideoUrl(v string)`

SetVideoUrl sets VideoUrl field to given value.

### HasVideoUrl

`func (o *PinMediaMetadata) HasVideoUrl() bool`

HasVideoUrl returns a boolean if a field has been set.

### SetVideoUrlNil

`func (o *PinMediaMetadata) SetVideoUrlNil(b bool)`

 SetVideoUrlNil sets the value for VideoUrl to be an explicit nil

### UnsetVideoUrl
`func (o *PinMediaMetadata) UnsetVideoUrl()`

UnsetVideoUrl ensures that no value is present for VideoUrl, not even an explicit nil
### GetDuration

`func (o *PinMediaMetadata) GetDuration() float32`

GetDuration returns the Duration field if non-nil, zero value otherwise.

### GetDurationOk

`func (o *PinMediaMetadata) GetDurationOk() (*float32, bool)`

GetDurationOk returns a tuple with the Duration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuration

`func (o *PinMediaMetadata) SetDuration(v float32)`

SetDuration sets Duration field to given value.

### HasDuration

`func (o *PinMediaMetadata) HasDuration() bool`

HasDuration returns a boolean if a field has been set.

### GetHeight

`func (o *PinMediaMetadata) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *PinMediaMetadata) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *PinMediaMetadata) SetHeight(v int32)`

SetHeight sets Height field to given value.

### HasHeight

`func (o *PinMediaMetadata) HasHeight() bool`

HasHeight returns a boolean if a field has been set.

### GetWidth

`func (o *PinMediaMetadata) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *PinMediaMetadata) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *PinMediaMetadata) SetWidth(v int32)`

SetWidth sets Width field to given value.

### HasWidth

`func (o *PinMediaMetadata) HasWidth() bool`

HasWidth returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


