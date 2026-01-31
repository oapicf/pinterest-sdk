# TargetingSpecOperationList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** |  | 
**operation** | **str** |  | 
**values** | **List[str]** |  | 

## Example

```python
from pinterestsdk.models.targeting_spec_operation_list import TargetingSpecOperationList

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationList from a JSON string
targeting_spec_operation_list_instance = TargetingSpecOperationList.from_json(json)
# print the JSON string representation of the object
print(TargetingSpecOperationList.to_json())

# convert the object into a dict
targeting_spec_operation_list_dict = targeting_spec_operation_list_instance.to_dict()
# create an instance of TargetingSpecOperationList from a dict
targeting_spec_operation_list_from_dict = TargetingSpecOperationList.from_dict(targeting_spec_operation_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


