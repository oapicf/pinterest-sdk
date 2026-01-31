# ItemCreateBatchRecord

Object describing an item batch record to create items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [optional] 
**item_id** | **str** | The catalog item id in the merchant namespace | [optional] 

## Example

```python
from pinterestsdk.models.item_create_batch_record import ItemCreateBatchRecord

# TODO update the JSON string below
json = "{}"
# create an instance of ItemCreateBatchRecord from a JSON string
item_create_batch_record_instance = ItemCreateBatchRecord.from_json(json)
# print the JSON string representation of the object
print(ItemCreateBatchRecord.to_json())

# convert the object into a dict
item_create_batch_record_dict = item_create_batch_record_instance.to_dict()
# create an instance of ItemCreateBatchRecord from a dict
item_create_batch_record_from_dict = ItemCreateBatchRecord.from_dict(item_create_batch_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


