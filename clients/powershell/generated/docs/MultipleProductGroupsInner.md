# MultipleProductGroupsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** |  | [optional] 
**FeedId** | **String** | Catalog Feed id pertaining to the catalog product group. | 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] [default to $false]
**Name** | **String** |  | 
**CatalogId** | **String** | Catalog id pertaining to the creative assets product group. | 
**CatalogType** | **String** |  | 
**Country** | [**Country**](Country.md) |  | [optional] 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MultipleProductGroupsInner = Initialize-PSOpenAPIToolsMultipleProductGroupsInner  -Description null `
 -FeedId 2680059592705 `
 -Filters null `
 -IsFeatured null `
 -Name null `
 -CatalogId 2680059592705 `
 -CatalogType null `
 -Country null `
 -Locale null
```

- Convert the resource to JSON
```powershell
$MultipleProductGroupsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

