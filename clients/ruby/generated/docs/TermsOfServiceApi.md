# PinterestSdkClient::TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**terms_of_service_get**](TermsOfServiceApi.md#terms_of_service_get) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service |


## terms_of_service_get

> <TermsOfService> terms_of_service_get(ad_account_id, opts)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::TermsOfServiceApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  include_html: true, # Boolean | Return HTML in TOS text.
  tos_type: 'tos_type_example' # String | Request type.
}

begin
  # Get terms of service
  result = api_instance.terms_of_service_get(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TermsOfServiceApi->terms_of_service_get: #{e}"
end
```

#### Using the terms_of_service_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TermsOfService>, Integer, Hash)> terms_of_service_get_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get terms of service
  data, status_code, headers = api_instance.terms_of_service_get_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TermsOfService>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TermsOfServiceApi->terms_of_service_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **include_html** | **Boolean** | Return HTML in TOS text. | [optional][default to false] |
| **tos_type** | **String** | Request type. | [optional] |

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

