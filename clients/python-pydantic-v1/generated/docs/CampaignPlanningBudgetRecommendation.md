# CampaignPlanningBudgetRecommendation

Budget recommendation response containing recommended budget, estimated days, and point estimations.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_recommendation** | **int** | The recommended budget amount. | [optional] 
**experiment_campaign_budget_recommendation** | [**List[CampaignPlanningExperimentBudgetRecommendation]**](CampaignPlanningExperimentBudgetRecommendation.md) | List of experimental budget recommendations. | [optional] 
**lifetime_days_recommendation** | **int** | Recommended number of days for the campaign lifetime. | [optional] 
**point_estimations** | [**List[CampaignPlanningBudgetRecommendationPoint]**](CampaignPlanningBudgetRecommendationPoint.md) | List of point estimations for different budget scenarios. | [optional] 

## Example

```python
from openapi_client.models.campaign_planning_budget_recommendation import CampaignPlanningBudgetRecommendation

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignPlanningBudgetRecommendation from a JSON string
campaign_planning_budget_recommendation_instance = CampaignPlanningBudgetRecommendation.from_json(json)
# print the JSON string representation of the object
print CampaignPlanningBudgetRecommendation.to_json()

# convert the object into a dict
campaign_planning_budget_recommendation_dict = campaign_planning_budget_recommendation_instance.to_dict()
# create an instance of CampaignPlanningBudgetRecommendation from a dict
campaign_planning_budget_recommendation_from_dict = CampaignPlanningBudgetRecommendation.from_dict(campaign_planning_budget_recommendation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


