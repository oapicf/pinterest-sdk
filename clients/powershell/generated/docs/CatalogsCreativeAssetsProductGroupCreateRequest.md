# CatalogsCreativeAssetsProductGroupCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the creative assets product group. | 
**CatalogType** | **String** |  | 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**Name** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsProductGroupCreateRequest = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsProductGroupCreateRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Description null `
 -Filters null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsProductGroupCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

