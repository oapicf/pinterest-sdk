# CampaignPlanningExperimentBudgetRecommendation

Experimental budget recommendation for a single experiment version.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_recommendation** | **number** | Recommended budget for this experiment version. | [optional] [default to undefined]
**lifetime_days_recommendation** | **number** | Recommended lifetime days for this experiment. | [optional] [default to undefined]
**point_estimations** | [**Array&lt;CampaignPlanningBudgetRecommendationPoint&gt;**](CampaignPlanningBudgetRecommendationPoint.md) | Point estimations for this experiment version. | [optional] [default to undefined]
**version_id** | **string** | Version identifier for the experiment. | [optional] [default to undefined]

## Example

```typescript
import { CampaignPlanningExperimentBudgetRecommendation } from './api';

const instance: CampaignPlanningExperimentBudgetRecommendation = {
    budget_recommendation,
    lifetime_days_recommendation,
    point_estimations,
    version_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
