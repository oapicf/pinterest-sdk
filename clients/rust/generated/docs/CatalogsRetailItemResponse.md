# CatalogsRetailItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | Option<[**models::ItemAttributes**](ItemAttributes.md)> |  | [optional]
**catalog_type** | **CatalogType** |  (enum: RETAIL) | 
**item_id** | Option<**String**> | The catalog retail item id in the merchant namespace | [optional]
**item_response_kind** | **ItemResponseKind** | Discriminator literal identifying this leaf inside an `ItemResponse` payload. (enum: retail_item) | 
**pins** | Option<[**Vec<models::Pin>**](Pin.md)> | The pins mapped to the item | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


