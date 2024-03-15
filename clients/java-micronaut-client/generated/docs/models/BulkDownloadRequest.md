

# BulkDownloadRequest

Ad entities to get in bulk request.

The class is defined in **[BulkDownloadRequest.java](../../src/main/java/org/openapitools/model/BulkDownloadRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityTypes** | `List&lt;BulkEntityType&gt;` | All entity types specified will be downloaded. Fewer types result in faster downloads. |  [optional property]
**entityIds** | `List&lt;String&gt;` | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. |  [optional property]
**updatedSince** | `String` | Unix UTC timestamp to retrieve all entities that have changed since this time. |  [optional property]
**campaignFilter** | [`BulkDownloadRequestCampaignFilter`](BulkDownloadRequestCampaignFilter.md) |  |  [optional property]
**outputFormat** | `BulkOutputFormat` |  |  [optional property]







