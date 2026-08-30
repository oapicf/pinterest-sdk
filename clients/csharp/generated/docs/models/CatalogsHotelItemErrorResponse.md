# Org.OpenAPITools.Model.CatalogsHotelItemErrorResponse
Object describing a hotel item error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**Errors** | [**List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**ItemResponseKind** | **string** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**HotelId** | **string** | The catalog hotel id in the merchant namespace | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

