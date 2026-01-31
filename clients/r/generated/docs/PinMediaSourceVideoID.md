# openapi::PinMediaSourceVideoID

Video ID-based media source.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_content_type** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] [Enum: ] 
**cover_image_data** | **character** | Cover image Base64. | [optional] 
**cover_image_key_frame_time** | **integer** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] [Min: 0] 
**cover_image_url** | **character** | Cover image URL. | [optional] 
**is_standard** | **character** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to TRUE] 
**media_id** | **character** |  | [Pattern: ^\\d+$] 
**source_type** | **character** |  | [Enum: [video_id]] 


