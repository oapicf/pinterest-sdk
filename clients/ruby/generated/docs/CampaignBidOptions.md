# PinterestSdkClient::CampaignBidOptions

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **age_bucket_multipliers** | [**AgeBucketMultipliers**](AgeBucketMultipliers.md) | Age bucket multipliers for bid adjustments. | [optional] |
| **app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) | App type multipliers for bid adjustments. | [optional] |
| **audience_multipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) | Audience multipliers for bid adjustments. | [optional] |
| **freq_bid_multiplier_time_window** | [**FreqBidMultiplierTimeWindow**](FreqBidMultiplierTimeWindow.md) | The time window for frequency bid multipliers. | [optional] |
| **frequency_multipliers** | [**FrequencyMultipliers**](FrequencyMultipliers.md) | Frequency multipliers for bid adjustments. | [optional] |
| **gender_multipliers** | [**GenderMultipliers**](GenderMultipliers.md) | Gender multipliers for bid adjustments. | [optional] |
| **placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) | Placement multipliers for bid adjustments. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignBidOptions.new(
  age_bucket_multipliers: null,
  app_type_multipliers: null,
  audience_multipliers: null,
  freq_bid_multiplier_time_window: null,
  frequency_multipliers: null,
  gender_multipliers: null,
  placement_multipliers: null
)
```

