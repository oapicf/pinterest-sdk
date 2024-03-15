# OauthAccessTokenRequestCode
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GrantType** | **String** |  | 
**Code** | **String** |  | 
**RedirectUri** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$OauthAccessTokenRequestCode = Initialize-PSOpenAPIToolsOauthAccessTokenRequestCode  -GrantType null `
 -Code null `
 -RedirectUri null
```

- Convert the resource to JSON
```powershell
$OauthAccessTokenRequestCode | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

