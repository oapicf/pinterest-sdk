# DynamicTitlesProcessCSVError


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_type** | **str** | The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. | [optional] 
**row_number** | **int** | The row number with a validation error. -1 indicates a file-level error. | [optional] 

## Example

```python
from openapi_client.models.dynamic_titles_process_csv_error import DynamicTitlesProcessCSVError

# TODO update the JSON string below
json = "{}"
# create an instance of DynamicTitlesProcessCSVError from a JSON string
dynamic_titles_process_csv_error_instance = DynamicTitlesProcessCSVError.from_json(json)
# print the JSON string representation of the object
print DynamicTitlesProcessCSVError.to_json()

# convert the object into a dict
dynamic_titles_process_csv_error_dict = dynamic_titles_process_csv_error_instance.to_dict()
# create an instance of DynamicTitlesProcessCSVError from a dict
dynamic_titles_process_csv_error_from_dict = DynamicTitlesProcessCSVError.from_dict(dynamic_titles_process_csv_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


