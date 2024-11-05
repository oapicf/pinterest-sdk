# PinterestSdkClient::AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ad_groups_analytics**](AdGroupsApi.md#ad_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics |
| [**ad_groups_audience_sizing**](AdGroupsApi.md#ad_groups_audience_sizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing |
| [**ad_groups_bid_floor_get**](AdGroupsApi.md#ad_groups_bid_floor_get) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors |
| [**ad_groups_create**](AdGroupsApi.md#ad_groups_create) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups |
| [**ad_groups_get**](AdGroupsApi.md#ad_groups_get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group |
| [**ad_groups_list**](AdGroupsApi.md#ad_groups_list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups |
| [**ad_groups_targeting_analytics_get**](AdGroupsApi.md#ad_groups_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups |
| [**ad_groups_update**](AdGroupsApi.md#ad_groups_update) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups |


## ad_groups_analytics

> <Array<AdGroupsAnalyticsResponseInner>> ad_groups_analytics(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, opts)

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

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
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
ad_group_ids = ['inner_example'] # Array<String> | List of Ad group Ids to use to filter the results.
columns = ['SPEND_IN_MICRO_DOLLAR'] # Array<String> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
opts = {
  click_window_days: 0, # Integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 0, # Integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  view_window_days: 0, # Integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  conversion_report_time: 'TIME_OF_AD_ACTION' # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
}

begin
  # Get ad group analytics
  result = api_instance.ad_groups_analytics(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_analytics: #{e}"
end
```

#### Using the ad_groups_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<AdGroupsAnalyticsResponseInner>>, Integer, Hash)> ad_groups_analytics_with_http_info(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, opts)

```ruby
begin
  # Get ad group analytics
  data, status_code, headers = api_instance.ad_groups_analytics_with_http_info(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<AdGroupsAnalyticsResponseInner>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **ad_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad group Ids to use to filter the results. |  |
| **columns** | [**Array&lt;String&gt;**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |  |
| **click_window_days** | **Integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **view_window_days** | **Integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |

### Return type

[**Array&lt;AdGroupsAnalyticsResponseInner&gt;**](AdGroupsAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_audience_sizing

> <AdGroupAudienceSizingResponse> ad_groups_audience_sizing(ad_account_id, opts)

Get audience sizing

Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

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
opts = {
  ad_group_audience_sizing_request: PinterestSdkClient::AdGroupAudienceSizingRequest.new # AdGroupAudienceSizingRequest | 
}

begin
  # Get audience sizing
  result = api_instance.ad_groups_audience_sizing(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_audience_sizing: #{e}"
end
```

#### Using the ad_groups_audience_sizing_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdGroupAudienceSizingResponse>, Integer, Hash)> ad_groups_audience_sizing_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get audience sizing
  data, status_code, headers = api_instance.ad_groups_audience_sizing_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdGroupAudienceSizingResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_audience_sizing_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_audience_sizing_request** | [**AdGroupAudienceSizingRequest**](AdGroupAudienceSizingRequest.md) |  | [optional] |

### Return type

[**AdGroupAudienceSizingResponse**](AdGroupAudienceSizingResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ad_groups_bid_floor_get

> <BidFloor> ad_groups_bid_floor_get(ad_account_id, bid_floor_request)

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’ s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li>  </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.

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
bid_floor_request = PinterestSdkClient::BidFloorRequest.new({bid_floor_specs: [PinterestSdkClient::BidFloorSpec.new({currency: PinterestSdkClient::Currency::UNK, billable_event: PinterestSdkClient::ActionType::CLICKTHROUGH})]}) # BidFloorRequest | Parameters to get bid_floor info

begin
  # Get bid floors
  result = api_instance.ad_groups_bid_floor_get(ad_account_id, bid_floor_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_bid_floor_get: #{e}"
end
```

#### Using the ad_groups_bid_floor_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BidFloor>, Integer, Hash)> ad_groups_bid_floor_get_with_http_info(ad_account_id, bid_floor_request)

```ruby
begin
  # Get bid floors
  data, status_code, headers = api_instance.ad_groups_bid_floor_get_with_http_info(ad_account_id, bid_floor_request)
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
| **bid_floor_request** | [**BidFloorRequest**](BidFloorRequest.md) | Parameters to get bid_floor info |  |

### Return type

[**BidFloor**](BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ad_groups_create

> <AdGroupArrayResponse> ad_groups_create(ad_account_id, ad_group_create_request)

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p>  <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.

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
ad_group_create_request = [PinterestSdkClient::AdGroupCreateRequest.new({name: 'Ad Group For Pin: 687195905986', campaign_id: '626736533506', billable_event: PinterestSdkClient::ActionType::CLICKTHROUGH})] # Array<AdGroupCreateRequest> | List of ad groups to create, size limit [1, 30].

begin
  # Create ad groups
  result = api_instance.ad_groups_create(ad_account_id, ad_group_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_create: #{e}"
end
```

#### Using the ad_groups_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdGroupArrayResponse>, Integer, Hash)> ad_groups_create_with_http_info(ad_account_id, ad_group_create_request)

```ruby
begin
  # Create ad groups
  data, status_code, headers = api_instance.ad_groups_create_with_http_info(ad_account_id, ad_group_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdGroupArrayResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_create_request** | [**Array&lt;AdGroupCreateRequest&gt;**](AdGroupCreateRequest.md) | List of ad groups to create, size limit [1, 30]. |  |

### Return type

[**AdGroupArrayResponse**](AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ad_groups_get

> <AdGroupResponse> ad_groups_get(ad_account_id, ad_group_id)

Get ad group

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.

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
ad_group_id = 'ad_group_id_example' # String | Unique identifier of an ad group.

begin
  # Get ad group
  result = api_instance.ad_groups_get(ad_account_id, ad_group_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_get: #{e}"
end
```

#### Using the ad_groups_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdGroupResponse>, Integer, Hash)> ad_groups_get_with_http_info(ad_account_id, ad_group_id)

```ruby
begin
  # Get ad group
  data, status_code, headers = api_instance.ad_groups_get_with_http_info(ad_account_id, ad_group_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdGroupResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_id** | **String** | Unique identifier of an ad group. |  |

### Return type

[**AdGroupResponse**](AdGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_list

> <AdGroupsList200Response> ad_groups_list(ad_account_id, opts)

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.

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
opts = {
  campaign_ids: ['inner_example'], # Array<String> | List of Campaign Ids to use to filter the results.
  ad_group_ids: ['inner_example'], # Array<String> | List of Ad group Ids to use to filter the results.
  entity_statuses: ['ACTIVE'], # Array<String> | Entity status
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
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
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. | [optional] |
| **ad_group_ids** | [**Array&lt;String&gt;**](String.md) | List of Ad group Ids to use to filter the results. | [optional] |
| **entity_statuses** | [**Array&lt;String&gt;**](String.md) | Entity status | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **translate_interests_to_names** | **Boolean** | Return interests as text names (if value is true) rather than topic IDs. | [optional][default to false] |

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_groups_targeting_analytics_get

> <MetricsResponse> ad_groups_targeting_analytics_get(ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, opts)

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

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
ad_group_ids = ['inner_example'] # Array<String> | List of Ad group Ids to use to filter the results.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
targeting_types = [PinterestSdkClient::AdsAnalyticsTargetingType::KEYWORD] # Array<AdsAnalyticsTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
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
| **targeting_types** | [**Array&lt;AdsAnalyticsTargetingType&gt;**](AdsAnalyticsTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |  |
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


## ad_groups_update

> <AdGroupArrayResponse> ad_groups_update(ad_account_id, ad_group_update_request)

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
ad_group_update_request = [PinterestSdkClient::AdGroupUpdateRequest.new({id: '2680060704746'})] # Array<AdGroupUpdateRequest> | List of ad groups to update, size limit [1, 30].

begin
  # Update ad groups
  result = api_instance.ad_groups_update(ad_account_id, ad_group_update_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_update: #{e}"
end
```

#### Using the ad_groups_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdGroupArrayResponse>, Integer, Hash)> ad_groups_update_with_http_info(ad_account_id, ad_group_update_request)

```ruby
begin
  # Update ad groups
  data, status_code, headers = api_instance.ad_groups_update_with_http_info(ad_account_id, ad_group_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdGroupArrayResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdGroupsApi->ad_groups_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_group_update_request** | [**Array&lt;AdGroupUpdateRequest&gt;**](AdGroupUpdateRequest.md) | List of ad groups to update, size limit [1, 30]. |  |

### Return type

[**AdGroupArrayResponse**](AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

