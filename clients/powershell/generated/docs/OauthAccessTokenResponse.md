# OauthAccessTokenResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResponseType** | **String** |  | [optional] 
**AccessToken** | **String** |  | 
**TokenType** | **String** |  | [default to "bearer"]
**ExpiresIn** | **Int32** |  | 
**Scope** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$OauthAccessTokenResponse = Initialize-PSOpenAPIToolsOauthAccessTokenResponse  -ResponseType null `
 -AccessToken null `
 -TokenType null `
 -ExpiresIn null `
 -Scope null
```

- Convert the resource to JSON
```powershell
$OauthAccessTokenResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

