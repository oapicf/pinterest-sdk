# PinMediaSource
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **content\_type** | [**ContentType**](ContentType.md) |  | [default to null] |
| **data** | **String** |  | [default to null] |
| **is\_standard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true] |
| **source\_type** | **String** |  | [default to null] |
| **url** | **String** |  | [default to null] |
| **cover\_image\_content\_type** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] [default to null] |
| **cover\_image\_data** | **String** | Cover image Base64. | [optional] [default to null] |
| **cover\_image\_key\_frame\_time** | **Integer** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] [default to null] |
| **cover\_image\_url** | **String** | Cover image URL. | [optional] [default to null] |
| **media\_id** | **String** |  | [default to null] |
| **index** | **Integer** |  | [optional] [default to null] |
| **items** | [**List**](PinMediaSourceImagesURLItem.md) | Array with image objects. | [default to null] |
| **is\_affiliate\_link** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

