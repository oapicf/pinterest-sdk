# PinterestSdkClient::AdAccountsAudience

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Ad account ID. | [optional] |
| **audience_type** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] |
| **created_by_company_name** | **String** | The company that created this audience. | [optional][readonly] |
| **created_timestamp** | **Integer** | Creation time. Unix timestamp in seconds. | [optional][readonly] |
| **description** | **String** | Audience description. | [optional] |
| **id** | **String** | Audience ID. |  |
| **is_nca** | **Boolean** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional][readonly] |
| **name** | **String** | Audience name. | [optional] |
| **rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] |
| **size** | **Integer** | Audience size. | [optional][readonly] |
| **status** | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional][readonly] |
| **type** | **String** | Always \&quot;audience\&quot;. | [optional][readonly] |
| **updated_timestamp** | **Integer** | Last update time. Unix timestamp in seconds. | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountsAudience.new(
  ad_account_id: null,
  audience_type: null,
  created_by_company_name: null,
  created_timestamp: null,
  description: null,
  id: null,
  is_nca: null,
  name: null,
  rule: null,
  size: null,
  status: null,
  type: null,
  updated_timestamp: null
)
```

