# CatalogsRetailProductGroup
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**Id** | **String** | ID of the catalog product group. | 
**Name** | **String** | Name of catalog product group | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] 
**Type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] 
**Status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] 
**CreatedAt** | **Int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**UpdatedAt** | **Int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**CatalogId** | **String** | Catalog id pertaining to the retail product group. | 
**FeedId** | **String** | id of the catalogs feed belonging to this catalog product group | 
**Country** | **String** |  | [optional] 
**Locale** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailProductGroup = Initialize-PSOpenAPIToolsCatalogsRetailProductGroup  -CatalogType null `
 -Id 443727193917 `
 -Name Most Popular `
 -Description null `
 -Filters null `
 -IsFeatured null `
 -Type null `
 -Status null `
 -CreatedAt 1621350033000 `
 -UpdatedAt 1622742155000 `
 -CatalogId null `
 -FeedId 2680059592705 `
 -Country null `
 -Locale null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailProductGroup | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

