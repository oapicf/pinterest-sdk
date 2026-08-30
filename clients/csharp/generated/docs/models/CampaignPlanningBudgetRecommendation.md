# Org.OpenAPITools.Model.CampaignPlanningBudgetRecommendation
Budget recommendation response containing recommended budget, estimated days, and point estimations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BudgetRecommendation** | **int** | The recommended budget amount. | [optional] 
**ExperimentCampaignBudgetRecommendation** | [**List&lt;CampaignPlanningExperimentBudgetRecommendation&gt;**](CampaignPlanningExperimentBudgetRecommendation.md) | List of experimental budget recommendations. | [optional] 
**LifetimeDaysRecommendation** | **int** | Recommended number of days for the campaign lifetime. | [optional] 
**PointEstimations** | [**List&lt;CampaignPlanningBudgetRecommendationPoint&gt;**](CampaignPlanningBudgetRecommendationPoint.md) | List of point estimations for different budget scenarios. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

