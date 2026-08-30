# CatalogsItemsBatchPostRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] [default to None]
**catalog_type** | [***models::CatalogsCreativeAssetsAvailableFilterValuesCatalogType**](CatalogsCreativeAssetsAvailableFilterValues_catalog_type.md) |  | 
**country** | [***models::Country**](Country.md) |  | 
**items** | [**Vec<models::ItemDeleteBatchRecord>**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**language** | [***models::CatalogsCreativeAssetsBatchRequestLanguage**](CatalogsCreativeAssetsBatchRequest_language.md) |  | 
**operation** | [***models::AdvancedAuctionItemsSubmitDeleteRecordOperation**](AdvancedAuctionItemsSubmitDeleteRecord_operation.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


