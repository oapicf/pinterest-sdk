# PinterestSdkClient::AudienceCommon

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Ad account ID. | [optional] |
| **name** | **String** | Audience name. | [optional] |
| **rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceCommon.new(
  ad_account_id: 549755885175,
  name: string,
  rule: null
)
```

