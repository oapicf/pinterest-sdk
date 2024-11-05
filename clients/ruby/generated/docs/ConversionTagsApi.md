# PinterestSdkClient::ConversionTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**conversion_tags_create**](ConversionTagsApi.md#conversion_tags_create) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag |
| [**conversion_tags_get**](ConversionTagsApi.md#conversion_tags_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag |
| [**conversion_tags_list**](ConversionTagsApi.md#conversion_tags_list) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags |
| [**ocpm_eligible_conversion_tags_get**](ConversionTagsApi.md#ocpm_eligible_conversion_tags_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags |
| [**page_visit_conversion_tags_get**](ConversionTagsApi.md#page_visit_conversion_tags_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags |


## conversion_tags_create

> <ConversionTagResponse> conversion_tags_create(ad_account_id, conversion_tag_create)

Create conversion tag

Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/#enhanced-match\">Enhanced match</a>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ConversionTagsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
conversion_tag_create = PinterestSdkClient::ConversionTagCreate.new({name: 'ACME Tools Tag'}) # ConversionTagCreate | Conversion Tag to create

begin
  # Create conversion tag
  result = api_instance.conversion_tags_create(ad_account_id, conversion_tag_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionTagsApi->conversion_tags_create: #{e}"
end
```

#### Using the conversion_tags_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionTagResponse>, Integer, Hash)> conversion_tags_create_with_http_info(ad_account_id, conversion_tag_create)

```ruby
begin
  # Create conversion tag
  data, status_code, headers = api_instance.conversion_tags_create_with_http_info(ad_account_id, conversion_tag_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionTagResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionTagsApi->conversion_tags_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **conversion_tag_create** | [**ConversionTagCreate**](ConversionTagCreate.md) | Conversion Tag to create |  |

### Return type

[**ConversionTagResponse**](ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## conversion_tags_get

> <ConversionTagResponse> conversion_tags_get(ad_account_id, conversion_tag_id)

Get conversion tag

Get information about an existing conversion tag.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ConversionTagsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
conversion_tag_id = '2617998078212' # String | Id of the conversion tag.

begin
  # Get conversion tag
  result = api_instance.conversion_tags_get(ad_account_id, conversion_tag_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionTagsApi->conversion_tags_get: #{e}"
end
```

#### Using the conversion_tags_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionTagResponse>, Integer, Hash)> conversion_tags_get_with_http_info(ad_account_id, conversion_tag_id)

```ruby
begin
  # Get conversion tag
  data, status_code, headers = api_instance.conversion_tags_get_with_http_info(ad_account_id, conversion_tag_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionTagResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionTagsApi->conversion_tags_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **conversion_tag_id** | **String** | Id of the conversion tag. |  |

### Return type

[**ConversionTagResponse**](ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## conversion_tags_list

> <ConversionTagListResponse> conversion_tags_list(ad_account_id, opts)

Get conversion tags

List conversion tags associated with an ad account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ConversionTagsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  filter_deleted: true # Boolean | Filter out deleted tags.
}

begin
  # Get conversion tags
  result = api_instance.conversion_tags_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionTagsApi->conversion_tags_list: #{e}"
end
```

#### Using the conversion_tags_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionTagListResponse>, Integer, Hash)> conversion_tags_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get conversion tags
  data, status_code, headers = api_instance.conversion_tags_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionTagListResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionTagsApi->conversion_tags_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **filter_deleted** | **Boolean** | Filter out deleted tags. | [optional][default to false] |

### Return type

[**ConversionTagListResponse**](ConversionTagListResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ocpm_eligible_conversion_tags_get

> Hash&lt;String, Array&lt;ConversionEventResponse&gt;&gt; ocpm_eligible_conversion_tags_get(ad_account_id)

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ConversionTagsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get Ocpm eligible conversion tags
  result = api_instance.ocpm_eligible_conversion_tags_get(ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionTagsApi->ocpm_eligible_conversion_tags_get: #{e}"
end
```

#### Using the ocpm_eligible_conversion_tags_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Hash&lt;String, Array&lt;ConversionEventResponse&gt;&gt;, Integer, Hash)> ocpm_eligible_conversion_tags_get_with_http_info(ad_account_id)

```ruby
begin
  # Get Ocpm eligible conversion tags
  data, status_code, headers = api_instance.ocpm_eligible_conversion_tags_get_with_http_info(ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Hash&lt;String, Array&lt;ConversionEventResponse&gt;&gt;
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionTagsApi->ocpm_eligible_conversion_tags_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

**Hash&lt;String, Array&lt;ConversionEventResponse&gt;&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## page_visit_conversion_tags_get

> <PageVisitConversionTagsGet200Response> page_visit_conversion_tags_get(ad_account_id, opts)

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ConversionTagsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # Get page visit conversion tags
  result = api_instance.page_visit_conversion_tags_get(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionTagsApi->page_visit_conversion_tags_get: #{e}"
end
```

#### Using the page_visit_conversion_tags_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PageVisitConversionTagsGet200Response>, Integer, Hash)> page_visit_conversion_tags_get_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get page visit conversion tags
  data, status_code, headers = api_instance.page_visit_conversion_tags_get_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PageVisitConversionTagsGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionTagsApi->page_visit_conversion_tags_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**PageVisitConversionTagsGet200Response**](PageVisitConversionTagsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

