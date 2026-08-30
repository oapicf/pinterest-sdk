# TargetingSpecOperationLocation


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** |  | 
**operation** | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  | 
**values** | **List[str]** |  | 

## Example

```python
from openapi_client.models.targeting_spec_operation_location import TargetingSpecOperationLocation

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationLocation from a JSON string
targeting_spec_operation_location_instance = TargetingSpecOperationLocation.from_json(json)
# print the JSON string representation of the object
print TargetingSpecOperationLocation.to_json()

# convert the object into a dict
targeting_spec_operation_location_dict = targeting_spec_operation_location_instance.to_dict()
# create an instance of TargetingSpecOperationLocation from a dict
targeting_spec_operation_location_from_dict = TargetingSpecOperationLocation.from_dict(targeting_spec_operation_location_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


