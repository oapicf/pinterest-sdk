# PinterestSdkClient::CampaignPlanningExperimentBudgetRecommendation

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **budget_recommendation** | **Integer** | Recommended budget for this experiment version. | [optional] |
| **lifetime_days_recommendation** | **Integer** | Recommended lifetime days for this experiment. | [optional] |
| **point_estimations** | [**Array&lt;CampaignPlanningBudgetRecommendationPoint&gt;**](CampaignPlanningBudgetRecommendationPoint.md) | Point estimations for this experiment version. | [optional] |
| **version_id** | **String** | Version identifier for the experiment. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignPlanningExperimentBudgetRecommendation.new(
  budget_recommendation: 5500000,
  lifetime_days_recommendation: 35,
  point_estimations: null,
  version_id: null
)
```

