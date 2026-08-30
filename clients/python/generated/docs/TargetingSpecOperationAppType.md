# TargetingSpecOperationAppType


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** |  | 
**operation** | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  | 
**values** | [**List[TargetingSpecAppType]**](TargetingSpecAppType.md) |  | 

## Example

```python
from pinterestsdk.models.targeting_spec_operation_app_type import TargetingSpecOperationAppType

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationAppType from a JSON string
targeting_spec_operation_app_type_instance = TargetingSpecOperationAppType.from_json(json)
# print the JSON string representation of the object
print(TargetingSpecOperationAppType.to_json())

# convert the object into a dict
targeting_spec_operation_app_type_dict = targeting_spec_operation_app_type_instance.to_dict()
# create an instance of TargetingSpecOperationAppType from a dict
targeting_spec_operation_app_type_from_dict = TargetingSpecOperationAppType.from_dict(targeting_spec_operation_app_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


