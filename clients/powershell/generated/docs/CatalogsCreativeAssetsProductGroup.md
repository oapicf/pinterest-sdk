# CatalogsCreativeAssetsProductGroup
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the creative assets product group. | 
**CatalogType** | **String** |  | 
**CreatedAt** | **Int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**Id** | **String** | ID of the creative assets product group. | 
**Name** | **String** | Name of creative assets product group | [optional] 
**UpdatedAt** | **Int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsProductGroup = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsProductGroup  -CatalogId null `
 -CatalogType null `
 -CreatedAt 1621350033000 `
 -Description null `
 -Filters null `
 -Id 443727193917 `
 -Name Most Popular `
 -UpdatedAt 1622742155000
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsProductGroup | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

