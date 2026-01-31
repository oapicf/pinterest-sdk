# AudienceCreateCustomRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Ad account ID. | [optional] [default to undefined]
**name** | **string** | Audience name. | [default to undefined]
**rule** | [**AudienceRule**](AudienceRule.md) |  | [default to undefined]
**sharing_type** | [**AudienceSharingType**](AudienceSharingType.md) |  | [default to undefined]
**data_party** | [**AudienceDataParty**](AudienceDataParty.md) |  | [default to undefined]
**category** | **string** |  | [optional] [default to undefined]

## Example

```typescript
import { AudienceCreateCustomRequest } from './api';

const instance: AudienceCreateCustomRequest = {
    ad_account_id,
    name,
    rule,
    sharing_type,
    data_party,
    category,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
