# OauthAccessTokenResponseIntegrationRefresh
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RefreshToken** | **String** |  | 
**RefreshTokenExpiresIn** | **Int32** |  | 
**AccessToken** | **String** |  | 
**ExpiresIn** | **Int32** |  | 
**ResponseType** | **String** |  | [optional] 
**Scope** | **String** |  | 
**TokenType** | **String** |  | [default to "bearer"]

## Examples

- Prepare the resource
```powershell
$OauthAccessTokenResponseIntegrationRefresh = Initialize-PSOpenAPIToolsOauthAccessTokenResponseIntegrationRefresh  -RefreshToken null `
 -RefreshTokenExpiresIn null `
 -AccessToken null `
 -ExpiresIn null `
 -ResponseType null `
 -Scope null `
 -TokenType null
```

- Convert the resource to JSON
```powershell
$OauthAccessTokenResponseIntegrationRefresh | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

