# PinterestSdkClient::AudienceUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Ad account ID. | [optional] |
| **name** | **String** | Audience name. | [optional] |
| **rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] |
| **description** | **String** | Audience description. | [optional] |
| **operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | [optional][default to &#39;UPDATE&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceUpdateRequest.new(
  ad_account_id: 549755885175,
  name: string,
  rule: null,
  description: string,
  operation_type: null
)
```

