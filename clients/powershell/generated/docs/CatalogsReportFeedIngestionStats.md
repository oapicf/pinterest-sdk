# CatalogsReportFeedIngestionStats
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportType** | **String** |  | [optional] 
**CatalogId** | **String** | ID of the catalog entity. | [optional] 
**Code** | **Int32** | The event code that a diagnostics aggregated number references | [optional] 
**CodeLabel** | **String** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) | [optional] 
**Message** | **String** | Title message describing the diagnostic issue | [optional] 
**Occurrences** | **Int32** | Number of occurrences of the issue | [optional] 
**Severity** | **String** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsReportFeedIngestionStats = Initialize-PSOpenAPIToolsCatalogsReportFeedIngestionStats  -ReportType null `
 -CatalogId null `
 -Code 112 `
 -CodeLabel AVAILABILITY_INVALID `
 -Message null `
 -Occurrences 10 `
 -Severity null
```

- Convert the resource to JSON
```powershell
$CatalogsReportFeedIngestionStats | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

