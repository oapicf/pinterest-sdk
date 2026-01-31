# BulkDownloadResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | ID of the bulk request. | [optional] 

## Example

```python
from pinterestsdk.models.bulk_download_response import BulkDownloadResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BulkDownloadResponse from a JSON string
bulk_download_response_instance = BulkDownloadResponse.from_json(json)
# print the JSON string representation of the object
print(BulkDownloadResponse.to_json())

# convert the object into a dict
bulk_download_response_dict = bulk_download_response_instance.to_dict()
# create an instance of BulkDownloadResponse from a dict
bulk_download_response_from_dict = BulkDownloadResponse.from_dict(bulk_download_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


