# OauthAccessTokenRequestRefresh
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GrantType** | **String** |  | 
**RefreshToken** | **String** |  | 
**Scope** | **String** |  | [optional] 
**RefreshOn** | **Boolean** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to &quot;&quot;everlasting_refresh&quot;&quot;. | [optional] 

## Examples

- Prepare the resource
```powershell
$OauthAccessTokenRequestRefresh = Initialize-PSOpenAPIToolsOauthAccessTokenRequestRefresh  -GrantType null `
 -RefreshToken null `
 -Scope null `
 -RefreshOn null
```

- Convert the resource to JSON
```powershell
$OauthAccessTokenRequestRefresh | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

