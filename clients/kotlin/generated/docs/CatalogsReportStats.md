
# CatalogsReportStats

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **reportType** | [**inline**](#ReportType) |  |  |
| **catalogId** | **kotlin.String** | ID of the catalog entity. |  [optional] |
| **code** | **kotlin.Int** | The event code that a diagnostics aggregated number references |  [optional] |
| **codeLabel** | **kotlin.String** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) |  [optional] |
| **message** | **kotlin.String** | Title message describing the diagnostic issue |  [optional] |
| **occurrences** | **kotlin.Int** | Number of occurrences of the issue |  [optional] |
| **severity** | [**inline**](#Severity) | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue |  [optional] |
| **ineligibleForAds** | **kotlin.Boolean** | Indicates if issue makes items ineligible for ads distribution |  [optional] |
| **ineligibleForOrganic** | **kotlin.Boolean** | Indicates if issue makes items ineligible for organic distribution |  [optional] |


<a id="ReportType"></a>
## Enum: report_type
| Name | Value |
| ---- | ----- |
| reportType | FEED_INGESTION_ISSUES, DISTRIBUTION_ISSUES |


<a id="Severity"></a>
## Enum: severity
| Name | Value |
| ---- | ----- |
| severity | WARN, ERROR |



