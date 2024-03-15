# WWW::OpenAPIClient::Object::BulkDownloadRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::BulkDownloadRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_types** | [**ARRAY[BulkEntityType]**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**entity_ids** | **ARRAY[string]** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**updated_since** | **string** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 
**campaign_filter** | [**BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  | [optional] 
**output_format** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to &#39;JSON&#39;]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


