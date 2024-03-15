# Org.OpenAPITools.Model.PinMediaSource
Pin media source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceType** | **string** |  | 
**ContentType** | **string** |  | 
**Data** | **string** |  | 
**IsStandard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**Url** | **string** |  | 
**CoverImageUrl** | **string** | Cover image url. | [optional] 
**CoverImageContentType** | **string** | Content type for cover image Base64. | [optional] 
**CoverImageData** | **string** | Cover image Base64. | [optional] 
**MediaId** | **string** |  | 
**Items** | [**List&lt;PinMediaSourceImagesURLItemsInner&gt;**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. | 
**Index** | **int** |  | [optional] 
**IsAffiliateLink** | **bool** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

