
# CatalogsReportFeedIngestionFilter

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **reportType** | [**inline**](#ReportType) |  |  |
| **feedId** | **kotlin.String** | ID of the feed entity. |  |
| **processingResultId** | **kotlin.String** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. |  [optional] |


<a id="ReportType"></a>
## Enum: report_type
| Name | Value |
| ---- | ----- |
| reportType | FEED_INGESTION_ISSUES |



