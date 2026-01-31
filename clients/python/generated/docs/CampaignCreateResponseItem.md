# CampaignCreateResponseItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**CampaignCreateResponseData**](CampaignCreateResponseData.md) |  | [optional] 
**exceptions** | [**List[Exception]**](Exception.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.campaign_create_response_item import CampaignCreateResponseItem

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignCreateResponseItem from a JSON string
campaign_create_response_item_instance = CampaignCreateResponseItem.from_json(json)
# print the JSON string representation of the object
print(CampaignCreateResponseItem.to_json())

# convert the object into a dict
campaign_create_response_item_dict = campaign_create_response_item_instance.to_dict()
# create an instance of CampaignCreateResponseItem from a dict
campaign_create_response_item_from_dict = CampaignCreateResponseItem.from_dict(campaign_create_response_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


