# CatalogsHotelItemsFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**HotelIds** | **String[]** |  | 
**CatalogId** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelItemsFilter = Initialize-PSOpenAPIToolsCatalogsHotelItemsFilter  -CatalogType null `
 -HotelIds null `
 -CatalogId null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelItemsFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

