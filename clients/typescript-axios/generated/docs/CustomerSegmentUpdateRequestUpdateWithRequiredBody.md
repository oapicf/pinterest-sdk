# CustomerSegmentUpdateRequestUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_ids** | **Array&lt;string&gt;** | Audience IDs to update the customer segment to. Only applicable for UPDATE operations. | [optional] [default to undefined]
**id** | **string** | Customer segment ID. | [default to undefined]
**operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | [default to undefined]

## Example

```typescript
import { CustomerSegmentUpdateRequestUpdateWithRequiredBody } from './api';

const instance: CustomerSegmentUpdateRequestUpdateWithRequiredBody = {
    audience_ids,
    id,
    operation_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
