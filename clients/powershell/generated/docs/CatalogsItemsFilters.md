# CatalogsItemsFilters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**CatalogId** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**ItemIds** | **String[]** |  | 
**HotelIds** | **String[]** |  | 
**CreativeAssetsIds** | **String[]** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsItemsFilters = Initialize-PSOpenAPIToolsCatalogsItemsFilters  -CatalogType null `
 -CatalogId null `
 -ItemIds null `
 -HotelIds null `
 -CreativeAssetsIds null
```

- Convert the resource to JSON
```powershell
$CatalogsItemsFilters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

