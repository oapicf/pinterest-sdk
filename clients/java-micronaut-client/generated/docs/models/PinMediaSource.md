

# PinMediaSource

Pin media source that can be an image, video, or a mix of both passed in as a request.

The class is defined in **[PinMediaSource.java](../../src/main/java/org/openapitools/model/PinMediaSource.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | `ContentType` |  | 
**data** | `String` |  | 
**isStandard** | `Boolean` | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional property]
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  | 
**url** | `String` |  | 
**coverImageContentType** | `ContentType` | Content type for cover image Base64. |  [optional property]
**coverImageData** | `String` | Cover image Base64. |  [optional property]
**coverImageKeyFrameTime** | `Integer` | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. |  [optional property]
**coverImageUrl** | `String` | Cover image URL. |  [optional property]
**mediaId** | `String` |  | 
**index** | `Integer` |  |  [optional property]
**items** | [`List&lt;PinMediaSourceImagesURLItem&gt;`](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**isAffiliateLink** | `Boolean` | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. |  [optional property]




## SourceTypeEnum

Name | Value
---- | -----
PIN_URL | `"pin_url"`











