# OauthAccessToken
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessToken** | **String** |  | [readonly] 
**ExpiresIn** | **Int32** |  | [readonly] 
**RefreshToken** | **String** |  | [optional] 
**RefreshTokenExpiresAt** | **Int32** |  | [optional] [readonly] 
**RefreshTokenExpiresIn** | **Int32** |  | [optional] [readonly] 
**ResponseType** | [**TokenGrantType**](TokenGrantType.md) |  | [optional] [readonly] 
**Scope** | **String** |  | [optional] 
**TokenType** | **String** |  | [readonly] [default to "bearer"]

## Examples

- Prepare the resource
```powershell
$OauthAccessToken = Initialize-PSOpenAPIToolsOauthAccessToken  -AccessToken null `
 -ExpiresIn null `
 -RefreshToken null `
 -RefreshTokenExpiresAt null `
 -RefreshTokenExpiresIn null `
 -ResponseType null `
 -Scope null `
 -TokenType null
```

- Convert the resource to JSON
```powershell
$OauthAccessToken | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

