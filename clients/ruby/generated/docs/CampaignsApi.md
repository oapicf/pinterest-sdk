# PinterestSdkClient::CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ad_pins_analytics**](CampaignsApi.md#ad_pins_analytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics |
| [**campaign_targeting_analytics_get**](CampaignsApi.md#campaign_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns |
| [**campaigns_analytics**](CampaignsApi.md#campaigns_analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics |
| [**campaigns_create**](CampaignsApi.md#campaigns_create) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns |
| [**campaigns_get**](CampaignsApi.md#campaigns_get) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign |
| [**campaigns_list**](CampaignsApi.md#campaigns_list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns |
| [**campaigns_update**](CampaignsApi.md#campaigns_update) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns |
| [**get_campaign_delivery_estimates**](CampaignsApi.md#get_campaign_delivery_estimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates |


## ad_pins_analytics

> <Array<AdPinAnalytics>> ad_pins_analytics(campaign_id, pin_ids, start_date, end_date, columns, granularity, ad_account_id, opts)

Get pins analytics

Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

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

api_instance = PinterestSdkClient::CampaignsApi.new
campaign_id = 'campaign_id_example' # String | Campaign Id to use to filter the results.
pin_ids = ['inner_example'] # Array<String> | List of Pin IDs.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
columns = [PinterestSdkClient::ReportingColumnSync::SPEND_IN_MICRO_DOLLAR] # Array<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  click_window_days: 0, # Float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 0, # Float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  view_window_days: 0, # Float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION' # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
}

begin
  # Get pins analytics
  result = api_instance.ad_pins_analytics(campaign_id, pin_ids, start_date, end_date, columns, granularity, ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->ad_pins_analytics: #{e}"
end
```

#### Using the ad_pins_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<AdPinAnalytics>>, Integer, Hash)> ad_pins_analytics_with_http_info(campaign_id, pin_ids, start_date, end_date, columns, granularity, ad_account_id, opts)

```ruby
begin
  # Get pins analytics
  data, status_code, headers = api_instance.ad_pins_analytics_with_http_info(campaign_id, pin_ids, start_date, end_date, columns, granularity, ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<AdPinAnalytics>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->ad_pins_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **String** | Campaign Id to use to filter the results. |  |
| **pin_ids** | [**Array&lt;String&gt;**](String.md) | List of Pin IDs. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **columns** | [**Array&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |  |
| **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **click_window_days** | **Float** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Float** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional][default to 30] |
| **view_window_days** | **Float** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |

### Return type

[**Array&lt;AdPinAnalytics&gt;**](AdPinAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaign_targeting_analytics_get

> <MetricsResponse> campaign_targeting_analytics_get(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, opts)

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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

api_instance = PinterestSdkClient::CampaignsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
campaign_ids = ['inner_example'] # Array<String> | List of Campaign Ids to use to filter the results.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
targeting_types = [PinterestSdkClient::AdsAnalyticsCampaignTargetingType::KEYWORD] # Array<AdsAnalyticsCampaignTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
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
  # Get targeting analytics for campaigns
  result = api_instance.campaign_targeting_analytics_get(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaign_targeting_analytics_get: #{e}"
end
```

#### Using the campaign_targeting_analytics_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MetricsResponse>, Integer, Hash)> campaign_targeting_analytics_get_with_http_info(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, opts)

```ruby
begin
  # Get targeting analytics for campaigns
  data, status_code, headers = api_instance.campaign_targeting_analytics_get_with_http_info(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MetricsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaign_targeting_analytics_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **targeting_types** | [**Array&lt;AdsAnalyticsCampaignTargetingType&gt;**](AdsAnalyticsCampaignTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |  |
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


## campaigns_analytics

> <Array<CampaignsAnalyticsMetrics>> campaigns_analytics(start_date, end_date, campaign_ids, columns, granularity, ad_account_id, opts)

Get campaign analytics

Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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

api_instance = PinterestSdkClient::CampaignsApi.new
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
campaign_ids = ['inner_example'] # Array<String> | List of Campaign Ids to use to filter the results.
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
  # Get campaign analytics
  result = api_instance.campaigns_analytics(start_date, end_date, campaign_ids, columns, granularity, ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_analytics: #{e}"
end
```

#### Using the campaigns_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<CampaignsAnalyticsMetrics>>, Integer, Hash)> campaigns_analytics_with_http_info(start_date, end_date, campaign_ids, columns, granularity, ad_account_id, opts)

```ruby
begin
  # Get campaign analytics
  data, status_code, headers = api_instance.campaigns_analytics_with_http_info(start_date, end_date, campaign_ids, columns, granularity, ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<CampaignsAnalyticsMetrics>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. |  |
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

[**Array&lt;CampaignsAnalyticsMetrics&gt;**](CampaignsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaigns_create

> <CampaignBatchWriteResponseModel> campaigns_create(ad_account_id, campaign_create_item)

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CampaignsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
campaign_create_item = [PinterestSdkClient::CampaignCreateItem.new({name: 'ACME Tools', objective_type: PinterestSdkClient::ConversionObjectiveType::AWARENESS})] # Array<CampaignCreateItem> | 

begin
  # Create campaigns
  result = api_instance.campaigns_create(ad_account_id, campaign_create_item)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_create: #{e}"
end
```

#### Using the campaigns_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CampaignBatchWriteResponseModel>, Integer, Hash)> campaigns_create_with_http_info(ad_account_id, campaign_create_item)

```ruby
begin
  # Create campaigns
  data, status_code, headers = api_instance.campaigns_create_with_http_info(ad_account_id, campaign_create_item)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CampaignBatchWriteResponseModel>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_create_item** | [**Array&lt;CampaignCreateItem&gt;**](CampaignCreateItem.md) |  |  |

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## campaigns_get

> <Campaign> campaigns_get(campaign_id, ad_account_id)

Get campaign

Get a specific campaign given the campaign ID.

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

api_instance = PinterestSdkClient::CampaignsApi.new
campaign_id = 'campaign_id_example' # String | Campaign ID, must be associated with the ad account ID provided in the path.
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get campaign
  result = api_instance.campaigns_get(campaign_id, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_get: #{e}"
end
```

#### Using the campaigns_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Campaign>, Integer, Hash)> campaigns_get_with_http_info(campaign_id, ad_account_id)

```ruby
begin
  # Get campaign
  data, status_code, headers = api_instance.campaigns_get_with_http_info(campaign_id, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Campaign>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **String** | Campaign ID, must be associated with the ad account ID provided in the path. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaigns_list

> <CampaignsList200Response> campaigns_list(ad_account_id, opts)

List campaigns

Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

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

api_instance = PinterestSdkClient::CampaignsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING, # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  campaign_ids: ['inner_example'], # Array<String> | List of Campaign Ids to use to filter the results.
  entity_statuses: [PinterestSdkClient::EntityStatus::ACTIVE] # Array<EntityStatus> | Entity status
}

begin
  # List campaigns
  result = api_instance.campaigns_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_list: #{e}"
end
```

#### Using the campaigns_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CampaignsList200Response>, Integer, Hash)> campaigns_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List campaigns
  data, status_code, headers = api_instance.campaigns_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CampaignsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_list_with_http_info: #{e}"
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
| **entity_statuses** | [**Array&lt;EntityStatus&gt;**](EntityStatus.md) | Entity status | [optional] |

### Return type

[**CampaignsList200Response**](CampaignsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaigns_update

> <CampaignBatchWriteResponseModel> campaigns_update(ad_account_id, campaign_batch_update_item)

Update campaigns

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CampaignsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
campaign_batch_update_item = [PinterestSdkClient::CampaignBatchUpdateItem.new({id: '549755885175'})] # Array<CampaignBatchUpdateItem> | 

begin
  # Update campaigns
  result = api_instance.campaigns_update(ad_account_id, campaign_batch_update_item)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_update: #{e}"
end
```

#### Using the campaigns_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CampaignBatchWriteResponseModel>, Integer, Hash)> campaigns_update_with_http_info(ad_account_id, campaign_batch_update_item)

```ruby
begin
  # Update campaigns
  data, status_code, headers = api_instance.campaigns_update_with_http_info(ad_account_id, campaign_batch_update_item)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CampaignBatchWriteResponseModel>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_batch_update_item** | [**Array&lt;CampaignBatchUpdateItem&gt;**](CampaignBatchUpdateItem.md) |  |  |

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_campaign_delivery_estimates

> <CampaignDeliveryEstimatesResponse> get_campaign_delivery_estimates(ad_account_id, campaign_delivery_estimates_campaign)

Get campaign delivery estimates

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CampaignsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
campaign_delivery_estimates_campaign = [PinterestSdkClient::CampaignDeliveryEstimatesCampaign.new({ad_groups: [PinterestSdkClient::AdGroupDeliveryEstimates.new], budget_duration_type: PinterestSdkClient::BudgetDurationType::FIXED_DAILY, objective_type: PinterestSdkClient::DeliveryEstimateObjectiveType::AWARENESS, start_date: 'start_date_example'})] # Array<CampaignDeliveryEstimatesCampaign> | 

begin
  # Get campaign delivery estimates
  result = api_instance.get_campaign_delivery_estimates(ad_account_id, campaign_delivery_estimates_campaign)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaign_delivery_estimates: #{e}"
end
```

#### Using the get_campaign_delivery_estimates_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CampaignDeliveryEstimatesResponse>, Integer, Hash)> get_campaign_delivery_estimates_with_http_info(ad_account_id, campaign_delivery_estimates_campaign)

```ruby
begin
  # Get campaign delivery estimates
  data, status_code, headers = api_instance.get_campaign_delivery_estimates_with_http_info(ad_account_id, campaign_delivery_estimates_campaign)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CampaignDeliveryEstimatesResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaign_delivery_estimates_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_delivery_estimates_campaign** | [**Array&lt;CampaignDeliveryEstimatesCampaign&gt;**](CampaignDeliveryEstimatesCampaign.md) |  |  |

### Return type

[**CampaignDeliveryEstimatesResponse**](CampaignDeliveryEstimatesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

