# CatalogBinding
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** | Catalog type | [optional] 
**Id** | **String** | Catalog ID. | [optional] 
**Name** | **String** | Catalog name | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogBinding = Initialize-PSOpenAPIToolsCatalogBinding  -CatalogType null `
 -Id null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogBinding | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

