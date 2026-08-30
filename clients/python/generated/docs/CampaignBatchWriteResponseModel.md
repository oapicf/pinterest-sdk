# CampaignBatchWriteResponseModel

Response model for batch campaign write operations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[CampaignBatchItem]**](CampaignBatchItem.md) |  | 

## Example

```python
from pinterestsdk.models.campaign_batch_write_response_model import CampaignBatchWriteResponseModel

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignBatchWriteResponseModel from a JSON string
campaign_batch_write_response_model_instance = CampaignBatchWriteResponseModel.from_json(json)
# print the JSON string representation of the object
print(CampaignBatchWriteResponseModel.to_json())

# convert the object into a dict
campaign_batch_write_response_model_dict = campaign_batch_write_response_model_instance.to_dict()
# create an instance of CampaignBatchWriteResponseModel from a dict
campaign_batch_write_response_model_from_dict = CampaignBatchWriteResponseModel.from_dict(campaign_batch_write_response_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


