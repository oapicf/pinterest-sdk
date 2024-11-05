# openapi::CatalogsReportFeedIngestionStats


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_type** | **character** |  | [optional] [Enum: [FEED_INGESTION_ISSUES]] 
**catalog_id** | **character** | ID of the catalog entity. | [optional] [Pattern: ^\\d+$] 
**code** | **integer** | The event code that a diagnostics aggregated number references | [optional] 
**code_label** | **character** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) | [optional] 
**message** | **character** | Title message describing the diagnostic issue | [optional] 
**occurrences** | **integer** | Number of occurrences of the issue | [optional] 
**severity** | **character** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] [Enum: [WARN, ERROR]] 


