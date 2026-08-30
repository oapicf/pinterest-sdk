# PinterestSdkClient::CampaignPlanningBudgetRecommendationPoint

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **estimation_type** | [**CampaignPlanningEstimationType**](CampaignPlanningEstimationType.md) | Estimation type for this point. | [optional] |
| **point_estimate** | [**CampaignPlanningPointEstimate**](CampaignPlanningPointEstimate.md) | Point estimate data. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignPlanningBudgetRecommendationPoint.new(
  estimation_type: null,
  point_estimate: null
)
```

