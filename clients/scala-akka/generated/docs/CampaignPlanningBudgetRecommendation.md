

# CampaignPlanningBudgetRecommendation

Budget recommendation response containing recommended budget, estimated days, and point estimations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budgetRecommendation** | **Int** | The recommended budget amount. |  [optional]
**experimentCampaignBudgetRecommendation** | [**Seq&lt;CampaignPlanningExperimentBudgetRecommendation&gt;**](CampaignPlanningExperimentBudgetRecommendation.md) | List of experimental budget recommendations. |  [optional]
**lifetimeDaysRecommendation** | **Int** | Recommended number of days for the campaign lifetime. |  [optional]
**pointEstimations** | [**Seq&lt;CampaignPlanningBudgetRecommendationPoint&gt;**](CampaignPlanningBudgetRecommendationPoint.md) | List of point estimations for different budget scenarios. |  [optional]



