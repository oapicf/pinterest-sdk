# CampaignIdFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_ids** | **List[str]** | List of campaign ids | [optional] 

## Example

```python
from pinterestsdk.models.campaign_id_filter import CampaignIdFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignIdFilter from a JSON string
campaign_id_filter_instance = CampaignIdFilter.from_json(json)
# print the JSON string representation of the object
print(CampaignIdFilter.to_json())

# convert the object into a dict
campaign_id_filter_dict = campaign_id_filter_instance.to_dict()
# create an instance of CampaignIdFilter from a dict
campaign_id_filter_from_dict = CampaignIdFilter.from_dict(campaign_id_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


