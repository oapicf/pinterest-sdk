# catalogs_report_feed_ingestion_stats_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_type** | **pinterest_rest_api_catalogs_report_feed_ingestion_stats_REPORTTYPE_e** |  | [optional] 
**catalog_id** | **char \*** | ID of the catalog entity. | [optional] 
**code** | **int** | The event code that a diagnostics aggregated number references | [optional] 
**code_label** | **char \*** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) | [optional] 
**message** | **char \*** | Title message describing the diagnostic issue | [optional] 
**occurrences** | **int** | Number of occurrences of the issue | [optional] 
**severity** | **pinterest_rest_api_catalogs_report_feed_ingestion_stats_SEVERITY_e** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


