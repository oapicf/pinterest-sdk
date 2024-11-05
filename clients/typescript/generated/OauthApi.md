# .OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token


# **oauthToken**
> OauthAccessTokenResponse oauthToken()

Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href=\'/docs/getting-started/authentication-and-scopes/\'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>  <strong>Grant type <i>client_credentials</i> and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.</strong>

### Example


```typescript
import { createConfiguration, OauthApi } from '';
import type { OauthApiOauthTokenRequest } from '';

const configuration = createConfiguration();
const apiInstance = new OauthApi(configuration);

const request: OauthApiOauthTokenRequest = {
  
  grantType: "authorization_code",
};

const data = await apiInstance.oauthToken(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | [**string**]**Array<&#39;authorization_code&#39; &#124; &#39;refresh_token&#39; &#124; &#39;client_credentials&#39;>** |  | defaults to undefined


### Return type

**OauthAccessTokenResponse**

### Authorization

[basic](README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


