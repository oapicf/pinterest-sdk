

# CatalogsReportStats

Diagnostics aggregated numbers

The class is defined in **[CatalogsReportStats.java](../../src/main/java/org/openapitools/model/CatalogsReportStats.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) |  | 
**catalogId** | `String` | ID of the catalog entity. |  [optional property]
**code** | `Integer` | The event code that a diagnostics aggregated number references |  [optional property]
**codeLabel** | `String` | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) |  [optional property]
**message** | `String` | Title message describing the diagnostic issue |  [optional property]
**occurrences** | `Integer` | Number of occurrences of the issue |  [optional property]
**severity** | [**SeverityEnum**](#SeverityEnum) | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue |  [optional property]
**ineligibleForAds** | `Boolean` | Indicates if issue makes items ineligible for ads distribution |  [optional property]
**ineligibleForOrganic** | `Boolean` | Indicates if issue makes items ineligible for organic distribution |  [optional property]

## ReportTypeEnum

Name | Value
---- | -----
FEED_INGESTION_ISSUES | `"FEED_INGESTION_ISSUES"`
DISTRIBUTION_ISSUES | `"DISTRIBUTION_ISSUES"`






## SeverityEnum

Name | Value
---- | -----
WARN | `"WARN"`
ERROR | `"ERROR"`




