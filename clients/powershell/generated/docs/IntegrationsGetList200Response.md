# IntegrationsGetList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**IntegrationRecord[]**](IntegrationRecord.md) |  | 

## Examples

- Prepare the resource
```powershell
$IntegrationsGetList200Response = Initialize-PSOpenAPIToolsIntegrationsGetList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$IntegrationsGetList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

