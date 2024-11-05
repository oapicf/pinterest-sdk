# CatalogsCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** | Type of the catalog entity. | 
**Name** | **String** | A human-friendly name associated to a given catalog. | 

## Examples

- Prepare the resource
```powershell
$CatalogsCreateRequest = Initialize-PSOpenAPIToolsCatalogsCreateRequest  -CatalogType null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogsCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

