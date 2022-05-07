# MediaUpload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaId** | Pointer to **string** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [optional] 
**MediaType** | Pointer to [**MediaUploadType**](MediaUploadType.md) |  | [optional] 
**UploadUrl** | Pointer to **string** | The URL where you will POST your media file. | [optional] 
**UploadParameters** | Pointer to [**MediaUploadAllOfUploadParameters**](MediaUploadAllOfUploadParameters.md) |  | [optional] 

## Methods

### NewMediaUpload

`func NewMediaUpload() *MediaUpload`

NewMediaUpload instantiates a new MediaUpload object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMediaUploadWithDefaults

`func NewMediaUploadWithDefaults() *MediaUpload`

NewMediaUploadWithDefaults instantiates a new MediaUpload object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMediaId

`func (o *MediaUpload) GetMediaId() string`

GetMediaId returns the MediaId field if non-nil, zero value otherwise.

### GetMediaIdOk

`func (o *MediaUpload) GetMediaIdOk() (*string, bool)`

GetMediaIdOk returns a tuple with the MediaId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaId

`func (o *MediaUpload) SetMediaId(v string)`

SetMediaId sets MediaId field to given value.

### HasMediaId

`func (o *MediaUpload) HasMediaId() bool`

HasMediaId returns a boolean if a field has been set.

### GetMediaType

`func (o *MediaUpload) GetMediaType() MediaUploadType`

GetMediaType returns the MediaType field if non-nil, zero value otherwise.

### GetMediaTypeOk

`func (o *MediaUpload) GetMediaTypeOk() (*MediaUploadType, bool)`

GetMediaTypeOk returns a tuple with the MediaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaType

`func (o *MediaUpload) SetMediaType(v MediaUploadType)`

SetMediaType sets MediaType field to given value.

### HasMediaType

`func (o *MediaUpload) HasMediaType() bool`

HasMediaType returns a boolean if a field has been set.

### GetUploadUrl

`func (o *MediaUpload) GetUploadUrl() string`

GetUploadUrl returns the UploadUrl field if non-nil, zero value otherwise.

### GetUploadUrlOk

`func (o *MediaUpload) GetUploadUrlOk() (*string, bool)`

GetUploadUrlOk returns a tuple with the UploadUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUploadUrl

`func (o *MediaUpload) SetUploadUrl(v string)`

SetUploadUrl sets UploadUrl field to given value.

### HasUploadUrl

`func (o *MediaUpload) HasUploadUrl() bool`

HasUploadUrl returns a boolean if a field has been set.

### GetUploadParameters

`func (o *MediaUpload) GetUploadParameters() MediaUploadAllOfUploadParameters`

GetUploadParameters returns the UploadParameters field if non-nil, zero value otherwise.

### GetUploadParametersOk

`func (o *MediaUpload) GetUploadParametersOk() (*MediaUploadAllOfUploadParameters, bool)`

GetUploadParametersOk returns a tuple with the UploadParameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUploadParameters

`func (o *MediaUpload) SetUploadParameters(v MediaUploadAllOfUploadParameters)`

SetUploadParameters sets UploadParameters field to given value.

### HasUploadParameters

`func (o *MediaUpload) HasUploadParameters() bool`

HasUploadParameters returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


