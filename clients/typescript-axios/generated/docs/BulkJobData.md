# BulkJobData

Bulk request result data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result_url** | **string** | Presigned s3 file url for the bulk request result. | [optional] [default to undefined]
**status** | [**BulkRequestStatus**](BulkRequestStatus.md) |  | [default to undefined]
**workload_id** | **number** | Bulk Workload Id. | [optional] [default to undefined]

## Example

```typescript
import { BulkJobData } from './api';

const instance: BulkJobData = {
    result_url,
    status,
    workload_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
