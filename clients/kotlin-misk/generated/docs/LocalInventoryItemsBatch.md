
# LocalInventoryItemsBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **kotlin.String** | Id of the batch operation |  [readonly]
**createdTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [readonly]
**operationResults** | [**kotlin.collections.List&lt;SupplementalOperationResult&gt;**](SupplementalOperationResult.md) | Array of operation results |  [readonly]
**status** | [**SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED |  [readonly]
**completedTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional] [readonly]



