# BulkDownload

Ad entities to get in bulk request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | ID of the bulk request. | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.bulk_download import BulkDownload

# TODO update the JSON string below
json = "{}"
# create an instance of BulkDownload from a JSON string
bulk_download_instance = BulkDownload.from_json(json)
# print the JSON string representation of the object
print(BulkDownload.to_json())

# convert the object into a dict
bulk_download_dict = bulk_download_instance.to_dict()
# create an instance of BulkDownload from a dict
bulk_download_from_dict = BulkDownload.from_dict(bulk_download_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


