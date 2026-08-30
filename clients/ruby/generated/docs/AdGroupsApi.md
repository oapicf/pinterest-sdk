# PinterestSdkClient::AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ad_groups_analytics**](AdGroupsApi.md#ad_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics |
| [**ad_groups_audience_sizing**](AdGroupsApi.md#ad_groups_audience_sizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing |
| [**ad_groups_bid_floor_get**](AdGroupsApi.md#ad_groups_bid_floor_get) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors |
| [**ad_groups_create**](AdGroupsApi.md#ad_groups_create) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups |
| [**ad_groups_dynamic_titles_download_csv**](AdGroupsApi.md#ad_groups_dynamic_titles_download_csv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL |
| [**ad_groups_dynamic_titles_get_status**](AdGroupsApi.md#ad_groups_dynamic_titles_get_status) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status |
| [**ad_groups_dynamic_titles_get_upload_url**](AdGroupsApi.md#ad_groups_dynamic_titles_get_upload_url) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL |
| [**ad_groups_dynamic_titles_process_csv**](AdGroupsApi.md#ad_groups_dynamic_titles_process_csv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV |
| [**ad_groups_get**](AdGroupsApi.md#ad_groups_get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group |
| [**ad_groups_list**](AdGroupsApi.md#ad_groups_list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups |
| [**ad_groups_targeting_analytics_get**](AdGroupsApi.md#ad_groups_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups |
| [**ad_groups_update**](AdGroupsApi.md#ad_groups_update) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups |
| [**get_ad_groups_by_promotion_ids_list**](AdGroupsApi.md#get_ad_groups_by_promotion_ids_list) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs. |


## ad_groups_analytics

> <Array<AdGroupsAnalyticsMetrics>> ad_groups_analytics(start_date, end_date, ad_group_ids, columns, granularity, ad_account_id, opts)

Get ad group analytics

Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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

api_instance = PinterestSdkClient::AdGroupsApi.new
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
ad_group_ids = ['inner_example'] # Array<String> | List of Ad group Ids to use to filter the results.
columns = [PinterestSdkClient::ReportingColumnSync::SPEND_IN_MICRO_DOLLAR] # Array<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  click_window_days: 0, # Float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 0, # Float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  view_window_days: 0, # Float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION', # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  aggregate_report_rows: true, # Boolean | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
  reporting_timezone: PinterestSdkClient::ReportingTimeZone::PINTEREST_TIME_ZONE # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
}

begin
  # Get ad group analytics
  result = api_instance.ad_groups_analytics(start_date, end_date, ad_group_ids, columns, granularity, ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_analytics: #{e}"
end
```

#### Using the ad_groups_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<AdGroupsAnalyticsMetrics>>, Integer, Hash)> ad_groups_analytics_with_http_info(start_date, end_date, ad_group_ids, columns, granularity, ad_account_id, opts)

```ruby
begin
  # Get ad group analytics
  data, status_code, headers = api_instance.ad_groups_analytics_with_http_info(start_date, end_date, ad_group_ids, columns, granularity, ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<AdGroupsAnalyticsMetrics>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **ad_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad group Ids to use to filter the results. |  |
| **columns** | [**Array&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |  |
| **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **click_window_days** | **Float** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Float** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional][default to 30] |
| **view_window_days** | **Float** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |
| **aggregate_report_rows** | **Boolean** | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional][default to false] |
| **reporting_timezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] |

### Return type

[**Array&lt;AdGroupsAnalyticsMetrics&gt;**](AdGroupsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_audience_sizing

> <AdGroupAudienceSizing> ad_groups_audience_sizing(ad_account_id, ad_group_audience_sizing_create)

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

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

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_group_audience_sizing_create = PinterestSdkClient::AdGroupAudienceSizingCreate.new # AdGroupAudienceSizingCreate | 

begin
  # Get audience sizing
  result = api_instance.ad_groups_audience_sizing(ad_account_id, ad_group_audience_sizing_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_audience_sizing: #{e}"
end
```

#### Using the ad_groups_audience_sizing_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdGroupAudienceSizing>, Integer, Hash)> ad_groups_audience_sizing_with_http_info(ad_account_id, ad_group_audience_sizing_create)

```ruby
begin
  # Get audience sizing
  data, status_code, headers = api_instance.ad_groups_audience_sizing_with_http_info(ad_account_id, ad_group_audience_sizing_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdGroupAudienceSizing>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_audience_sizing_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_audience_sizing_create** | [**AdGroupAudienceSizingCreate**](AdGroupAudienceSizingCreate.md) |  |  |

### Return type

[**AdGroupAudienceSizing**](AdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ad_groups_bid_floor_get

> <BidFloor> ad_groups_bid_floor_get(ad_account_id, bid_floor_create)

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

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

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
bid_floor_create = PinterestSdkClient::BidFloorCreate.new({bid_floor_specs: [PinterestSdkClient::BidFloorSpec.new({billable_event: PinterestSdkClient::ActionType::CLICKTHROUGH, currency: PinterestSdkClient::Currency::UNK})]}) # BidFloorCreate | 

begin
  # Get bid floors
  result = api_instance.ad_groups_bid_floor_get(ad_account_id, bid_floor_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_bid_floor_get: #{e}"
end
```

#### Using the ad_groups_bid_floor_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BidFloor>, Integer, Hash)> ad_groups_bid_floor_get_with_http_info(ad_account_id, bid_floor_create)

```ruby
begin
  # Get bid floors
  data, status_code, headers = api_instance.ad_groups_bid_floor_get_with_http_info(ad_account_id, bid_floor_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BidFloor>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_bid_floor_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bid_floor_create** | [**BidFloorCreate**](BidFloorCreate.md) |  |  |

### Return type

[**BidFloor**](BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ad_groups_create

> <AdGroupsCreate200Response> ad_groups_create(ad_account_id, ad_group_create_create)

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_group_create_create = [PinterestSdkClient::AdGroupCreateCreate.new({billable_event: PinterestSdkClient::ActionType::CLICKTHROUGH, campaign_id: 'campaign_id_example', name: 'name_example'})] # Array<AdGroupCreateCreate> | 

begin
  # Create ad groups
  result = api_instance.ad_groups_create(ad_account_id, ad_group_create_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_create: #{e}"
end
```

#### Using the ad_groups_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdGroupsCreate200Response>, Integer, Hash)> ad_groups_create_with_http_info(ad_account_id, ad_group_create_create)

```ruby
begin
  # Create ad groups
  data, status_code, headers = api_instance.ad_groups_create_with_http_info(ad_account_id, ad_group_create_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdGroupsCreate200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_create_create** | [**Array&lt;AdGroupCreateCreate&gt;**](AdGroupCreateCreate.md) |  |  |

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ad_groups_dynamic_titles_download_csv

> <DynamicTitlesDownloadCSV> ad_groups_dynamic_titles_download_csv(ad_account_id, ad_group_id)

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_group_id = 'ad_group_id_example' # String | Ad group ID.

begin
  # Get dynamic titles CSV download URL
  result = api_instance.ad_groups_dynamic_titles_download_csv(ad_account_id, ad_group_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_dynamic_titles_download_csv: #{e}"
end
```

#### Using the ad_groups_dynamic_titles_download_csv_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DynamicTitlesDownloadCSV>, Integer, Hash)> ad_groups_dynamic_titles_download_csv_with_http_info(ad_account_id, ad_group_id)

```ruby
begin
  # Get dynamic titles CSV download URL
  data, status_code, headers = api_instance.ad_groups_dynamic_titles_download_csv_with_http_info(ad_account_id, ad_group_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DynamicTitlesDownloadCSV>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_dynamic_titles_download_csv_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_id** | **String** | Ad group ID. |  |

### Return type

[**DynamicTitlesDownloadCSV**](DynamicTitlesDownloadCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_dynamic_titles_get_status

> <DynamicTitlesGetStatus> ad_groups_dynamic_titles_get_status(ad_account_id, ad_group_id)

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_group_id = 'ad_group_id_example' # String | Ad group ID.

begin
  # Get dynamic titles status
  result = api_instance.ad_groups_dynamic_titles_get_status(ad_account_id, ad_group_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_dynamic_titles_get_status: #{e}"
end
```

#### Using the ad_groups_dynamic_titles_get_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DynamicTitlesGetStatus>, Integer, Hash)> ad_groups_dynamic_titles_get_status_with_http_info(ad_account_id, ad_group_id)

```ruby
begin
  # Get dynamic titles status
  data, status_code, headers = api_instance.ad_groups_dynamic_titles_get_status_with_http_info(ad_account_id, ad_group_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DynamicTitlesGetStatus>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_dynamic_titles_get_status_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_id** | **String** | Ad group ID. |  |

### Return type

[**DynamicTitlesGetStatus**](DynamicTitlesGetStatus.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_dynamic_titles_get_upload_url

> <DynamicTitlesUploadURL> ad_groups_dynamic_titles_get_upload_url(ad_account_id, ad_group_id)

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_group_id = 'ad_group_id_example' # String | Ad group ID.

begin
  # Get dynamic titles upload URL
  result = api_instance.ad_groups_dynamic_titles_get_upload_url(ad_account_id, ad_group_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_dynamic_titles_get_upload_url: #{e}"
end
```

#### Using the ad_groups_dynamic_titles_get_upload_url_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DynamicTitlesUploadURL>, Integer, Hash)> ad_groups_dynamic_titles_get_upload_url_with_http_info(ad_account_id, ad_group_id)

```ruby
begin
  # Get dynamic titles upload URL
  data, status_code, headers = api_instance.ad_groups_dynamic_titles_get_upload_url_with_http_info(ad_account_id, ad_group_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DynamicTitlesUploadURL>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_dynamic_titles_get_upload_url_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_id** | **String** | Ad group ID. |  |

### Return type

[**DynamicTitlesUploadURL**](DynamicTitlesUploadURL.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_dynamic_titles_process_csv

> <DynamicTitlesProcessCSV> ad_groups_dynamic_titles_process_csv(ad_account_id, ad_group_id, dynamic_titles_process_csv_create)

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_group_id = 'ad_group_id_example' # String | Ad group ID.
dynamic_titles_process_csv_create = PinterestSdkClient::DynamicTitlesProcessCSVCreate.new({request_id: 'request_id_example'}) # DynamicTitlesProcessCSVCreate | 

begin
  # Process dynamic titles CSV
  result = api_instance.ad_groups_dynamic_titles_process_csv(ad_account_id, ad_group_id, dynamic_titles_process_csv_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_dynamic_titles_process_csv: #{e}"
end
```

#### Using the ad_groups_dynamic_titles_process_csv_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DynamicTitlesProcessCSV>, Integer, Hash)> ad_groups_dynamic_titles_process_csv_with_http_info(ad_account_id, ad_group_id, dynamic_titles_process_csv_create)

```ruby
begin
  # Process dynamic titles CSV
  data, status_code, headers = api_instance.ad_groups_dynamic_titles_process_csv_with_http_info(ad_account_id, ad_group_id, dynamic_titles_process_csv_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DynamicTitlesProcessCSV>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_dynamic_titles_process_csv_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_id** | **String** | Ad group ID. |  |
| **dynamic_titles_process_csv_create** | [**DynamicTitlesProcessCSVCreate**](DynamicTitlesProcessCSVCreate.md) |  |  |

### Return type

[**DynamicTitlesProcessCSV**](DynamicTitlesProcessCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ad_groups_get

> <AdGroup> ad_groups_get(ad_group_id, ad_account_id)

Get ad group

Get a specific ad group given the ad group ID.

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

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_group_id = 'ad_group_id_example' # String | Ad group ID.
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get ad group
  result = api_instance.ad_groups_get(ad_group_id, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_get: #{e}"
end
```

#### Using the ad_groups_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdGroup>, Integer, Hash)> ad_groups_get_with_http_info(ad_group_id, ad_account_id)

```ruby
begin
  # Get ad group
  data, status_code, headers = api_instance.ad_groups_get_with_http_info(ad_group_id, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdGroup>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_group_id** | **String** | Ad group ID. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**AdGroup**](AdGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_list

> <AdGroupsList200Response> ad_groups_list(ad_account_id, opts)

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

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

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING, # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  campaign_ids: ['inner_example'], # Array<String> | List of Campaign Ids to use to filter the results.
  ad_group_ids: ['inner_example'], # Array<String> | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
  entity_statuses: [PinterestSdkClient::EntityStatus::ACTIVE], # Array<EntityStatus> | Entity status
  translate_interests_to_names: true # Boolean | Return interests as text names (if value is true) rather than topic IDs.
}

begin
  # List ad groups
  result = api_instance.ad_groups_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_list: #{e}"
end
```

#### Using the ad_groups_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdGroupsList200Response>, Integer, Hash)> ad_groups_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List ad groups
  data, status_code, headers = api_instance.ad_groups_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdGroupsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. | [optional] |
| **ad_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] |
| **entity_statuses** | [**Array&lt;EntityStatus&gt;**](EntityStatus.md) | Entity status | [optional] |
| **translate_interests_to_names** | **Boolean** | Return interests as text names (if value is true) rather than topic IDs. | [optional][default to false] |

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_targeting_analytics_get

> <MetricsResponse> ad_groups_targeting_analytics_get(ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, opts)

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_group_ids = ['inner_example'] # Array<String> | List of Ad group Ids to use to filter the results.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
targeting_types = [PinterestSdkClient::AdsAnalyticsAdGroupTargetingType::KEYWORD] # Array<AdsAnalyticsAdGroupTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
columns = [PinterestSdkClient::ReportingColumnSync::SPEND_IN_MICRO_DOLLAR] # Array<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
opts = {
  click_window_days: 0, # Float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 0, # Float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  view_window_days: 0, # Float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION', # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  attribution_types: [PinterestSdkClient::ConversionReportAttributionType::INDIVIDUAL], # Array<ConversionReportAttributionType> | List of types of attribution for the conversion report
  reporting_timezone: PinterestSdkClient::ReportingTimeZone::PINTEREST_TIME_ZONE, # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  sort_columns: ['inner_example'], # Array<String> | Sort Columns.
  sort_ascending: true # Boolean | Sort ascending.
}

begin
  # Get targeting analytics for ad groups
  result = api_instance.ad_groups_targeting_analytics_get(ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_targeting_analytics_get: #{e}"
end
```

#### Using the ad_groups_targeting_analytics_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MetricsResponse>, Integer, Hash)> ad_groups_targeting_analytics_get_with_http_info(ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, opts)

```ruby
begin
  # Get targeting analytics for ad groups
  data, status_code, headers = api_instance.ad_groups_targeting_analytics_get_with_http_info(ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MetricsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_targeting_analytics_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad group Ids to use to filter the results. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **targeting_types** | [**Array&lt;AdsAnalyticsAdGroupTargetingType&gt;**](AdsAnalyticsAdGroupTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. |  |
| **columns** | [**Array&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |  |
| **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |  |
| **click_window_days** | **Float** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Float** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional][default to 30] |
| **view_window_days** | **Float** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |
| **attribution_types** | [**Array&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] |
| **reporting_timezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] |
| **sort_columns** | [**Array&lt;String&gt;**](String.md) | Sort Columns. | [optional] |
| **sort_ascending** | **Boolean** | Sort ascending. | [optional] |

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_update

> <AdGroupsCreate200Response> ad_groups_update(ad_account_id, ad_group_update_batch_update)

Update ad groups

Update multiple existing ad groups.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_group_update_batch_update = [PinterestSdkClient::AdGroupUpdateBatchUpdate.new({id: 'id_example'})] # Array<AdGroupUpdateBatchUpdate> | 

begin
  # Update ad groups
  result = api_instance.ad_groups_update(ad_account_id, ad_group_update_batch_update)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_update: #{e}"
end
```

#### Using the ad_groups_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdGroupsCreate200Response>, Integer, Hash)> ad_groups_update_with_http_info(ad_account_id, ad_group_update_batch_update)

```ruby
begin
  # Update ad groups
  data, status_code, headers = api_instance.ad_groups_update_with_http_info(ad_account_id, ad_group_update_batch_update)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdGroupsCreate200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_update_batch_update** | [**Array&lt;AdGroupUpdateBatchUpdate&gt;**](AdGroupUpdateBatchUpdate.md) |  |  |

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_ad_groups_by_promotion_ids_list

> <AdGroupsList200Response> get_ad_groups_by_promotion_ids_list(ad_account_id, promotion_ids, opts)

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
promotion_ids = ['inner_example'] # Array<String> | List of Promotion IDs to use to filter the results.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
}

begin
  # List of ad groups using promotions IDs.
  result = api_instance.get_ad_groups_by_promotion_ids_list(ad_account_id, promotion_ids, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->get_ad_groups_by_promotion_ids_list: #{e}"
end
```

#### Using the get_ad_groups_by_promotion_ids_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdGroupsList200Response>, Integer, Hash)> get_ad_groups_by_promotion_ids_list_with_http_info(ad_account_id, promotion_ids, opts)

```ruby
begin
  # List of ad groups using promotions IDs.
  data, status_code, headers = api_instance.get_ad_groups_by_promotion_ids_list_with_http_info(ad_account_id, promotion_ids, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdGroupsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->get_ad_groups_by_promotion_ids_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **promotion_ids** | [**Array&lt;String&gt;**](String.md) | List of Promotion IDs to use to filter the results. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

