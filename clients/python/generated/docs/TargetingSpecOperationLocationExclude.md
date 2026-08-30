# TargetingSpecOperationLocationExclude


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** |  | 
**operation** | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  | 
**values** | **List[str]** |  | 

## Example

```python
from pinterestsdk.models.targeting_spec_operation_location_exclude import TargetingSpecOperationLocationExclude

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationLocationExclude from a JSON string
targeting_spec_operation_location_exclude_instance = TargetingSpecOperationLocationExclude.from_json(json)
# print the JSON string representation of the object
print(TargetingSpecOperationLocationExclude.to_json())

# convert the object into a dict
targeting_spec_operation_location_exclude_dict = targeting_spec_operation_location_exclude_instance.to_dict()
# create an instance of TargetingSpecOperationLocationExclude from a dict
targeting_spec_operation_location_exclude_from_dict = TargetingSpecOperationLocationExclude.from_dict(targeting_spec_operation_location_exclude_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


