# SchedulesCreate200ResponseInnerData

Created/updated resource on success or error details on failure

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delta_value** | [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] 
**end_timestamp** | **int** | Schedule end time. Unix timestamp in seconds. | [optional] 
**entity_id** | **str** | entity ID. | 
**entity_type** | [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] 
**name** | **str** | Schedule name. | [optional] 
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] 
**schedule_id** | **str** | Schedule ID. | 
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] 
**schedule_type** | [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] 
**start_timestamp** | **int** | Schedule start time. Unix timestamp in seconds. | [optional] 
**id** | **str** |  | 
**exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | 

## Example

```python
from openapi_client.models.schedules_create200_response_inner_data import SchedulesCreate200ResponseInnerData

# TODO update the JSON string below
json = "{}"
# create an instance of SchedulesCreate200ResponseInnerData from a JSON string
schedules_create200_response_inner_data_instance = SchedulesCreate200ResponseInnerData.from_json(json)
# print the JSON string representation of the object
print SchedulesCreate200ResponseInnerData.to_json()

# convert the object into a dict
schedules_create200_response_inner_data_dict = schedules_create200_response_inner_data_instance.to_dict()
# create an instance of SchedulesCreate200ResponseInnerData from a dict
schedules_create200_response_inner_data_from_dict = SchedulesCreate200ResponseInnerData.from_dict(schedules_create200_response_inner_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


