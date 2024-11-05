

# CatalogsReportDistributionStats

The class is defined in **[CatalogsReportDistributionStats.java](../../src/main/java/org/openapitools/model/CatalogsReportDistributionStats.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) |  |  [optional property]
**catalogId** | `String` | ID of the catalog entity. |  [optional property]
**code** | `Integer` | The event code that a diagnostics aggregated number references |  [optional property]
**codeLabel** | `String` | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) |  [optional property]
**message** | `String` | Title message describing the diagnostic issue |  [optional property]
**occurrences** | `Integer` | Number of occurrences of the issue |  [optional property]
**ineligibleForAds** | `Boolean` | Indicates if issue makes items ineligible for ads distribution |  [optional property]
**ineligibleForOrganic** | `Boolean` | Indicates if issue makes items ineligible for organic distribution |  [optional property]

## ReportTypeEnum

Name | Value
---- | -----
DISTRIBUTION_ISSUES | `"DISTRIBUTION_ISSUES"`









