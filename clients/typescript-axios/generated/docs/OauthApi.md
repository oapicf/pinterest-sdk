# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**oauthConversionToken**](#oauthconversiontoken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API|
|[**oauthToken**](#oauthtoken) | **POST** /oauth/token | Generate OAuth access token|
|[**tokenRevoke**](#tokenrevoke) | **POST** /oauth/token/revoke | Revoke a token|

# **oauthConversionToken**
> ConversionAccessToken oauthConversionToken()

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example

```typescript
import {
    OauthApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new OauthApi(configuration);

const { status, data } = await apiInstance.oauthConversionToken();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**ConversionAccessToken**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauthToken**
> OauthAccessToken oauthToken()

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

### Example

```typescript
import {
    OauthApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new OauthApi(configuration);

let grantType: TokenGrantType; // (default to undefined)
let code: string; // (optional) (default to undefined)
let continuousRefresh: string; //  If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. (optional) (default to undefined)
let redirectUri: string; // (optional) (default to undefined)
let refreshToken: string; // (optional) (default to undefined)
let scope: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.oauthToken(
    grantType,
    code,
    continuousRefresh,
    redirectUri,
    refreshToken,
    scope
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **grantType** | **TokenGrantType** |  | defaults to undefined|
| **code** | [**string**] |  | (optional) defaults to undefined|
| **continuousRefresh** | [**string**] |   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | (optional) defaults to undefined|
| **redirectUri** | [**string**] |  | (optional) defaults to undefined|
| **refreshToken** | [**string**] |  | (optional) defaults to undefined|
| **scope** | [**string**] |  | (optional) defaults to undefined|


### Return type

**OauthAccessToken**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tokenRevoke**
> tokenRevoke()

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Example

```typescript
import {
    OauthApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new OauthApi(configuration);

let token: string; //The token to revoke. (default to undefined)
let tokenTypeHint: TokenTypeHint; //The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional) (default to undefined)

const { status, data } = await apiInstance.tokenRevoke(
    token,
    tokenTypeHint
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **token** | [**string**] | The token to revoke. | defaults to undefined|
| **tokenTypeHint** | **TokenTypeHint** | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | (optional) defaults to undefined|


### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

