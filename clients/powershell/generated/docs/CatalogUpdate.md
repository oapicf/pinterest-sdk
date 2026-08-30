# CatalogUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | [optional] 
**Name** | **String** | A human-friendly name associated to a catalog entity. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogUpdate = Initialize-PSOpenAPIToolsCatalogUpdate  -CatalogType null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

