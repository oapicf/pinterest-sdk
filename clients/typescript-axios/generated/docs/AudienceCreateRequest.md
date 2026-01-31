# AudienceCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Ad account ID. | [optional] [default to undefined]
**name** | **string** | Audience name. | [default to undefined]
**rule** | [**AudienceRule**](AudienceRule.md) |  | [default to undefined]
**description** | **string** | Audience description. | [optional] [default to undefined]
**audience_type** | [**AudienceType**](AudienceType.md) | &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive. | [default to undefined]

## Example

```typescript
import { AudienceCreateRequest } from './api';

const instance: AudienceCreateRequest = {
    ad_account_id,
    name,
    rule,
    description,
    audience_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
