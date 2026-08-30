# LocalInventoryUpsertOperation

Upsert operation for local inventory item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**RetailLocalInventoryItemAttributes**](RetailLocalInventoryItemAttributes.md) |  | 
**item_id** | **str** | Catalog item id in the merchant namespace | 
**operation** | **str** |  | 
**store_code** | **str** | Store code for the local inventory item | 

## Example

```python
from pinterestsdk.models.local_inventory_upsert_operation import LocalInventoryUpsertOperation

# TODO update the JSON string below
json = "{}"
# create an instance of LocalInventoryUpsertOperation from a JSON string
local_inventory_upsert_operation_instance = LocalInventoryUpsertOperation.from_json(json)
# print the JSON string representation of the object
print(LocalInventoryUpsertOperation.to_json())

# convert the object into a dict
local_inventory_upsert_operation_dict = local_inventory_upsert_operation_instance.to_dict()
# create an instance of LocalInventoryUpsertOperation from a dict
local_inventory_upsert_operation_from_dict = LocalInventoryUpsertOperation.from_dict(local_inventory_upsert_operation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


