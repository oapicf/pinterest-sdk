# NullableOptimizationGoalMetadata


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversion_tag_v3_goal_metadata** | [**ConversionTagV3GoalMetadata**](ConversionTagV3GoalMetadata.md) |  | [optional] 
**frequency_goal_metadata** | [**FrequencyGoalMetadata**](FrequencyGoalMetadata.md) |  | [optional] 
**scrollup_goal_metadata** | [**ScrollupGoalMetadata**](ScrollupGoalMetadata.md) |  | [optional] 

## Example

```python
from openapi_client.models.nullable_optimization_goal_metadata import NullableOptimizationGoalMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of NullableOptimizationGoalMetadata from a JSON string
nullable_optimization_goal_metadata_instance = NullableOptimizationGoalMetadata.from_json(json)
# print the JSON string representation of the object
print NullableOptimizationGoalMetadata.to_json()

# convert the object into a dict
nullable_optimization_goal_metadata_dict = nullable_optimization_goal_metadata_instance.to_dict()
# create an instance of NullableOptimizationGoalMetadata from a dict
nullable_optimization_goal_metadata_from_dict = NullableOptimizationGoalMetadata.from_dict(nullable_optimization_goal_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


