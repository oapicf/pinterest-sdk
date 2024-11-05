# CatalogsCreativeAssetsItemsPostFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**CreativeAssetsIds** | **String[]** |  | 
**CatalogId** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsItemsPostFilter = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsItemsPostFilter  -CatalogType null `
 -CreativeAssetsIds null `
 -CatalogId null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsItemsPostFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

