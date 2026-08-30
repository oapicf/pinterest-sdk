# Schedule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delta_value** | [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] 
**end_timestamp** | **int** | Schedule end time. Unix timestamp in seconds. | [optional] 
**entity_id** | **str** | entity ID. | 
**entity_type** | [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] 
**name** | **str** | Schedule name. | [optional] 
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] 
**schedule_id** | **str** | Schedule ID. | [readonly] 
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] 
**schedule_type** | [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] 
**start_timestamp** | **int** | Schedule start time. Unix timestamp in seconds. | [optional] 

## Example

```python
from pinterestsdk.models.schedule import Schedule

# TODO update the JSON string below
json = "{}"
# create an instance of Schedule from a JSON string
schedule_instance = Schedule.from_json(json)
# print the JSON string representation of the object
print(Schedule.to_json())

# convert the object into a dict
schedule_dict = schedule_instance.to_dict()
# create an instance of Schedule from a dict
schedule_from_dict = Schedule.from_dict(schedule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


