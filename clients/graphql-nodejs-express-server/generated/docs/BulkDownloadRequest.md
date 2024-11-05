# BulkDownloadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityTypes** | [**BulkEntityType**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] [default to null]
**entityIds** | **String!** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] [default to null]
**updatedSince** | **String!** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] [default to null]
**campaignFilter** | [***BulkDownloadRequestCampaignFilter**](BulkDownloadRequest_campaign_filter.md) |  | [optional] [default to null]
**outputFormat** | [***BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to JSON]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


