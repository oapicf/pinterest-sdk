# CATALOGS_REPORT_FEED_INGESTION_STATS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_type** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**catalog_id** | [**STRING_32**](STRING_32.md) | ID of the catalog entity. | [optional] [default to null]
**code** | **INTEGER_32** | The event code that a diagnostics aggregated number references | [optional] [default to null]
**code_label** | [**STRING_32**](STRING_32.md) | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) | [optional] [default to null]
**message** | [**STRING_32**](STRING_32.md) | Title message describing the diagnostic issue | [optional] [default to null]
**occurrences** | **INTEGER_32** | Number of occurrences of the issue | [optional] [default to null]
**severity** | [**STRING_32**](STRING_32.md) | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


