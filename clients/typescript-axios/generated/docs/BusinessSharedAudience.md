# BusinessSharedAudience


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **string** | Unique identifier of an audience | [default to undefined]
**operation_type** | [**OperationType**](OperationType.md) |  | [default to undefined]
**recipient_business_ids** | **Array&lt;string&gt;** | List of business IDs to share with or revoke from. | [default to undefined]

## Example

```typescript
import { BusinessSharedAudience } from './api';

const instance: BusinessSharedAudience = {
    audience_id,
    operation_type,
    recipient_business_ids,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
