# AdAccountsAudienceCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Ad account ID. | [optional] [default to undefined]
**audience_type** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] [default to undefined]
**description** | **string** | Audience description. | [optional] [default to undefined]
**name** | **string** | Audience name. | [optional] [default to undefined]
**rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AdAccountsAudienceCreate } from './api';

const instance: AdAccountsAudienceCreate = {
    ad_account_id,
    audience_type,
    description,
    name,
    rule,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
