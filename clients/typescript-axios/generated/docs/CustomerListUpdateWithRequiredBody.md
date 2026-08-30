# CustomerListUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation_type** | [**UserListOperationType**](UserListOperationType.md) | Customer list update operation type (add or remove). Only valid in update request body. | [default to undefined]
**records** | **string** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [optional] [default to undefined]
**records_v2** | [**Array&lt;CustomerListRecordRow&gt;**](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. | [optional] [default to undefined]

## Example

```typescript
import { CustomerListUpdateWithRequiredBody } from './api';

const instance: CustomerListUpdateWithRequiredBody = {
    operation_type,
    records,
    records_v2,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
