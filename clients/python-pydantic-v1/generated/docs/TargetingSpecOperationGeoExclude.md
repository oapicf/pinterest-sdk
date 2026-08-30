# TargetingSpecOperationGeoExclude


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** |  | 
**operation** | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  | 
**values** | **List[str]** |  | 

## Example

```python
from openapi_client.models.targeting_spec_operation_geo_exclude import TargetingSpecOperationGeoExclude

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationGeoExclude from a JSON string
targeting_spec_operation_geo_exclude_instance = TargetingSpecOperationGeoExclude.from_json(json)
# print the JSON string representation of the object
print TargetingSpecOperationGeoExclude.to_json()

# convert the object into a dict
targeting_spec_operation_geo_exclude_dict = targeting_spec_operation_geo_exclude_instance.to_dict()
# create an instance of TargetingSpecOperationGeoExclude from a dict
targeting_spec_operation_geo_exclude_from_dict = TargetingSpecOperationGeoExclude.from_dict(targeting_spec_operation_geo_exclude_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


