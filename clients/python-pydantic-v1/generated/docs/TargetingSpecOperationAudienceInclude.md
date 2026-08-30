# TargetingSpecOperationAudienceInclude


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** |  | 
**operation** | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  | 
**values** | **List[str]** |  | 

## Example

```python
from openapi_client.models.targeting_spec_operation_audience_include import TargetingSpecOperationAudienceInclude

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationAudienceInclude from a JSON string
targeting_spec_operation_audience_include_instance = TargetingSpecOperationAudienceInclude.from_json(json)
# print the JSON string representation of the object
print TargetingSpecOperationAudienceInclude.to_json()

# convert the object into a dict
targeting_spec_operation_audience_include_dict = targeting_spec_operation_audience_include_instance.to_dict()
# create an instance of TargetingSpecOperationAudienceInclude from a dict
targeting_spec_operation_audience_include_from_dict = TargetingSpecOperationAudienceInclude.from_dict(targeting_spec_operation_audience_include_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


