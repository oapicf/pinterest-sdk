# CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**CatalogId** | **String** | Catalog id pertaining to the creative assets product group. | 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest  -CatalogType null `
 -CatalogId 2680059592705 `
 -Filters null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

