# # CatalogsReportFeedIngestionStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_type** | **string** |  | [optional]
**catalog_id** | **string** | ID of the catalog entity. | [optional]
**code** | **int** | The event code that a diagnostics aggregated number references | [optional]
**code_label** | **string** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) | [optional]
**message** | **string** | Title message describing the diagnostic issue | [optional]
**occurrences** | **int** | Number of occurrences of the issue | [optional]
**severity** | **string** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
