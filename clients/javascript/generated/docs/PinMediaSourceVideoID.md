# PinterestSdk.PinMediaSourceVideoID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverImageContentType** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] 
**coverImageData** | **String** | Cover image Base64. | [optional] 
**coverImageKeyFrameTime** | **Number** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] 
**coverImageUrl** | **String** | Cover image URL. | [optional] 
**isStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**mediaId** | **String** |  | 
**sourceType** | **String** |  | 



## Enum: SourceTypeEnum


* `video_id` (value: `"video_id"`)




