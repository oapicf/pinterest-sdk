# PinterestSdk.BulkDownloadCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignFilter** | [**BulkDownloadCampaignFilter**](BulkDownloadCampaignFilter.md) |  | [optional] 
**entityIds** | **[String]** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**entityTypes** | [**[BulkEntityType]**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**outputFormat** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] 
**updatedSince** | **String** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 


