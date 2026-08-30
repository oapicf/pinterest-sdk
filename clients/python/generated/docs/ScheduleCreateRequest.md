# ScheduleCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **str** |  | 
**entity_type** | **str** | Entity type | 
**delta_value** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | 
**end_timestamp** | **int** | Schedule end time. Unix timestamp in seconds. | 
**name** | **str** |  | 
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) |  | 
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) |  | 
**schedule_type** | [**ScheduleType**](ScheduleType.md) |  | 
**start_timestamp** | **int** | Schedule start time. Unix timestamp in seconds. | 

## Example

```python
from pinterestsdk.models.schedule_create_request import ScheduleCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleCreateRequest from a JSON string
schedule_create_request_instance = ScheduleCreateRequest.from_json(json)
# print the JSON string representation of the object
print(ScheduleCreateRequest.to_json())

# convert the object into a dict
schedule_create_request_dict = schedule_create_request_instance.to_dict()
# create an instance of ScheduleCreateRequest from a dict
schedule_create_request_from_dict = ScheduleCreateRequest.from_dict(schedule_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


