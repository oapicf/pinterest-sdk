# ScheduleCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delta_value** | [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] 
**end_timestamp** | **int** | Schedule end time. Unix timestamp in seconds. | [optional] 
**entity_id** | **str** | entity ID. | 
**entity_type** | [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] 
**name** | **str** | Schedule name. | [optional] 
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] 
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] 
**schedule_type** | [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] 
**start_timestamp** | **int** | Schedule start time. Unix timestamp in seconds. | [optional] 

## Example

```python
from pinterestsdk.models.schedule_create import ScheduleCreate

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleCreate from a JSON string
schedule_create_instance = ScheduleCreate.from_json(json)
# print the JSON string representation of the object
print(ScheduleCreate.to_json())

# convert the object into a dict
schedule_create_dict = schedule_create_instance.to_dict()
# create an instance of ScheduleCreate from a dict
schedule_create_from_dict = ScheduleCreate.from_dict(schedule_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


