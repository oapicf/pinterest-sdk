# pin_media_source_video_id_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_content_type** | **content_type_t \*** | Content type for cover image Base64. | [optional] 
**cover_image_data** | **char \*** | Cover image Base64. | [optional] 
**cover_image_key_frame_time** | **int** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] 
**cover_image_url** | **char \*** | Cover image URL. | [optional] 
**is_standard** | **int** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**media_id** | **char \*** |  | 
**source_type** | **pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


