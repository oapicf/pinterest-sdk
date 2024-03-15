# CatalogsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**Catalog[]**](Catalog.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsList200Response = Initialize-PSOpenAPIToolsCatalogsList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$CatalogsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

