# CatalogsVerticalProductGroup
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**Id** | **String** | ID of the catalog product group. | 
**Name** | **String** | Name of catalog product group | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**CreatedAt** | **Int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**UpdatedAt** | **Int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**CatalogId** | **String** |  | 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] 
**Type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] 
**Status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] 
**FeedId** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsVerticalProductGroup = Initialize-PSOpenAPIToolsCatalogsVerticalProductGroup  -CatalogType null `
 -Id 443727193917 `
 -Name Most Popular `
 -Description null `
 -Filters null `
 -CreatedAt 1621350033000 `
 -UpdatedAt 1622742155000 `
 -CatalogId null `
 -IsFeatured null `
 -Type null `
 -Status null `
 -FeedId null
```

- Convert the resource to JSON
```powershell
$CatalogsVerticalProductGroup | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

