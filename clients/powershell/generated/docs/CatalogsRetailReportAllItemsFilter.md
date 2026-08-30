# CatalogsRetailReportAllItemsFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 
**ProductGroupId** | **String** | Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. | [optional] 
**ReportType** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailReportAllItemsFilter = Initialize-PSOpenAPIToolsCatalogsRetailReportAllItemsFilter  -CatalogId null `
 -ProductGroupId null `
 -ReportType null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailReportAllItemsFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

