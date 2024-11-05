# CatalogsReportFeedIngestionStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_type** | Option<**String**> |  | [optional]
**catalog_id** | Option<**String**> | ID of the catalog entity. | [optional]
**code** | Option<**i32**> | The event code that a diagnostics aggregated number references | [optional]
**code_label** | Option<**String**> | A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID') | [optional]
**message** | Option<**String**> | Title message describing the diagnostic issue | [optional]
**occurrences** | Option<**i32**> | Number of occurrences of the issue | [optional]
**severity** | Option<**String**> | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


