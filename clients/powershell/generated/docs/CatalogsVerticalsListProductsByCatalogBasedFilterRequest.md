# CatalogsVerticalsListProductsByCatalogBasedFilterRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**CatalogId** | **String** | Catalog id pertaining to the creative assets product group. | 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**Country** | [**Country**](Country.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsVerticalsListProductsByCatalogBasedFilterRequest = Initialize-PSOpenAPIToolsCatalogsVerticalsListProductsByCatalogBasedFilterRequest  -CatalogType null `
 -CatalogId 2680059592705 `
 -Filters null `
 -Country null `
 -Locale null
```

- Convert the resource to JSON
```powershell
$CatalogsVerticalsListProductsByCatalogBasedFilterRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

