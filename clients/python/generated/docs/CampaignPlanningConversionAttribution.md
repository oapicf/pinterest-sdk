# CampaignPlanningConversionAttribution

Attribution windows for a conversion event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**click_window_days** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] 
**engagement_window_days** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. | [optional] 
**view_window_days** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] 

## Example

```python
from pinterestsdk.models.campaign_planning_conversion_attribution import CampaignPlanningConversionAttribution

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignPlanningConversionAttribution from a JSON string
campaign_planning_conversion_attribution_instance = CampaignPlanningConversionAttribution.from_json(json)
# print the JSON string representation of the object
print(CampaignPlanningConversionAttribution.to_json())

# convert the object into a dict
campaign_planning_conversion_attribution_dict = campaign_planning_conversion_attribution_instance.to_dict()
# create an instance of CampaignPlanningConversionAttribution from a dict
campaign_planning_conversion_attribution_from_dict = CampaignPlanningConversionAttribution.from_dict(campaign_planning_conversion_attribution_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


