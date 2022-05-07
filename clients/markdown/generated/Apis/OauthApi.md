# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth/token**](OauthApi.md#oauth/token) | **POST** /oauth/token | Generate OAuth access token


<a name="oauth/token"></a>
# **oauth/token**
> OauthAccessTokenResponse oauth/token(grant\_type)

Generate OAuth access token

    Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant\_type** | **String**|  | [default to null] [enum: authorization_code, refresh_token]

### Return type

[**OauthAccessTokenResponse**](../Models/OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

