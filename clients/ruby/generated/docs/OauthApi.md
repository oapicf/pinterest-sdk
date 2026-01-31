# PinterestSdkClient::OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**oauth_conversion_token**](OauthApi.md#oauth_conversion_token) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API |
| [**oauth_token**](OauthApi.md#oauth_token) | **POST** /oauth/token | Generate OAuth access token |
| [**token_revoke**](OauthApi.md#token_revoke) | **POST** /oauth/token/revoke | Revoke a token |


## oauth_conversion_token

> <ConversionAccessTokenResponse> oauth_conversion_token

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::OauthApi.new

begin
  # Generate OAuth access token for conversion API
  result = api_instance.oauth_conversion_token
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OauthApi->oauth_conversion_token: #{e}"
end
```

#### Using the oauth_conversion_token_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionAccessTokenResponse>, Integer, Hash)> oauth_conversion_token_with_http_info

```ruby
begin
  # Generate OAuth access token for conversion API
  data, status_code, headers = api_instance.oauth_conversion_token_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionAccessTokenResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OauthApi->oauth_conversion_token_with_http_info: #{e}"
end
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


## oauth_token

> <OauthAccessTokenResponse> oauth_token(grant_type)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = PinterestSdkClient::OauthApi.new
grant_type = 'authorization_code' # String | 

begin
  # Generate OAuth access token
  result = api_instance.oauth_token(grant_type)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OauthApi->oauth_token: #{e}"
end
```

#### Using the oauth_token_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OauthAccessTokenResponse>, Integer, Hash)> oauth_token_with_http_info(grant_type)

```ruby
begin
  # Generate OAuth access token
  data, status_code, headers = api_instance.oauth_token_with_http_info(grant_type)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OauthAccessTokenResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OauthApi->oauth_token_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **grant_type** | **String** |  |  |

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## token_revoke

> token_revoke(token, opts)

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = PinterestSdkClient::OauthApi.new
token = 'token_example' # String | The token to revoke.
opts = {
  token_type_hint: 'access_token' # String | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
}

begin
  # Revoke a token
  api_instance.token_revoke(token, opts)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OauthApi->token_revoke: #{e}"
end
```

#### Using the token_revoke_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> token_revoke_with_http_info(token, opts)

```ruby
begin
  # Revoke a token
  data, status_code, headers = api_instance.token_revoke_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OauthApi->token_revoke_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | The token to revoke. |  |
| **token_type_hint** | **String** | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] |

### Return type

nil (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

