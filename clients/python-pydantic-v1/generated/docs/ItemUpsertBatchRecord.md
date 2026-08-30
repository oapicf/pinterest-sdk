# ItemUpsertBatchRecord

Object describing an item batch record to upsert items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [optional] 
**item_id** | **str** | The catalog item id in the merchant namespace | [optional] 

## Example

```python
from openapi_client.models.item_upsert_batch_record import ItemUpsertBatchRecord

# TODO update the JSON string below
json = "{}"
# create an instance of ItemUpsertBatchRecord from a JSON string
item_upsert_batch_record_instance = ItemUpsertBatchRecord.from_json(json)
# print the JSON string representation of the object
print ItemUpsertBatchRecord.to_json()

# convert the object into a dict
item_upsert_batch_record_dict = item_upsert_batch_record_instance.to_dict()
# create an instance of ItemUpsertBatchRecord from a dict
item_upsert_batch_record_from_dict = ItemUpsertBatchRecord.from_dict(item_upsert_batch_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


