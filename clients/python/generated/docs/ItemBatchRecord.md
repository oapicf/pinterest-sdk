# ItemBatchRecord

Object describing an item batch record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [optional] 
**item_id** | **str** | The catalog item id in the merchant namespace | [optional] 
**update_mask** | [**List[UpdateMaskFieldType]**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 

## Example

```python
from pinterestsdk.models.item_batch_record import ItemBatchRecord

# TODO update the JSON string below
json = "{}"
# create an instance of ItemBatchRecord from a JSON string
item_batch_record_instance = ItemBatchRecord.from_json(json)
# print the JSON string representation of the object
print(ItemBatchRecord.to_json())

# convert the object into a dict
item_batch_record_dict = item_batch_record_instance.to_dict()
# create an instance of ItemBatchRecord from a dict
item_batch_record_from_dict = ItemBatchRecord.from_dict(item_batch_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


