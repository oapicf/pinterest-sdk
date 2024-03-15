# BoardMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ImageCoverUrl** | Pointer to **NullableString** | Board cover image. | [optional] 
**PinThumbnailUrls** | Pointer to **[]string** | Board pin thumbnail urls. | [optional] 

## Methods

### NewBoardMedia

`func NewBoardMedia() *BoardMedia`

NewBoardMedia instantiates a new BoardMedia object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBoardMediaWithDefaults

`func NewBoardMediaWithDefaults() *BoardMedia`

NewBoardMediaWithDefaults instantiates a new BoardMedia object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetImageCoverUrl

`func (o *BoardMedia) GetImageCoverUrl() string`

GetImageCoverUrl returns the ImageCoverUrl field if non-nil, zero value otherwise.

### GetImageCoverUrlOk

`func (o *BoardMedia) GetImageCoverUrlOk() (*string, bool)`

GetImageCoverUrlOk returns a tuple with the ImageCoverUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageCoverUrl

`func (o *BoardMedia) SetImageCoverUrl(v string)`

SetImageCoverUrl sets ImageCoverUrl field to given value.

### HasImageCoverUrl

`func (o *BoardMedia) HasImageCoverUrl() bool`

HasImageCoverUrl returns a boolean if a field has been set.

### SetImageCoverUrlNil

`func (o *BoardMedia) SetImageCoverUrlNil(b bool)`

 SetImageCoverUrlNil sets the value for ImageCoverUrl to be an explicit nil

### UnsetImageCoverUrl
`func (o *BoardMedia) UnsetImageCoverUrl()`

UnsetImageCoverUrl ensures that no value is present for ImageCoverUrl, not even an explicit nil
### GetPinThumbnailUrls

`func (o *BoardMedia) GetPinThumbnailUrls() []string`

GetPinThumbnailUrls returns the PinThumbnailUrls field if non-nil, zero value otherwise.

### GetPinThumbnailUrlsOk

`func (o *BoardMedia) GetPinThumbnailUrlsOk() (*[]string, bool)`

GetPinThumbnailUrlsOk returns a tuple with the PinThumbnailUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinThumbnailUrls

`func (o *BoardMedia) SetPinThumbnailUrls(v []string)`

SetPinThumbnailUrls sets PinThumbnailUrls field to given value.

### HasPinThumbnailUrls

`func (o *BoardMedia) HasPinThumbnailUrls() bool`

HasPinThumbnailUrls returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


