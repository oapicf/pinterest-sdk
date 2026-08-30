# CatalogsRetailListProductsByCatalogBasedFilterRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog ID pertaining to the product group. | 
**CatalogType** | **String** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | 
**Country** | [**Country**](Country.md) |  | 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailListProductsByCatalogBasedFilterRequest = Initialize-PSOpenAPIToolsCatalogsRetailListProductsByCatalogBasedFilterRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Country null `
 -Filters null `
 -Locale null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailListProductsByCatalogBasedFilterRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

