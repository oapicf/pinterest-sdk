# ItemDeleteDiscontinuedBatchRecord

Object describing an item batch record to discontinue items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **str** | The catalog item id in the merchant namespace | [optional] 

## Example

```python
from openapi_client.models.item_delete_discontinued_batch_record import ItemDeleteDiscontinuedBatchRecord

# TODO update the JSON string below
json = "{}"
# create an instance of ItemDeleteDiscontinuedBatchRecord from a JSON string
item_delete_discontinued_batch_record_instance = ItemDeleteDiscontinuedBatchRecord.from_json(json)
# print the JSON string representation of the object
print ItemDeleteDiscontinuedBatchRecord.to_json()

# convert the object into a dict
item_delete_discontinued_batch_record_dict = item_delete_discontinued_batch_record_instance.to_dict()
# create an instance of ItemDeleteDiscontinuedBatchRecord from a dict
item_delete_discontinued_batch_record_from_dict = ItemDeleteDiscontinuedBatchRecord.from_dict(item_delete_discontinued_batch_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


