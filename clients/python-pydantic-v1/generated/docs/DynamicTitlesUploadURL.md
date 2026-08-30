# DynamicTitlesUploadURL


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existing_filename** | **str** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. | [optional] 
**request_id** | **str** | Unique identifier for this upload session. Must be passed to the process endpoint. | 
**upload_url** | **str** | Pre-signed S3 PUT URL to upload the reviewed CSV file. | 

## Example

```python
from openapi_client.models.dynamic_titles_upload_url import DynamicTitlesUploadURL

# TODO update the JSON string below
json = "{}"
# create an instance of DynamicTitlesUploadURL from a JSON string
dynamic_titles_upload_url_instance = DynamicTitlesUploadURL.from_json(json)
# print the JSON string representation of the object
print DynamicTitlesUploadURL.to_json()

# convert the object into a dict
dynamic_titles_upload_url_dict = dynamic_titles_upload_url_instance.to_dict()
# create an instance of DynamicTitlesUploadURL from a dict
dynamic_titles_upload_url_from_dict = DynamicTitlesUploadURL.from_dict(dynamic_titles_upload_url_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


