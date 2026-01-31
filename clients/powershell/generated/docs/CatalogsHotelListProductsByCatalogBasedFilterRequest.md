# CatalogsHotelListProductsByCatalogBasedFilterRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the hotel product group. | 
**CatalogType** | **String** |  | 
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelListProductsByCatalogBasedFilterRequest = Initialize-PSOpenAPIToolsCatalogsHotelListProductsByCatalogBasedFilterRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Filters null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelListProductsByCatalogBasedFilterRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

