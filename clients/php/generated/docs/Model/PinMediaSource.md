# # PinMediaSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | [**\OpenAPI\Client\Model\ContentType**](ContentType.md) |  |
**data** | **string** |  |
**is_standard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**source_type** | **string** |  |
**url** | **string** |  |
**cover_image_content_type** | [**\OpenAPI\Client\Model\ContentType**](ContentType.md) | Content type for cover image Base64. | [optional]
**cover_image_data** | **string** | Cover image Base64. | [optional]
**cover_image_key_frame_time** | **int** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional]
**cover_image_url** | **string** | Cover image URL. | [optional]
**media_id** | **string** |  |
**index** | **int** |  | [optional]
**items** | [**\OpenAPI\Client\Model\PinMediaSourceImagesURLItem[]**](PinMediaSourceImagesURLItem.md) | Array with image objects. |
**is_affiliate_link** | **bool** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
