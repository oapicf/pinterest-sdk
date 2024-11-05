
# Table `CatalogsReportFeedIngestionStats`
(mapped from: CatalogsReportFeedIngestionStats)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**reportType** | report_type | text |  | [**report_type**](#ReportType) |  |  [optional]
**catalogId** | catalog_id | text |  | **kotlin.String** | ID of the catalog entity. |  [optional]
**code** | code | int |  | **kotlin.Int** | The event code that a diagnostics aggregated number references |  [optional]
**codeLabel** | code_label | text |  | **kotlin.String** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) |  [optional]
**message** | message | text |  | **kotlin.String** | Title message describing the diagnostic issue |  [optional]
**occurrences** | occurrences | int |  | **kotlin.Int** | Number of occurrences of the issue |  [optional]
**severity** | severity | text |  | [**severity**](#Severity) | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue |  [optional]









