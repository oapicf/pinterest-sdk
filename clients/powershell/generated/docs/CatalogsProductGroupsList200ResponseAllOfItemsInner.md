# CatalogsProductGroupsList200ResponseAllOfItemsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | ID of the catalog product group. | 
**Name** | **String** | Name of catalog product group | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] 
**Type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] 
**Status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] 
**CreatedAt** | **Int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**UpdatedAt** | **Int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**FeedId** | **String** |  | 
**CatalogType** | **String** |  | 
**CatalogId** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupsList200ResponseAllOfItemsInner = Initialize-PSOpenAPIToolsCatalogsProductGroupsList200ResponseAllOfItemsInner  -Id 443727193917 `
 -Name Most Popular `
 -Description null `
 -Filters null `
 -IsFeatured null `
 -Type null `
 -Status null `
 -CreatedAt 1621350033000 `
 -UpdatedAt 1622742155000 `
 -FeedId null `
 -CatalogType null `
 -CatalogId null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupsList200ResponseAllOfItemsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

