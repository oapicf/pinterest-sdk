# CatalogsVerticalsListProductsByCatalogBasedFilterRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the creative assets product group. | 
**CatalogType** | **String** |  | 
**Country** | [**Country**](Country.md) |  | 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsVerticalsListProductsByCatalogBasedFilterRequest = Initialize-PSOpenAPIToolsCatalogsVerticalsListProductsByCatalogBasedFilterRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Country null `
 -Filters null `
 -Locale null
```

- Convert the resource to JSON
```powershell
$CatalogsVerticalsListProductsByCatalogBasedFilterRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

