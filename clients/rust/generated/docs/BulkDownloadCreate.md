# BulkDownloadCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_filter** | Option<[**models::BulkDownloadCampaignFilter**](BulkDownloadCampaignFilter.md)> |  | [optional]
**entity_ids** | Option<**Vec<String>**> | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional]
**entity_types** | Option<[**Vec<models::BulkEntityType>**](BulkEntityType.md)> | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional]
**output_format** | Option<[**models::BulkOutputFormat**](BulkOutputFormat.md)> |  | [optional][default to Json]
**updated_since** | Option<**String**> | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


