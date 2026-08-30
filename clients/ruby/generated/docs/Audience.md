# PinterestSdkClient::Audience

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Ad account ID. | [optional] |
| **audience_type** | [**PinnerListType**](PinnerListType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] |
| **created_by_company_name** | **String** | The company that created this audience. | [optional] |
| **created_timestamp** | **Integer** | Creation time. Unix timestamp in seconds. | [optional] |
| **description** | **String** | Audience description. | [optional] |
| **id** | **String** | Audience ID. | [optional] |
| **is_nca** | **Boolean** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] |
| **name** | **String** | Audience name. | [optional] |
| **rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] |
| **size** | **Integer** | Audience size. | [optional] |
| **status** | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] |
| **type** | **String** | Always \&quot;audience\&quot;. | [optional] |
| **updated_timestamp** | **Integer** | Last update time. Unix timestamp in seconds. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Audience.new(
  ad_account_id: 549755885175,
  audience_type: null,
  created_by_company_name: Pinterest,
  created_timestamp: 1451431341,
  description: People who love making quilts.,
  id: 1234,
  is_nca: null,
  name: ACME Tools,
  rule: null,
  size: 1000,
  status: null,
  type: audience,
  updated_timestamp: 1451431341
)
```

