# openapi::CampaignPlanningBudgetRecommendation

Budget recommendation response containing recommended budget, estimated days, and point estimations.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_recommendation** | **integer** | The recommended budget amount. | [optional] 
**experiment_campaign_budget_recommendation** | [**array[CampaignPlanningExperimentBudgetRecommendation]**](CampaignPlanningExperimentBudgetRecommendation.md) | List of experimental budget recommendations. | [optional] 
**lifetime_days_recommendation** | **integer** | Recommended number of days for the campaign lifetime. | [optional] 
**point_estimations** | [**array[CampaignPlanningBudgetRecommendationPoint]**](CampaignPlanningBudgetRecommendationPoint.md) | List of point estimations for different budget scenarios. | [optional] 


