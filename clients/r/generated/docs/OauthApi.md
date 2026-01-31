# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OauthConversionToken**](OauthApi.md#OauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**OauthToken**](OauthApi.md#OauthToken) | **POST** /oauth/token | Generate OAuth access token
[**TokenRevoke**](OauthApi.md#TokenRevoke) | **POST** /oauth/token/revoke | Revoke a token


# **OauthConversionToken**
> ConversionAccessTokenResponse OauthConversionToken()

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example
```R
library(openapi)

# Generate OAuth access token for conversion API
#

api_instance <- OauthApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$OauthConversionToken(data_file = "result.txt")
result <- api_instance$OauthConversionToken()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversionAccessTokenResponse**](ConversionAccessTokenResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

# **OauthToken**
> OauthAccessTokenResponse OauthToken(grant_type)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.

### Example
```R
library(openapi)

# Generate OAuth access token
#
# prepare function argument(s)
var_grant_type <- "grant_type_example" # character | 

api_instance <- OauthApi$new()
# Configure HTTP basic authorization: basic
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$OauthToken(var_grant_typedata_file = "result.txt")
result <- api_instance$OauthToken(var_grant_type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant_type** | Enum [authorization_code, refresh_token, client_credentials] |  | 

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

# **TokenRevoke**
> TokenRevoke(token, token_type_hint = var.token_type_hint)

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Example
```R
library(openapi)

# Revoke a token
#
# prepare function argument(s)
var_token <- "token_example" # character | The token to revoke.
var_token_type_hint <- "token_type_hint_example" # character | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (Optional)

api_instance <- OauthApi$new()
# Configure HTTP basic authorization: basic
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$TokenRevoke(var_token, token_type_hint = var_token_type_hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **character**| The token to revoke. | 
 **token_type_hint** | Enum [access_token, refresh_token] | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] 

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
| **200** | Successful token revocation. No content is returned. |  -  |
| **401** | Client authentication error. |  -  |
| **403** | Client is not allowed to revoke token. |  -  |
| **0** | Unexpected error |  -  |

