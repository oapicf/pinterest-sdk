# CatalogsVerticalProductGroupCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog ID pertaining to the product group. | 
**CatalogType** | **String** |  | 
**Country** | [**Country**](Country.md) |  | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] 
**Name** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsVerticalProductGroupCreateRequest = Initialize-PSOpenAPIToolsCatalogsVerticalProductGroupCreateRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Country null `
 -Description null `
 -Filters null `
 -Locale null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogsVerticalProductGroupCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

