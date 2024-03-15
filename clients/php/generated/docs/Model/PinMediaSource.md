# # PinMediaSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_type** | **string** |  |
**content_type** | **string** |  |
**data** | **string** |  |
**is_standard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**url** | **string** |  |
**cover_image_url** | **string** | Cover image url. | [optional]
**cover_image_content_type** | **string** | Content type for cover image Base64. | [optional]
**cover_image_data** | **string** | Cover image Base64. | [optional]
**media_id** | **string** |  |
**items** | [**\OpenAPI\Client\Model\PinMediaSourceImagesURLItemsInner[]**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. |
**index** | **int** |  | [optional]
**is_affiliate_link** | **bool** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
