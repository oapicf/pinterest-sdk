# CampaignPlanningConversionRate

Conversion rate estimate for a specific conversion event and attribution window combination.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [**CampaignPlanningConversionAttribution**](CampaignPlanningConversionAttribution.md) |  | 
**conversion_event** | [**CampaignPlanningConversionEvent**](CampaignPlanningConversionEvent.md) |  | 
**conversion_rate** | **float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. | 

## Example

```python
from openapi_client.models.campaign_planning_conversion_rate import CampaignPlanningConversionRate

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignPlanningConversionRate from a JSON string
campaign_planning_conversion_rate_instance = CampaignPlanningConversionRate.from_json(json)
# print the JSON string representation of the object
print CampaignPlanningConversionRate.to_json()

# convert the object into a dict
campaign_planning_conversion_rate_dict = campaign_planning_conversion_rate_instance.to_dict()
# create an instance of CampaignPlanningConversionRate from a dict
campaign_planning_conversion_rate_from_dict = CampaignPlanningConversionRate.from_dict(campaign_planning_conversion_rate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


