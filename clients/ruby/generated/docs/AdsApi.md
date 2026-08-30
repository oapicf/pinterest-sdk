# PinterestSdkClient::AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ad_previews_create**](AdsApi.md#ad_previews_create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image |
| [**ad_targeting_analytics_get**](AdsApi.md#ad_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads |
| [**ads_analytics**](AdsApi.md#ads_analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics |
| [**ads_create**](AdsApi.md#ads_create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads |
| [**ads_get**](AdsApi.md#ads_get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad |
| [**ads_list**](AdsApi.md#ads_list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads |
| [**ads_update**](AdsApi.md#ads_update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads |
| [**campaign_ad_preview_create**](AdsApi.md#campaign_ad_preview_create) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups |
| [**campaign_ad_preview_delete**](AdsApi.md#campaign_ad_preview_delete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups |
| [**campaign_ad_preview_read**](AdsApi.md#campaign_ad_preview_read) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups |


## ad_previews_create

> <AdPreviewURLResponse> ad_previews_create(ad_account_id, ad_preview_request)

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_preview_request = PinterestSdkClient::AdPreviewShopping.new({catalog_product_group_id: '123456789', creative_type: PinterestSdkClient::AdShoppingPreviewCreativeType::SHOPPING}) # AdPreviewRequest | 

begin
  # Create ad preview with pin or image
  result = api_instance.ad_previews_create(ad_account_id, ad_preview_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ad_previews_create: #{e}"
end
```

#### Using the ad_previews_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdPreviewURLResponse>, Integer, Hash)> ad_previews_create_with_http_info(ad_account_id, ad_preview_request)

```ruby
begin
  # Create ad preview with pin or image
  data, status_code, headers = api_instance.ad_previews_create_with_http_info(ad_account_id, ad_preview_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdPreviewURLResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ad_previews_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_preview_request** | [**AdPreviewRequest**](AdPreviewRequest.md) |  |  |

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ad_targeting_analytics_get

> <MetricsResponse> ad_targeting_analytics_get(ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, opts)

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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

api_instance = PinterestSdkClient::AdsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_ids = ['inner_example'] # Array<String> | List of Ad Ids to use to filter the results.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
targeting_types = [PinterestSdkClient::AdsAnalyticsAdTargetingType::KEYWORD] # Array<AdsAnalyticsAdTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
columns = [PinterestSdkClient::ReportingColumnSync::SPEND_IN_MICRO_DOLLAR] # Array<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
opts = {
  click_window_days: PinterestSdkClient::ConversionAttributionWindowDays::N0, # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: PinterestSdkClient::ConversionAttributionWindowDays::N0, # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  view_window_days: PinterestSdkClient::ConversionAttributionWindowDays::N0, # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: PinterestSdkClient::ConversionReportTimeType::TIME_OF_AD_ACTION, # ConversionReportTimeType | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  attribution_types: [PinterestSdkClient::ConversionReportAttributionType::INDIVIDUAL], # Array<ConversionReportAttributionType> | List of types of attribution for the conversion report
  reporting_timezone: PinterestSdkClient::ReportingTimeZone::PINTEREST_TIME_ZONE, # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  sort_columns: ['inner_example'], # Array<String> | Sort Columns.
  sort_ascending: true # Boolean | Sort ascending.
}

begin
  # Get targeting analytics for ads
  result = api_instance.ad_targeting_analytics_get(ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ad_targeting_analytics_get: #{e}"
end
```

#### Using the ad_targeting_analytics_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MetricsResponse>, Integer, Hash)> ad_targeting_analytics_get_with_http_info(ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, opts)

```ruby
begin
  # Get targeting analytics for ads
  data, status_code, headers = api_instance.ad_targeting_analytics_get_with_http_info(ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MetricsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ad_targeting_analytics_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad Ids to use to filter the results. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **targeting_types** | [**Array&lt;AdsAnalyticsAdTargetingType&gt;**](AdsAnalyticsAdTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |  |
| **columns** | [**Array&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |  |
| **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |  |
| **click_window_days** | [**ConversionAttributionWindowDays**](.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] |
| **engagement_window_days** | [**ConversionAttributionWindowDays**](.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] |
| **view_window_days** | [**ConversionAttributionWindowDays**](.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] |
| **conversion_report_time** | [**ConversionReportTimeType**](.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] |
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


## ads_analytics

> <Array<AdsAnalytics>> ads_analytics(start_date, end_date, columns, granularity, ad_account_id, opts)

Get ad analytics

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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

api_instance = PinterestSdkClient::AdsApi.new
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
columns = [PinterestSdkClient::ReportingColumnSync::SPEND_IN_MICRO_DOLLAR] # Array<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  pin_ids: ['inner_example'], # Array<String> | List of Pin IDs.
  ad_ids: ['inner_example'], # Array<String> | List of Ad Ids to use to filter the results.
  click_window_days: 0, # Float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 0, # Float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  view_window_days: 0, # Float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION', # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  campaign_ids: ['inner_example'], # Array<String> | List of Campaign Ids to use to filter the results.
  reporting_timezone: PinterestSdkClient::ReportingTimeZone::PINTEREST_TIME_ZONE # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
}

begin
  # Get ad analytics
  result = api_instance.ads_analytics(start_date, end_date, columns, granularity, ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ads_analytics: #{e}"
end
```

#### Using the ads_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<AdsAnalytics>>, Integer, Hash)> ads_analytics_with_http_info(start_date, end_date, columns, granularity, ad_account_id, opts)

```ruby
begin
  # Get ad analytics
  data, status_code, headers = api_instance.ads_analytics_with_http_info(start_date, end_date, columns, granularity, ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<AdsAnalytics>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ads_analytics_with_http_info: #{e}"
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
| **pin_ids** | [**Array&lt;String&gt;**](String.md) | List of Pin IDs. | [optional] |
| **ad_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad Ids to use to filter the results. | [optional] |
| **click_window_days** | **Float** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Float** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional][default to 30] |
| **view_window_days** | **Float** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. | [optional] |
| **reporting_timezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] |

### Return type

[**Array&lt;AdsAnalytics&gt;**](AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ads_create

> <AdBatchWriteResponseModel> ads_create(ad_account_id, ad_create)

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_create = [PinterestSdkClient::AdCreate.new({ad_group_id: 'ad_group_id_example', creative_type: PinterestSdkClient::CreativeType::REGULAR, pin_id: 'pin_id_example'})] # Array<AdCreate> | 

begin
  # Create ads
  result = api_instance.ads_create(ad_account_id, ad_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ads_create: #{e}"
end
```

#### Using the ads_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdBatchWriteResponseModel>, Integer, Hash)> ads_create_with_http_info(ad_account_id, ad_create)

```ruby
begin
  # Create ads
  data, status_code, headers = api_instance.ads_create_with_http_info(ad_account_id, ad_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdBatchWriteResponseModel>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ads_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_create** | [**Array&lt;AdCreate&gt;**](AdCreate.md) |  |  |

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ads_get

> <Ad> ads_get(ad_id, ad_account_id)

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

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

api_instance = PinterestSdkClient::AdsApi.new
ad_id = 'ad_id_example' # String | The ID of this ad.
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get ad
  result = api_instance.ads_get(ad_id, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ads_get: #{e}"
end
```

#### Using the ads_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Ad>, Integer, Hash)> ads_get_with_http_info(ad_id, ad_account_id)

```ruby
begin
  # Get ad
  data, status_code, headers = api_instance.ads_get_with_http_info(ad_id, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Ad>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ads_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_id** | **String** | The ID of this ad. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**Ad**](Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ads_list

> <AdsList200Response> ads_list(ad_account_id, opts)

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

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

api_instance = PinterestSdkClient::AdsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING, # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  campaign_ids: ['inner_example'], # Array<String> | List of Campaign Ids to use to filter the results.
  ad_group_ids: ['inner_example'], # Array<String> | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
  ad_ids: ['inner_example'], # Array<String> | List of Ad Ids to use to filter the results.
  entity_statuses: [PinterestSdkClient::EntityStatus::ACTIVE] # Array<EntityStatus> | Entity status
}

begin
  # List ads
  result = api_instance.ads_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ads_list: #{e}"
end
```

#### Using the ads_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdsList200Response>, Integer, Hash)> ads_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List ads
  data, status_code, headers = api_instance.ads_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ads_list_with_http_info: #{e}"
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
| **ad_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad Ids to use to filter the results. | [optional] |
| **entity_statuses** | [**Array&lt;EntityStatus&gt;**](EntityStatus.md) | Entity status | [optional] |

### Return type

[**AdsList200Response**](AdsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ads_update

> <AdBatchWriteResponseModel> ads_update(ad_account_id, ad_batch_update)

Update ads

Update multiple existing ads

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_batch_update = [PinterestSdkClient::AdBatchUpdate.new({id: 'id_example'})] # Array<AdBatchUpdate> | 

begin
  # Update ads
  result = api_instance.ads_update(ad_account_id, ad_batch_update)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ads_update: #{e}"
end
```

#### Using the ads_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdBatchWriteResponseModel>, Integer, Hash)> ads_update_with_http_info(ad_account_id, ad_batch_update)

```ruby
begin
  # Update ads
  data, status_code, headers = api_instance.ads_update_with_http_info(ad_account_id, ad_batch_update)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdBatchWriteResponseModel>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->ads_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_batch_update** | [**Array&lt;AdBatchUpdate&gt;**](AdBatchUpdate.md) |  |  |

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## campaign_ad_preview_create

> <Array<CampaignAdPreviewCreate200ResponseInner>> campaign_ad_preview_create(ad_account_id, campaign_ad_preview_create)

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
campaign_ad_preview_create = [PinterestSdkClient::CampaignAdPreviewCreate.new({ad_group_id: '1234567890'})] # Array<CampaignAdPreviewCreate> | 

begin
  # Create ad preview records for one or more ad groups
  result = api_instance.campaign_ad_preview_create(ad_account_id, campaign_ad_preview_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->campaign_ad_preview_create: #{e}"
end
```

#### Using the campaign_ad_preview_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<CampaignAdPreviewCreate200ResponseInner>>, Integer, Hash)> campaign_ad_preview_create_with_http_info(ad_account_id, campaign_ad_preview_create)

```ruby
begin
  # Create ad preview records for one or more ad groups
  data, status_code, headers = api_instance.campaign_ad_preview_create_with_http_info(ad_account_id, campaign_ad_preview_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<CampaignAdPreviewCreate200ResponseInner>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->campaign_ad_preview_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_ad_preview_create** | [**Array&lt;CampaignAdPreviewCreate&gt;**](CampaignAdPreviewCreate.md) |  |  |

### Return type

[**Array&lt;CampaignAdPreviewCreate200ResponseInner&gt;**](CampaignAdPreviewCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## campaign_ad_preview_delete

> <Array<CampaignAdPreviewDelete200ResponseInner>> campaign_ad_preview_delete(ad_group_ids, ad_account_id)

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdsApi.new
ad_group_ids = ['inner_example'] # Array<String> | List of Ad group Ids to use to filter the results.
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Delete ad preview records for one or more ad groups
  result = api_instance.campaign_ad_preview_delete(ad_group_ids, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->campaign_ad_preview_delete: #{e}"
end
```

#### Using the campaign_ad_preview_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<CampaignAdPreviewDelete200ResponseInner>>, Integer, Hash)> campaign_ad_preview_delete_with_http_info(ad_group_ids, ad_account_id)

```ruby
begin
  # Delete ad preview records for one or more ad groups
  data, status_code, headers = api_instance.campaign_ad_preview_delete_with_http_info(ad_group_ids, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<CampaignAdPreviewDelete200ResponseInner>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->campaign_ad_preview_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad group Ids to use to filter the results. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**Array&lt;CampaignAdPreviewDelete200ResponseInner&gt;**](CampaignAdPreviewDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaign_ad_preview_read

> <Array<CampaignAdPreview>> campaign_ad_preview_read(ad_group_ids, ad_account_id)

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdsApi.new
ad_group_ids = ['inner_example'] # Array<String> | List of Ad group Ids to use to filter the results.
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Fetch ad preview records for one or more ad groups
  result = api_instance.campaign_ad_preview_read(ad_group_ids, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->campaign_ad_preview_read: #{e}"
end
```

#### Using the campaign_ad_preview_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<CampaignAdPreview>>, Integer, Hash)> campaign_ad_preview_read_with_http_info(ad_group_ids, ad_account_id)

```ruby
begin
  # Fetch ad preview records for one or more ad groups
  data, status_code, headers = api_instance.campaign_ad_preview_read_with_http_info(ad_group_ids, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<CampaignAdPreview>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdsApi->campaign_ad_preview_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad group Ids to use to filter the results. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**Array&lt;CampaignAdPreview&gt;**](CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

