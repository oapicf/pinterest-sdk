# CatalogsRetailItemsFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**ItemIds** | **String[]** |  | 
**CatalogId** | **String** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailItemsFilter = Initialize-PSOpenAPIToolsCatalogsRetailItemsFilter  -CatalogType null `
 -ItemIds null `
 -CatalogId null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailItemsFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
