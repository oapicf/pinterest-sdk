# ItemsBatchPostRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**CatalogType** | **String** |  | 
**Country** | [**Country**](Country.md) |  | 
**Items** | [**ItemDeleteBatchRecord[]**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**Language** | **String** | We recommend using the CatalogsLocale values. | 
**Operation** | [**BatchOperation**](BatchOperation.md) |  | 

## Examples

- Prepare the resource
```powershell
$ItemsBatchPostRequest = Initialize-PSOpenAPIToolsItemsBatchPostRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Country null `
 -Items null `
 -Language null `
 -Operation null
```

- Convert the resource to JSON
```powershell
$ItemsBatchPostRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

