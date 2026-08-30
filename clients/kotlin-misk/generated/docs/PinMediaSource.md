
# PinMediaSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | [**ContentType**](ContentType.md) |  | 
**&#x60;data&#x60;** | **kotlin.String** |  | 
**sourceType** | [**inline**](#SourceType) |  | 
**url** | **kotlin.String** |  | 
**mediaId** | **kotlin.String** |  | 
**items** | [**kotlin.collections.List&lt;PinMediaSourceImagesURLItem&gt;**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**isStandard** | **kotlin.Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional]
**coverImageContentType** | [**ContentType**](ContentType.md) | Content type for cover image Base64. |  [optional]
**coverImageData** | **kotlin.String** | Cover image Base64. |  [optional]
**coverImageKeyFrameTime** | **kotlin.Int** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. |  [optional]
**coverImageUrl** | **kotlin.String** | Cover image URL. |  [optional]
**index** | **kotlin.Int** |  |  [optional]
**isAffiliateLink** | **kotlin.Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. |  [optional]


<a id="SourceType"></a>
## Enum: source_type
Name | Value
---- | -----
sourceType | pin_url



