# PinMediaSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContentType** | [**ContentType**](ContentType.md) |  | 
**Data** | **string** |  | 
**IsStandard** | Pointer to **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**SourceType** | **string** |  | 
**Url** | **string** |  | 
**CoverImageContentType** | Pointer to [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] 
**CoverImageData** | Pointer to **string** | Cover image Base64. | [optional] 
**CoverImageKeyFrameTime** | Pointer to **int32** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] 
**CoverImageUrl** | Pointer to **string** | Cover image URL. | [optional] 
**MediaId** | **string** |  | 
**Index** | Pointer to **int32** |  | [optional] 
**Items** | [**[]PinMediaSourceImagesURLItem**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**IsAffiliateLink** | Pointer to **bool** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]

## Methods

### NewPinMediaSource

`func NewPinMediaSource(contentType ContentType, data string, sourceType string, url string, mediaId string, items []PinMediaSourceImagesURLItem, ) *PinMediaSource`

NewPinMediaSource instantiates a new PinMediaSource object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinMediaSourceWithDefaults

`func NewPinMediaSourceWithDefaults() *PinMediaSource`

NewPinMediaSourceWithDefaults instantiates a new PinMediaSource object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContentType

`func (o *PinMediaSource) GetContentType() ContentType`

GetContentType returns the ContentType field if non-nil, zero value otherwise.

### GetContentTypeOk

`func (o *PinMediaSource) GetContentTypeOk() (*ContentType, bool)`

GetContentTypeOk returns a tuple with the ContentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentType

`func (o *PinMediaSource) SetContentType(v ContentType)`

SetContentType sets ContentType field to given value.


### GetData

`func (o *PinMediaSource) GetData() string`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *PinMediaSource) GetDataOk() (*string, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *PinMediaSource) SetData(v string)`

SetData sets Data field to given value.


### GetIsStandard

`func (o *PinMediaSource) GetIsStandard() bool`

GetIsStandard returns the IsStandard field if non-nil, zero value otherwise.

### GetIsStandardOk

`func (o *PinMediaSource) GetIsStandardOk() (*bool, bool)`

GetIsStandardOk returns a tuple with the IsStandard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStandard

`func (o *PinMediaSource) SetIsStandard(v bool)`

SetIsStandard sets IsStandard field to given value.

### HasIsStandard

`func (o *PinMediaSource) HasIsStandard() bool`

HasIsStandard returns a boolean if a field has been set.

### GetSourceType

`func (o *PinMediaSource) GetSourceType() string`

GetSourceType returns the SourceType field if non-nil, zero value otherwise.

### GetSourceTypeOk

`func (o *PinMediaSource) GetSourceTypeOk() (*string, bool)`

GetSourceTypeOk returns a tuple with the SourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceType

`func (o *PinMediaSource) SetSourceType(v string)`

SetSourceType sets SourceType field to given value.


### GetUrl

`func (o *PinMediaSource) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *PinMediaSource) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *PinMediaSource) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetCoverImageContentType

`func (o *PinMediaSource) GetCoverImageContentType() ContentType`

GetCoverImageContentType returns the CoverImageContentType field if non-nil, zero value otherwise.

### GetCoverImageContentTypeOk

`func (o *PinMediaSource) GetCoverImageContentTypeOk() (*ContentType, bool)`

GetCoverImageContentTypeOk returns a tuple with the CoverImageContentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageContentType

`func (o *PinMediaSource) SetCoverImageContentType(v ContentType)`

SetCoverImageContentType sets CoverImageContentType field to given value.

### HasCoverImageContentType

`func (o *PinMediaSource) HasCoverImageContentType() bool`

HasCoverImageContentType returns a boolean if a field has been set.

### GetCoverImageData

`func (o *PinMediaSource) GetCoverImageData() string`

GetCoverImageData returns the CoverImageData field if non-nil, zero value otherwise.

### GetCoverImageDataOk

`func (o *PinMediaSource) GetCoverImageDataOk() (*string, bool)`

GetCoverImageDataOk returns a tuple with the CoverImageData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageData

`func (o *PinMediaSource) SetCoverImageData(v string)`

SetCoverImageData sets CoverImageData field to given value.

### HasCoverImageData

`func (o *PinMediaSource) HasCoverImageData() bool`

HasCoverImageData returns a boolean if a field has been set.

### GetCoverImageKeyFrameTime

`func (o *PinMediaSource) GetCoverImageKeyFrameTime() int32`

GetCoverImageKeyFrameTime returns the CoverImageKeyFrameTime field if non-nil, zero value otherwise.

### GetCoverImageKeyFrameTimeOk

`func (o *PinMediaSource) GetCoverImageKeyFrameTimeOk() (*int32, bool)`

GetCoverImageKeyFrameTimeOk returns a tuple with the CoverImageKeyFrameTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageKeyFrameTime

`func (o *PinMediaSource) SetCoverImageKeyFrameTime(v int32)`

SetCoverImageKeyFrameTime sets CoverImageKeyFrameTime field to given value.

### HasCoverImageKeyFrameTime

`func (o *PinMediaSource) HasCoverImageKeyFrameTime() bool`

HasCoverImageKeyFrameTime returns a boolean if a field has been set.

### GetCoverImageUrl

`func (o *PinMediaSource) GetCoverImageUrl() string`

GetCoverImageUrl returns the CoverImageUrl field if non-nil, zero value otherwise.

### GetCoverImageUrlOk

`func (o *PinMediaSource) GetCoverImageUrlOk() (*string, bool)`

GetCoverImageUrlOk returns a tuple with the CoverImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverImageUrl

`func (o *PinMediaSource) SetCoverImageUrl(v string)`

SetCoverImageUrl sets CoverImageUrl field to given value.

### HasCoverImageUrl

`func (o *PinMediaSource) HasCoverImageUrl() bool`

HasCoverImageUrl returns a boolean if a field has been set.

### GetMediaId

`func (o *PinMediaSource) GetMediaId() string`

GetMediaId returns the MediaId field if non-nil, zero value otherwise.

### GetMediaIdOk

`func (o *PinMediaSource) GetMediaIdOk() (*string, bool)`

GetMediaIdOk returns a tuple with the MediaId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaId

`func (o *PinMediaSource) SetMediaId(v string)`

SetMediaId sets MediaId field to given value.


### GetIndex

`func (o *PinMediaSource) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *PinMediaSource) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *PinMediaSource) SetIndex(v int32)`

SetIndex sets Index field to given value.

### HasIndex

`func (o *PinMediaSource) HasIndex() bool`

HasIndex returns a boolean if a field has been set.

### GetItems

`func (o *PinMediaSource) GetItems() []PinMediaSourceImagesURLItem`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *PinMediaSource) GetItemsOk() (*[]PinMediaSourceImagesURLItem, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *PinMediaSource) SetItems(v []PinMediaSourceImagesURLItem)`

SetItems sets Items field to given value.


### GetIsAffiliateLink

`func (o *PinMediaSource) GetIsAffiliateLink() bool`

GetIsAffiliateLink returns the IsAffiliateLink field if non-nil, zero value otherwise.

### GetIsAffiliateLinkOk

`func (o *PinMediaSource) GetIsAffiliateLinkOk() (*bool, bool)`

GetIsAffiliateLinkOk returns a tuple with the IsAffiliateLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAffiliateLink

`func (o *PinMediaSource) SetIsAffiliateLink(v bool)`

SetIsAffiliateLink sets IsAffiliateLink field to given value.

### HasIsAffiliateLink

`func (o *PinMediaSource) HasIsAffiliateLink() bool`

HasIsAffiliateLink returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


