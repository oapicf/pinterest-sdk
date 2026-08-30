# LocalInventoryOperationResult

Result model for local inventory operation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[SupplementalItemValidationEvent]**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**item_id** | **str** | Catalog item id in the merchant namespace | 
**status** | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | 
**store_code** | **str** | Store code for the local inventory item | 
**supplemental_type** | **str** |  | 
**warnings** | [**List[SupplementalItemValidationEvent]**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 

## Example

```python
from openapi_client.models.local_inventory_operation_result import LocalInventoryOperationResult

# TODO update the JSON string below
json = "{}"
# create an instance of LocalInventoryOperationResult from a JSON string
local_inventory_operation_result_instance = LocalInventoryOperationResult.from_json(json)
# print the JSON string representation of the object
print LocalInventoryOperationResult.to_json()

# convert the object into a dict
local_inventory_operation_result_dict = local_inventory_operation_result_instance.to_dict()
# create an instance of LocalInventoryOperationResult from a dict
local_inventory_operation_result_from_dict = LocalInventoryOperationResult.from_dict(local_inventory_operation_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


