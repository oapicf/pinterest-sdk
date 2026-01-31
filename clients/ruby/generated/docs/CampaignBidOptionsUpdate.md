# PinterestSdkClient::CampaignBidOptionsUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] |
| **audience_multipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) |  | [optional] |
| **placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) |  | [optional] |
| **update_mask** | **Array&lt;String&gt;** | List of fields to update, only the fields in the list will be updated. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignBidOptionsUpdate.new(
  app_type_multipliers: null,
  audience_multipliers: null,
  placement_multipliers: null,
  update_mask: null
)
```

