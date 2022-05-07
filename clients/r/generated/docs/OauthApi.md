# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OauthToken**](OauthApi.md#OauthToken) | **POST** /oauth/token | Generate OAuth access token


# **OauthToken**
> OauthAccessTokenResponse OauthToken(grant.type)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.

### Example
```R
library(openapi)

var.grant.type <- 'grant.type_example' # character | 

#Generate OAuth access token
api.instance <- OauthApi$new()
result <- api.instance$OauthToken(var.grant.type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant.type** | Enum [authorization_code, refresh_token] |  | 

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

