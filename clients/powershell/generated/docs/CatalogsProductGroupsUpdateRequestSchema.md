# CatalogsProductGroupsUpdateRequestSchema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [optional] 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] 
**Name** | **String** | Name of catalog product group | [optional] 
**CatalogType** | **String** |  | [optional] 
**Country** | [**Country**](Country.md) |  | [optional] 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupsUpdateRequestSchema = Initialize-PSOpenAPIToolsCatalogsProductGroupsUpdateRequestSchema  -Description null `
 -Filters null `
 -IsFeatured null `
 -Name Most Popular `
 -CatalogType null `
 -Country null `
 -Locale null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupsUpdateRequestSchema | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

