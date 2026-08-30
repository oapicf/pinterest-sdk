# CampaignPlanningCurveEstimate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**estimation_type** | [**CampaignPlanningEstimationType**](CampaignPlanningEstimationType.md) | Estimation type for campaign planning estimated curve | [optional] 
**points** | [**List[CampaignPlanningPointEstimate]**](CampaignPlanningPointEstimate.md) | The estimation points that make up the estimated curve. | [optional] 

## Example

```python
from openapi_client.models.campaign_planning_curve_estimate import CampaignPlanningCurveEstimate

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignPlanningCurveEstimate from a JSON string
campaign_planning_curve_estimate_instance = CampaignPlanningCurveEstimate.from_json(json)
# print the JSON string representation of the object
print CampaignPlanningCurveEstimate.to_json()

# convert the object into a dict
campaign_planning_curve_estimate_dict = campaign_planning_curve_estimate_instance.to_dict()
# create an instance of CampaignPlanningCurveEstimate from a dict
campaign_planning_curve_estimate_from_dict = CampaignPlanningCurveEstimate.from_dict(campaign_planning_curve_estimate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


