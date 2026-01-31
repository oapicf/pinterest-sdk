# # BulkDownloadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_filter** | [**\OpenAPI\Client\Model\BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  | [optional]
**entity_ids** | **string[]** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional]
**entity_types** | [**\OpenAPIClientModelBulkEntityType[]**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional]
**output_format** | [**\OpenAPI\Client\Model\BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to self::\OpenAPI\Client\Model\BulkOutputFormat_JSON]
**updated_since** | **string** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
