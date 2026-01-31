# CatalogsVerticalProductGroup
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the creative assets product group. | 
**CatalogType** | **String** |  | 
**Country** | **String** |  | [optional] 
**CreatedAt** | **Int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**Description** | **String** |  | [optional] 
**FeedId** | **String** | id of the catalogs feed belonging to this catalog product group | 
**Filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**Id** | **String** | ID of the creative assets product group. | 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] 
**Locale** | **String** |  | [optional] 
**Name** | **String** | Name of creative assets product group | [optional] 
**Status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] 
**Type** | [**CatalogsHotelProductGroupType**](CatalogsHotelProductGroupType.md) |  | 
**UpdatedAt** | **Int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsVerticalProductGroup = Initialize-PSOpenAPIToolsCatalogsVerticalProductGroup  -CatalogId null `
 -CatalogType null `
 -Country null `
 -CreatedAt 1621350033000 `
 -Description null `
 -FeedId 2680059592705 `
 -Filters null `
 -Id 443727193917 `
 -IsFeatured null `
 -Locale null `
 -Name Most Popular `
 -Status null `
 -Type null `
 -UpdatedAt 1622742155000
```

- Convert the resource to JSON
```powershell
$CatalogsVerticalProductGroup | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

