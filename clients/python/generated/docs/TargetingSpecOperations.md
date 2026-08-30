# TargetingSpecOperations


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** |  | 
**operation** | **str** |  | 
**values** | [**List[TargetingSpecShoppingRetargeting]**](TargetingSpecShoppingRetargeting.md) |  | 
**value** | **str** |  | 

## Example

```python
from pinterestsdk.models.targeting_spec_operations import TargetingSpecOperations

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperations from a JSON string
targeting_spec_operations_instance = TargetingSpecOperations.from_json(json)
# print the JSON string representation of the object
print(TargetingSpecOperations.to_json())

# convert the object into a dict
targeting_spec_operations_dict = targeting_spec_operations_instance.to_dict()
# create an instance of TargetingSpecOperations from a dict
targeting_spec_operations_from_dict = TargetingSpecOperations.from_dict(targeting_spec_operations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


