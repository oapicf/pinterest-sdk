# openapi::SupplementalItemsBatchResponse

Response model for supplemental items batch operation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **character** | Id of the batch operation | [readonly] 
**completed_time** | **character** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**created_time** | **character** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly] 
**operation_results** | [**array[SupplementalOperationResult]**](SupplementalOperationResult.md) | Array of operation results | [readonly] 
**status** | [**SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] [Enum: ] 


