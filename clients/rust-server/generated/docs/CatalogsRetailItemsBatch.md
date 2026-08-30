# CatalogsRetailItemsBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **String** | Id of the catalogs items batch | [optional] [default to None]
**catalog_type** | [***models::CatalogsRetailAvailableFilterValuesCatalogType**](CatalogsRetailAvailableFilterValues_catalog_type.md) |  | 
**completed_time** | [**swagger::Nullable<chrono::DateTime::<chrono::Utc>>**](DateTime.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss | [optional] [default to None]
**created_time** | [**swagger::Nullable<chrono::DateTime::<chrono::Utc>>**](DateTime.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. | 
**items** | [**Vec<models::ItemProcessingRecord>**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] [default to None]
**status** | [***models::BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


