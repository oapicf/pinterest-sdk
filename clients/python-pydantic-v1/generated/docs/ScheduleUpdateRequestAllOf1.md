# ScheduleUpdateRequestAllOf1


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **str** |  | [optional] 
**entity_type** | **str** | Entity type | [optional] 
**id** | **str** | Schedule ID. | 

## Example

```python
from openapi_client.models.schedule_update_request_all_of1 import ScheduleUpdateRequestAllOf1

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleUpdateRequestAllOf1 from a JSON string
schedule_update_request_all_of1_instance = ScheduleUpdateRequestAllOf1.from_json(json)
# print the JSON string representation of the object
print ScheduleUpdateRequestAllOf1.to_json()

# convert the object into a dict
schedule_update_request_all_of1_dict = schedule_update_request_all_of1_instance.to_dict()
# create an instance of ScheduleUpdateRequestAllOf1 from a dict
schedule_update_request_all_of1_from_dict = ScheduleUpdateRequestAllOf1.from_dict(schedule_update_request_all_of1_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


