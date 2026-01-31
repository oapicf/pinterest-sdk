# TargetingSpecOperationString


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** |  | 
**operation** | **str** |  | 
**value** | **str** |  | 

## Example

```python
from pinterestsdk.models.targeting_spec_operation_string import TargetingSpecOperationString

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationString from a JSON string
targeting_spec_operation_string_instance = TargetingSpecOperationString.from_json(json)
# print the JSON string representation of the object
print(TargetingSpecOperationString.to_json())

# convert the object into a dict
targeting_spec_operation_string_dict = targeting_spec_operation_string_instance.to_dict()
# create an instance of TargetingSpecOperationString from a dict
targeting_spec_operation_string_from_dict = TargetingSpecOperationString.from_dict(targeting_spec_operation_string_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


