# PinterestSdkClient::TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**terms_related_list**](TermsApi.md#terms_related_list) | **GET** /terms/related | List related terms |
| [**terms_suggested_list**](TermsApi.md#terms_suggested_list) | **GET** /terms/suggested | List suggested terms |


## terms_related_list

> <RelatedTerms> terms_related_list(terms)

List related terms

Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::TermsApi.new
terms = ['workout'] # Array<String> | List of input terms.

begin
  # List related terms
  result = api_instance.terms_related_list(terms)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TermsApi->terms_related_list: #{e}"
end
```

#### Using the terms_related_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RelatedTerms>, Integer, Hash)> terms_related_list_with_http_info(terms)

```ruby
begin
  # List related terms
  data, status_code, headers = api_instance.terms_related_list_with_http_info(terms)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RelatedTerms>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TermsApi->terms_related_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **terms** | [**Array&lt;String&gt;**](String.md) | List of input terms. |  |

### Return type

[**RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## terms_suggested_list

> Array&lt;String&gt; terms_suggested_list(term, opts)

List suggested terms

Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::TermsApi.new
term = 'sports' # String | Input term.
opts = {
  limit: 4 # Integer | Max suggested terms to return.
}

begin
  # List suggested terms
  result = api_instance.terms_suggested_list(term, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TermsApi->terms_suggested_list: #{e}"
end
```

#### Using the terms_suggested_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;String&gt;, Integer, Hash)> terms_suggested_list_with_http_info(term, opts)

```ruby
begin
  # List suggested terms
  data, status_code, headers = api_instance.terms_suggested_list_with_http_info(term, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;String&gt;
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TermsApi->terms_suggested_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **term** | **String** | Input term. |  |
| **limit** | **Integer** | Max suggested terms to return. | [optional][default to 4] |

### Return type

**Array&lt;String&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

