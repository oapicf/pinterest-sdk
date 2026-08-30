# AdBatchWriteResponseModel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[AdBatchItem]**](AdBatchItem.md) |  | 

## Example

```python
from pinterestsdk.models.ad_batch_write_response_model import AdBatchWriteResponseModel

# TODO update the JSON string below
json = "{}"
# create an instance of AdBatchWriteResponseModel from a JSON string
ad_batch_write_response_model_instance = AdBatchWriteResponseModel.from_json(json)
# print the JSON string representation of the object
print(AdBatchWriteResponseModel.to_json())

# convert the object into a dict
ad_batch_write_response_model_dict = ad_batch_write_response_model_instance.to_dict()
# create an instance of AdBatchWriteResponseModel from a dict
ad_batch_write_response_model_from_dict = AdBatchWriteResponseModel.from_dict(ad_batch_write_response_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


