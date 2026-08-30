# UserWebsiteCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VerificationMethod** | [**WebsiteVerificationMethod**](WebsiteVerificationMethod.md) | Method used to verify website ownership. | [optional] 
**Website** | **String** | Website with path or domain only | [optional] 

## Examples

- Prepare the resource
```powershell
$UserWebsiteCreate = Initialize-PSOpenAPIToolsUserWebsiteCreate  -VerificationMethod null `
 -Website null
```

- Convert the resource to JSON
```powershell
$UserWebsiteCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

