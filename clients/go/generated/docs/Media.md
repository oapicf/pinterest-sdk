# Media

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaId** | **string** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] 
**MediaType** | [**MediaUploadType**](MediaUploadType.md) |  | 
**Status** | Pointer to [**MediaUploadStatus**](MediaUploadStatus.md) |  | [optional] [readonly] 

## Methods

### NewMedia

`func NewMedia(mediaId string, mediaType MediaUploadType, ) *Media`

NewMedia instantiates a new Media object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMediaWithDefaults

`func NewMediaWithDefaults() *Media`

NewMediaWithDefaults instantiates a new Media object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMediaId

`func (o *Media) GetMediaId() string`

GetMediaId returns the MediaId field if non-nil, zero value otherwise.

### GetMediaIdOk

`func (o *Media) GetMediaIdOk() (*string, bool)`

GetMediaIdOk returns a tuple with the MediaId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaId

`func (o *Media) SetMediaId(v string)`

SetMediaId sets MediaId field to given value.


### GetMediaType

`func (o *Media) GetMediaType() MediaUploadType`

GetMediaType returns the MediaType field if non-nil, zero value otherwise.

### GetMediaTypeOk

`func (o *Media) GetMediaTypeOk() (*MediaUploadType, bool)`

GetMediaTypeOk returns a tuple with the MediaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaType

`func (o *Media) SetMediaType(v MediaUploadType)`

SetMediaType sets MediaType field to given value.


### GetStatus

`func (o *Media) GetStatus() MediaUploadStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Media) GetStatusOk() (*MediaUploadStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Media) SetStatus(v MediaUploadStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Media) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


