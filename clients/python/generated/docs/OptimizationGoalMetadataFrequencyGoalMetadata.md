# OptimizationGoalMetadataFrequencyGoalMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **int** | Frequency target can only be between 2 and 20 | [optional] 
**timerange** | **str** | User entity counts time range | [optional] 

## Example

```python
from pinterestsdk.models.optimization_goal_metadata_frequency_goal_metadata import OptimizationGoalMetadataFrequencyGoalMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of OptimizationGoalMetadataFrequencyGoalMetadata from a JSON string
optimization_goal_metadata_frequency_goal_metadata_instance = OptimizationGoalMetadataFrequencyGoalMetadata.from_json(json)
# print the JSON string representation of the object
print(OptimizationGoalMetadataFrequencyGoalMetadata.to_json())

# convert the object into a dict
optimization_goal_metadata_frequency_goal_metadata_dict = optimization_goal_metadata_frequency_goal_metadata_instance.to_dict()
# create an instance of OptimizationGoalMetadataFrequencyGoalMetadata from a dict
optimization_goal_metadata_frequency_goal_metadata_from_dict = OptimizationGoalMetadataFrequencyGoalMetadata.from_dict(optimization_goal_metadata_frequency_goal_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


