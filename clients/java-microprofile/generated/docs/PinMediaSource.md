

# PinMediaSource

Pin media source that can be an image, video, or a mix of both passed in as a request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contentType** | **ContentType** |  |  |
|**data** | **String** |  |  |
|**isStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional] |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  |
|**url** | **String** |  |  |
|**coverImageContentType** | **ContentType** | Content type for cover image Base64. |  [optional] |
|**coverImageData** | **String** | Cover image Base64. |  [optional] |
|**coverImageKeyFrameTime** | **Integer** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. |  [optional] |
|**coverImageUrl** | **String** | Cover image URL. |  [optional] |
|**mediaId** | **String** |  |  |
|**index** | **Integer** |  |  [optional] |
|**items** | [**List&lt;PinMediaSourceImagesURLItem&gt;**](PinMediaSourceImagesURLItem.md) | Array with image objects. |  |
|**isAffiliateLink** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. |  [optional] |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| PIN_URL | &quot;pin_url&quot; |



