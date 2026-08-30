# TargetingSpecOperationInterest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** |  | 
**operation** | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  | 
**values** | **List[str]** |  | 

## Example

```python
from openapi_client.models.targeting_spec_operation_interest import TargetingSpecOperationInterest

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationInterest from a JSON string
targeting_spec_operation_interest_instance = TargetingSpecOperationInterest.from_json(json)
# print the JSON string representation of the object
print TargetingSpecOperationInterest.to_json()

# convert the object into a dict
targeting_spec_operation_interest_dict = targeting_spec_operation_interest_instance.to_dict()
# create an instance of TargetingSpecOperationInterest from a dict
targeting_spec_operation_interest_from_dict = TargetingSpecOperationInterest.from_dict(targeting_spec_operation_interest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


