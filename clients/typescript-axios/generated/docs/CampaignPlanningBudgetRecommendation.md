# CampaignPlanningBudgetRecommendation

Budget recommendation response containing recommended budget, estimated days, and point estimations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_recommendation** | **number** | The recommended budget amount. | [optional] [default to undefined]
**experiment_campaign_budget_recommendation** | [**Array&lt;CampaignPlanningExperimentBudgetRecommendation&gt;**](CampaignPlanningExperimentBudgetRecommendation.md) | List of experimental budget recommendations. | [optional] [default to undefined]
**lifetime_days_recommendation** | **number** | Recommended number of days for the campaign lifetime. | [optional] [default to undefined]
**point_estimations** | [**Array&lt;CampaignPlanningBudgetRecommendationPoint&gt;**](CampaignPlanningBudgetRecommendationPoint.md) | List of point estimations for different budget scenarios. | [optional] [default to undefined]

## Example

```typescript
import { CampaignPlanningBudgetRecommendation } from './api';

const instance: CampaignPlanningBudgetRecommendation = {
    budget_recommendation,
    experiment_campaign_budget_recommendation,
    lifetime_days_recommendation,
    point_estimations,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
