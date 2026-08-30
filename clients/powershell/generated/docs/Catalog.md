# Catalog
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**CreatedAt** | **System.DateTime** |  | [readonly] 
**Id** | **String** | ID of the catalog entity. | 
**Name** | **String** | A human-friendly name associated to a catalog entity. | 
**UpdatedAt** | **System.DateTime** |  | [readonly] 

## Examples

- Prepare the resource
```powershell
$Catalog = Initialize-PSOpenAPIToolsCatalog  -CatalogType null `
 -CreatedAt 2022-03-14T15:15:22Z `
 -Id 864344156814050986 `
 -Name null `
 -UpdatedAt 2022-03-14T15:16:34Z
```

- Convert the resource to JSON
```powershell
$Catalog | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

