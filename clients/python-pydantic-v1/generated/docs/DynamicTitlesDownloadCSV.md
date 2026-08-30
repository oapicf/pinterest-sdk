# DynamicTitlesDownloadCSV


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**download_url** | **str** | Pre-signed S3 URL to download the CSV file. | [optional] 

## Example

```python
from openapi_client.models.dynamic_titles_download_csv import DynamicTitlesDownloadCSV

# TODO update the JSON string below
json = "{}"
# create an instance of DynamicTitlesDownloadCSV from a JSON string
dynamic_titles_download_csv_instance = DynamicTitlesDownloadCSV.from_json(json)
# print the JSON string representation of the object
print DynamicTitlesDownloadCSV.to_json()

# convert the object into a dict
dynamic_titles_download_csv_dict = dynamic_titles_download_csv_instance.to_dict()
# create an instance of DynamicTitlesDownloadCSV from a dict
dynamic_titles_download_csv_from_dict = DynamicTitlesDownloadCSV.from_dict(dynamic_titles_download_csv_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


