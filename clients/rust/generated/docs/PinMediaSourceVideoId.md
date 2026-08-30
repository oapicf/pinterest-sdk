# PinMediaSourceVideoId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_content_type** | Option<[**models::ContentType**](ContentType.md)> | Content type for cover image Base64. | [optional]
**cover_image_data** | Option<**String**> | Cover image Base64. | [optional]
**cover_image_key_frame_time** | Option<**i32**> | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional]
**cover_image_url** | Option<**String**> | Cover image URL. | [optional]
**is_standard** | Option<**bool**> | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional][default to true]
**media_id** | **String** |  | 
**source_type** | **SourceType** |  (enum: video_id) | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


