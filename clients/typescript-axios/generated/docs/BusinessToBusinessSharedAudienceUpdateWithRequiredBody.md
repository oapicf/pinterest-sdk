# BusinessToBusinessSharedAudienceUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **string** | Unique identifier of an audience | [default to undefined]
**operation_type** | [**OperationType**](OperationType.md) |  | [default to undefined]
**recipient_business_ids** | **Array&lt;string&gt;** | Business IDs to share with or revoke from (request) / that received the audience (response). | [default to undefined]

## Example

```typescript
import { BusinessToBusinessSharedAudienceUpdateWithRequiredBody } from './api';

const instance: BusinessToBusinessSharedAudienceUpdateWithRequiredBody = {
    audience_id,
    operation_type,
    recipient_business_ids,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
