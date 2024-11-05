# CatalogsReportStats
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportType** | **String** |  | 
**CatalogId** | **String** | ID of the catalog entity. | [optional] 
**Code** | **Int32** | The event code that a diagnostics aggregated number references | [optional] 
**CodeLabel** | **String** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) | [optional] 
**Message** | **String** | Title message describing the diagnostic issue | [optional] 
**Occurrences** | **Int32** | Number of occurrences of the issue | [optional] 
**Severity** | **String** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] 
**IneligibleForAds** | **Boolean** | Indicates if issue makes items ineligible for ads distribution | [optional] 
**IneligibleForOrganic** | **Boolean** | Indicates if issue makes items ineligible for organic distribution | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsReportStats = Initialize-PSOpenAPIToolsCatalogsReportStats  -ReportType null `
 -CatalogId null `
 -Code null `
 -CodeLabel SPAM `
 -Message null `
 -Occurrences 10 `
 -Severity null `
 -IneligibleForAds true `
 -IneligibleForOrganic true
```

- Convert the resource to JSON
```powershell
$CatalogsReportStats | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

