
# Table `CatalogsReportDistributionStats`
(mapped from: CatalogsReportDistributionStats)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**reportType** | report_type | text |  | [**report_type**](#ReportType) |  |  [optional]
**catalogId** | catalog_id | text |  | **kotlin.String** | ID of the catalog entity. |  [optional]
**code** | code | int |  | **kotlin.Int** | The event code that a diagnostics aggregated number references |  [optional]
**codeLabel** | code_label | text |  | **kotlin.String** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) |  [optional]
**message** | message | text |  | **kotlin.String** | Title message describing the diagnostic issue |  [optional]
**occurrences** | occurrences | int |  | **kotlin.Int** | Number of occurrences of the issue |  [optional]
**ineligibleForAds** | ineligible_for_ads | boolean |  | **kotlin.Boolean** | Indicates if issue makes items ineligible for ads distribution |  [optional]
**ineligibleForOrganic** | ineligible_for_organic | boolean |  | **kotlin.Boolean** | Indicates if issue makes items ineligible for organic distribution |  [optional]










