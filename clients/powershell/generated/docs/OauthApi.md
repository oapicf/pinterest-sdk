# PSOpenAPITools.PSOpenAPITools\Api.OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-OauthToken**](OauthApi.md#Invoke-OauthToken) | **POST** /oauth/token | Generate OAuth access token


<a id="Invoke-OauthToken"></a>
# **Invoke-OauthToken**
> OauthAccessTokenResponse Invoke-OauthToken<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GrantType] <String><br>

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basic
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$GrantType = "authorization_code" # String | 

# Generate OAuth access token
try {
    $Result = Invoke-OauthToken -GrantType $GrantType
} catch {
    Write-Host ("Exception occurred when calling Invoke-OauthToken: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GrantType** | **String**|  | 

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md) (PSCustomObject)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

