# PinterestSdkClient::PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**promotions_create**](PromotionsApi.md#promotions_create) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions |
| [**promotions_delete**](PromotionsApi.md#promotions_delete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id |
| [**promotions_get**](PromotionsApi.md#promotions_get) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id |
| [**promotions_list**](PromotionsApi.md#promotions_list) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions |
| [**promotions_update**](PromotionsApi.md#promotions_update) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions |


## promotions_create

> <PromotionsResponse> promotions_create(ad_account_id, promotion_create_request)

Create promotions

Create multiple new promotions.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::PromotionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
promotion_create_request = [PinterestSdkClient::PromotionCreateRequest.new({promotion_title: 'Black Friday 10% off', promotion_type: PinterestSdkClient::PromotionType::VARIABLE})] # Array<PromotionCreateRequest> | List of promotions to create, size limit [1, 30].

begin
  # Create promotions
  result = api_instance.promotions_create(ad_account_id, promotion_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_create: #{e}"
end
```

#### Using the promotions_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PromotionsResponse>, Integer, Hash)> promotions_create_with_http_info(ad_account_id, promotion_create_request)

```ruby
begin
  # Create promotions
  data, status_code, headers = api_instance.promotions_create_with_http_info(ad_account_id, promotion_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PromotionsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **promotion_create_request** | [**Array&lt;PromotionCreateRequest&gt;**](PromotionCreateRequest.md) | List of promotions to create, size limit [1, 30]. |  |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## promotions_delete

> promotions_delete(ad_account_id, promotion_id)

Delete promotion by id

Delete a promotion within Pinterest.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::PromotionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
promotion_id = 'promotion_id_example' # String | Unique identifier of a promotion

begin
  # Delete promotion by id
  api_instance.promotions_delete(ad_account_id, promotion_id)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_delete: #{e}"
end
```

#### Using the promotions_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> promotions_delete_with_http_info(ad_account_id, promotion_id)

```ruby
begin
  # Delete promotion by id
  data, status_code, headers = api_instance.promotions_delete_with_http_info(ad_account_id, promotion_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **promotion_id** | **String** | Unique identifier of a promotion |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotions_get

> <PromotionResponse> promotions_get(ad_account_id, promotion_id)

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::PromotionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
promotion_id = 'promotion_id_example' # String | Unique identifier of a promotion

begin
  # Get promotion by id
  result = api_instance.promotions_get(ad_account_id, promotion_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_get: #{e}"
end
```

#### Using the promotions_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PromotionResponse>, Integer, Hash)> promotions_get_with_http_info(ad_account_id, promotion_id)

```ruby
begin
  # Get promotion by id
  data, status_code, headers = api_instance.promotions_get_with_http_info(ad_account_id, promotion_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PromotionResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **promotion_id** | **String** | Unique identifier of a promotion |  |

### Return type

[**PromotionResponse**](PromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotions_list

> <PromotionsList200Response> promotions_list(ad_account_id, opts)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::PromotionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # Get promotions
  result = api_instance.promotions_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_list: #{e}"
end
```

#### Using the promotions_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PromotionsList200Response>, Integer, Hash)> promotions_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get promotions
  data, status_code, headers = api_instance.promotions_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PromotionsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_list_with_http_info: #{e}"
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

[**PromotionsList200Response**](PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotions_update

> <PromotionsResponse> promotions_update(ad_account_id, promotion_update_request)

Update promotions

Update multiple promotions.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::PromotionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
promotion_update_request = [PinterestSdkClient::PromotionUpdateRequest.new({id: '7834020347906'})] # Array<PromotionUpdateRequest> | List of promotions to create, size limit [1, 30].

begin
  # Update promotions
  result = api_instance.promotions_update(ad_account_id, promotion_update_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_update: #{e}"
end
```

#### Using the promotions_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PromotionsResponse>, Integer, Hash)> promotions_update_with_http_info(ad_account_id, promotion_update_request)

```ruby
begin
  # Update promotions
  data, status_code, headers = api_instance.promotions_update_with_http_info(ad_account_id, promotion_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PromotionsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **promotion_update_request** | [**Array&lt;PromotionUpdateRequest&gt;**](PromotionUpdateRequest.md) | List of promotions to create, size limit [1, 30]. |  |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

