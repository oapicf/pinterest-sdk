# SupplementalItemsBatchResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **string** | Id of the batch operation | [readonly]
**completed_time** | **\DateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly]
**created_time** | **\DateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly]
**operation_results** | [**\OpenAPI\Client\Model\SupplementalOperationResult[]**](SupplementalOperationResult.md) | Array of operation results | [readonly]
**status** | [**\OpenAPI\Client\Model\SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
