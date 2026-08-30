# PinterestSdkClient::CampaignPlanningConversionAttribution

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **click_window_days** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] |
| **engagement_window_days** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. | [optional] |
| **view_window_days** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignPlanningConversionAttribution.new(
  click_window_days: null,
  engagement_window_days: null,
  view_window_days: null
)
```

