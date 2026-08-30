# ScheduleCommonDeltaValue


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age_bucket_multipliers** | [**ScheduleAgeBucketMultipliers**](ScheduleAgeBucketMultipliers.md) |  | [optional] 
**app_type_multipliers** | [**ScheduleAppTypeMultipliers**](ScheduleAppTypeMultipliers.md) |  | [optional] 
**audience_multipliers** | [**ScheduleAudienceMultipliers**](ScheduleAudienceMultipliers.md) |  | [optional] 
**gender_multipliers** | [**ScheduleBidOptionsGenderMultipliers**](ScheduleBidOptionsGenderMultipliers.md) |  | [optional] 
**placement_multipliers** | [**ScheduleBidOptionsPlacementMultipliers**](ScheduleBidOptionsPlacementMultipliers.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.schedule_common_delta_value import ScheduleCommonDeltaValue

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleCommonDeltaValue from a JSON string
schedule_common_delta_value_instance = ScheduleCommonDeltaValue.from_json(json)
# print the JSON string representation of the object
print(ScheduleCommonDeltaValue.to_json())

# convert the object into a dict
schedule_common_delta_value_dict = schedule_common_delta_value_instance.to_dict()
# create an instance of ScheduleCommonDeltaValue from a dict
schedule_common_delta_value_from_dict = ScheduleCommonDeltaValue.from_dict(schedule_common_delta_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


