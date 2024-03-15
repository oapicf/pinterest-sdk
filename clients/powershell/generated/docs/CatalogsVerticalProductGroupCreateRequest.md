# CatalogsVerticalProductGroupCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**Name** | **String** |  | 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**CatalogId** | **String** | Catalog id pertaining to the hotel product group. | 

## Examples

- Prepare the resource
```powershell
$CatalogsVerticalProductGroupCreateRequest = Initialize-PSOpenAPIToolsCatalogsVerticalProductGroupCreateRequest  -CatalogType null `
 -Name null `
 -Description null `
 -Filters null `
 -CatalogId 2680059592705
```

- Convert the resource to JSON
```powershell
$CatalogsVerticalProductGroupCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

