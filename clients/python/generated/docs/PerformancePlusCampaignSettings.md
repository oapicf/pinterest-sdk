# PerformancePlusCampaignSettings

Pinterest Performance+ campaign settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boost_prospecting_ad_group_bid** | **bool** | Whether to boost prospecting ad group bid. | [optional] 
**pinner_list_exclusions** | **List[str]** | List of campaign-level exclusion pinner list IDs. | [optional] 

## Example

```python
from pinterestsdk.models.performance_plus_campaign_settings import PerformancePlusCampaignSettings

# TODO update the JSON string below
json = "{}"
# create an instance of PerformancePlusCampaignSettings from a JSON string
performance_plus_campaign_settings_instance = PerformancePlusCampaignSettings.from_json(json)
# print the JSON string representation of the object
print(PerformancePlusCampaignSettings.to_json())

# convert the object into a dict
performance_plus_campaign_settings_dict = performance_plus_campaign_settings_instance.to_dict()
# create an instance of PerformancePlusCampaignSettings from a dict
performance_plus_campaign_settings_from_dict = PerformancePlusCampaignSettings.from_dict(performance_plus_campaign_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


