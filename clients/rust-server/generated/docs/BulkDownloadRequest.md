# BulkDownloadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_types** | [**Vec<models::BulkEntityType>**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] [default to None]
**entity_ids** | **Vec<String>** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] [default to None]
**updated_since** | **String** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] [default to None]
**campaign_filter** | [***models::BulkDownloadRequestCampaignFilter**](BulkDownloadRequest_campaign_filter.md) |  | [optional] [default to None]
**output_format** | [***models::BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to Some("JSON".to_string())]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


