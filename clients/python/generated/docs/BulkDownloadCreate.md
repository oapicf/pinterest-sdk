# BulkDownloadCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_filter** | [**BulkDownloadCampaignFilter**](BulkDownloadCampaignFilter.md) |  | [optional] 
**entity_ids** | **List[str]** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**entity_types** | [**List[BulkEntityType]**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**output_format** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] 
**updated_since** | **str** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 

## Example

```python
from pinterestsdk.models.bulk_download_create import BulkDownloadCreate

# TODO update the JSON string below
json = "{}"
# create an instance of BulkDownloadCreate from a JSON string
bulk_download_create_instance = BulkDownloadCreate.from_json(json)
# print the JSON string representation of the object
print(BulkDownloadCreate.to_json())

# convert the object into a dict
bulk_download_create_dict = bulk_download_create_instance.to_dict()
# create an instance of BulkDownloadCreate from a dict
bulk_download_create_from_dict = BulkDownloadCreate.from_dict(bulk_download_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


