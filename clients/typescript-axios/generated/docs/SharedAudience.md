# SharedAudience


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **string** | Unique identifier of an audience | [default to undefined]
**operation_type** | [**OperationType**](OperationType.md) |  | [default to undefined]
**recipient_account_ids** | **Array&lt;string&gt;** | List of ad account IDs to share with or revoke from. | [default to undefined]

## Example

```typescript
import { SharedAudience } from './api';

const instance: SharedAudience = {
    audience_id,
    operation_type,
    recipient_account_ids,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
