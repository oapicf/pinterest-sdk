# CatalogsCreativeAssetsItemErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **CatalogType** |  (enum: CREATIVE_ASSETS) | 
**creative_assets_id** | Option<**String**> | The catalog creative assets id in the merchant namespace | [optional]
**errors** | [**Vec<models::ItemValidationEvent>**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**item_response_kind** | **ItemResponseKind** | Discriminator literal identifying this leaf inside an `ItemResponse` payload. (enum: creative_assets_item_error) | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


