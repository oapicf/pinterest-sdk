# ScheduleUpdateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **str** |  | [optional] 
**entity_type** | **str** | Entity type | [optional] 
**id** | **str** | Schedule ID. | 
**delta_value** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | [optional] 
**end_timestamp** | **int** | Schedule end time. Unix timestamp in seconds. | [optional] 
**name** | **str** |  | [optional] 
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) |  | [optional] 
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) |  | [optional] 
**schedule_type** | [**ScheduleType**](ScheduleType.md) |  | [optional] 
**start_timestamp** | **int** | Schedule start time. Unix timestamp in seconds. | [optional] 

## Example

```python
from openapi_client.models.schedule_update_request import ScheduleUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleUpdateRequest from a JSON string
schedule_update_request_instance = ScheduleUpdateRequest.from_json(json)
# print the JSON string representation of the object
print ScheduleUpdateRequest.to_json()

# convert the object into a dict
schedule_update_request_dict = schedule_update_request_instance.to_dict()
# create an instance of ScheduleUpdateRequest from a dict
schedule_update_request_from_dict = ScheduleUpdateRequest.from_dict(schedule_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


