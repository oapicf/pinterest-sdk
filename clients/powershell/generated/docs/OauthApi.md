# PSOpenAPITools.PSOpenAPITools\Api.OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-OauthConversionToken**](OauthApi.md#Invoke-OauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**Invoke-OauthToken**](OauthApi.md#Invoke-OauthToken) | **POST** /oauth/token | Generate OAuth access token
[**Invoke-TokenRevoke**](OauthApi.md#Invoke-TokenRevoke) | **POST** /oauth/token/revoke | Revoke a token


<a id="Invoke-OauthConversionToken"></a>
# **Invoke-OauthConversionToken**
> ConversionAccessToken Invoke-OauthConversionToken<br>

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"


# Generate OAuth access token for conversion API
try {
    $Result = Invoke-OauthConversionToken
} catch {
    Write-Host ("Exception occurred when calling Invoke-OauthConversionToken: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversionAccessToken**](ConversionAccessToken.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-OauthToken"></a>
# **Invoke-OauthToken**
> OauthAccessToken Invoke-OauthToken<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GrantType] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Code] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ContinuousRefresh] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RedirectUri] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RefreshToken] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Scope] <String><br>

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basic
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$GrantType = "authorization_code" # TokenGrantType | 
$Code = "MyCode" # String |  (optional)
$ContinuousRefresh = "MyContinuousRefresh" # String |   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. (optional)
$RedirectUri = "MyRedirectUri" # String |  (optional)
$RefreshToken = "MyRefreshToken" # String |  (optional)
$Scope = "MyScope" # String |  (optional)

# Generate OAuth access token
try {
    $Result = Invoke-OauthToken -GrantType $GrantType -Code $Code -ContinuousRefresh $ContinuousRefresh -RedirectUri $RedirectUri -RefreshToken $RefreshToken -Scope $Scope
} catch {
    Write-Host ("Exception occurred when calling Invoke-OauthToken: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GrantType** | [**TokenGrantType**](TokenGrantType.md)|  | 
 **Code** | **String**|  | [optional] 
 **ContinuousRefresh** | **String**|   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional] 
 **RedirectUri** | **String**|  | [optional] 
 **RefreshToken** | **String**|  | [optional] 
 **Scope** | **String**|  | [optional] 

### Return type

[**OauthAccessToken**](OauthAccessToken.md) (PSCustomObject)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-TokenRevoke"></a>
# **Invoke-TokenRevoke**
> void Invoke-TokenRevoke<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Token] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TokenTypeHint] <PSCustomObject><br>

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basic
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Token = "MyToken" # String | The token to revoke.
$TokenTypeHint = "access_token" # TokenTypeHint | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional)

# Revoke a token
try {
    $Result = Invoke-TokenRevoke -Token $Token -TokenTypeHint $TokenTypeHint
} catch {
    Write-Host ("Exception occurred when calling Invoke-TokenRevoke: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Token** | **String**| The token to revoke. | 
 **TokenTypeHint** | [**TokenTypeHint**](TokenTypeHint.md)| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

