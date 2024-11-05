# CatalogsReportStats

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportType** | **String** |  | 
**catalogId** | **String** | ID of the catalog entity. | [optional] 
**code** | **Int** | The event code that a diagnostics aggregated number references | [optional] 
**codeLabel** | **String** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) | [optional] 
**message** | **String** | Title message describing the diagnostic issue | [optional] 
**occurrences** | **Int** | Number of occurrences of the issue | [optional] 
**severity** | **String** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] 
**ineligibleForAds** | **Bool** | Indicates if issue makes items ineligible for ads distribution | [optional] 
**ineligibleForOrganic** | **Bool** | Indicates if issue makes items ineligible for organic distribution | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


