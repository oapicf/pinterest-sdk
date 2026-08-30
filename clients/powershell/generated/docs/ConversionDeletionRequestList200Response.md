# ConversionDeletionRequestList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**ConversionDeletionRequest[]**](ConversionDeletionRequest.md) |  | 

## Examples

- Prepare the resource
```powershell
$ConversionDeletionRequestList200Response = Initialize-PSOpenAPIToolsConversionDeletionRequestList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$ConversionDeletionRequestList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

