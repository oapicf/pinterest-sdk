# MediaUploadDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaId** | Pointer to **string** |  | [optional] [readonly] 
**MediaType** | Pointer to [**MediaUploadType**](MediaUploadType.md) |  | [optional] [readonly] 
**Status** | Pointer to [**MediaUploadStatus**](MediaUploadStatus.md) |  | [optional] [readonly] 

## Methods

### NewMediaUploadDetails

`func NewMediaUploadDetails() *MediaUploadDetails`

NewMediaUploadDetails instantiates a new MediaUploadDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMediaUploadDetailsWithDefaults

`func NewMediaUploadDetailsWithDefaults() *MediaUploadDetails`

NewMediaUploadDetailsWithDefaults instantiates a new MediaUploadDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMediaId

`func (o *MediaUploadDetails) GetMediaId() string`

GetMediaId returns the MediaId field if non-nil, zero value otherwise.

### GetMediaIdOk

`func (o *MediaUploadDetails) GetMediaIdOk() (*string, bool)`

GetMediaIdOk returns a tuple with the MediaId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaId

`func (o *MediaUploadDetails) SetMediaId(v string)`

SetMediaId sets MediaId field to given value.

### HasMediaId

`func (o *MediaUploadDetails) HasMediaId() bool`

HasMediaId returns a boolean if a field has been set.

### GetMediaType

`func (o *MediaUploadDetails) GetMediaType() MediaUploadType`

GetMediaType returns the MediaType field if non-nil, zero value otherwise.

### GetMediaTypeOk

`func (o *MediaUploadDetails) GetMediaTypeOk() (*MediaUploadType, bool)`

GetMediaTypeOk returns a tuple with the MediaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaType

`func (o *MediaUploadDetails) SetMediaType(v MediaUploadType)`

SetMediaType sets MediaType field to given value.

### HasMediaType

`func (o *MediaUploadDetails) HasMediaType() bool`

HasMediaType returns a boolean if a field has been set.

### GetStatus

`func (o *MediaUploadDetails) GetStatus() MediaUploadStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *MediaUploadDetails) GetStatusOk() (*MediaUploadStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *MediaUploadDetails) SetStatus(v MediaUploadStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *MediaUploadDetails) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


