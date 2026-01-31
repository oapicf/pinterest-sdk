# CatalogsReportDistributionStats
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | ID of the catalog entity. | [optional] 
**Code** | **Int32** | The event code that a diagnostics aggregated number references | [optional] 
**CodeLabel** | **String** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) | [optional] 
**IneligibleForAds** | **Boolean** | Indicates if issue makes items ineligible for ads distribution | [optional] 
**IneligibleForOrganic** | **Boolean** | Indicates if issue makes items ineligible for organic distribution | [optional] 
**Message** | **String** | Title message describing the diagnostic issue | [optional] 
**Occurrences** | **Int32** | Number of occurrences of the issue | [optional] 
**ReportType** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsReportDistributionStats = Initialize-PSOpenAPIToolsCatalogsReportDistributionStats  -CatalogId null `
 -Code null `
 -CodeLabel SPAM `
 -IneligibleForAds true `
 -IneligibleForOrganic true `
 -Message null `
 -Occurrences 10 `
 -ReportType null
```

- Convert the resource to JSON
```powershell
$CatalogsReportDistributionStats | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

