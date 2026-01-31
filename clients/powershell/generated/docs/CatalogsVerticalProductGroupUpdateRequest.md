# CatalogsVerticalProductGroupUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | [optional] 
**Country** | [**Country**](Country.md) |  | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [optional] 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] 
**Name** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsVerticalProductGroupUpdateRequest = Initialize-PSOpenAPIToolsCatalogsVerticalProductGroupUpdateRequest  -CatalogType null `
 -Country null `
 -Description null `
 -Filters null `
 -Locale null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogsVerticalProductGroupUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

