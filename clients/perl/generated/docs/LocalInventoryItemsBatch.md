# WWW::OpenAPIClient::Object::LocalInventoryItemsBatch

## Load the model package
```perl
use WWW::OpenAPIClient::Object::LocalInventoryItemsBatch;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **string** | Id of the batch operation | [readonly] 
**completed_time** | **DATE_TIME** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**created_time** | **DATE_TIME** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly] 
**operation_results** | [**ARRAY[SupplementalOperationResult]**](SupplementalOperationResult.md) | Array of operation results | [readonly] 
**status** | [**SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


