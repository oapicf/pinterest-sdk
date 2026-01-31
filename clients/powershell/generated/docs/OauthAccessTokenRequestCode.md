# OauthAccessTokenRequestCode
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **String** |  | 
**RedirectUri** | **String** |  | 
**GrantType** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$OauthAccessTokenRequestCode = Initialize-PSOpenAPIToolsOauthAccessTokenRequestCode  -Code null `
 -RedirectUri null `
 -GrantType null
```

- Convert the resource to JSON
```powershell
$OauthAccessTokenRequestCode | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

