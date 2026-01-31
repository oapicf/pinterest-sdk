# CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the creative assets product group. | 
**CatalogType** | **String** |  | 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Filters null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

