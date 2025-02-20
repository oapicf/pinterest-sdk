# Org.OpenAPITools.Model.BulkDownloadRequest
Ad entities to get in bulk request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityTypes** | [**List&lt;BulkEntityType&gt;**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**EntityIds** | **List&lt;string&gt;** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**UpdatedSince** | **string** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 
**CampaignFilter** | [**BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  | [optional] 
**OutputFormat** | **BulkOutputFormat** |  | [optional] [default to "JSON"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

