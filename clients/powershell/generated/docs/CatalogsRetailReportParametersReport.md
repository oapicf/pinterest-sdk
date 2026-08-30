# CatalogsRetailReportParametersReport
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedId** | **String** | ID of the feed entity. | 
**ProcessingResultId** | **String** | Unique identifier of a feed processing result. It can be acquired from the &quot;&quot;id&quot;&quot; field of the &quot;&quot;items&quot;&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 
**ReportType** | **String** |  | 
**CatalogId** | **String** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 
**ProductGroupId** | **String** | Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailReportParametersReport = Initialize-PSOpenAPIToolsCatalogsRetailReportParametersReport  -FeedId null `
 -ProcessingResultId null `
 -ReportType null `
 -CatalogId null `
 -ProductGroupId null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailReportParametersReport | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

