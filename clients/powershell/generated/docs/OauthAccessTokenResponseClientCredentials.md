# OauthAccessTokenResponseClientCredentials
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessToken** | **String** |  | 
**ExpiresIn** | **Int32** |  | 
**ResponseType** | **String** |  | [optional] 
**Scope** | **String** |  | 
**TokenType** | **String** |  | [default to "bearer"]

## Examples

- Prepare the resource
```powershell
$OauthAccessTokenResponseClientCredentials = Initialize-PSOpenAPIToolsOauthAccessTokenResponseClientCredentials  -AccessToken null `
 -ExpiresIn null `
 -ResponseType null `
 -Scope null `
 -TokenType null
```

- Convert the resource to JSON
```powershell
$OauthAccessTokenResponseClientCredentials | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

