# PinMediaSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceType** | **string** |  | 
**contentType** | **string** |  | 
**data** | **string** |  | 
**isStandard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**url** | **string** |  | 
**coverImageUrl** | **string** | Cover image url. | [optional] 
**coverImageContentType** | **string** | Content type for cover image Base64. | [optional] 
**coverImageData** | **string** | Cover image Base64. | [optional] 
**mediaId** | **string** |  | 
**items** | [**OpenAPI\Server\Model\PinMediaSourceImagesURLItemsInner**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. | 
**index** | **int** |  | [optional] 
**isAffiliateLink** | **bool** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


