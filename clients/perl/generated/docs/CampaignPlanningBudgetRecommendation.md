# WWW::OpenAPIClient::Object::CampaignPlanningBudgetRecommendation

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CampaignPlanningBudgetRecommendation;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_recommendation** | **int** | The recommended budget amount. | [optional] 
**experiment_campaign_budget_recommendation** | [**ARRAY[CampaignPlanningExperimentBudgetRecommendation]**](CampaignPlanningExperimentBudgetRecommendation.md) | List of experimental budget recommendations. | [optional] 
**lifetime_days_recommendation** | **int** | Recommended number of days for the campaign lifetime. | [optional] 
**point_estimations** | [**ARRAY[CampaignPlanningBudgetRecommendationPoint]**](CampaignPlanningBudgetRecommendationPoint.md) | List of point estimations for different budget scenarios. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


