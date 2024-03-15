# OauthAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OauthAPI_oauthToken**](OauthAPI.md#OauthAPI_oauthToken) | **POST** /oauth/token | Generate OAuth access token


# **OauthAPI_oauthToken**
```c
// Generate OAuth access token
//
// Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
//
oauth_access_token_response_t* OauthAPI_oauthToken(apiClient_t *apiClient, pinterest_rest_api_oauthToken_grant_type_e grant_type);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**grant_type** | **pinterest_rest_api_oauthToken_grant_type_e** |  | 

### Return type

[oauth_access_token_response_t](oauth_access_token_response.md) *


### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

