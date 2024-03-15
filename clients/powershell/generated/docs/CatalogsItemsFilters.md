# CatalogsItemsFilters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**ItemIds** | **String[]** |  | 
**CatalogId** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 
**HotelIds** | **String[]** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsItemsFilters = Initialize-PSOpenAPIToolsCatalogsItemsFilters  -CatalogType null `
 -ItemIds null `
 -CatalogId null `
 -HotelIds null
```

- Convert the resource to JSON
```powershell
$CatalogsItemsFilters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

