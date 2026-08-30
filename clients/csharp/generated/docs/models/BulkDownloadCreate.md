# Org.OpenAPITools.Model.BulkDownloadCreate
Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignFilter** | [**BulkDownloadCampaignFilter**](BulkDownloadCampaignFilter.md) |  | [optional] 
**EntityIds** | **List&lt;string&gt;** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**EntityTypes** | [**List&lt;BulkEntityType&gt;**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**OutputFormat** | **BulkOutputFormat** |  | [optional] 
**UpdatedSince** | **string** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

