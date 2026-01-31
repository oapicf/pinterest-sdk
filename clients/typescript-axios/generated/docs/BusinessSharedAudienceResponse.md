# BusinessSharedAudienceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **string** | Audience ID that was shared | [optional] [default to undefined]
**permissions** | [**Array&lt;Role&gt;**](Role.md) |  | [optional] [default to undefined]
**recipient_business_ids** | **Array&lt;string&gt;** | Business IDs that received the audience | [optional] [default to undefined]

## Example

```typescript
import { BusinessSharedAudienceResponse } from './api';

const instance: BusinessSharedAudienceResponse = {
    audience_id,
    permissions,
    recipient_business_ids,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
