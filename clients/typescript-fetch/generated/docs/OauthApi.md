# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oauthConversionToken**](OauthApi.md#oauthconversiontoken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API |
| [**oauthToken**](OauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token |
| [**tokenRevoke**](OauthApi.md#tokenrevoke) | **POST** /oauth/token/revoke | Revoke a token |



## oauthConversionToken

> ConversionAccessTokenResponse oauthConversionToken()

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

[**ConversionAccessTokenResponse**](ConversionAccessTokenResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## oauthToken

> OauthAccessTokenResponse oauthToken(grantType)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for &lt;a href&#x3D;\&#39;/docs/getting-started/set-up-authentication-and-authorization/\&#39; target&#x3D;\&#39;blank\&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.  &lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use &lt;a href&#x3D;\&#39;/docs/developer-tools/token-debugger/\&#39; target&#x3D;\&#39;blank\&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token.

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
    // string
    grantType: grantType_example,
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
| **grantType** | `authorization_code`, `refresh_token`, `client_credentials` |  | [Defaults to `undefined`] [Enum: authorization_code, refresh_token, client_credentials] |

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

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
    // string | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional)
    tokenTypeHint: tokenTypeHint_example,
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
| **tokenTypeHint** | `access_token`, `refresh_token` | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [Optional] [Defaults to `undefined`] [Enum: access_token, refresh_token] |

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
| **200** | Successful token revocation. No content is returned. |  -  |
| **401** | Client authentication error. |  -  |
| **403** | Client is not allowed to revoke token. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

