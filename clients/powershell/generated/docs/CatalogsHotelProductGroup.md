# CatalogsHotelProductGroup
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**Id** | **String** | ID of the hotel product group. | 
**Name** | **String** | Name of hotel product group | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**CreatedAt** | **Int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**UpdatedAt** | **Int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**CatalogId** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelProductGroup = Initialize-PSOpenAPIToolsCatalogsHotelProductGroup  -CatalogType null `
 -Id 443727193917 `
 -Name Most Popular `
 -Description null `
 -Filters null `
 -CreatedAt 1621350033000 `
 -UpdatedAt 1622742155000 `
 -CatalogId null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelProductGroup | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

