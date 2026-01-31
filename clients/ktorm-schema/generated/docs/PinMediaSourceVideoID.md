
# Table `PinMediaSourceVideoID`
(mapped from: PinMediaSourceVideoID)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mediaId** | media_id | text NOT NULL |  | **kotlin.String** |  | 
**sourceType** | source_type | text NOT NULL |  | [**source_type**](#SourceType) |  | 
**coverImageContentType** | cover_image_content_type | long |  | [**ContentType**](ContentType.md) | Content type for cover image Base64. |  [optional] [foreignkey]
**coverImageData** | cover_image_data | text |  | **kotlin.String** | Cover image Base64. |  [optional]
**coverImageKeyFrameTime** | cover_image_key_frame_time | int UNSIGNED |  | **kotlin.Int** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. |  [optional]
**coverImageUrl** | cover_image_url | text |  | **kotlin.String** | Cover image URL. |  [optional]
**isStandard** | is_standard | boolean |  | **kotlin.Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional]









