# ScheduleBidOptions

Object describing the schedule level bid level changes.

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
from pinterestsdk.models.schedule_bid_options import ScheduleBidOptions

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleBidOptions from a JSON string
schedule_bid_options_instance = ScheduleBidOptions.from_json(json)
# print the JSON string representation of the object
print(ScheduleBidOptions.to_json())

# convert the object into a dict
schedule_bid_options_dict = schedule_bid_options_instance.to_dict()
# create an instance of ScheduleBidOptions from a dict
schedule_bid_options_from_dict = ScheduleBidOptions.from_dict(schedule_bid_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


