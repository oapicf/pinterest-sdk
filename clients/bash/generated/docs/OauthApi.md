# OauthApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthConversionToken**](OauthApi.md#oauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**oauthToken**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token
[**tokenRevoke**](OauthApi.md#tokenRevoke) | **POST** /oauth/token/revoke | Revoke a token



## oauthConversionToken

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example

```bash
 oauthConversionToken
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ConversionAccessToken**](ConversionAccessToken.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## oauthToken

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.

Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).

**Note:** If your app was created **before September 25, 2025**, make sure to set the 'continuous_refresh' parameter to 'true' to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).

Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.

Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token.

### Example

```bash
 oauthToken
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | [**TokenGrantType**](TokenGrantType.md) |  | [default to null]
 **code** | **string** |  | [optional] [default to null]
 **continuousRefresh** | **string** | If your app was created before **September 25, 2025**, set to 'true' to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.

  If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional] [default to null]
 **redirectUri** | **string** |  | [optional] [default to null]
 **refreshToken** | **string** |  | [optional] [default to null]
 **scope** | **string** |  | [optional] [default to null]

### Return type

[**OauthAccessToken**](OauthAccessToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tokenRevoke

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Example

```bash
 tokenRevoke
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | The token to revoke. | [default to null]
 **tokenTypeHint** | [**TokenTypeHint**](TokenTypeHint.md) | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

