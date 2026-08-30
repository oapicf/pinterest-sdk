# LocalInventoryItemsBatch


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`batch_id`** | **`String`** | Id of the batch operation | [readonly] [default to nothing]
**`completed_time`** | **`ZonedDateTime`** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] [default to nothing]
**`created_time`** | **`ZonedDateTime`** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly] [default to nothing]
**`operation_results`** | [**`Vector{SupplementalOperationResult}`**](SupplementalOperationResult.md) | Array of operation results | [readonly] [default to nothing]
**`status`** | [**`*SupplementalItemBatchOperationStatus`**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


