# BulkDownloadCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignFilter** | [**OpenAPI\Server\Model\BulkDownloadCampaignFilter**](BulkDownloadCampaignFilter.md) |  | [optional] 
**entityIds** | **string** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**entityTypes** | [**OpenAPI\Server\Model\BulkEntityType**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**outputFormat** | [**OpenAPI\Server\Model\BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to BulkOutputFormat::JSON]
**updatedSince** | **string** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


