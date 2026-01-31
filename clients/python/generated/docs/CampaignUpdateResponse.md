# CampaignUpdateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[CampaignCreateResponseItem]**](CampaignCreateResponseItem.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.campaign_update_response import CampaignUpdateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignUpdateResponse from a JSON string
campaign_update_response_instance = CampaignUpdateResponse.from_json(json)
# print the JSON string representation of the object
print(CampaignUpdateResponse.to_json())

# convert the object into a dict
campaign_update_response_dict = campaign_update_response_instance.to_dict()
# create an instance of CampaignUpdateResponse from a dict
campaign_update_response_from_dict = CampaignUpdateResponse.from_dict(campaign_update_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


