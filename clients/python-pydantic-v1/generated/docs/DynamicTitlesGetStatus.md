# DynamicTitlesGetStatus


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generated_count** | **int** | The count of generated titles. | [optional] 
**is_ready** | **bool** | Whether dynamic titles have been generated and are ready to be reviewed for the ad group. | [optional] 
**reviewed_count** | **int** | The count of advertiser reviewed titles. | [optional] 

## Example

```python
from openapi_client.models.dynamic_titles_get_status import DynamicTitlesGetStatus

# TODO update the JSON string below
json = "{}"
# create an instance of DynamicTitlesGetStatus from a JSON string
dynamic_titles_get_status_instance = DynamicTitlesGetStatus.from_json(json)
# print the JSON string representation of the object
print DynamicTitlesGetStatus.to_json()

# convert the object into a dict
dynamic_titles_get_status_dict = dynamic_titles_get_status_instance.to_dict()
# create an instance of DynamicTitlesGetStatus from a dict
dynamic_titles_get_status_from_dict = DynamicTitlesGetStatus.from_dict(dynamic_titles_get_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


