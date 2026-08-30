# CampaignPlanningExperimentBudgetRecommendation

Experimental budget recommendation for a single experiment version.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_recommendation** | **int** | Recommended budget for this experiment version. | [optional] 
**lifetime_days_recommendation** | **int** | Recommended lifetime days for this experiment. | [optional] 
**point_estimations** | [**List[CampaignPlanningBudgetRecommendationPoint]**](CampaignPlanningBudgetRecommendationPoint.md) | Point estimations for this experiment version. | [optional] 
**version_id** | **str** | Version identifier for the experiment. | [optional] 

## Example

```python
from openapi_client.models.campaign_planning_experiment_budget_recommendation import CampaignPlanningExperimentBudgetRecommendation

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignPlanningExperimentBudgetRecommendation from a JSON string
campaign_planning_experiment_budget_recommendation_instance = CampaignPlanningExperimentBudgetRecommendation.from_json(json)
# print the JSON string representation of the object
print CampaignPlanningExperimentBudgetRecommendation.to_json()

# convert the object into a dict
campaign_planning_experiment_budget_recommendation_dict = campaign_planning_experiment_budget_recommendation_instance.to_dict()
# create an instance of CampaignPlanningExperimentBudgetRecommendation from a dict
campaign_planning_experiment_budget_recommendation_from_dict = CampaignPlanningExperimentBudgetRecommendation.from_dict(campaign_planning_experiment_budget_recommendation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


