# LocalInventoryItemsBatch

Unified model for local inventory items batch operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **str** | Id of the batch operation | [readonly] 
**completed_time** | **datetime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**created_time** | **datetime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly] 
**operation_results** | [**List[SupplementalOperationResult]**](SupplementalOperationResult.md) | Array of operation results | [readonly] 
**status** | [**SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] 

## Example

```python
from pinterestsdk.models.local_inventory_items_batch import LocalInventoryItemsBatch

# TODO update the JSON string below
json = "{}"
# create an instance of LocalInventoryItemsBatch from a JSON string
local_inventory_items_batch_instance = LocalInventoryItemsBatch.from_json(json)
# print the JSON string representation of the object
print(LocalInventoryItemsBatch.to_json())

# convert the object into a dict
local_inventory_items_batch_dict = local_inventory_items_batch_instance.to_dict()
# create an instance of LocalInventoryItemsBatch from a dict
local_inventory_items_batch_from_dict = LocalInventoryItemsBatch.from_dict(local_inventory_items_batch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


