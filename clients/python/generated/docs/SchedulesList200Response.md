# SchedulesList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Schedule]**](Schedule.md) |  | 

## Example

```python
from pinterestsdk.models.schedules_list200_response import SchedulesList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of SchedulesList200Response from a JSON string
schedules_list200_response_instance = SchedulesList200Response.from_json(json)
# print the JSON string representation of the object
print(SchedulesList200Response.to_json())

# convert the object into a dict
schedules_list200_response_dict = schedules_list200_response_instance.to_dict()
# create an instance of SchedulesList200Response from a dict
schedules_list200_response_from_dict = SchedulesList200Response.from_dict(schedules_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


