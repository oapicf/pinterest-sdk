# OauthAccessTokenResponseCode
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RefreshToken** | **String** |  | 
**RefreshTokenExpiresIn** | **Int32** |  | 
**ResponseType** | **String** |  | [optional] 
**AccessToken** | **String** |  | 
**TokenType** | **String** |  | [default to "bearer"]
**ExpiresIn** | **Int32** |  | 
**Scope** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$OauthAccessTokenResponseCode = Initialize-PSOpenAPIToolsOauthAccessTokenResponseCode  -RefreshToken null `
 -RefreshTokenExpiresIn null `
 -ResponseType null `
 -AccessToken null `
 -TokenType null `
 -ExpiresIn null `
 -Scope null
```

- Convert the resource to JSON
```powershell
$OauthAccessTokenResponseCode | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

