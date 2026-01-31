# CatalogsHotelItemsPostFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 
**CatalogType** | **String** |  | 
**HotelIds** | **String[]** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelItemsPostFilter = Initialize-PSOpenAPIToolsCatalogsHotelItemsPostFilter  -CatalogId null `
 -CatalogType null `
 -HotelIds null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelItemsPostFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

