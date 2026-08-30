# PinMediaSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | [***models::ContentType**](ContentType.md) |  | 
**data** | **String** |  | 
**is_standard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to Some(true)]
**source_type** | [***models::PinMediaSourcePinUrlSourceType**](PinMediaSourcePinURL_source_type.md) |  | 
**url** | **String** |  | 
**cover_image_content_type** | [***models::ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] [default to None]
**cover_image_data** | **String** | Cover image Base64. | [optional] [default to None]
**cover_image_key_frame_time** | **u32** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] [default to None]
**cover_image_url** | **String** | Cover image URL. | [optional] [default to None]
**media_id** | **String** |  | 
**index** | **u32** |  | [optional] [default to None]
**items** | [**Vec<models::PinMediaSourceImagesUrlItem>**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**is_affiliate_link** | **bool** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to Some(false)]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


