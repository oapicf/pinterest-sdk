# openapi::BulkDownloadRequest

Ad entities to get in bulk request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_types** | [**array[BulkEntityType]**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] [Max. items: 5] [Min. items: 1] 
**entity_ids** | **array[character]** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**updated_since** | **character** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] [Pattern: ^\\d+$] 
**campaign_filter** | [**BulkDownloadRequestCampaignFilter**](BulkDownloadRequest_campaign_filter.md) |  | [optional] 
**output_format** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to &quot;JSON&quot;] [Enum: ] 


