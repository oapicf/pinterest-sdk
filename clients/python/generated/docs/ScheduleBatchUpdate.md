# ScheduleBatchUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delta_value** | [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] 
**end_timestamp** | **int** | Schedule end time. Unix timestamp in seconds. | [optional] 
**entity_id** | **str** | entity ID. | [optional] 
**entity_type** | [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] 
**id** | **str** |  | 
**name** | **str** | Schedule name. | [optional] 
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] 
**schedule_id** | **str** | Schedule ID. | 
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] 
**schedule_type** | [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] 
**start_timestamp** | **int** | Schedule start time. Unix timestamp in seconds. | [optional] 

## Example

```python
from pinterestsdk.models.schedule_batch_update import ScheduleBatchUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleBatchUpdate from a JSON string
schedule_batch_update_instance = ScheduleBatchUpdate.from_json(json)
# print the JSON string representation of the object
print(ScheduleBatchUpdate.to_json())

# convert the object into a dict
schedule_batch_update_dict = schedule_batch_update_instance.to_dict()
# create an instance of ScheduleBatchUpdate from a dict
schedule_batch_update_from_dict = ScheduleBatchUpdate.from_dict(schedule_batch_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


