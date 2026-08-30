# ScheduleAppTypeMultipliers

This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_type** | [**TargetingSpecAppType**](TargetingSpecAppType.md) |  | [optional] 

## Example

```python
from openapi_client.models.schedule_app_type_multipliers import ScheduleAppTypeMultipliers

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleAppTypeMultipliers from a JSON string
schedule_app_type_multipliers_instance = ScheduleAppTypeMultipliers.from_json(json)
# print the JSON string representation of the object
print ScheduleAppTypeMultipliers.to_json()

# convert the object into a dict
schedule_app_type_multipliers_dict = schedule_app_type_multipliers_instance.to_dict()
# create an instance of ScheduleAppTypeMultipliers from a dict
schedule_app_type_multipliers_from_dict = ScheduleAppTypeMultipliers.from_dict(schedule_app_type_multipliers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


