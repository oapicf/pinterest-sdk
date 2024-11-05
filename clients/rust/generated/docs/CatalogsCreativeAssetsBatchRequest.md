# CatalogsCreativeAssetsBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **String** |  | 
**country** | [**models::Country**](Country.md) |  | 
**language** | [**models::CatalogsItemsRequestLanguage**](CatalogsItemsRequest_language.md) |  | 
**items** | [**Vec<models::CatalogsCreativeAssetsBatchItem>**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations | 
**catalog_id** | Option<**String**> | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


