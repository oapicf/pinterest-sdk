# CatalogsReportAllItemsFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 
**ReportType** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsReportAllItemsFilter = Initialize-PSOpenAPIToolsCatalogsReportAllItemsFilter  -CatalogId null `
 -ReportType null
```

- Convert the resource to JSON
```powershell
$CatalogsReportAllItemsFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

