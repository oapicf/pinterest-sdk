# PinterestSdkClient::CampaignDeliveryEstimatesResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **curves** | [**Array&lt;CampaignPlanningCurveEstimate&gt;**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] |
| **derived_metrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] |
| **max_potential_spend** | **Integer** | Maximum potential spend estimate. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignDeliveryEstimatesResponse.new(
  curves: null,
  derived_metrics: null,
  max_potential_spend: 50000000
)
```

