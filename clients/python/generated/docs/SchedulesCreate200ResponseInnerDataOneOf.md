# SchedulesCreate200ResponseInnerDataOneOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**schedule_id** | **str** | Schedule ID. | 
**exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | 

## Example

```python
from pinterestsdk.models.schedules_create200_response_inner_data_one_of import SchedulesCreate200ResponseInnerDataOneOf

# TODO update the JSON string below
json = "{}"
# create an instance of SchedulesCreate200ResponseInnerDataOneOf from a JSON string
schedules_create200_response_inner_data_one_of_instance = SchedulesCreate200ResponseInnerDataOneOf.from_json(json)
# print the JSON string representation of the object
print(SchedulesCreate200ResponseInnerDataOneOf.to_json())

# convert the object into a dict
schedules_create200_response_inner_data_one_of_dict = schedules_create200_response_inner_data_one_of_instance.to_dict()
# create an instance of SchedulesCreate200ResponseInnerDataOneOf from a dict
schedules_create200_response_inner_data_one_of_from_dict = SchedulesCreate200ResponseInnerDataOneOf.from_dict(schedules_create200_response_inner_data_one_of_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


