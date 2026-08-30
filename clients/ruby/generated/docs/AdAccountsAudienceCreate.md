# PinterestSdkClient::AdAccountsAudienceCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Ad account ID. | [optional] |
| **audience_type** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] |
| **description** | **String** | Audience description. | [optional] |
| **name** | **String** | Audience name. | [optional] |
| **rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountsAudienceCreate.new(
  ad_account_id: null,
  audience_type: null,
  description: null,
  name: null,
  rule: null
)
```

