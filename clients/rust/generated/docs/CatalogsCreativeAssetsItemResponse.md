# CatalogsCreativeAssetsItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | Option<[**models::CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md)> |  | [optional]
**catalog_type** | **CatalogType** |  (enum: CREATIVE_ASSETS) | 
**creative_assets_id** | Option<**String**> | The catalog creative assets id in the merchant namespace | [optional]
**item_response_kind** | **ItemResponseKind** | Discriminator literal identifying this leaf inside an `ItemResponse` payload. (enum: creative_assets_item) | 
**pins** | Option<[**Vec<models::Pin>**](Pin.md)> | The pins mapped to the item | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


