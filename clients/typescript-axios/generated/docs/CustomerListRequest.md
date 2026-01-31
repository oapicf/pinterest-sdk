# CustomerListRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Customer list name. | [default to undefined]
**records** | **string** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [default to undefined]
**list_type** | [**UserListType**](UserListType.md) |  | [optional] [default to UserListType_Email]
**exceptions** | **object** | Customer list errors. | [optional] [default to undefined]

## Example

```typescript
import { CustomerListRequest } from './api';

const instance: CustomerListRequest = {
    name,
    records,
    list_type,
    exceptions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
