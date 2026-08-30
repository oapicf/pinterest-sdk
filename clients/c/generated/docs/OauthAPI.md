# OauthAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OauthAPI_oauthConversionToken**](OauthAPI.md#OauthAPI_oauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**OauthAPI_oauthToken**](OauthAPI.md#OauthAPI_oauthToken) | **POST** /oauth/token | Generate OAuth access token
[**OauthAPI_tokenRevoke**](OauthAPI.md#OauthAPI_tokenRevoke) | **POST** /oauth/token/revoke | Revoke a token


# **OauthAPI_oauthConversionToken**
```c
// Generate OAuth access token for conversion API
//
// Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
//
conversion_access_token_t* OauthAPI_oauthConversionToken(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[conversion_access_token_t](conversion_access_token.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OauthAPI_oauthToken**
```c
// Generate OAuth access token
//
// Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
//
oauth_access_token_t* OauthAPI_oauthToken(apiClient_t *apiClient, token_grant_type_e grant_type, char *code, char *continuous_refresh, char *redirect_uri, char *refresh_token, char *scope);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**grant_type** | **token_grant_type_e** |  | 
**code** | **char \*** |  | [optional] 
**continuous_refresh** | **char \*** |   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional] 
**redirect_uri** | **char \*** |  | [optional] 
**refresh_token** | **char \*** |  | [optional] 
**scope** | **char \*** |  | [optional] 

### Return type

[oauth_access_token_t](oauth_access_token.md) *


### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OauthAPI_tokenRevoke**
```c
// Revoke a token
//
// Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
//
void OauthAPI_tokenRevoke(apiClient_t *apiClient, char *token, token_type_hint);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**token** | **char \*** | The token to revoke. | 
**token_type_hint** |  | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] 

### Return type

void

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

