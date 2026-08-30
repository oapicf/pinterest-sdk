# ItemResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**OpenAPI\Server\Model\CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**catalogType** | **string** |  | 
**itemId** | **string** | The catalog item id in the merchant namespace | [optional] 
**itemResponseKind** | **string** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**OpenAPI\Server\Model\Pin**](Pin.md) | The pins mapped to the item | [optional] 
**hotelId** | **string** | The catalog hotel id in the merchant namespace | [optional] 
**creativeAssetsId** | **string** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**OpenAPI\Server\Model\ItemValidationEvent**](ItemValidationEvent.md) | Array with the errors for the item id requested | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


