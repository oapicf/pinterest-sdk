# PIN_MEDIA_SOURCE_VIDEO_ID

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_content_type** | [**CONTENT_TYPE**](ContentType.md) | Content type for cover image Base64. | [optional] [default to null]
**cover_image_data** | [**STRING_32**](STRING_32.md) | Cover image Base64. | [optional] [default to null]
**cover_image_key_frame_time** | **INTEGER_32** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] [default to null]
**cover_image_url** | [**STRING_32**](STRING_32.md) | Cover image URL. | [optional] [default to null]
**is_standard** | **BOOLEAN** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**media_id** | [**STRING_32**](STRING_32.md) |  | [default to null]
**source_type** | [**STRING_32**](STRING_32.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


