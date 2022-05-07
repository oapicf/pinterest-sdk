# CatalogsItemsBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**Vec<models::ItemProcessingRecord>**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] [default to None]
**batch_id** | **String** | Id of the catalogs items batch | [optional] [default to None]
**created_time** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD | [optional] [readonly] [default to None]
**completed_time** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD | [optional] [readonly] [default to None]
**status** | [***models::BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


