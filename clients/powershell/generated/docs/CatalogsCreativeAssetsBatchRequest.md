# CatalogsCreativeAssetsBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**CatalogType** | **String** |  | 
**Country** | [**Country**](Country.md) |  | 
**Items** | [**CatalogsCreativeAssetsBatchItem[]**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations | 
**Language** | **String** | We recommend using the CatalogsLocale values. | 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsBatchRequest = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsBatchRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Country null `
 -Items null `
 -Language null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

