# CatalogsHotelProductGroupCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog ID pertaining to the product group. | 
**CatalogType** | **String** |  | 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**Name** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelProductGroupCreateRequest = Initialize-PSOpenAPIToolsCatalogsHotelProductGroupCreateRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Description null `
 -Filters null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelProductGroupCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

