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

> <ProductGroupPromotions> product_group_promotions_create(ad_account_id, product_group_promotions_create)

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
product_group_promotions_create = PinterestSdkClient::ProductGroupPromotionsCreate.new({ad_group_id: '2680059592705', product_group_promotion: [{"slideshow_collections_description": "Description", "creative_type": "REGULAR", "collections_hero_pin_id": "123123", "catalog_product_group_name": "catalogProductGroupName to create", "collections_hero_destination_url": "http: //www.pinterest.com", "tracking_url": "https: //www.pinterest.com", "slideshow_collections_title": "Title", "status": "ACTIVE", "is_mdl": true}, {"id": "2680059592705", "catalog_product_group_id": "1234123", "slideshow_collections_description": "Description", "creative_type": "REGULAR", "collections_hero_pin_id": "123123", "catalog_product_group_name": "catalogProductGroupName to update", "collections_hero_destination_url": "http: //www.pinterest.com", "tracking_url": "https: //www.pinterest.com", "slideshow_collections_title": "Title", "status": "ACTIVE"}]}) # ProductGroupPromotionsCreate | 

begin
  # Create product group promotions
  result = api_instance.product_group_promotions_create(ad_account_id, product_group_promotions_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_create: #{e}"
end
```

#### Using the product_group_promotions_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProductGroupPromotions>, Integer, Hash)> product_group_promotions_create_with_http_info(ad_account_id, product_group_promotions_create)

```ruby
begin
  # Create product group promotions
  data, status_code, headers = api_instance.product_group_promotions_create_with_http_info(ad_account_id, product_group_promotions_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProductGroupPromotions>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **product_group_promotions_create** | [**ProductGroupPromotionsCreate**](ProductGroupPromotionsCreate.md) |  |  |

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## product_group_promotions_get

> <ProductGroupPromotion> product_group_promotions_get(ad_account_id, product_group_promotion_id)

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

> <Array(<ProductGroupPromotion>, Integer, Hash)> product_group_promotions_get_with_http_info(ad_account_id, product_group_promotion_id)

```ruby
begin
  # Get a product group promotion by id
  data, status_code, headers = api_instance.product_group_promotions_get_with_http_info(ad_account_id, product_group_promotion_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProductGroupPromotion>
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

[**ProductGroupPromotion**](ProductGroupPromotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## product_group_promotions_list

> <ProductGroupPromotionsList200Response> product_group_promotions_list(ad_account_id, opts)

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

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
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING, # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  product_group_promotion_ids: ['inner_example'], # Array<String> | List of Product group promotion Ids.
  entity_statuses: [PinterestSdkClient::EntityStatus::ACTIVE], # Array<EntityStatus> | Entity status
  ad_group_id: 'ad_group_id_example' # String | Ad group Id.
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
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **product_group_promotion_ids** | [**Array&lt;String&gt;**](String.md) | List of Product group promotion Ids. | [optional] |
| **entity_statuses** | [**Array&lt;EntityStatus&gt;**](EntityStatus.md) | Entity status | [optional] |
| **ad_group_id** | **String** | Ad group Id. | [optional] |

### Return type

[**ProductGroupPromotionsList200Response**](ProductGroupPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## product_group_promotions_update

> <ProductGroupPromotions> product_group_promotions_update(ad_account_id, product_group_promotions_update_with_required_body)

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
product_group_promotions_update_with_required_body = PinterestSdkClient::ProductGroupPromotionsUpdateWithRequiredBody.new({ad_group_id: '2680059592705', product_group_promotion: [{"slideshow_collections_description": "Description", "creative_type": "REGULAR", "collections_hero_pin_id": "123123", "catalog_product_group_name": "catalogProductGroupName to create", "collections_hero_destination_url": "http: //www.pinterest.com", "tracking_url": "https: //www.pinterest.com", "slideshow_collections_title": "Title", "status": "ACTIVE", "is_mdl": true}, {"id": "2680059592705", "catalog_product_group_id": "1234123", "slideshow_collections_description": "Description", "creative_type": "REGULAR", "collections_hero_pin_id": "123123", "catalog_product_group_name": "catalogProductGroupName to update", "collections_hero_destination_url": "http: //www.pinterest.com", "tracking_url": "https: //www.pinterest.com", "slideshow_collections_title": "Title", "status": "ACTIVE"}]}) # ProductGroupPromotionsUpdateWithRequiredBody | 

begin
  # Update product group promotions
  result = api_instance.product_group_promotions_update(ad_account_id, product_group_promotions_update_with_required_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_update: #{e}"
end
```

#### Using the product_group_promotions_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProductGroupPromotions>, Integer, Hash)> product_group_promotions_update_with_http_info(ad_account_id, product_group_promotions_update_with_required_body)

```ruby
begin
  # Update product group promotions
  data, status_code, headers = api_instance.product_group_promotions_update_with_http_info(ad_account_id, product_group_promotions_update_with_required_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProductGroupPromotions>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_group_promotions_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **product_group_promotions_update_with_required_body** | [**ProductGroupPromotionsUpdateWithRequiredBody**](ProductGroupPromotionsUpdateWithRequiredBody.md) |  |  |

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## product_groups_analytics

> <Array<ProductGroupAnalyticsItems>> product_groups_analytics(start_date, end_date, product_group_ids, columns, granularity, ad_account_id, opts)

Get product group analytics

Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'

  # Configure OAuth2 access token for authorization: client_credentials
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ProductGroupPromotionsApi.new
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
product_group_ids = ['inner_example'] # Array<String> | List of Product group Ids to use to filter the results.
columns = [PinterestSdkClient::ReportingColumnSync::SPEND_IN_MICRO_DOLLAR] # Array<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  click_window_days: 0, # Float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 0, # Float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  view_window_days: 0, # Float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION', # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  reporting_timezone: PinterestSdkClient::ReportingTimeZone::PINTEREST_TIME_ZONE # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
}

begin
  # Get product group analytics
  result = api_instance.product_groups_analytics(start_date, end_date, product_group_ids, columns, granularity, ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_groups_analytics: #{e}"
end
```

#### Using the product_groups_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<ProductGroupAnalyticsItems>>, Integer, Hash)> product_groups_analytics_with_http_info(start_date, end_date, product_group_ids, columns, granularity, ad_account_id, opts)

```ruby
begin
  # Get product group analytics
  data, status_code, headers = api_instance.product_groups_analytics_with_http_info(start_date, end_date, product_group_ids, columns, granularity, ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<ProductGroupAnalyticsItems>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupPromotionsApi->product_groups_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **product_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Product group Ids to use to filter the results. |  |
| **columns** | [**Array&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |  |
| **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **click_window_days** | **Float** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Float** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional][default to 30] |
| **view_window_days** | **Float** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |
| **reporting_timezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] |

### Return type

[**Array&lt;ProductGroupAnalyticsItems&gt;**](ProductGroupAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

