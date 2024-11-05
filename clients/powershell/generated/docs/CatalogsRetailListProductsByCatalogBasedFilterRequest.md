# CatalogsRetailListProductsByCatalogBasedFilterRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | 
**CatalogId** | **String** | Catalog id pertaining to the retail product group. | 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**Country** | [**Country**](Country.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailListProductsByCatalogBasedFilterRequest = Initialize-PSOpenAPIToolsCatalogsRetailListProductsByCatalogBasedFilterRequest  -CatalogType null `
 -CatalogId 2680059592705 `
 -Filters null `
 -Country null `
 -Locale null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailListProductsByCatalogBasedFilterRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

