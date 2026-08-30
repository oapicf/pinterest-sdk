# LocalInventoryItemsGetCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_filters** | [**List[ItemIdStoreCodePair]**](ItemIdStoreCodePair.md) | Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. | 

## Example

```python
from pinterestsdk.models.local_inventory_items_get_create import LocalInventoryItemsGetCreate

# TODO update the JSON string below
json = "{}"
# create an instance of LocalInventoryItemsGetCreate from a JSON string
local_inventory_items_get_create_instance = LocalInventoryItemsGetCreate.from_json(json)
# print the JSON string representation of the object
print(LocalInventoryItemsGetCreate.to_json())

# convert the object into a dict
local_inventory_items_get_create_dict = local_inventory_items_get_create_instance.to_dict()
# create an instance of LocalInventoryItemsGetCreate from a dict
local_inventory_items_get_create_from_dict = LocalInventoryItemsGetCreate.from_dict(local_inventory_items_get_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


