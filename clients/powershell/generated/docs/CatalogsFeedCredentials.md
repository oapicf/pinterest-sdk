# CatalogsFeedCredentials
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Password** | **String** | The required password for downloading a feed. | 
**Username** | **String** | The required username for downloading a feed. | 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedCredentials = Initialize-PSOpenAPIToolsCatalogsFeedCredentials  -Password null `
 -Username null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedCredentials | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

