# MultipleProductGroupsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** |  | 
**Description** | **String** |  | [optional] 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] [default to $false]
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**FeedId** | **String** | Catalog Feed id pertaining to the catalog product group. | 
**CatalogType** | **String** |  | 
**CatalogId** | **String** | Catalog id pertaining to the creative assets product group. | 
**Country** | [**Country**](Country.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Examples

- Prepare the resource
```powershell
$MultipleProductGroupsInner = Initialize-PSOpenAPIToolsMultipleProductGroupsInner  -Name null `
 -Description null `
 -IsFeatured null `
 -Filters null `
 -FeedId 2680059592705 `
 -CatalogType null `
 -CatalogId 2680059592705 `
 -Country null `
 -Locale null
```

- Convert the resource to JSON
```powershell
$MultipleProductGroupsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

