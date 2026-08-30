# PinterestSdkClient::CampaignPlanningConversionRate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attribution_windows** | [**CampaignPlanningConversionAttribution**](CampaignPlanningConversionAttribution.md) |  |  |
| **conversion_event** | [**CampaignPlanningConversionEvent**](CampaignPlanningConversionEvent.md) |  |  |
| **conversion_rate** | **Float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignPlanningConversionRate.new(
  attribution_windows: null,
  conversion_event: null,
  conversion_rate: 2.32600002288818
)
```

