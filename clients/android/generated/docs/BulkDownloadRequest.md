

# BulkDownloadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityTypes** | [**List&lt;BulkEntityType&gt;**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. |  [optional]
**entityIds** | **List&lt;String&gt;** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. |  [optional]
**updatedSince** | **String** | Unix UTC timestamp to retrieve all entities that have changed since this time. |  [optional]
**campaignFilter** | [**BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  |  [optional]
**outputFormat** | [**BulkOutputFormat**](BulkOutputFormat.md) |  |  [optional]




