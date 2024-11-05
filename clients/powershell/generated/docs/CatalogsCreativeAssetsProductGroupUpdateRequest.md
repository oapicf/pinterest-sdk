# CatalogsCreativeAssetsProductGroupUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | [optional] 
**Name** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsProductGroupUpdateRequest = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsProductGroupUpdateRequest  -CatalogType null `
 -Name null `
 -Description null `
 -Filters null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsProductGroupUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

