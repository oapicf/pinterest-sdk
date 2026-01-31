# PinterestSdk.PinMediaSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | [**ContentType**](ContentType.md) |  | 
**data** | **String** |  | 
**isStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**sourceType** | **String** |  | 
**url** | **String** |  | 
**coverImageContentType** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] 
**coverImageData** | **String** | Cover image Base64. | [optional] 
**coverImageKeyFrameTime** | **Number** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] 
**coverImageUrl** | **String** | Cover image URL. | [optional] 
**mediaId** | **String** |  | 
**index** | **Number** |  | [optional] 
**items** | [**[PinMediaSourceImagesURLItem]**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**isAffiliateLink** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]



## Enum: SourceTypeEnum


* `pin_url` (value: `"pin_url"`)




