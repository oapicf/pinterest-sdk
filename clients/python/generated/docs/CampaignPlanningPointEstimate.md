# CampaignPlanningPointEstimate

A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget** | **int** | The budget value of the point. | 
**double_y** | **float** | Y value as a decimal. | 
**max_y** | **int** | The maximum Y value of the point. | 
**min_y** | **int** | The minimum Y value of the point. | 
**y** | **int** | The expected Y value of the point. | 

## Example

```python
from pinterestsdk.models.campaign_planning_point_estimate import CampaignPlanningPointEstimate

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignPlanningPointEstimate from a JSON string
campaign_planning_point_estimate_instance = CampaignPlanningPointEstimate.from_json(json)
# print the JSON string representation of the object
print(CampaignPlanningPointEstimate.to_json())

# convert the object into a dict
campaign_planning_point_estimate_dict = campaign_planning_point_estimate_instance.to_dict()
# create an instance of CampaignPlanningPointEstimate from a dict
campaign_planning_point_estimate_from_dict = CampaignPlanningPointEstimate.from_dict(campaign_planning_point_estimate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


