# OAUTH_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**oauth_token**](OAUTH_API.md#oauth_token) | **Post** /oauth/token | Generate OAuth access token


# **oauth_token**
> oauth_token (grant_type: STRING_32 ): detachable OAUTH_ACCESS_TOKEN_RESPONSE


Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant_type** | **STRING_32**|  | [default to null]

### Return type

[**OAUTH_ACCESS_TOKEN_RESPONSE**](OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

