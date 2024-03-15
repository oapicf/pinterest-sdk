# bulk_download_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_types** | [**list_t**](bulk_entity_type.md) \* | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**entity_ids** | **list_t \*** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**updated_since** | **char \*** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 
**campaign_filter** | [**bulk_download_request_campaign_filter_t**](bulk_download_request_campaign_filter.md) \* |  | [optional] 
**output_format** | **bulk_output_format_t \*** |  | [optional] [default to 'JSON']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


