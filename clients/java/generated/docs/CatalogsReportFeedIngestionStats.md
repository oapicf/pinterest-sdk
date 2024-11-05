

# CatalogsReportFeedIngestionStats


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) |  |  [optional] |
|**catalogId** | **String** | ID of the catalog entity. |  [optional] |
|**code** | **Integer** | The event code that a diagnostics aggregated number references |  [optional] |
|**codeLabel** | **String** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) |  [optional] |
|**message** | **String** | Title message describing the diagnostic issue |  [optional] |
|**occurrences** | **Integer** | Number of occurrences of the issue |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue |  [optional] |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| FEED_INGESTION_ISSUES | &quot;FEED_INGESTION_ISSUES&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| WARN | &quot;WARN&quot; |
| ERROR | &quot;ERROR&quot; |



