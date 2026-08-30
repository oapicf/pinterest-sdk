# PinterestSdkClient::AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ad_account_analytics**](AdAccountsApi.md#ad_account_analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics |
| [**ad_account_targeting_analytics_get**](AdAccountsApi.md#ad_account_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account |
| [**ad_accounts_create**](AdAccountsApi.md#ad_accounts_create) | **POST** /ad_accounts | Create ad account |
| [**ad_accounts_get**](AdAccountsApi.md#ad_accounts_get) | **GET** /ad_accounts/{ad_account_id} | Get ad account |
| [**ad_accounts_list**](AdAccountsApi.md#ad_accounts_list) | **GET** /ad_accounts | List ad accounts |
| [**analytics_create_conversion_product_report**](AdAccountsApi.md#analytics_create_conversion_product_report) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report |
| [**analytics_create_mmm_report**](AdAccountsApi.md#analytics_create_mmm_report) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report |
| [**analytics_create_report**](AdAccountsApi.md#analytics_create_report) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report |
| [**analytics_create_template_report**](AdAccountsApi.md#analytics_create_template_report) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template |
| [**analytics_get_conversion_product_report**](AdAccountsApi.md#analytics_get_conversion_product_report) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report |
| [**analytics_get_mmm_report**](AdAccountsApi.md#analytics_get_mmm_report) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report. |
| [**analytics_get_report**](AdAccountsApi.md#analytics_get_report) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call |
| [**sandbox_delete**](AdAccountsApi.md#sandbox_delete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox |
| [**templates_list**](AdAccountsApi.md#templates_list) | **GET** /ad_accounts/{ad_account_id}/templates | List templates |


## ad_account_analytics

> <Array<AdAccountAnalyticsItems>> ad_account_analytics(start_date, end_date, columns, granularity, ad_account_id, opts)

Get ad account analytics

  Get analytics for the specified `ad_account_id`, filtered by the specified options.    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.

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

api_instance = PinterestSdkClient::AdAccountsApi.new
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
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
  # Get ad account analytics
  result = api_instance.ad_account_analytics(start_date, end_date, columns, granularity, ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_account_analytics: #{e}"
end
```

#### Using the ad_account_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<AdAccountAnalyticsItems>>, Integer, Hash)> ad_account_analytics_with_http_info(start_date, end_date, columns, granularity, ad_account_id, opts)

```ruby
begin
  # Get ad account analytics
  data, status_code, headers = api_instance.ad_account_analytics_with_http_info(start_date, end_date, columns, granularity, ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<AdAccountAnalyticsItems>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_account_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **columns** | [**Array&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |  |
| **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **click_window_days** | **Float** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Float** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional][default to 30] |
| **view_window_days** | **Float** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |
| **reporting_timezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] |

### Return type

[**Array&lt;AdAccountAnalyticsItems&gt;**](AdAccountAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_account_targeting_analytics_get

> <MetricsResponse> ad_account_targeting_analytics_get(ad_account_id, start_date, end_date, targeting_types, columns, granularity, opts)

Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
targeting_types = [PinterestSdkClient::AdsAnalyticsAccountTargetingType::KEYWORD] # Array<AdsAnalyticsAccountTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
columns = [PinterestSdkClient::ReportingColumnSync::SPEND_IN_MICRO_DOLLAR] # Array<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
opts = {
  click_window_days: 0, # Float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 0, # Float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  view_window_days: 0, # Float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION', # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  attribution_types: [PinterestSdkClient::ConversionReportAttributionType::INDIVIDUAL], # Array<ConversionReportAttributionType> | List of types of attribution for the conversion report
  reporting_timezone: PinterestSdkClient::ReportingTimeZone::PINTEREST_TIME_ZONE # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
}

begin
  # Get targeting analytics for an ad account
  result = api_instance.ad_account_targeting_analytics_get(ad_account_id, start_date, end_date, targeting_types, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_account_targeting_analytics_get: #{e}"
end
```

#### Using the ad_account_targeting_analytics_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MetricsResponse>, Integer, Hash)> ad_account_targeting_analytics_get_with_http_info(ad_account_id, start_date, end_date, targeting_types, columns, granularity, opts)

```ruby
begin
  # Get targeting analytics for an ad account
  data, status_code, headers = api_instance.ad_account_targeting_analytics_get_with_http_info(ad_account_id, start_date, end_date, targeting_types, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MetricsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_account_targeting_analytics_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **targeting_types** | [**Array&lt;AdsAnalyticsAccountTargetingType&gt;**](AdsAnalyticsAccountTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |  |
| **columns** | [**Array&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |  |
| **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |  |
| **click_window_days** | **Float** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Float** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional][default to 30] |
| **view_window_days** | **Float** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |
| **attribution_types** | [**Array&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] |
| **reporting_timezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] |

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_accounts_create

> <AdAccount> ad_accounts_create(ad_account_create)

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).

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
ad_account_create = PinterestSdkClient::AdAccountCreate.new # AdAccountCreate | 

begin
  # Create ad account
  result = api_instance.ad_accounts_create(ad_account_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_accounts_create: #{e}"
end
```

#### Using the ad_accounts_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccount>, Integer, Hash)> ad_accounts_create_with_http_info(ad_account_create)

```ruby
begin
  # Create ad account
  data, status_code, headers = api_instance.ad_accounts_create_with_http_info(ad_account_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccount>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_accounts_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_create** | [**AdAccountCreate**](AdAccountCreate.md) |  |  |

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ad_accounts_get

> <AdAccount> ad_accounts_get(ad_account_id)

Get ad account

Get an ad account

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

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | 

begin
  # Get ad account
  result = api_instance.ad_accounts_get(ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_accounts_get: #{e}"
end
```

#### Using the ad_accounts_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccount>, Integer, Hash)> ad_accounts_get_with_http_info(ad_account_id)

```ruby
begin
  # Get ad account
  data, status_code, headers = api_instance.ad_accounts_get_with_http_info(ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccount>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_accounts_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_accounts_list

> <AdAccountsList200Response> ad_accounts_list(opts)

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).

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

api_instance = PinterestSdkClient::AdAccountsApi.new
opts = {
  include_shared_accounts: true, # Boolean | Include shared ad accounts
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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

> <Array(<AdAccountsList200Response>, Integer, Hash)> ad_accounts_list_with_http_info(opts)

```ruby
begin
  # List ad accounts
  data, status_code, headers = api_instance.ad_accounts_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_accounts_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **include_shared_accounts** | **Boolean** | Include shared ad accounts | [optional][default to true] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

### Return type

[**AdAccountsList200Response**](AdAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analytics_create_conversion_product_report

> <ConversionProductReport> analytics_create_conversion_product_report(ad_account_id, conversion_product_report_create)

Create a request for a brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.

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
conversion_product_report_create = PinterestSdkClient::ConversionProductReportCreate.new({columns: [PinterestSdkClient::ConversionProductReportingColumn::CAMPAIGN_NAME], end_date: '2024-04-23', granularity: PinterestSdkClient::ConversionProductReportGranularity::TOTAL, level: PinterestSdkClient::ConversionProductReportLevel::ADVERTISER, report_name: 'report_name_example', start_date: '2024-04-17'}) # ConversionProductReportCreate | 

begin
  # Create a request for a brand, category, SKU report
  result = api_instance.analytics_create_conversion_product_report(ad_account_id, conversion_product_report_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_create_conversion_product_report: #{e}"
end
```

#### Using the analytics_create_conversion_product_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionProductReport>, Integer, Hash)> analytics_create_conversion_product_report_with_http_info(ad_account_id, conversion_product_report_create)

```ruby
begin
  # Create a request for a brand, category, SKU report
  data, status_code, headers = api_instance.analytics_create_conversion_product_report_with_http_info(ad_account_id, conversion_product_report_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionProductReport>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_create_conversion_product_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **conversion_product_report_create** | [**ConversionProductReportCreate**](ConversionProductReportCreate.md) |  |  |

### Return type

[**ConversionProductReport**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## analytics_create_mmm_report

> <MMMReport> analytics_create_mmm_report(ad_account_id, mmm_report_create)

Create a request for a Marketing Mix Modeling (MMM) report

    This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it's in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we'll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.

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
ad_account_id = 'ad_account_id_example' # String | 
mmm_report_create = PinterestSdkClient::MMMReportCreate.new({columns: [PinterestSdkClient::MMMReportingColumn::SPEND_IN_DOLLAR], end_date: '2020-12-20', granularity: PinterestSdkClient::MMMReportGranularity::DAY, level: PinterestSdkClient::MMMReportLevel::CAMPAIGN_TARGETING, report_name: 'report_name_example', start_date: '2020-12-20', targeting_types: ["GENDER"]}) # MMMReportCreate | 

begin
  # Create a request for a Marketing Mix Modeling (MMM) report
  result = api_instance.analytics_create_mmm_report(ad_account_id, mmm_report_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_create_mmm_report: #{e}"
end
```

#### Using the analytics_create_mmm_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MMMReport>, Integer, Hash)> analytics_create_mmm_report_with_http_info(ad_account_id, mmm_report_create)

```ruby
begin
  # Create a request for a Marketing Mix Modeling (MMM) report
  data, status_code, headers = api_instance.analytics_create_mmm_report_with_http_info(ad_account_id, mmm_report_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MMMReport>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_create_mmm_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **mmm_report_create** | [**MMMReportCreate**](MMMReportCreate.md) |  |  |

### Return type

[**MMMReport**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## analytics_create_report

> <AdsAnalyticsCreateAsyncResponse> analytics_create_report(ad_account_id, ads_analytics_create_async_request)

Create async request for an account analytics report

  This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

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
ads_analytics_create_async_request = PinterestSdkClient::AdsAnalyticsCreateAsyncRequest.new({end_date: 'end_date_example', granularity: PinterestSdkClient::Granularity::TOTAL, start_date: 'start_date_example'}) # AdsAnalyticsCreateAsyncRequest | 

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


## analytics_create_template_report

> <TemplateBasedReport> analytics_create_template_report(ad_account_id, template_id, opts)

Create async request for an analytics report using a template

  This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.

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
ad_account_id = 'ad_account_id_example' # String | 
template_id = 'template_id_example' # String | Unique identifier of a template.
opts = {
  start_date: Date.parse('2013-10-20'), # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
  end_date: Date.parse('2013-10-20'), # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
  granularity: PinterestSdkClient::Granularity::TOTAL # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
}

begin
  # Create async request for an analytics report using a template
  result = api_instance.analytics_create_template_report(ad_account_id, template_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_create_template_report: #{e}"
end
```

#### Using the analytics_create_template_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TemplateBasedReport>, Integer, Hash)> analytics_create_template_report_with_http_info(ad_account_id, template_id, opts)

```ruby
begin
  # Create async request for an analytics report using a template
  data, status_code, headers = api_instance.analytics_create_template_report_with_http_info(ad_account_id, template_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TemplateBasedReport>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_create_template_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **template_id** | **String** | Unique identifier of a template. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional] |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional] |
| **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [optional] |

### Return type

[**TemplateBasedReport**](TemplateBasedReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analytics_get_conversion_product_report

> <ConversionProductReport> analytics_get_conversion_product_report(ad_account_id, token)

Get advertiser brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.

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
  # Get advertiser brand, category, SKU report
  result = api_instance.analytics_get_conversion_product_report(ad_account_id, token)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_get_conversion_product_report: #{e}"
end
```

#### Using the analytics_get_conversion_product_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionProductReport>, Integer, Hash)> analytics_get_conversion_product_report_with_http_info(ad_account_id, token)

```ruby
begin
  # Get advertiser brand, category, SKU report
  data, status_code, headers = api_instance.analytics_get_conversion_product_report_with_http_info(ad_account_id, token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionProductReport>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_get_conversion_product_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **token** | **String** | Token returned from the post request creation call |  |

### Return type

[**ConversionProductReport**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analytics_get_mmm_report

> <MMMReport> analytics_get_mmm_report(ad_account_id, token)

Get advertiser Marketing Mix Modeling (MMM) report.

    Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.

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
ad_account_id = 'ad_account_id_example' # String | 
token = 'token_example' # String | Token returned from the post request creation call

begin
  # Get advertiser Marketing Mix Modeling (MMM) report.
  result = api_instance.analytics_get_mmm_report(ad_account_id, token)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_get_mmm_report: #{e}"
end
```

#### Using the analytics_get_mmm_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MMMReport>, Integer, Hash)> analytics_get_mmm_report_with_http_info(ad_account_id, token)

```ruby
begin
  # Get advertiser Marketing Mix Modeling (MMM) report.
  data, status_code, headers = api_instance.analytics_get_mmm_report_with_http_info(ad_account_id, token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MMMReport>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_get_mmm_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **token** | **String** | Token returned from the post request creation call |  |

### Return type

[**MMMReport**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analytics_get_report

> <AdsAnalyticsGetAsyncResponse> analytics_get_report(ad_account_id, token)

Get the account analytics report created by the async call

  This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

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


## sandbox_delete

> String sandbox_delete(ad_account_id)

Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.

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

begin
  # Delete ads data for ad account in API Sandbox
  result = api_instance.sandbox_delete(ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->sandbox_delete: #{e}"
end
```

#### Using the sandbox_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> sandbox_delete_with_http_info(ad_account_id)

```ruby
begin
  # Delete ads data for ad account in API Sandbox
  data, status_code, headers = api_instance.sandbox_delete_with_http_info(ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->sandbox_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

**String**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## templates_list

> <TemplatesList200Response> templates_list(ad_account_id, opts)

List templates

Gets all Templates associated with an ad account ID.

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
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
}

begin
  # List templates
  result = api_instance.templates_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->templates_list: #{e}"
end
```

#### Using the templates_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TemplatesList200Response>, Integer, Hash)> templates_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List templates
  data, status_code, headers = api_instance.templates_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TemplatesList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->templates_list_with_http_info: #{e}"
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

[**TemplatesList200Response**](TemplatesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

