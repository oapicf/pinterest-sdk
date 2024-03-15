# CatalogsProductGroupsUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] 
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | [optional] 
**CatalogType** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupsUpdateRequest = Initialize-PSOpenAPIToolsCatalogsProductGroupsUpdateRequest  -Name null `
 -Description null `
 -IsFeatured null `
 -Filters null `
 -CatalogType null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupsUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

