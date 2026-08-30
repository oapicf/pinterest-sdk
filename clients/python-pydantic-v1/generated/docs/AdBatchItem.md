# AdBatchItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**Ad**](Ad.md) |  | [optional] 
**exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | [optional] 

## Example

```python
from openapi_client.models.ad_batch_item import AdBatchItem

# TODO update the JSON string below
json = "{}"
# create an instance of AdBatchItem from a JSON string
ad_batch_item_instance = AdBatchItem.from_json(json)
# print the JSON string representation of the object
print AdBatchItem.to_json()

# convert the object into a dict
ad_batch_item_dict = ad_batch_item_instance.to_dict()
# create an instance of AdBatchItem from a dict
ad_batch_item_from_dict = AdBatchItem.from_dict(ad_batch_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


