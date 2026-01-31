# CampaignObjectivesFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_objective_types** | [**List[ObjectiveType]**](ObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. | [optional] 

## Example

```python
from pinterestsdk.models.campaign_objectives_filter import CampaignObjectivesFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignObjectivesFilter from a JSON string
campaign_objectives_filter_instance = CampaignObjectivesFilter.from_json(json)
# print the JSON string representation of the object
print(CampaignObjectivesFilter.to_json())

# convert the object into a dict
campaign_objectives_filter_dict = campaign_objectives_filter_instance.to_dict()
# create an instance of CampaignObjectivesFilter from a dict
campaign_objectives_filter_from_dict = CampaignObjectivesFilter.from_dict(campaign_objectives_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


