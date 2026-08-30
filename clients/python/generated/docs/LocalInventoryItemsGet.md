# LocalInventoryItemsGet

Model for getting local inventory items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[LocalInventoryItemResponse]**](LocalInventoryItemResponse.md) | Array of local inventory items | [readonly] 

## Example

```python
from pinterestsdk.models.local_inventory_items_get import LocalInventoryItemsGet

# TODO update the JSON string below
json = "{}"
# create an instance of LocalInventoryItemsGet from a JSON string
local_inventory_items_get_instance = LocalInventoryItemsGet.from_json(json)
# print the JSON string representation of the object
print(LocalInventoryItemsGet.to_json())

# convert the object into a dict
local_inventory_items_get_dict = local_inventory_items_get_instance.to_dict()
# create an instance of LocalInventoryItemsGet from a dict
local_inventory_items_get_from_dict = LocalInventoryItemsGet.from_dict(local_inventory_items_get_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


