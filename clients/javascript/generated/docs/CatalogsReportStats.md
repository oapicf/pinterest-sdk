# PinterestSdk.CatalogsReportStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportType** | **String** |  | 
**catalogId** | **String** | ID of the catalog entity. | [optional] 
**code** | **Number** | The event code that a diagnostics aggregated number references | [optional] 
**codeLabel** | **String** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) | [optional] 
**message** | **String** | Title message describing the diagnostic issue | [optional] 
**occurrences** | **Number** | Number of occurrences of the issue | [optional] 
**severity** | **String** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] 
**ineligibleForAds** | **Boolean** | Indicates if issue makes items ineligible for ads distribution | [optional] 
**ineligibleForOrganic** | **Boolean** | Indicates if issue makes items ineligible for organic distribution | [optional] 



## Enum: ReportTypeEnum


* `FEED_INGESTION_ISSUES` (value: `"FEED_INGESTION_ISSUES"`)

* `DISTRIBUTION_ISSUES` (value: `"DISTRIBUTION_ISSUES"`)





## Enum: SeverityEnum


* `WARN` (value: `"WARN"`)

* `ERROR` (value: `"ERROR"`)




