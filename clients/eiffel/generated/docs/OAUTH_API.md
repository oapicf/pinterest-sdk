# OAUTH_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**oauth_conversion_token**](OAUTH_API.md#oauth_conversion_token) | **Post** /oauth/conversion_token | Generate OAuth access token for conversion API
[**oauth_token**](OAUTH_API.md#oauth_token) | **Post** /oauth/token | Generate OAuth access token
[**token_revoke**](OAUTH_API.md#token_revoke) | **Post** /oauth/token/revoke | Revoke a token


# **oauth_conversion_token**
> oauth_conversion_token : detachable CONVERSION_ACCESS_TOKEN


Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.


### Parameters
This endpoint does not need any parameter.

### Return type

[**CONVERSION_ACCESS_TOKEN**](ConversionAccessToken.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauth_token**
> oauth_token (grant_type: TOKEN_GRANT_TYPE ; code:  detachable STRING_32 ; continuous_refresh:  detachable STRING_32 ; redirect_uri:  detachable STRING_32 ; refresh_token:  detachable STRING_32 ; scope:  detachable STRING_32 ): detachable OAUTH_ACCESS_TOKEN


Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant_type** | [**TOKEN_GRANT_TYPE**](TokenGrantType.md)|  | [default to null]
 **code** | **STRING_32**|  | [optional] [default to null]
 **continuous_refresh** | **STRING_32**|   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional] [default to null]
 **redirect_uri** | **STRING_32**|  | [optional] [default to null]
 **refresh_token** | **STRING_32**|  | [optional] [default to null]
 **scope** | **STRING_32**|  | [optional] [default to null]

### Return type

[**OAUTH_ACCESS_TOKEN**](OauthAccessToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **token_revoke**
> token_revoke (token: STRING_32 ; token_type_hint:  detachable TOKEN_TYPE_HINT )


Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **STRING_32**| The token to revoke. | [default to null]
 **token_type_hint** | [**TOKEN_TYPE_HINT**](TokenTypeHint.md)| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

