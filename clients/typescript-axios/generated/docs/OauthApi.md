# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**oauthConversionToken**](#oauthconversiontoken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API|
|[**oauthToken**](#oauthtoken) | **POST** /oauth/token | Generate OAuth access token|
|[**tokenRevoke**](#tokenrevoke) | **POST** /oauth/token/revoke | Revoke a token|

# **oauthConversionToken**
> ConversionAccessTokenResponse oauthConversionToken()

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

**ConversionAccessTokenResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | response |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauthToken**
> OauthAccessTokenResponse oauthToken()

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href=\'/docs/getting-started/set-up-authentication-and-authorization/\' target=\'blank\'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href=\'/docs/developer-tools/token-debugger/\' target=\'blank\'>Token Debugger</a> to validate and inspect your access token.

### Example

```typescript
import {
    OauthApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new OauthApi(configuration);

let grantType: string; // (default to undefined)

const { status, data } = await apiInstance.oauthToken(
    grantType
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **grantType** | [**string**]**Array<&#39;authorization_code&#39; &#124; &#39;refresh_token&#39; &#124; &#39;client_credentials&#39;>** |  | defaults to undefined|


### Return type

**OauthAccessTokenResponse**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | response |  -  |
|**0** | Unexpected error |  -  |

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
let tokenTypeHint: string; //The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional) (default to undefined)

const { status, data } = await apiInstance.tokenRevoke(
    token,
    tokenTypeHint
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **token** | [**string**] | The token to revoke. | defaults to undefined|
| **tokenTypeHint** | [**string**]**Array<&#39;access_token&#39; &#124; &#39;refresh_token&#39;>** | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | (optional) defaults to undefined|


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
|**200** | Successful token revocation. No content is returned. |  -  |
|**401** | Client authentication error. |  -  |
|**403** | Client is not allowed to revoke token. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

