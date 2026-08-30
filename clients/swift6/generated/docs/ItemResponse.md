# ItemResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**catalogType** | **String** |  | 
**itemId** | **String** | The catalog item id in the merchant namespace | [optional] 
**itemResponseKind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [Pin] | The pins mapped to the item | [optional] 
**hotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**creativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [ItemValidationEvent] | Array with the errors for the item id requested | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


