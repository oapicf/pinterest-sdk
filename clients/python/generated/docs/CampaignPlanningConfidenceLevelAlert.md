# CampaignPlanningConfidenceLevelAlert

A confidence level alert for the delivery estimates provided in the response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Human-readable context for debugging. Not intended for display to end users. | [optional] 
**reason** | [**CampaignPlanningConfidenceLevelAlertReason**](CampaignPlanningConfidenceLevelAlertReason.md) | Reason for the confidence level alert. | [optional] 
**severity** | [**CampaignPlanningConfidenceLevelAlertSeverity**](CampaignPlanningConfidenceLevelAlertSeverity.md) | Severity of the confidence level alert. | [optional] 

## Example

```python
from pinterestsdk.models.campaign_planning_confidence_level_alert import CampaignPlanningConfidenceLevelAlert

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignPlanningConfidenceLevelAlert from a JSON string
campaign_planning_confidence_level_alert_instance = CampaignPlanningConfidenceLevelAlert.from_json(json)
# print the JSON string representation of the object
print(CampaignPlanningConfidenceLevelAlert.to_json())

# convert the object into a dict
campaign_planning_confidence_level_alert_dict = campaign_planning_confidence_level_alert_instance.to_dict()
# create an instance of CampaignPlanningConfidenceLevelAlert from a dict
campaign_planning_confidence_level_alert_from_dict = CampaignPlanningConfidenceLevelAlert.from_dict(campaign_planning_confidence_level_alert_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


