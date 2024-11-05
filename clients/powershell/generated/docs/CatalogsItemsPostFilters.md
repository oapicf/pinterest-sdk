# CatalogsItemsPostFilters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**ItemIds** | **String[]** |  | 
**CatalogId** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**HotelIds** | **String[]** |  | 
**CreativeAssetsIds** | **String[]** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsItemsPostFilters = Initialize-PSOpenAPIToolsCatalogsItemsPostFilters  -CatalogType null `
 -ItemIds null `
 -CatalogId null `
 -HotelIds null `
 -CreativeAssetsIds null
```

- Convert the resource to JSON
```powershell
$CatalogsItemsPostFilters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

