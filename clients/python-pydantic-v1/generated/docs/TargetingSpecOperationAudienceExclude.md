# TargetingSpecOperationAudienceExclude


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** |  | 
**operation** | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  | 
**values** | **List[str]** |  | 

## Example

```python
from openapi_client.models.targeting_spec_operation_audience_exclude import TargetingSpecOperationAudienceExclude

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationAudienceExclude from a JSON string
targeting_spec_operation_audience_exclude_instance = TargetingSpecOperationAudienceExclude.from_json(json)
# print the JSON string representation of the object
print TargetingSpecOperationAudienceExclude.to_json()

# convert the object into a dict
targeting_spec_operation_audience_exclude_dict = targeting_spec_operation_audience_exclude_instance.to_dict()
# create an instance of TargetingSpecOperationAudienceExclude from a dict
targeting_spec_operation_audience_exclude_from_dict = TargetingSpecOperationAudienceExclude.from_dict(targeting_spec_operation_audience_exclude_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


