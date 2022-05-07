# PinterestSdkClient::AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ad_account_analytics**](AdAccountsApi.md#ad_account_analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics |
| [**ad_accounts_list**](AdAccountsApi.md#ad_accounts_list) | **GET** /ad_accounts | List ad accounts |
| [**ad_groups_analytics**](AdAccountsApi.md#ad_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics |
| [**ad_groups_list**](AdAccountsApi.md#ad_groups_list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups |
| [**ads_analytics**](AdAccountsApi.md#ads_analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics |
| [**ads_list**](AdAccountsApi.md#ads_list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads |
| [**analytics_create_report**](AdAccountsApi.md#analytics_create_report) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report |
| [**analytics_get_report**](AdAccountsApi.md#analytics_get_report) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call |
| [**campaigns_analytics**](AdAccountsApi.md#campaigns_analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics |
| [**campaigns_list**](AdAccountsApi.md#campaigns_list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns |
| [**product_groups_analytics**](AdAccountsApi.md#product_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics |


## ad_account_analytics

> Array&lt;Hash&lt;String, Object&gt;&gt; ad_account_analytics(ad_account_id, start_date, end_date, columns, granularity, opts)

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD
columns = ['AD_ACCOUNT_ID'] # Array<String> | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity | Granularity
opts = {
  click_window_days: 1, # Integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 1, # Integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  view_window_days: 1, # Integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION' # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
}

begin
  # Get ad account analytics
  result = api_instance.ad_account_analytics(ad_account_id, start_date, end_date, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_account_analytics: #{e}"
end
```

#### Using the ad_account_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;Hash&lt;String, Object&gt;&gt;, Integer, Hash)> ad_account_analytics_with_http_info(ad_account_id, start_date, end_date, columns, granularity, opts)

```ruby
begin
  # Get ad account analytics
  data, status_code, headers = api_instance.ad_account_analytics_with_http_info(ad_account_id, start_date, end_date, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;Hash&lt;String, Object&gt;&gt;
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_account_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **columns** | [**Array&lt;String&gt;**](String.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](.md) | Granularity |  |
| **click_window_days** | **Integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **view_window_days** | **Integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |

### Return type

**Array&lt;Hash&lt;String, Object&gt;&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_accounts_list

> <Paginated> ad_accounts_list(opts)

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdAccountsApi.new
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
  include_shared_accounts: true # Boolean | Include shared ad accounts
}

begin
  # List ad accounts
  result = api_instance.ad_accounts_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_accounts_list: #{e}"
end
```

#### Using the ad_accounts_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Paginated>, Integer, Hash)> ad_accounts_list_with_http_info(opts)

```ruby
begin
  # List ad accounts
  data, status_code, headers = api_instance.ad_accounts_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Paginated>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_accounts_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **include_shared_accounts** | **Boolean** | Include shared ad accounts | [optional][default to true] |

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_analytics

> Array&lt;Hash&lt;String, Object&gt;&gt; ad_groups_analytics(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, opts)

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD
ad_group_ids = ['inner_example'] # Array<String> | List of Ad group Ids to use to filter the results.
columns = ['AD_ACCOUNT_ID'] # Array<String> | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity | Granularity
opts = {
  click_window_days: 1, # Integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 1, # Integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  view_window_days: 1, # Integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION' # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
}

begin
  # Get ad group analytics
  result = api_instance.ad_groups_analytics(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_groups_analytics: #{e}"
end
```

#### Using the ad_groups_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;Hash&lt;String, Object&gt;&gt;, Integer, Hash)> ad_groups_analytics_with_http_info(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, opts)

```ruby
begin
  # Get ad group analytics
  data, status_code, headers = api_instance.ad_groups_analytics_with_http_info(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;Hash&lt;String, Object&gt;&gt;
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_groups_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **ad_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad group Ids to use to filter the results. |  |
| **columns** | [**Array&lt;String&gt;**](String.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](.md) | Granularity |  |
| **click_window_days** | **Integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **view_window_days** | **Integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |

### Return type

**Array&lt;Hash&lt;String, Object&gt;&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_list

> <Paginated> ad_groups_list(ad_account_id, opts)

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  campaign_ids: ['inner_example'], # Array<String> | List of Campaign Ids to use to filter the results.
  ad_group_ids: ['inner_example'], # Array<String> | List of Ad group Ids to use to filter the results.
  entity_statuses: ['ACTIVE'], # Array<String> | Entity status
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  translate_interests_to_names: true # Boolean | Return interests as text names (if value is true) rather than topic IDs.
}

begin
  # List ad groups
  result = api_instance.ad_groups_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_groups_list: #{e}"
end
```

#### Using the ad_groups_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Paginated>, Integer, Hash)> ad_groups_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List ad groups
  data, status_code, headers = api_instance.ad_groups_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Paginated>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_groups_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. | [optional] |
| **ad_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad group Ids to use to filter the results. | [optional] |
| **entity_statuses** | [**Array&lt;String&gt;**](String.md) | Entity status | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **translate_interests_to_names** | **Boolean** | Return interests as text names (if value is true) rather than topic IDs. | [optional][default to false] |

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ads_analytics

> Array&lt;Hash&lt;String, Object&gt;&gt; ads_analytics(ad_account_id, start_date, end_date, ad_ids, columns, granularity, opts)

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD
ad_ids = ['inner_example'] # Array<String> | List of Ad Ids to use to filter the results.
columns = ['AD_ACCOUNT_ID'] # Array<String> | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity | Granularity
opts = {
  click_window_days: 1, # Integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 1, # Integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  view_window_days: 1, # Integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION' # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
}

begin
  # Get ad analytics
  result = api_instance.ads_analytics(ad_account_id, start_date, end_date, ad_ids, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ads_analytics: #{e}"
end
```

#### Using the ads_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;Hash&lt;String, Object&gt;&gt;, Integer, Hash)> ads_analytics_with_http_info(ad_account_id, start_date, end_date, ad_ids, columns, granularity, opts)

```ruby
begin
  # Get ad analytics
  data, status_code, headers = api_instance.ads_analytics_with_http_info(ad_account_id, start_date, end_date, ad_ids, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;Hash&lt;String, Object&gt;&gt;
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ads_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **ad_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad Ids to use to filter the results. |  |
| **columns** | [**Array&lt;String&gt;**](String.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](.md) | Granularity |  |
| **click_window_days** | **Integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **view_window_days** | **Integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |

### Return type

**Array&lt;Hash&lt;String, Object&gt;&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ads_list

> <Paginated> ads_list(ad_account_id, opts)

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  campaign_ids: ['inner_example'], # Array<String> | List of Campaign Ids to use to filter the results.
  ad_group_ids: ['inner_example'], # Array<String> | List of Ad group Ids to use to filter the results.
  ad_ids: ['inner_example'], # Array<String> | List of Ad Ids to use to filter the results.
  entity_statuses: ['ACTIVE'], # Array<String> | Entity status
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # List ads
  result = api_instance.ads_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ads_list: #{e}"
end
```

#### Using the ads_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Paginated>, Integer, Hash)> ads_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List ads
  data, status_code, headers = api_instance.ads_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Paginated>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ads_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. | [optional] |
| **ad_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad group Ids to use to filter the results. | [optional] |
| **ad_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad Ids to use to filter the results. | [optional] |
| **entity_statuses** | [**Array&lt;String&gt;**](String.md) | Entity status | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analytics_create_report

> <AdsAnalyticsCreateAsyncResponse> analytics_create_report(ad_account_id, ads_analytics_create_async_request)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ads_analytics_create_async_request = PinterestSdkClient::AdsAnalyticsCreateAsyncRequest.new({start_date: '2020-12-20', end_date: '2020-12-20', granularity: PinterestSdkClient::Granularity::TOTAL, columns: [PinterestSdkClient::ReportingColumnAsync::SPEND_IN_MICRO_DOLLAR], level: PinterestSdkClient::MetricsReportingLevel::ADVERTISER}) # AdsAnalyticsCreateAsyncRequest | 

begin
  # Create async request for an account analytics report
  result = api_instance.analytics_create_report(ad_account_id, ads_analytics_create_async_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_create_report: #{e}"
end
```

#### Using the analytics_create_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdsAnalyticsCreateAsyncResponse>, Integer, Hash)> analytics_create_report_with_http_info(ad_account_id, ads_analytics_create_async_request)

```ruby
begin
  # Create async request for an account analytics report
  data, status_code, headers = api_instance.analytics_create_report_with_http_info(ad_account_id, ads_analytics_create_async_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdsAnalyticsCreateAsyncResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_create_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ads_analytics_create_async_request** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md) |  |  |

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## analytics_get_report

> <AdsAnalyticsGetAsyncResponse> analytics_get_report(ad_account_id, token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
token = 'token_example' # String | Token returned from the post request creation call

begin
  # Get the account analytics report created by the async call
  result = api_instance.analytics_get_report(ad_account_id, token)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_get_report: #{e}"
end
```

#### Using the analytics_get_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdsAnalyticsGetAsyncResponse>, Integer, Hash)> analytics_get_report_with_http_info(ad_account_id, token)

```ruby
begin
  # Get the account analytics report created by the async call
  data, status_code, headers = api_instance.analytics_get_report_with_http_info(ad_account_id, token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdsAnalyticsGetAsyncResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_get_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **token** | **String** | Token returned from the post request creation call |  |

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaigns_analytics

> Array&lt;Hash&lt;String, Object&gt;&gt; campaigns_analytics(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, opts)

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD
campaign_ids = ['inner_example'] # Array<String> | List of Campaign Ids to use to filter the results.
columns = ['AD_ACCOUNT_ID'] # Array<String> | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity | Granularity
opts = {
  click_window_days: 1, # Integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 1, # Integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  view_window_days: 1, # Integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION' # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
}

begin
  # Get campaign analytics
  result = api_instance.campaigns_analytics(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->campaigns_analytics: #{e}"
end
```

#### Using the campaigns_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;Hash&lt;String, Object&gt;&gt;, Integer, Hash)> campaigns_analytics_with_http_info(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, opts)

```ruby
begin
  # Get campaign analytics
  data, status_code, headers = api_instance.campaigns_analytics_with_http_info(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;Hash&lt;String, Object&gt;&gt;
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->campaigns_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. |  |
| **columns** | [**Array&lt;String&gt;**](String.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](.md) | Granularity |  |
| **click_window_days** | **Integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **view_window_days** | **Integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |

### Return type

**Array&lt;Hash&lt;String, Object&gt;&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaigns_list

> <Paginated> campaigns_list(ad_account_id, opts)

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  campaign_ids: ['inner_example'], # Array<String> | List of Campaign Ids to use to filter the results.
  entity_statuses: ['ACTIVE'], # Array<String> | Entity status
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # List campaigns
  result = api_instance.campaigns_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->campaigns_list: #{e}"
end
```

#### Using the campaigns_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Paginated>, Integer, Hash)> campaigns_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List campaigns
  data, status_code, headers = api_instance.campaigns_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Paginated>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->campaigns_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. | [optional] |
| **entity_statuses** | [**Array&lt;String&gt;**](String.md) | Entity status | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## product_groups_analytics

> Array&lt;Hash&lt;String, Object&gt;&gt; product_groups_analytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, opts)

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD
product_group_ids = ['inner_example'] # Array<String> | List of Product group Ids to use to filter the results.
columns = ['AD_ACCOUNT_ID'] # Array<String> | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity | Granularity
opts = {
  click_window_days: 1, # Integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 1, # Integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  view_window_days: 1, # Integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION' # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
}

begin
  # Get product group analytics
  result = api_instance.product_groups_analytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->product_groups_analytics: #{e}"
end
```

#### Using the product_groups_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;Hash&lt;String, Object&gt;&gt;, Integer, Hash)> product_groups_analytics_with_http_info(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, opts)

```ruby
begin
  # Get product group analytics
  data, status_code, headers = api_instance.product_groups_analytics_with_http_info(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;Hash&lt;String, Object&gt;&gt;
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->product_groups_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **product_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Product group Ids to use to filter the results. |  |
| **columns** | [**Array&lt;String&gt;**](String.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](.md) | Granularity |  |
| **click_window_days** | **Integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **view_window_days** | **Integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |

### Return type

**Array&lt;Hash&lt;String, Object&gt;&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

