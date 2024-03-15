# PinterestSdkClient::ProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**product_group_promotions_create**](ProductGroupPromotionsApi.md#product_group_promotions_create) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions |
| [**product_group_promotions_get**](ProductGroupPromotionsApi.md#product_group_promotions_get) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id |
| [**product_group_promotions_list**](ProductGroupPromotionsApi.md#product_group_promotions_list) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions |
| [**product_group_promotions_update**](ProductGroupPromotionsApi.md#product_group_promotions_update) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions |
| [**product_groups_analytics**](ProductGroupPromotionsApi.md#product_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics |


## product_group_promotions_create

> <ProductGroupPromotionResponse> product_group_promotions_create(ad_account_id, product_group_promotion_create_request)

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ProductGroupPromotionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
product_group_promotion_create_request = PinterestSdkClient::ProductGroupPromotionCreateRequest.new({ad_group_id: '2680059592705', product_group_promotion: [PinterestSdkClient::ProductGroupPromotion.new]}) # ProductGroupPromotionCreateRequest | List of Product Group Promotions to create, size limit [1, 30].

begin
  # Create product group promotions
  result = api_instance.product_group_promotions_create(ad_account_id, product_group_promotion_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_create: #{e}"
end
```

#### Using the product_group_promotions_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProductGroupPromotionResponse>, Integer, Hash)> product_group_promotions_create_with_http_info(ad_account_id, product_group_promotion_create_request)

```ruby
begin
  # Create product group promotions
  data, status_code, headers = api_instance.product_group_promotions_create_with_http_info(ad_account_id, product_group_promotion_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProductGroupPromotionResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **product_group_promotion_create_request** | [**ProductGroupPromotionCreateRequest**](ProductGroupPromotionCreateRequest.md) | List of Product Group Promotions to create, size limit [1, 30]. |  |

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## product_group_promotions_get

> <ProductGroupPromotionResponse> product_group_promotions_get(ad_account_id, product_group_promotion_id)

Get a product group promotion by id

Get a product group promotion by id

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ProductGroupPromotionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
product_group_promotion_id = 'product_group_promotion_id_example' # String | Unique identifier of a product group promotion

begin
  # Get a product group promotion by id
  result = api_instance.product_group_promotions_get(ad_account_id, product_group_promotion_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_get: #{e}"
end
```

#### Using the product_group_promotions_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProductGroupPromotionResponse>, Integer, Hash)> product_group_promotions_get_with_http_info(ad_account_id, product_group_promotion_id)

```ruby
begin
  # Get a product group promotion by id
  data, status_code, headers = api_instance.product_group_promotions_get_with_http_info(ad_account_id, product_group_promotion_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProductGroupPromotionResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **product_group_promotion_id** | **String** | Unique identifier of a product group promotion |  |

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## product_group_promotions_list

> <ProductGroupPromotionsList200Response> product_group_promotions_list(ad_account_id, opts)

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ProductGroupPromotionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  product_group_promotion_ids: ['inner_example'], # Array<String> | List of Product group promotion Ids.
  entity_statuses: ['ACTIVE'], # Array<String> | Entity status
  ad_group_id: '123123123', # String | Ad group Id.
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # Get product group promotions
  result = api_instance.product_group_promotions_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_list: #{e}"
end
```

#### Using the product_group_promotions_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProductGroupPromotionsList200Response>, Integer, Hash)> product_group_promotions_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get product group promotions
  data, status_code, headers = api_instance.product_group_promotions_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProductGroupPromotionsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **product_group_promotion_ids** | [**Array&lt;String&gt;**](String.md) | List of Product group promotion Ids. | [optional] |
| **entity_statuses** | [**Array&lt;String&gt;**](String.md) | Entity status | [optional] |
| **ad_group_id** | **String** | Ad group Id. | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**ProductGroupPromotionsList200Response**](ProductGroupPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## product_group_promotions_update

> <ProductGroupPromotionResponse> product_group_promotions_update(ad_account_id, product_group_promotion_update_request)

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ProductGroupPromotionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
product_group_promotion_update_request = PinterestSdkClient::ProductGroupPromotionUpdateRequest.new({ad_group_id: '2680059592705', product_group_promotion: [PinterestSdkClient::ProductGroupPromotion.new]}) # ProductGroupPromotionUpdateRequest | Parameters to update Product group promotions

begin
  # Update product group promotions
  result = api_instance.product_group_promotions_update(ad_account_id, product_group_promotion_update_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_update: #{e}"
end
```

#### Using the product_group_promotions_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProductGroupPromotionResponse>, Integer, Hash)> product_group_promotions_update_with_http_info(ad_account_id, product_group_promotion_update_request)

```ruby
begin
  # Update product group promotions
  data, status_code, headers = api_instance.product_group_promotions_update_with_http_info(ad_account_id, product_group_promotion_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProductGroupPromotionResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **product_group_promotion_update_request** | [**ProductGroupPromotionUpdateRequest**](ProductGroupPromotionUpdateRequest.md) | Parameters to update Product group promotions |  |

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## product_groups_analytics

> <Array<ProductGroupAnalyticsResponseInner>> product_groups_analytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, opts)

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ProductGroupPromotionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
product_group_ids = ['inner_example'] # Array<String> | List of Product group Ids to use to filter the results.
columns = ['SPEND_IN_MICRO_DOLLAR'] # Array<String> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
opts = {
  click_window_days: 0, # Integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 0, # Integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  view_window_days: 0, # Integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION' # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
}

begin
  # Get product group analytics
  result = api_instance.product_groups_analytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_groups_analytics: #{e}"
end
```

#### Using the product_groups_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<ProductGroupAnalyticsResponseInner>>, Integer, Hash)> product_groups_analytics_with_http_info(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, opts)

```ruby
begin
  # Get product group analytics
  data, status_code, headers = api_instance.product_groups_analytics_with_http_info(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<ProductGroupAnalyticsResponseInner>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_groups_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **product_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Product group Ids to use to filter the results. |  |
| **columns** | [**Array&lt;String&gt;**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |  |
| **click_window_days** | **Integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **view_window_days** | **Integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |

### Return type

[**Array&lt;ProductGroupAnalyticsResponseInner&gt;**](ProductGroupAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

