# CustomerSegment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | The ID of the ad account that this customer segment belongs to. | [optional] [readonly] [default to undefined]
**audience_ids** | **Array&lt;string&gt;** | Audience IDs included in the customer segment. | [default to undefined]
**created_time** | **number** | Customer segment created time. Unix timestamp in seconds. | [optional] [readonly] [default to undefined]
**id** | **string** | Customer segment ID. | [optional] [readonly] [default to undefined]
**name** | **string** | Customer segment name. | [default to undefined]
**status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicates whether the customer segment is active or deleted. | [optional] [readonly] [default to undefined]
**updated_time** | **number** | Customer segment updated time. Unix timestamp in seconds. | [optional] [readonly] [default to undefined]

## Example

```typescript
import { CustomerSegment } from './api';

const instance: CustomerSegment = {
    ad_account_id,
    audience_ids,
    created_time,
    id,
    name,
    status,
    updated_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
