# PinterestSdkClient::CampaignPlanningBudgetRecommendation

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **budget_recommendation** | **Integer** | The recommended budget amount. | [optional] |
| **experiment_campaign_budget_recommendation** | [**Array&lt;CampaignPlanningExperimentBudgetRecommendation&gt;**](CampaignPlanningExperimentBudgetRecommendation.md) | List of experimental budget recommendations. | [optional] |
| **lifetime_days_recommendation** | **Integer** | Recommended number of days for the campaign lifetime. | [optional] |
| **point_estimations** | [**Array&lt;CampaignPlanningBudgetRecommendationPoint&gt;**](CampaignPlanningBudgetRecommendationPoint.md) | List of point estimations for different budget scenarios. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignPlanningBudgetRecommendation.new(
  budget_recommendation: 5000000,
  experiment_campaign_budget_recommendation: null,
  lifetime_days_recommendation: 30,
  point_estimations: null
)
```

