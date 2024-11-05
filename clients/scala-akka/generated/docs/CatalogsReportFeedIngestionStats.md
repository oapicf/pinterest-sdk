

# CatalogsReportFeedIngestionStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportType** | [**ReportType**](#ReportType) |  |  [optional]
**catalogId** | **String** | ID of the catalog entity. |  [optional]
**code** | **Int** | The event code that a diagnostics aggregated number references |  [optional]
**codeLabel** | **String** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) |  [optional]
**message** | **String** | Title message describing the diagnostic issue |  [optional]
**occurrences** | **Int** | Number of occurrences of the issue |  [optional]
**severity** | [**Severity**](#Severity) | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue |  [optional]


## Enum: ReportType
Allowed values: [FEED_INGESTION_ISSUES]



## Enum: Severity
Allowed values: [WARN, ERROR]




