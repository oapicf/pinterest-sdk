# CatalogsReportStats

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **String** | ID of the catalog entity. | [optional] [default to None]
**code** | **i32** | The event code that a diagnostics aggregated number references | [optional] [default to None]
**code_label** | **String** | A human-friendly label for the event code (e.g, 'SPAM') | [optional] [default to None]
**message** | **String** | Title message describing the diagnostic issue | [optional] [default to None]
**occurrences** | **i32** | Number of occurrences of the issue | [optional] [default to None]
**report_type** | [***models::CatalogsReportDistributionIssueFilterReportType**](CatalogsReportDistributionIssueFilter_report_type.md) |  | [optional] [default to None]
**severity** | [***models::CatalogsReportFeedIngestionStatsSeverity**](CatalogsReportFeedIngestionStats_severity.md) |  | [optional] [default to None]
**ineligible_for_ads** | **bool** | Indicates if issue makes items ineligible for ads distribution | [optional] [default to None]
**ineligible_for_organic** | **bool** | Indicates if issue makes items ineligible for organic distribution | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


