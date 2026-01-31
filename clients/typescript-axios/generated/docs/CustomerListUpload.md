# CustomerListUpload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Advertiser ID. | [default to undefined]
**creation_time** | **number** | Customer List Upload creation_time. Epoch (seconds). | [default to undefined]
**customer_list_id** | **string** | ID of the customer list associated with this upload. | [default to undefined]
**error_counts** | [**Array&lt;ErrorDetail&gt;**](ErrorDetail.md) | Error counts by error code | [optional] [default to undefined]
**id** | **string** | Customer List Upload ID. | [default to undefined]
**operation** | [**UserListOperationType**](UserListOperationType.md) |  | [default to undefined]
**record_counts** | [**RecordCounts**](RecordCounts.md) |  | [optional] [default to undefined]
**state** | **string** | Workload processing state | [default to undefined]
**updated_time** | **number** | Customer List Upload updated_time. Epoch (seconds). | [default to undefined]

## Example

```typescript
import { CustomerListUpload } from './api';

const instance: CustomerListUpload = {
    ad_account_id,
    creation_time,
    customer_list_id,
    error_counts,
    id,
    operation,
    record_counts,
    state,
    updated_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
