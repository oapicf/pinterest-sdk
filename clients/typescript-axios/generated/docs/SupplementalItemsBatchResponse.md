# SupplementalItemsBatchResponse

Response model for supplemental items batch operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **string** | Id of the batch operation | [readonly] [default to undefined]
**completed_time** | **string** | Date and time (UTC) of the batch completion: YYYY-MM-DD\&#39;T\&#39;hh:mm:ss | [optional] [readonly] [default to undefined]
**created_time** | **string** | Date and time (UTC) of the batch creation: YYYY-MM-DD\&#39;T\&#39;hh:mm:ss | [readonly] [default to undefined]
**operation_results** | [**Array&lt;SupplementalOperationResult&gt;**](SupplementalOperationResult.md) | Array of operation results | [readonly] [default to undefined]
**status** | [**SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] [default to undefined]

## Example

```typescript
import { SupplementalItemsBatchResponse } from './api';

const instance: SupplementalItemsBatchResponse = {
    batch_id,
    completed_time,
    created_time,
    operation_results,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
