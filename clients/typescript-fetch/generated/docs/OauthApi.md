# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oauthConversionToken**](OauthApi.md#oauthconversiontoken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API |
| [**oauthToken**](OauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token |
| [**tokenRevoke**](OauthApi.md#tokenrevoke) | **POST** /oauth/token/revoke | Revoke a token |



## oauthConversionToken

> ConversionAccessToken oauthConversionToken()

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example

```ts
import {
  Configuration,
  OauthApi,
} from '';
import type { OauthConversionTokenRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new OauthApi(config);

  try {
    const data = await api.oauthConversionToken();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ConversionAccessToken**](ConversionAccessToken.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## oauthToken

> OauthAccessToken oauthToken(grantType, code, continuousRefresh, redirectUri, refreshToken, scope)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

### Example

```ts
import {
  Configuration,
  OauthApi,
} from '';
import type { OauthTokenRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basic
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new OauthApi(config);

  const body = {
    // TokenGrantType
    grantType: ...,
    // string (optional)
    code: code_example,
    // string |   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. (optional)
    continuousRefresh: continuousRefresh_example,
    // string (optional)
    redirectUri: redirectUri_example,
    // string (optional)
    refreshToken: refreshToken_example,
    // string (optional)
    scope: scope_example,
  } satisfies OauthTokenRequest;

  try {
    const data = await api.oauthToken(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | `TokenGrantType` |  | [Defaults to `undefined`] [Enum: authorization_code, refresh_token, client_credentials] |
| **code** | `string` |  | [Optional] [Defaults to `undefined`] |
| **continuousRefresh** | `string` |   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [Optional] [Defaults to `undefined`] |
| **redirectUri** | `string` |  | [Optional] [Defaults to `undefined`] |
| **refreshToken** | `string` |  | [Optional] [Defaults to `undefined`] |
| **scope** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**OauthAccessToken**](OauthAccessToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## tokenRevoke

> tokenRevoke(token, tokenTypeHint)

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Example

```ts
import {
  Configuration,
  OauthApi,
} from '';
import type { TokenRevokeRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basic
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new OauthApi(config);

  const body = {
    // string | The token to revoke.
    token: token_example,
    // TokenTypeHint | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional)
    tokenTypeHint: ...,
  } satisfies TokenRevokeRequest;

  try {
    const data = await api.tokenRevoke(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | `string` | The token to revoke. | [Defaults to `undefined`] |
| **tokenTypeHint** | `TokenTypeHint` | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [Optional] [Defaults to `undefined`] [Enum: access_token, refresh_token] |

### Return type

`void` (Empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

