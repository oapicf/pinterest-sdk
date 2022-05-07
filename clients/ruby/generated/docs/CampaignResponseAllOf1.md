# PinterestSdkClient::CampaignResponseAllOf1

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] |
| **created_time** | **Integer** | Campaign creation time. Unix timestamp in seconds. | [optional] |
| **updated_time** | **Integer** | UTC timestamp. Last update time. | [optional] |
| **type** | **String** | Always \&quot;campaign\&quot;. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignResponseAllOf1.new(
  objective_type: null,
  created_time: 1432744744,
  updated_time: 1432744744,
  type: campaign
)
```

