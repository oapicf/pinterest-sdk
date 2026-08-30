

# SupplementalItemsBatchResponse

Response model for supplemental items batch operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchId** | **String** | Id of the batch operation |  [readonly] |
|**completedTime** | **Date** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional] [readonly] |
|**createdTime** | **Date** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [readonly] |
|**operationResults** | [**List&lt;SupplementalOperationResult&gt;**](SupplementalOperationResult.md) | Array of operation results |  [readonly] |
|**status** | **SupplementalItemBatchOperationStatus** | Status of the batch: PROCESSING, COMPLETED, FAILED |  [readonly] |



