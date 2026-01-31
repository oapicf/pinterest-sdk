# OauthAccessTokenResponseRefresh
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessToken** | **String** |  | 
**ExpiresIn** | **Int32** |  | 
**ResponseType** | **String** |  | [optional] 
**Scope** | **String** |  | 
**TokenType** | **String** |  | [default to "bearer"]
**RefreshToken** | **String** |  | 
**RefreshTokenExpiresAt** | **Int32** |  | 
**RefreshTokenExpiresIn** | **Int32** |  | 

## Examples

- Prepare the resource
```powershell
$OauthAccessTokenResponseRefresh = Initialize-PSOpenAPIToolsOauthAccessTokenResponseRefresh  -AccessToken null `
 -ExpiresIn null `
 -ResponseType null `
 -Scope null `
 -TokenType null `
 -RefreshToken null `
 -RefreshTokenExpiresAt null `
 -RefreshTokenExpiresIn null
```

- Convert the resource to JSON
```powershell
$OauthAccessTokenResponseRefresh | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

