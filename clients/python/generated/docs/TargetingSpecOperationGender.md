# TargetingSpecOperationGender


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** |  | 
**operation** | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  | 
**values** | [**List[TargetingSpecGender]**](TargetingSpecGender.md) |  | 

## Example

```python
from pinterestsdk.models.targeting_spec_operation_gender import TargetingSpecOperationGender

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationGender from a JSON string
targeting_spec_operation_gender_instance = TargetingSpecOperationGender.from_json(json)
# print the JSON string representation of the object
print(TargetingSpecOperationGender.to_json())

# convert the object into a dict
targeting_spec_operation_gender_dict = targeting_spec_operation_gender_instance.to_dict()
# create an instance of TargetingSpecOperationGender from a dict
targeting_spec_operation_gender_from_dict = TargetingSpecOperationGender.from_dict(targeting_spec_operation_gender_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


