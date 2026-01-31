# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oauthToken**](OauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token |



## oauthToken

> OauthAccessTokenResponse oauthToken(grantType)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See &lt;a href&#x3D;\&#39;/docs/getting-started/authentication-and-scopes/\&#39;&gt;Authentication&lt;/a&gt; for more.  &lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  &lt;strong&gt;Grant type &lt;i&gt;client_credentials&lt;/i&gt; and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.&lt;/strong&gt;

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

