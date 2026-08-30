# SupplementalItemsBatchResponse

Response model for supplemental items batch operation

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
from openapi_client.models.supplemental_items_batch_response import SupplementalItemsBatchResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SupplementalItemsBatchResponse from a JSON string
supplemental_items_batch_response_instance = SupplementalItemsBatchResponse.from_json(json)
# print the JSON string representation of the object
print SupplementalItemsBatchResponse.to_json()

# convert the object into a dict
supplemental_items_batch_response_dict = supplemental_items_batch_response_instance.to_dict()
# create an instance of SupplementalItemsBatchResponse from a dict
supplemental_items_batch_response_from_dict = SupplementalItemsBatchResponse.from_dict(supplemental_items_batch_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


