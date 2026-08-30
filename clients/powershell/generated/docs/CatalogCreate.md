# CatalogCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Name** | **String** | A human-friendly name associated to a catalog entity. | 

## Examples

- Prepare the resource
```powershell
$CatalogCreate = Initialize-PSOpenAPIToolsCatalogCreate  -CatalogType null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

