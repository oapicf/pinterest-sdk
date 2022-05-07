# oauth_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**oauth/token**](oauth_api.md#oauth/token) | **POST** /oauth/token | Generate OAuth access token


# **oauth/token**
> models::OauthAccessTokenResponse oauth/token(grant_type)
Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **grant_type** | **String**|  | 

### Return type

[**models::OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

