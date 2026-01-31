# CampaignCreateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[CampaignCreateResponseItem]**](CampaignCreateResponseItem.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.campaign_create_response import CampaignCreateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignCreateResponse from a JSON string
campaign_create_response_instance = CampaignCreateResponse.from_json(json)
# print the JSON string representation of the object
print(CampaignCreateResponse.to_json())

# convert the object into a dict
campaign_create_response_dict = campaign_create_response_instance.to_dict()
# create an instance of CampaignCreateResponse from a dict
campaign_create_response_from_dict = CampaignCreateResponse.from_dict(campaign_create_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


