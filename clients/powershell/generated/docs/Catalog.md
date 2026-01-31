# Catalog
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **System.DateTime** |  | 
**Id** | **String** | ID of the catalog entity. | 
**UpdatedAt** | **System.DateTime** |  | 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Name** | **String** | A human-friendly name associated to a catalog entity. | 

## Examples

- Prepare the resource
```powershell
$Catalog = Initialize-PSOpenAPIToolsCatalog  -CreatedAt 2022-03-14T15:15:22Z `
 -Id 864344156814050986 `
 -UpdatedAt 2022-03-14T15:16:34Z `
 -CatalogType null `
 -Name null
```

- Convert the resource to JSON
```powershell
$Catalog | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

