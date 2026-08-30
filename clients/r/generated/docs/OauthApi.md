# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OauthConversionToken**](OauthApi.md#OauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**OauthToken**](OauthApi.md#OauthToken) | **POST** /oauth/token | Generate OAuth access token
[**TokenRevoke**](OauthApi.md#TokenRevoke) | **POST** /oauth/token/revoke | Revoke a token


# **OauthConversionToken**
> ConversionAccessToken OauthConversionToken()

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

[**ConversionAccessToken**](ConversionAccessToken.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **OauthToken**
> OauthAccessToken OauthToken(grant_type, code = var.code, continuous_refresh = var.continuous_refresh, redirect_uri = var.redirect_uri, refresh_token = var.refresh_token, scope = var.scope)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

### Example
```R
library(openapi)

# Generate OAuth access token
#
# prepare function argument(s)
var_grant_type <- TokenGrantType$new() # TokenGrantType | 
var_code <- "code_example" # character |  (Optional)
var_continuous_refresh <- "continuous_refresh_example" # character |   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. (Optional)
var_redirect_uri <- "redirect_uri_example" # character |  (Optional)
var_refresh_token <- "refresh_token_example" # character |  (Optional)
var_scope <- "scope_example" # character |  (Optional)

api_instance <- OauthApi$new()
# Configure HTTP basic authorization: basic
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$OauthToken(var_grant_type, code = var_code, continuous_refresh = var_continuous_refresh, redirect_uri = var_redirect_uri, refresh_token = var_refresh_token, scope = var_scopedata_file = "result.txt")
result <- api_instance$OauthToken(var_grant_type, code = var_code, continuous_refresh = var_continuous_refresh, redirect_uri = var_redirect_uri, refresh_token = var_refresh_token, scope = var_scope)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant_type** | [**TokenGrantType**](TokenGrantType.md)|  | 
 **code** | **character**|  | [optional] 
 **continuous_refresh** | **character**|   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional] 
 **redirect_uri** | **character**|  | [optional] 
 **refresh_token** | **character**|  | [optional] 
 **scope** | **character**|  | [optional] 

### Return type

[**OauthAccessToken**](OauthAccessToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

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
var_token_type_hint <- TokenTypeHint$new() # TokenTypeHint | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (Optional)

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
 **token_type_hint** | [**TokenTypeHint**](TokenTypeHint.md)| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] 

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
| **200** | The request has succeeded. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **0** | An unexpected error response. |  -  |

