

# PinMediaSourceVideoID

Video ID-based media source.

The class is defined in **[PinMediaSourceVideoID.java](../../src/main/java/org/openapitools/model/PinMediaSourceVideoID.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverImageContentType** | `ContentType` | Content type for cover image Base64. |  [optional property]
**coverImageData** | `String` | Cover image Base64. |  [optional property]
**coverImageKeyFrameTime** | `Integer` | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. |  [optional property]
**coverImageUrl** | `String` | Cover image URL. |  [optional property]
**isStandard** | `Boolean` | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional property]
**mediaId** | `String` |  | 
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  | 







## SourceTypeEnum

Name | Value
---- | -----
VIDEO_ID | `"video_id"`


