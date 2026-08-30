# LocalInventoryItemsBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **String** | Id of the batch operation | [readonly] 
**completed_time** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss | [optional] [readonly] [default to None]
**created_time** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss | [readonly] 
**operation_results** | [**Vec<models::SupplementalOperationResult>**](SupplementalOperationResult.md) | Array of operation results | [readonly] 
**status** | [***models::SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


