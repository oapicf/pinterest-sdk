# Org.OpenAPITools.Model.CatalogsCreativeAssetsItemResponse
Object describing a creative assets item record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**ItemResponseKind** | **string** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**Attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**CreativeAssetsId** | **string** | The catalog creative assets id in the merchant namespace | [optional] 
**Pins** | [**List&lt;Pin&gt;**](Pin.md) | The pins mapped to the item | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

