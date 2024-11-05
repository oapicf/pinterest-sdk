# CatalogsHotelListProductsByCatalogBasedFilterRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**CatalogId** | **String** | Catalog id pertaining to the hotel product group. | 
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelListProductsByCatalogBasedFilterRequest = Initialize-PSOpenAPIToolsCatalogsHotelListProductsByCatalogBasedFilterRequest  -CatalogType null `
 -CatalogId 2680059592705 `
 -Filters null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelListProductsByCatalogBasedFilterRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

