# PinterestSdkClient::OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**oauth_conversion_token**](OauthApi.md#oauth_conversion_token) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API |
| [**oauth_token**](OauthApi.md#oauth_token) | **POST** /oauth/token | Generate OAuth access token |
| [**token_revoke**](OauthApi.md#token_revoke) | **POST** /oauth/token/revoke | Revoke a token |


## oauth_conversion_token

> <ConversionAccessToken> oauth_conversion_token

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

> <Array(<ConversionAccessToken>, Integer, Hash)> oauth_conversion_token_with_http_info

```ruby
begin
  # Generate OAuth access token for conversion API
  data, status_code, headers = api_instance.oauth_conversion_token_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionAccessToken>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OauthApi->oauth_conversion_token_with_http_info: #{e}"
end
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


## oauth_token

> <OauthAccessToken> oauth_token(grant_type, opts)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

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
grant_type = PinterestSdkClient::TokenGrantType::AUTHORIZATION_CODE # TokenGrantType | 
opts = {
  code: 'code_example', # String | 
  continuous_refresh: 'continuous_refresh_example', # String |   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.
  redirect_uri: 'redirect_uri_example', # String | 
  refresh_token: 'refresh_token_example', # String | 
  scope: 'scope_example' # String | 
}

begin
  # Generate OAuth access token
  result = api_instance.oauth_token(grant_type, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OauthApi->oauth_token: #{e}"
end
```

#### Using the oauth_token_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OauthAccessToken>, Integer, Hash)> oauth_token_with_http_info(grant_type, opts)

```ruby
begin
  # Generate OAuth access token
  data, status_code, headers = api_instance.oauth_token_with_http_info(grant_type, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OauthAccessToken>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OauthApi->oauth_token_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **grant_type** | [**TokenGrantType**](TokenGrantType.md) |  |  |
| **code** | **String** |  | [optional] |
| **continuous_refresh** | **String** |   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional] |
| **redirect_uri** | **String** |  | [optional] |
| **refresh_token** | **String** |  | [optional] |
| **scope** | **String** |  | [optional] |

### Return type

[**OauthAccessToken**](OauthAccessToken.md)

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
  token_type_hint: PinterestSdkClient::TokenTypeHint::ACCESS_TOKEN # TokenTypeHint | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
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
| **token_type_hint** | [**TokenTypeHint**](TokenTypeHint.md) | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] |

### Return type

nil (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

