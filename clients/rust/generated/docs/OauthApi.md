# \OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth_slash_conversion_token**](OauthApi.md#oauth_slash_conversion_token) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**oauth_slash_token**](OauthApi.md#oauth_slash_token) | **POST** /oauth/token | Generate OAuth access token
[**token_slash_revoke**](OauthApi.md#token_slash_revoke) | **POST** /oauth/token/revoke | Revoke a token



## oauth_slash_conversion_token

> models::ConversionAccessToken oauth_slash_conversion_token()
Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::ConversionAccessToken**](ConversionAccessToken.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## oauth_slash_token

> models::OauthAccessToken oauth_slash_token(grant_type, code, continuous_refresh, redirect_uri, refresh_token, scope)
Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**grant_type** | [**models::TokenGrantType**](TokenGrantType.md) |  | [required] |
**code** | Option<**String**> |  |  |
**continuous_refresh** | Option<**String**> |   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. |  |
**redirect_uri** | Option<**String**> |  |  |
**refresh_token** | Option<**String**> |  |  |
**scope** | Option<**String**> |  |  |

### Return type

[**models::OauthAccessToken**](OauthAccessToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## token_slash_revoke

> token_slash_revoke(token, token_type_hint)
Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**token** | **String** | The token to revoke. | [required] |
**token_type_hint** | Option<[**models::TokenTypeHint**](TokenTypeHint.md)> | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. |  |

### Return type

 (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

