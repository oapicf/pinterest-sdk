# SchedulePlacementMultipliers

This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**browse** | **float** | Browse (home-feed and related surfaces) | [optional] 
**related_pins** | **float** | Related-Pins placement | [optional] 
**search** | **float** | Search placement | [optional] 

## Example

```python
from pinterestsdk.models.schedule_placement_multipliers import SchedulePlacementMultipliers

# TODO update the JSON string below
json = "{}"
# create an instance of SchedulePlacementMultipliers from a JSON string
schedule_placement_multipliers_instance = SchedulePlacementMultipliers.from_json(json)
# print the JSON string representation of the object
print(SchedulePlacementMultipliers.to_json())

# convert the object into a dict
schedule_placement_multipliers_dict = schedule_placement_multipliers_instance.to_dict()
# create an instance of SchedulePlacementMultipliers from a dict
schedule_placement_multipliers_from_dict = SchedulePlacementMultipliers.from_dict(schedule_placement_multipliers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


