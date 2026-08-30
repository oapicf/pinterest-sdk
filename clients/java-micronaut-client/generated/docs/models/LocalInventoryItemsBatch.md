

# LocalInventoryItemsBatch

Unified model for local inventory items batch operation

The class is defined in **[LocalInventoryItemsBatch.java](../../src/main/java/org/openapitools/model/LocalInventoryItemsBatch.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | `String` | Id of the batch operation |  [readonly property]
**completedTime** | `OffsetDateTime` | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional property] [readonly property]
**createdTime** | `OffsetDateTime` | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [readonly property]
**operationResults** | [`List&lt;SupplementalOperationResult&gt;`](SupplementalOperationResult.md) | Array of operation results |  [readonly property]
**status** | `SupplementalItemBatchOperationStatus` | Status of the batch: PROCESSING, COMPLETED, FAILED |  [readonly property]







