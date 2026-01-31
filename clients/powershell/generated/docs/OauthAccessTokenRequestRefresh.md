# OauthAccessTokenRequestRefresh
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RefreshToken** | **String** |  | 
**Scope** | **String** |  | [optional] 
**GrantType** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$OauthAccessTokenRequestRefresh = Initialize-PSOpenAPIToolsOauthAccessTokenRequestRefresh  -RefreshToken null `
 -Scope null `
 -GrantType null
```

- Convert the resource to JSON
```powershell
$OauthAccessTokenRequestRefresh | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

