# OAIBulkDownloadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityTypes** | [**NSArray&lt;OAIBulkEntityType&gt;***](OAIBulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**entityIds** | **NSArray&lt;NSString*&gt;*** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**updatedSince** | **NSString*** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 
**campaignFilter** | [**OAIBulkDownloadRequestCampaignFilter***](OAIBulkDownloadRequestCampaignFilter.md) |  | [optional] 
**outputFormat** | [**OAIBulkOutputFormat***](OAIBulkOutputFormat.md) |  | [optional] [default to @"JSON"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


