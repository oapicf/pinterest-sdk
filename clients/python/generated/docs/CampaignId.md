# CampaignId


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Campaign ID. | [optional] 

## Example

```python
from pinterestsdk.models.campaign_id import CampaignId

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignId from a JSON string
campaign_id_instance = CampaignId.from_json(json)
# print the JSON string representation of the object
print(CampaignId.to_json())

# convert the object into a dict
campaign_id_dict = campaign_id_instance.to_dict()
# create an instance of CampaignId from a dict
campaign_id_from_dict = CampaignId.from_dict(campaign_id_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


