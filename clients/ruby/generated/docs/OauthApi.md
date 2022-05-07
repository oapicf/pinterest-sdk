# PinterestSdkClient::OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**oauth_token**](OauthApi.md#oauth_token) | **POST** /oauth/token | Generate OAuth access token |


## oauth_token

> <OauthAccessTokenResponse> oauth_token(grant_type)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'

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

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

