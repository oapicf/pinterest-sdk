# PinterestSdkClient::CampaignBidOptions

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] |
| **audience_multipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) |  | [optional] |
| **placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignBidOptions.new(
  app_type_multipliers: null,
  audience_multipliers: null,
  placement_multipliers: null
)
```

