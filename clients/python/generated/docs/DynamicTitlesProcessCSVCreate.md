# DynamicTitlesProcessCSVCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The request_id returned from the GET uploads endpoint. | 

## Example

```python
from pinterestsdk.models.dynamic_titles_process_csv_create import DynamicTitlesProcessCSVCreate

# TODO update the JSON string below
json = "{}"
# create an instance of DynamicTitlesProcessCSVCreate from a JSON string
dynamic_titles_process_csv_create_instance = DynamicTitlesProcessCSVCreate.from_json(json)
# print the JSON string representation of the object
print(DynamicTitlesProcessCSVCreate.to_json())

# convert the object into a dict
dynamic_titles_process_csv_create_dict = dynamic_titles_process_csv_create_instance.to_dict()
# create an instance of DynamicTitlesProcessCSVCreate from a dict
dynamic_titles_process_csv_create_from_dict = DynamicTitlesProcessCSVCreate.from_dict(dynamic_titles_process_csv_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


