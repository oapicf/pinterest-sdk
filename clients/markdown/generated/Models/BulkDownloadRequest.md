# BulkDownloadRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entity\_types** | [**List**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] [default to null] |
| **entity\_ids** | **List** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] [default to null] |
| **updated\_since** | **String** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] [default to null] |
| **campaign\_filter** | [**BulkDownloadRequest_campaign_filter**](BulkDownloadRequest_campaign_filter.md) |  | [optional] [default to null] |
| **output\_format** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to JSON] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

