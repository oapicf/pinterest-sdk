# AdAccountToAdAccountSharedAudience


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **string** | Unique identifier of an audience | [default to undefined]
**permissions** | [**Array&lt;Role&gt;**](Role.md) | Permissions granted to the recipients. | [optional] [readonly] [default to undefined]
**recipient_account_ids** | **Array&lt;string&gt;** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | [default to undefined]

## Example

```typescript
import { AdAccountToAdAccountSharedAudience } from './api';

const instance: AdAccountToAdAccountSharedAudience = {
    audience_id,
    permissions,
    recipient_account_ids,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
