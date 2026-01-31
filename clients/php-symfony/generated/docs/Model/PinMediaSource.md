# PinMediaSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | [**OpenAPI\Server\Model\ContentType**](ContentType.md) |  | 
**data** | **string** |  | 
**isStandard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**sourceType** | **string** |  | 
**url** | **string** |  | 
**coverImageContentType** | [**OpenAPI\Server\Model\ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] 
**coverImageData** | **string** | Cover image Base64. | [optional] 
**coverImageKeyFrameTime** | **int** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] 
**coverImageUrl** | **string** | Cover image URL. | [optional] 
**mediaId** | **string** |  | 
**index** | **int** |  | [optional] 
**items** | [**OpenAPI\Server\Model\PinMediaSourceImagesURLItem**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**isAffiliateLink** | **bool** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


