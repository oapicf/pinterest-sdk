# PinterestSdkClient::AudienceCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Ad account ID. | [optional] |
| **name** | **String** | Audience name. |  |
| **rule** | [**AudienceRule**](AudienceRule.md) |  |  |
| **description** | **String** | Audience description. | [optional] |
| **audience_type** | [**AudienceCreateRequest1AudienceType**](AudienceCreateRequest1AudienceType.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceCreateRequest.new(
  ad_account_id: 549755885175,
  name: string,
  rule: null,
  description: string,
  audience_type: null
)
```

