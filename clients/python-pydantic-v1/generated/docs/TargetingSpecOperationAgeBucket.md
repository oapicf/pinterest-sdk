# TargetingSpecOperationAgeBucket


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** |  | 
**operation** | **str** |  | 
**values** | [**List[TargetingSpecAgeBucket]**](TargetingSpecAgeBucket.md) |  | 

## Example

```python
from openapi_client.models.targeting_spec_operation_age_bucket import TargetingSpecOperationAgeBucket

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationAgeBucket from a JSON string
targeting_spec_operation_age_bucket_instance = TargetingSpecOperationAgeBucket.from_json(json)
# print the JSON string representation of the object
print TargetingSpecOperationAgeBucket.to_json()

# convert the object into a dict
targeting_spec_operation_age_bucket_dict = targeting_spec_operation_age_bucket_instance.to_dict()
# create an instance of TargetingSpecOperationAgeBucket from a dict
targeting_spec_operation_age_bucket_from_dict = TargetingSpecOperationAgeBucket.from_dict(targeting_spec_operation_age_bucket_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


