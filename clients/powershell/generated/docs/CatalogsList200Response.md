# CatalogsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**Catalog[]**](Catalog.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsList200Response = Initialize-PSOpenAPIToolsCatalogsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CatalogsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

