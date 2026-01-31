# # PinMediaSourceVideoID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_content_type** | [**\OpenAPI\Client\Model\ContentType**](ContentType.md) | Content type for cover image Base64. | [optional]
**cover_image_data** | **string** | Cover image Base64. | [optional]
**cover_image_key_frame_time** | **int** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional]
**cover_image_url** | **string** | Cover image URL. | [optional]
**is_standard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**media_id** | **string** |  |
**source_type** | **string** |  |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
