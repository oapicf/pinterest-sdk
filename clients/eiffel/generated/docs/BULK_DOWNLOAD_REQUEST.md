# BULK_DOWNLOAD_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_types** | [**LIST [BULK_ENTITY_TYPE]**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] [default to null]
**entity_ids** | [**LIST [STRING_32]**](STRING_32.md) | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] [default to null]
**updated_since** | [**STRING_32**](STRING_32.md) | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] [default to null]
**campaign_filter** | [**BULK_DOWNLOAD_REQUEST_CAMPAIGN_FILTER**](BulkDownloadRequest_campaign_filter.md) |  | [optional] [default to null]
**output_format** | [**BULK_OUTPUT_FORMAT**](BulkOutputFormat.md) |  | [optional] [default to JSON]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


