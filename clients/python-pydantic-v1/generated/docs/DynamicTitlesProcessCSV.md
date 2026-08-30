# DynamicTitlesProcessCSV


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[DynamicTitlesProcessCSVError]**](DynamicTitlesProcessCSVError.md) | List of validation errors. Empty on success. | [optional] [readonly] 
**status** | **str** | Processing status. Present on success. | [optional] [readonly] 

## Example

```python
from openapi_client.models.dynamic_titles_process_csv import DynamicTitlesProcessCSV

# TODO update the JSON string below
json = "{}"
# create an instance of DynamicTitlesProcessCSV from a JSON string
dynamic_titles_process_csv_instance = DynamicTitlesProcessCSV.from_json(json)
# print the JSON string representation of the object
print DynamicTitlesProcessCSV.to_json()

# convert the object into a dict
dynamic_titles_process_csv_dict = dynamic_titles_process_csv_instance.to_dict()
# create an instance of DynamicTitlesProcessCSV from a dict
dynamic_titles_process_csv_from_dict = DynamicTitlesProcessCSV.from_dict(dynamic_titles_process_csv_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


