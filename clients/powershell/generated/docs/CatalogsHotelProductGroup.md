# CatalogsHotelProductGroup
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog ID pertaining to the product group. | 
**CatalogType** | **String** |  | 
**CreatedAt** | **Int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**Id** | **String** | ID of the catalog product group. | 
**Name** | **String** | Name of catalog product group | [optional] 
**Type** | [**CatalogsHotelProductGroupType**](CatalogsHotelProductGroupType.md) |  | 
**UpdatedAt** | **Int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelProductGroup = Initialize-PSOpenAPIToolsCatalogsHotelProductGroup  -CatalogId 2680059592705 `
 -CatalogType null `
 -CreatedAt 1621350033000 `
 -Description null `
 -Filters null `
 -Id 443727193917 `
 -Name Most Popular `
 -Type null `
 -UpdatedAt 1622742155000
```

- Convert the resource to JSON
```powershell
$CatalogsHotelProductGroup | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

