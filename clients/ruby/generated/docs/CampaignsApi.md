# PinterestSdkClient::CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**campaign_targeting_analytics_get**](CampaignsApi.md#campaign_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns |
| [**campaigns_analytics**](CampaignsApi.md#campaigns_analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics |
| [**campaigns_create**](CampaignsApi.md#campaigns_create) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns |
| [**campaigns_get**](CampaignsApi.md#campaigns_get) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign |
| [**campaigns_list**](CampaignsApi.md#campaigns_list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns |
| [**campaigns_update**](CampaignsApi.md#campaigns_update) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns |


## campaign_targeting_analytics_get

> <MetricsResponse> campaign_targeting_analytics_get(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, opts)

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

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
campaign_ids = ['inner_example'] # Array<String> | List of Campaign Ids to use to filter the results.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
targeting_types = [PinterestSdkClient::AdsAnalyticsTargetingType::KEYWORD] # Array<AdsAnalyticsTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.
columns = ['SPEND_IN_MICRO_DOLLAR'] # Array<String> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
opts = {
  click_window_days: 0, # Integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 0, # Integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  view_window_days: 0, # Integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION', # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  attribution_types: PinterestSdkClient::ConversionReportAttributionType::INDIVIDUAL # ConversionReportAttributionType | List of types of attribution for the conversion report
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
| **targeting_types** | [**Array&lt;AdsAnalyticsTargetingType&gt;**](AdsAnalyticsTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. |  |
| **columns** | [**Array&lt;String&gt;**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |  |
| **click_window_days** | **Integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **view_window_days** | **Integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |
| **attribution_types** | [**ConversionReportAttributionType**](.md) | List of types of attribution for the conversion report | [optional] |

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaigns_analytics

> <Array<CampaignsAnalyticsResponseInner>> campaigns_analytics(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, opts)

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

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
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
campaign_ids = ['inner_example'] # Array<String> | List of Campaign Ids to use to filter the results.
columns = ['SPEND_IN_MICRO_DOLLAR'] # Array<String> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
opts = {
  click_window_days: 0, # Integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 0, # Integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  view_window_days: 0, # Integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION' # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
}

begin
  # Get campaign analytics
  result = api_instance.campaigns_analytics(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_analytics: #{e}"
end
```

#### Using the campaigns_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<CampaignsAnalyticsResponseInner>>, Integer, Hash)> campaigns_analytics_with_http_info(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, opts)

```ruby
begin
  # Get campaign analytics
  data, status_code, headers = api_instance.campaigns_analytics_with_http_info(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<CampaignsAnalyticsResponseInner>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. |  |
| **columns** | [**Array&lt;String&gt;**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |  |
| **click_window_days** | **Integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **view_window_days** | **Integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |

### Return type

[**Array&lt;CampaignsAnalyticsResponseInner&gt;**](CampaignsAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaigns_create

> <CampaignCreateResponse> campaigns_create(ad_account_id, campaign_create_request)

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>

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
campaign_create_request = [PinterestSdkClient::CampaignCreateRequest.new({ad_account_id: '549755885175', name: 'ACME Tools', objective_type: PinterestSdkClient::ObjectiveType::AWARENESS})] # Array<CampaignCreateRequest> | Array of campaigns.

begin
  # Create campaigns
  result = api_instance.campaigns_create(ad_account_id, campaign_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_create: #{e}"
end
```

#### Using the campaigns_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CampaignCreateResponse>, Integer, Hash)> campaigns_create_with_http_info(ad_account_id, campaign_create_request)

```ruby
begin
  # Create campaigns
  data, status_code, headers = api_instance.campaigns_create_with_http_info(ad_account_id, campaign_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CampaignCreateResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_create_request** | [**Array&lt;CampaignCreateRequest&gt;**](CampaignCreateRequest.md) | Array of campaigns. |  |

### Return type

[**CampaignCreateResponse**](CampaignCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## campaigns_get

> <CampaignResponse> campaigns_get(ad_account_id, campaign_id)

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
end

api_instance = PinterestSdkClient::CampaignsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
campaign_id = 'campaign_id_example' # String | Campaign ID, must be associated with the ad account ID provided in the path.

begin
  # Get campaign
  result = api_instance.campaigns_get(ad_account_id, campaign_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_get: #{e}"
end
```

#### Using the campaigns_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CampaignResponse>, Integer, Hash)> campaigns_get_with_http_info(ad_account_id, campaign_id)

```ruby
begin
  # Get campaign
  data, status_code, headers = api_instance.campaigns_get_with_http_info(ad_account_id, campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CampaignResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_id** | **String** | Campaign ID, must be associated with the ad account ID provided in the path. |  |

### Return type

[**CampaignResponse**](CampaignResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaigns_list

> <CampaignsList200Response> campaigns_list(ad_account_id, opts)

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

api_instance = PinterestSdkClient::CampaignsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  campaign_ids: ['inner_example'], # Array<String> | List of Campaign Ids to use to filter the results.
  entity_statuses: ['ACTIVE'], # Array<String> | Entity status
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
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
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. | [optional] |
| **entity_statuses** | [**Array&lt;String&gt;**](String.md) | Entity status | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**CampaignsList200Response**](CampaignsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaigns_update

> <CampaignUpdateResponse> campaigns_update(ad_account_id, campaign_update_request)

Update campaigns

Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>

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
campaign_update_request = [PinterestSdkClient::CampaignUpdateRequest.new({id: '549755885175', ad_account_id: '549755885175'})] # Array<CampaignUpdateRequest> | Array of campaigns.

begin
  # Update campaigns
  result = api_instance.campaigns_update(ad_account_id, campaign_update_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_update: #{e}"
end
```

#### Using the campaigns_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CampaignUpdateResponse>, Integer, Hash)> campaigns_update_with_http_info(ad_account_id, campaign_update_request)

```ruby
begin
  # Update campaigns
  data, status_code, headers = api_instance.campaigns_update_with_http_info(ad_account_id, campaign_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CampaignUpdateResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CampaignsApi->campaigns_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_update_request** | [**Array&lt;CampaignUpdateRequest&gt;**](CampaignUpdateRequest.md) | Array of campaigns. |  |

### Return type

[**CampaignUpdateResponse**](CampaignUpdateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

