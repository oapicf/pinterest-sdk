# BulkDownloadRequest

Ad entities to get in bulk request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_filter** | [**BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  | [optional] 
**entity_ids** | **List[str]** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**entity_types** | [**List[BulkEntityType]**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**output_format** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to 'JSON']
**updated_since** | **str** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 

## Example

```python
from pinterestsdk.models.bulk_download_request import BulkDownloadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BulkDownloadRequest from a JSON string
bulk_download_request_instance = BulkDownloadRequest.from_json(json)
# print the JSON string representation of the object
print(BulkDownloadRequest.to_json())

# convert the object into a dict
bulk_download_request_dict = bulk_download_request_instance.to_dict()
# create an instance of BulkDownloadRequest from a dict
bulk_download_request_from_dict = BulkDownloadRequest.from_dict(bulk_download_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


