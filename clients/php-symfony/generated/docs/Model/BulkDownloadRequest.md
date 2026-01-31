# BulkDownloadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignFilter** | [**OpenAPI\Server\Model\BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  | [optional] 
**entityIds** | **string** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**entityTypes** | [**OpenAPIServerModelBulkEntityType**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**outputFormat** | [**OpenAPI\Server\Model\BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to self::OpenAPI\Server\Model\BulkOutputFormat_JSON]
**updatedSince** | **string** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


