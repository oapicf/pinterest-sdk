# SupplementalOperationResult

Result of a supplemental item operation, discriminated by supplemental_type

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
from pinterestsdk.models.supplemental_operation_result import SupplementalOperationResult

# TODO update the JSON string below
json = "{}"
# create an instance of SupplementalOperationResult from a JSON string
supplemental_operation_result_instance = SupplementalOperationResult.from_json(json)
# print the JSON string representation of the object
print(SupplementalOperationResult.to_json())

# convert the object into a dict
supplemental_operation_result_dict = supplemental_operation_result_instance.to_dict()
# create an instance of SupplementalOperationResult from a dict
supplemental_operation_result_from_dict = SupplementalOperationResult.from_dict(supplemental_operation_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


