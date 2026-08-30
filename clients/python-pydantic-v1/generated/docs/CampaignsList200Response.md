# CampaignsList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Campaign]**](Campaign.md) |  | 

## Example

```python
from openapi_client.models.campaigns_list200_response import CampaignsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignsList200Response from a JSON string
campaigns_list200_response_instance = CampaignsList200Response.from_json(json)
# print the JSON string representation of the object
print CampaignsList200Response.to_json()

# convert the object into a dict
campaigns_list200_response_dict = campaigns_list200_response_instance.to_dict()
# create an instance of CampaignsList200Response from a dict
campaigns_list200_response_from_dict = CampaignsList200Response.from_dict(campaigns_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


