# AudienceUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Ad account ID. | [optional] [default to undefined]
**name** | **string** | Audience name. | [optional] [default to undefined]
**rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] [default to undefined]
**description** | **string** | Audience description. | [optional] [default to undefined]
**operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AudienceUpdateRequest } from './api';

const instance: AudienceUpdateRequest = {
    ad_account_id,
    name,
    rule,
    description,
    operation_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
