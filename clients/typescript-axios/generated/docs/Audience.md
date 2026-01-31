# Audience


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Ad account ID. | [optional] [default to undefined]
**audience_type** | **string** | &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] [default to undefined]
**created_by_company_name** | **string** | The company that created this audience. | [optional] [default to undefined]
**created_timestamp** | **number** | Creation time. Unix timestamp in seconds. | [optional] [default to undefined]
**description** | **string** | Audience description. | [optional] [default to undefined]
**id** | **string** | Audience ID. | [optional] [default to undefined]
**name** | **string** | Audience name. | [optional] [default to undefined]
**rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] [default to undefined]
**size** | **number** | Audience size. | [optional] [default to undefined]
**status** | **string** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [default to undefined]
**type** | **string** | Always \&quot;audience\&quot;. | [optional] [default to undefined]
**updated_timestamp** | **number** | Last update time. Unix timestamp in seconds. | [optional] [default to undefined]

## Example

```typescript
import { Audience } from './api';

const instance: Audience = {
    ad_account_id,
    audience_type,
    created_by_company_name,
    created_timestamp,
    description,
    id,
    name,
    rule,
    size,
    status,
    type,
    updated_timestamp,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
