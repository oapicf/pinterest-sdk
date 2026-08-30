# FrequencyGoalMetadata

Frequency target can only be between 2 and 20

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **int** |  | [optional] 
**timerange** | [**FrequencyGoalMetadataTimerange**](FrequencyGoalMetadataTimerange.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.frequency_goal_metadata import FrequencyGoalMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of FrequencyGoalMetadata from a JSON string
frequency_goal_metadata_instance = FrequencyGoalMetadata.from_json(json)
# print the JSON string representation of the object
print(FrequencyGoalMetadata.to_json())

# convert the object into a dict
frequency_goal_metadata_dict = frequency_goal_metadata_instance.to_dict()
# create an instance of FrequencyGoalMetadata from a dict
frequency_goal_metadata_from_dict = FrequencyGoalMetadata.from_dict(frequency_goal_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


