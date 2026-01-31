

# PinMediaSourceVideoID

Video ID-based media source.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**coverImageContentType** | **ContentType** | Content type for cover image Base64. |  [optional] |
|**coverImageData** | **String** | Cover image Base64. |  [optional] |
|**coverImageKeyFrameTime** | **Integer** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. |  [optional] |
|**coverImageUrl** | **String** | Cover image URL. |  [optional] |
|**isStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional] |
|**mediaId** | **String** |  |  |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| VIDEO_ID | &quot;video_id&quot; |



