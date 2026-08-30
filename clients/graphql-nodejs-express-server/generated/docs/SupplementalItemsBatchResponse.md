# SupplementalItemsBatchResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **String!** | Id of the batch operation | [readonly] [default to null]
**completedTime** | **String!** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] [default to null]
**createdTime** | **String!** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly] [default to null]
**operationResults** | [**SupplementalOperationResult**](SupplementalOperationResult.md) | Array of operation results | [readonly] [default to null]
**status** | [***SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


