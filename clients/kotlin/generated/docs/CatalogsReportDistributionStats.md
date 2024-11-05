
# CatalogsReportDistributionStats

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **reportType** | [**inline**](#ReportType) |  |  [optional] |
| **catalogId** | **kotlin.String** | ID of the catalog entity. |  [optional] |
| **code** | **kotlin.Int** | The event code that a diagnostics aggregated number references |  [optional] |
| **codeLabel** | **kotlin.String** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) |  [optional] |
| **message** | **kotlin.String** | Title message describing the diagnostic issue |  [optional] |
| **occurrences** | **kotlin.Int** | Number of occurrences of the issue |  [optional] |
| **ineligibleForAds** | **kotlin.Boolean** | Indicates if issue makes items ineligible for ads distribution |  [optional] |
| **ineligibleForOrganic** | **kotlin.Boolean** | Indicates if issue makes items ineligible for organic distribution |  [optional] |


<a id="ReportType"></a>
## Enum: report_type
| Name | Value |
| ---- | ----- |
| reportType | DISTRIBUTION_ISSUES |



