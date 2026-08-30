# AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **string** | Unique identifier of an audience | [default to undefined]
**operation_type** | [**OperationType**](OperationType.md) |  | [default to undefined]
**recipient_account_ids** | **Array&lt;string&gt;** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | [default to undefined]

## Example

```typescript
import { AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody } from './api';

const instance: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody = {
    audience_id,
    operation_type,
    recipient_account_ids,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
