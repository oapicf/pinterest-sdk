# CatalogsReportDistributionIssueFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportType** | **String** |  | 
**CatalogId** | **String** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsReportDistributionIssueFilter = Initialize-PSOpenAPIToolsCatalogsReportDistributionIssueFilter  -ReportType null `
 -CatalogId null
```

- Convert the resource to JSON
```powershell
$CatalogsReportDistributionIssueFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

