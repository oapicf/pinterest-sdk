# TargetingSpecOperationGeo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** |  | 
**operation** | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  | 
**values** | **List[str]** |  | 

## Example

```python
from pinterestsdk.models.targeting_spec_operation_geo import TargetingSpecOperationGeo

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationGeo from a JSON string
targeting_spec_operation_geo_instance = TargetingSpecOperationGeo.from_json(json)
# print the JSON string representation of the object
print(TargetingSpecOperationGeo.to_json())

# convert the object into a dict
targeting_spec_operation_geo_dict = targeting_spec_operation_geo_instance.to_dict()
# create an instance of TargetingSpecOperationGeo from a dict
targeting_spec_operation_geo_from_dict = TargetingSpecOperationGeo.from_dict(targeting_spec_operation_geo_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


