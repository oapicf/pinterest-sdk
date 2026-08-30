# CampaignBatchItem

Item in a batch campaign response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**CampaignBatchResponseData**](CampaignBatchResponseData.md) | Campaign data on success. | [optional] 
**exceptions** | [**List[Exception]**](Exception.md) | Exceptions on failure. | [optional] 

## Example

```python
from pinterestsdk.models.campaign_batch_item import CampaignBatchItem

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignBatchItem from a JSON string
campaign_batch_item_instance = CampaignBatchItem.from_json(json)
# print the JSON string representation of the object
print(CampaignBatchItem.to_json())

# convert the object into a dict
campaign_batch_item_dict = campaign_batch_item_instance.to_dict()
# create an instance of CampaignBatchItem from a dict
campaign_batch_item_from_dict = CampaignBatchItem.from_dict(campaign_batch_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


