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

> <PromotionsResponse> promotions_create(ad_account_id, promotion_create)

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
promotion_create = [PinterestSdkClient::PromotionCreate.new({promotion_title: 'promotion_title_example', promotion_type: PinterestSdkClient::PromotionType::VARIABLE})] # Array<PromotionCreate> | 

begin
  # Create promotions
  result = api_instance.promotions_create(ad_account_id, promotion_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_create: #{e}"
end
```

#### Using the promotions_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PromotionsResponse>, Integer, Hash)> promotions_create_with_http_info(ad_account_id, promotion_create)

```ruby
begin
  # Create promotions
  data, status_code, headers = api_instance.promotions_create_with_http_info(ad_account_id, promotion_create)
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
| **promotion_create** | [**Array&lt;PromotionCreate&gt;**](PromotionCreate.md) |  |  |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## promotions_delete

> <Promotion> promotions_delete(promotion_id, ad_account_id)

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
promotion_id = 'promotion_id_example' # String | Promotion ID
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Delete promotion by id
  result = api_instance.promotions_delete(promotion_id, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_delete: #{e}"
end
```

#### Using the promotions_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Promotion>, Integer, Hash)> promotions_delete_with_http_info(promotion_id, ad_account_id)

```ruby
begin
  # Delete promotion by id
  data, status_code, headers = api_instance.promotions_delete_with_http_info(promotion_id, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Promotion>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **promotion_id** | **String** | Promotion ID |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotions_get

> <Promotion> promotions_get(promotion_id, ad_account_id)

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
promotion_id = 'promotion_id_example' # String | Promotion ID
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get promotion by id
  result = api_instance.promotions_get(promotion_id, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_get: #{e}"
end
```

#### Using the promotions_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Promotion>, Integer, Hash)> promotions_get_with_http_info(promotion_id, ad_account_id)

```ruby
begin
  # Get promotion by id
  data, status_code, headers = api_instance.promotions_get_with_http_info(promotion_id, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Promotion>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **promotion_id** | **String** | Promotion ID |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**Promotion**](Promotion.md)

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
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
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
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |

### Return type

[**PromotionsList200Response**](PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotions_update

> <PromotionsResponse> promotions_update(ad_account_id, promotion_batch_update)

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
promotion_batch_update = [PinterestSdkClient::PromotionBatchUpdate.new({id: 'id_example'})] # Array<PromotionBatchUpdate> | 

begin
  # Update promotions
  result = api_instance.promotions_update(ad_account_id, promotion_batch_update)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PromotionsApi->promotions_update: #{e}"
end
```

#### Using the promotions_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PromotionsResponse>, Integer, Hash)> promotions_update_with_http_info(ad_account_id, promotion_batch_update)

```ruby
begin
  # Update promotions
  data, status_code, headers = api_instance.promotions_update_with_http_info(ad_account_id, promotion_batch_update)
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
| **promotion_batch_update** | [**Array&lt;PromotionBatchUpdate&gt;**](PromotionBatchUpdate.md) |  |  |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

