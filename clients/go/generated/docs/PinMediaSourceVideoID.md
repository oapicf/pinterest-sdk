# PinMediaSourceVideoID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceType** | **string** |  | 
**CoverImageUrl** | Pointer to **string** | Cover image url. | [optional] 
**CoverImageContentType** | Pointer to **string** | Content type for cover image Base64. | [optional] 
**CoverImageData** | Pointer to **string** | Cover image Base64. | [optional] 
**MediaId** | **string** |  | 
**IsStandard** | Pointer to **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]

## Methods

### NewPinMediaSourceVideoID

`func NewPinMediaSourceVideoID(sourceType string, mediaId string, ) *PinMediaSourceVideoID`

NewPinMediaSourceVideoID instantiates a new PinMediaSourceVideoID object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinMediaSourceVideoIDWithDefaults

`func NewPinMediaSourceVideoIDWithDefaults() *PinMediaSourceVideoID`

NewPinMediaSourceVideoIDWithDefaults instantiates a new PinMediaSourceVideoID object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSourceType

`func (o *PinMediaSourceVideoID) GetSourceType() string`

GetSourceType returns the SourceType field if non-nil, zero value otherwise.

### GetSourceTypeOk

`func (o *PinMediaSourceVideoID) GetSourceTypeOk() (*string, bool)`

GetSourceTypeOk returns a tuple with the SourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceType

`func (o *PinMediaSourceVideoID) SetSourceType(v string)`

SetSourceType sets SourceType field to given value.


### GetCoverImageUrl

`func (o *PinMediaSourceVideoID) GetCoverImageUrl() string`

GetCoverImageUrl returns the CoverImageUrl field if non-nil, zero value otherwise.

### GetCoverImageUrlOk

`func (o *PinMediaSourceVideoID) GetCoverImageUrlOk() (*string, bool)`

GetCoverImageUrlOk returns a tuple with the CoverImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageUrl

`func (o *PinMediaSourceVideoID) SetCoverImageUrl(v string)`

SetCoverImageUrl sets CoverImageUrl field to given value.

### HasCoverImageUrl

`func (o *PinMediaSourceVideoID) HasCoverImageUrl() bool`

HasCoverImageUrl returns a boolean if a field has been set.

### GetCoverImageContentType

`func (o *PinMediaSourceVideoID) GetCoverImageContentType() string`

GetCoverImageContentType returns the CoverImageContentType field if non-nil, zero value otherwise.

### GetCoverImageContentTypeOk

`func (o *PinMediaSourceVideoID) GetCoverImageContentTypeOk() (*string, bool)`

GetCoverImageContentTypeOk returns a tuple with the CoverImageContentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageContentType

`func (o *PinMediaSourceVideoID) SetCoverImageContentType(v string)`

SetCoverImageContentType sets CoverImageContentType field to given value.

### HasCoverImageContentType

`func (o *PinMediaSourceVideoID) HasCoverImageContentType() bool`

HasCoverImageContentType returns a boolean if a field has been set.

### GetCoverImageData

`func (o *PinMediaSourceVideoID) GetCoverImageData() string`

GetCoverImageData returns the CoverImageData field if non-nil, zero value otherwise.

### GetCoverImageDataOk

`func (o *PinMediaSourceVideoID) GetCoverImageDataOk() (*string, bool)`

GetCoverImageDataOk returns a tuple with the CoverImageData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageData

`func (o *PinMediaSourceVideoID) SetCoverImageData(v string)`

SetCoverImageData sets CoverImageData field to given value.

### HasCoverImageData

`func (o *PinMediaSourceVideoID) HasCoverImageData() bool`

HasCoverImageData returns a boolean if a field has been set.

### GetMediaId

`func (o *PinMediaSourceVideoID) GetMediaId() string`

GetMediaId returns the MediaId field if non-nil, zero value otherwise.

### GetMediaIdOk

`func (o *PinMediaSourceVideoID) GetMediaIdOk() (*string, bool)`

GetMediaIdOk returns a tuple with the MediaId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaId

`func (o *PinMediaSourceVideoID) SetMediaId(v string)`

SetMediaId sets MediaId field to given value.


### GetIsStandard

`func (o *PinMediaSourceVideoID) GetIsStandard() bool`

GetIsStandard returns the IsStandard field if non-nil, zero value otherwise.

### GetIsStandardOk

`func (o *PinMediaSourceVideoID) GetIsStandardOk() (*bool, bool)`

GetIsStandardOk returns a tuple with the IsStandard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStandard

`func (o *PinMediaSourceVideoID) SetIsStandard(v bool)`

SetIsStandard sets IsStandard field to given value.

### HasIsStandard

`func (o *PinMediaSourceVideoID) HasIsStandard() bool`

HasIsStandard returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


