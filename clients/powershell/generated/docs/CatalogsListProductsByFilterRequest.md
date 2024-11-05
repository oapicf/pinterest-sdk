# CatalogsListProductsByFilterRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedId** | **String** | Catalog Feed id pertaining to the catalog product group filter. | 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**CatalogType** | **String** |  | 
**CatalogId** | **String** | Catalog id pertaining to the creative assets product group. | 
**Country** | [**Country**](Country.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsListProductsByFilterRequest = Initialize-PSOpenAPIToolsCatalogsListProductsByFilterRequest  -FeedId 2680059592705 `
 -Filters null `
 -CatalogType null `
 -CatalogId 2680059592705 `
 -Country null `
 -Locale null
```

- Convert the resource to JSON
```powershell
$CatalogsListProductsByFilterRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

