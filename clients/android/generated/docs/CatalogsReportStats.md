

# CatalogsReportStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) |  | 
**catalogId** | **String** | ID of the catalog entity. |  [optional]
**code** | **Integer** | The event code that a diagnostics aggregated number references |  [optional]
**codeLabel** | **String** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) |  [optional]
**message** | **String** | Title message describing the diagnostic issue |  [optional]
**occurrences** | **Integer** | Number of occurrences of the issue |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue |  [optional]
**ineligibleForAds** | **Boolean** | Indicates if issue makes items ineligible for ads distribution |  [optional]
**ineligibleForOrganic** | **Boolean** | Indicates if issue makes items ineligible for organic distribution |  [optional]


## Enum: ReportTypeEnum

Name | Value
---- | -----


## Enum: SeverityEnum

Name | Value
---- | -----




