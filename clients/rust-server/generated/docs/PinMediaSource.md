# PinMediaSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_type** | **String** |  | 
**content_type** | **String** |  | 
**data** | **String** |  | 
**is_standard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to Some(true)]
**url** | **String** |  | 
**cover_image_url** | **String** | Cover image url. | [optional] [default to None]
**cover_image_content_type** | **String** | Content type for cover image Base64. | [optional] [default to None]
**cover_image_data** | **String** | Cover image Base64. | [optional] [default to None]
**media_id** | **String** |  | 
**items** | [**Vec<models::PinMediaSourceImagesUrlItemsInner>**](PinMediaSourceImagesURL_items_inner.md) | Array with image objects. | 
**index** | **u32** |  | [optional] [default to None]
**is_affiliate_link** | **bool** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to Some(false)]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


