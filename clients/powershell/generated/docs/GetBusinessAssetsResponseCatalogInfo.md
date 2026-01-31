# GetBusinessAssetsResponseCatalogInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** | Catalog type | [optional] 
**Id** | **String** | Catalog ID. | [optional] 
**Name** | **String** | Catalog name | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBusinessAssetsResponseCatalogInfo = Initialize-PSOpenAPIToolsGetBusinessAssetsResponseCatalogInfo  -CatalogType PRODUCT `
 -Id 4836859046874 `
 -Name Canada Catalog
```

- Convert the resource to JSON
```powershell
$GetBusinessAssetsResponseCatalogInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

