# ItemDeleteBatchRecord

Object describing an item batch record to delete items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **str** | The catalog item id in the merchant namespace | [optional] 

## Example

```python
from pinterestsdk.models.item_delete_batch_record import ItemDeleteBatchRecord

# TODO update the JSON string below
json = "{}"
# create an instance of ItemDeleteBatchRecord from a JSON string
item_delete_batch_record_instance = ItemDeleteBatchRecord.from_json(json)
# print the JSON string representation of the object
print(ItemDeleteBatchRecord.to_json())

# convert the object into a dict
item_delete_batch_record_dict = item_delete_batch_record_instance.to_dict()
# create an instance of ItemDeleteBatchRecord from a dict
item_delete_batch_record_from_dict = ItemDeleteBatchRecord.from_dict(item_delete_batch_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


