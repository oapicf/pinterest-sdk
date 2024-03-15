# PIN_MEDIA_SOURCE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_type** | [**STRING_32**](STRING_32.md) |  | [default to null]
**content_type** | [**STRING_32**](STRING_32.md) |  | [default to null]
**data** | [**STRING_32**](STRING_32.md) |  | [default to null]
**is_standard** | **BOOLEAN** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**url** | [**STRING_32**](STRING_32.md) |  | [default to null]
**cover_image_url** | [**STRING_32**](STRING_32.md) | Cover image url. | [optional] [default to null]
**cover_image_content_type** | [**STRING_32**](STRING_32.md) | Content type for cover image Base64. | [optional] [default to null]
**cover_image_data** | [**STRING_32**](STRING_32.md) | Cover image Base64. | [optional] [default to null]
**media_id** | [**STRING_32**](STRING_32.md) |  | [default to null]
**items** | [**LIST [PIN_MEDIA_SOURCE_IMAGES_URL_ITEMS_INNER]**](PinMediaSourceImagesURL_items_inner.md) | Array with image objects. | [default to null]
**index** | **INTEGER_32** |  | [optional] [default to null]
**is_affiliate_link** | **BOOLEAN** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


