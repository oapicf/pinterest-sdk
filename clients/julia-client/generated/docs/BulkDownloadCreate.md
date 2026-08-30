# BulkDownloadCreate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`campaign_filter`** | [**`*BulkDownloadCampaignFilter`**](BulkDownloadCampaignFilter.md) |  | [optional] [default to nothing]
**`entity_ids`** | **`Vector{String}`** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] [default to nothing]
**`entity_types`** | [**`Vector{BulkEntityType}`**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] [default to nothing]
**`output_format`** | [**`*BulkOutputFormat`**](BulkOutputFormat.md) |  | [optional] [default to nothing]
**`updated_since`** | **`String`** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


