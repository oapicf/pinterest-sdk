# IntegrationLogClientRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Method** | **String** |  | 
**VarHost** | **String** | HTTP request host from host header. | 
**Path** | **String** | HTTP request path. | 
**RequestHeaders** | **System.Collections.Hashtable** | HTTP request headers as key-value pairs. | [optional] 
**ResponseHeaders** | **System.Collections.Hashtable** | HTTP response headers as key-value pairs. | [optional] 
**ResponseStatusCode** | **Int32** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$IntegrationLogClientRequest = Initialize-PSOpenAPIToolsIntegrationLogClientRequest  -Method null `
 -VarHost null `
 -Path null `
 -RequestHeaders null `
 -ResponseHeaders null `
 -ResponseStatusCode null
```

- Convert the resource to JSON
```powershell
$IntegrationLogClientRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

