# CatalogsRetailBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] 
**CatalogType** | **String** |  | 
**Country** | [**Country**](Country.md) |  | 
**Items** | [**CatalogsRetailBatchRequestItemsItems[]**](CatalogsRetailBatchRequestItemsItems.md) | Array with catalogs item operations | 
**Language** | **String** | We recommend using the CatalogsLocale values. | 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailBatchRequest = Initialize-PSOpenAPIToolsCatalogsRetailBatchRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Country null `
 -Items null `
 -Language null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

