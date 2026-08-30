# ScheduleDeltaValue

The value of the scheduled adjustment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age_bucket_multipliers** | [**BidOptionsAgeBucketMultipliers**](BidOptionsAgeBucketMultipliers.md) |  | [optional] 
**app_type_multipliers** | [**BidOptionsAppTypeMultipliers**](BidOptionsAppTypeMultipliers.md) |  | [optional] 
**audience_multipliers** | [**List[BidOptionsAudienceMultipliers]**](BidOptionsAudienceMultipliers.md) |  | [optional] 
**gender_multipliers** | [**BidOptionsGenderMultipliers**](BidOptionsGenderMultipliers.md) |  | [optional] 
**placement_multipliers** | [**BidOptionsPlacementMultipliers**](BidOptionsPlacementMultipliers.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.schedule_delta_value import ScheduleDeltaValue

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleDeltaValue from a JSON string
schedule_delta_value_instance = ScheduleDeltaValue.from_json(json)
# print the JSON string representation of the object
print(ScheduleDeltaValue.to_json())

# convert the object into a dict
schedule_delta_value_dict = schedule_delta_value_instance.to_dict()
# create an instance of ScheduleDeltaValue from a dict
schedule_delta_value_from_dict = ScheduleDeltaValue.from_dict(schedule_delta_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


