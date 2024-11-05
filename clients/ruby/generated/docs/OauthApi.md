# PinterestSdkClient::OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**oauth_token**](OauthApi.md#oauth_token) | **POST** /oauth/token | Generate OAuth access token |


## oauth_token

> <OauthAccessTokenResponse> oauth_token(grant_type)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication-and-scopes/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  <strong>Grant type <i>client_credentials</i> and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.</strong>

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

