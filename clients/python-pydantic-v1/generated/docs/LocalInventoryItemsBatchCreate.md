# LocalInventoryItemsBatchCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operations** | [**List[LocalInventoryOperation]**](LocalInventoryOperation.md) | Array of inventory operations. Up to 1000 items per request. | 

## Example

```python
from openapi_client.models.local_inventory_items_batch_create import LocalInventoryItemsBatchCreate

# TODO update the JSON string below
json = "{}"
# create an instance of LocalInventoryItemsBatchCreate from a JSON string
local_inventory_items_batch_create_instance = LocalInventoryItemsBatchCreate.from_json(json)
# print the JSON string representation of the object
print LocalInventoryItemsBatchCreate.to_json()

# convert the object into a dict
local_inventory_items_batch_create_dict = local_inventory_items_batch_create_instance.to_dict()
# create an instance of LocalInventoryItemsBatchCreate from a dict
local_inventory_items_batch_create_from_dict = LocalInventoryItemsBatchCreate.from_dict(local_inventory_items_batch_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


