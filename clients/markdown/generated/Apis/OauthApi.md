# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oauth/conversionToken**](OauthApi.md#oauth/conversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API |
| [**oauth/token**](OauthApi.md#oauth/token) | **POST** /oauth/token | Generate OAuth access token |
| [**token/revoke**](OauthApi.md#token/revoke) | **POST** /oauth/token/revoke | Revoke a token |


<a name="oauth/conversionToken"></a>
# **oauth/conversionToken**
> ConversionAccessTokenResponse oauth/conversionToken()

Generate OAuth access token for conversion API

    Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversionAccessTokenResponse**](../Models/ConversionAccessTokenResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="oauth/token"></a>
# **oauth/token**
> OauthAccessTokenResponse oauth/token(grant\_type)

Generate OAuth access token

    Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for &lt;a href&#x3D;&#39;/docs/getting-started/set-up-authentication-and-authorization/&#39; target&#x3D;&#39;blank&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.  &lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use &lt;a href&#x3D;&#39;/docs/developer-tools/token-debugger/&#39; target&#x3D;&#39;blank&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grant\_type** | **String**|  | [default to null] [enum: authorization_code, refresh_token, client_credentials] |

### Return type

[**OauthAccessTokenResponse**](../Models/OauthAccessTokenResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

<a name="token/revoke"></a>
# **token/revoke**
> token/revoke(token, token\_type\_hint)

Revoke a token

    Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| The token to revoke. | [default to null] |
| **token\_type\_hint** | **String**| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] [default to null] [enum: access_token, refresh_token] |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

