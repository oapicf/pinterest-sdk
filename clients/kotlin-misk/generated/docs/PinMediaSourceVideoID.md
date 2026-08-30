
# PinMediaSourceVideoID

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mediaId** | **kotlin.String** |  | 
**sourceType** | [**inline**](#SourceType) |  | 
**coverImageContentType** | [**ContentType**](ContentType.md) | Content type for cover image Base64. |  [optional]
**coverImageData** | **kotlin.String** | Cover image Base64. |  [optional]
**coverImageKeyFrameTime** | **kotlin.Int** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. |  [optional]
**coverImageUrl** | **kotlin.String** | Cover image URL. |  [optional]
**isStandard** | **kotlin.Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional]


<a id="SourceType"></a>
## Enum: source_type
Name | Value
---- | -----
sourceType | video_id



