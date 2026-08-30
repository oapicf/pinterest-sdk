# CampaignPlanningBudgetRecommendationPoint

A point estimation containing the estimate data and estimation type for a budget recommendation.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**estimation_type** | [**CampaignPlanningEstimationType**](CampaignPlanningEstimationType.md) | Estimation type for this point. | [optional] 
**point_estimate** | [**CampaignPlanningPointEstimate**](CampaignPlanningPointEstimate.md) | Point estimate data. | [optional] 

## Example

```python
from openapi_client.models.campaign_planning_budget_recommendation_point import CampaignPlanningBudgetRecommendationPoint

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignPlanningBudgetRecommendationPoint from a JSON string
campaign_planning_budget_recommendation_point_instance = CampaignPlanningBudgetRecommendationPoint.from_json(json)
# print the JSON string representation of the object
print CampaignPlanningBudgetRecommendationPoint.to_json()

# convert the object into a dict
campaign_planning_budget_recommendation_point_dict = campaign_planning_budget_recommendation_point_instance.to_dict()
# create an instance of CampaignPlanningBudgetRecommendationPoint from a dict
campaign_planning_budget_recommendation_point_from_dict = CampaignPlanningBudgetRecommendationPoint.from_dict(campaign_planning_budget_recommendation_point_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


