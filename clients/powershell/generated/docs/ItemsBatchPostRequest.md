# ItemsBatchPostRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**Items** | [**ItemDeleteBatchRecord[]**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**CatalogId** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 
**Operation** | [**BatchOperation**](BatchOperation.md) |  | 

## Examples

- Prepare the resource
```powershell
$ItemsBatchPostRequest = Initialize-PSOpenAPIToolsItemsBatchPostRequest  -CatalogType null `
 -Country null `
 -Language null `
 -Items null `
 -CatalogId 2680059592705 `
 -Operation null
```

- Convert the resource to JSON
```powershell
$ItemsBatchPostRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

