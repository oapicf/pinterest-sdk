# Org.OpenAPITools.Model.CatalogsReportStats
Diagnostics aggregated numbers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportType** | **string** |  | 
**CatalogId** | **string** | ID of the catalog entity. | [optional] 
**Code** | **int** | The event code that a diagnostics aggregated number references | [optional] 
**CodeLabel** | **string** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) | [optional] 
**Message** | **string** | Title message describing the diagnostic issue | [optional] 
**Occurrences** | **int** | Number of occurrences of the issue | [optional] 
**Severity** | **string** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] 
**IneligibleForAds** | **bool** | Indicates if issue makes items ineligible for ads distribution | [optional] 
**IneligibleForOrganic** | **bool** | Indicates if issue makes items ineligible for organic distribution | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

