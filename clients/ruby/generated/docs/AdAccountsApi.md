# PinterestSdkClient::AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ad_account_analytics**](AdAccountsApi.md#ad_account_analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics |
| [**ad_account_targeting_analytics_get**](AdAccountsApi.md#ad_account_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account |
| [**ad_accounts_create**](AdAccountsApi.md#ad_accounts_create) | **POST** /ad_accounts | Create ad account |
| [**ad_accounts_get**](AdAccountsApi.md#ad_accounts_get) | **GET** /ad_accounts/{ad_account_id} | Get ad account |
| [**ad_accounts_list**](AdAccountsApi.md#ad_accounts_list) | **GET** /ad_accounts | List ad accounts |
| [**analytics_create_mmm_report**](AdAccountsApi.md#analytics_create_mmm_report) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report |
| [**analytics_create_report**](AdAccountsApi.md#analytics_create_report) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report |
| [**analytics_create_template_report**](AdAccountsApi.md#analytics_create_template_report) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template |
| [**analytics_get_mmm_report**](AdAccountsApi.md#analytics_get_mmm_report) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report. |
| [**analytics_get_report**](AdAccountsApi.md#analytics_get_report) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call |
| [**sandbox_delete**](AdAccountsApi.md#sandbox_delete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox |
| [**templates_list**](AdAccountsApi.md#templates_list) | **GET** /ad_accounts/{ad_account_id}/templates | List templates |


## ad_account_analytics

> <Array<AdAccountAnalyticsResponseInner>> ad_account_analytics(ad_account_id, start_date, end_date, columns, granularity, opts)

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.

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
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
columns = ['SPEND_IN_MICRO_DOLLAR'] # Array<String> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
granularity = PinterestSdkClient::Granularity::TOTAL # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
opts = {
  click_window_days: 0, # Integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  engagement_window_days: 0, # Integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  view_window_days: 0, # Integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
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

> <Array(<Array<AdAccountAnalyticsResponseInner>>, Integer, Hash)> ad_account_analytics_with_http_info(ad_account_id, start_date, end_date, columns, granularity, opts)

```ruby
begin
  # Get ad account analytics
  data, status_code, headers = api_instance.ad_account_analytics_with_http_info(ad_account_id, start_date, end_date, columns, granularity, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<AdAccountAnalyticsResponseInner>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_account_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **columns** | [**Array&lt;String&gt;**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |  |
| **click_window_days** | **Integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **engagement_window_days** | **Integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional][default to 30] |
| **view_window_days** | **Integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional][default to 1] |
| **conversion_report_time** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to &#39;TIME_OF_AD_ACTION&#39;] |

### Return type

[**Array&lt;AdAccountAnalyticsResponseInner&gt;**](AdAccountAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_account_targeting_analytics_get

> <MetricsResponse> ad_account_targeting_analytics_get(ad_account_id, start_date, end_date, targeting_types, columns, granularity, opts)

Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

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


## ad_accounts_create

> <AdAccount> ad_accounts_create(ad_account_create_request)

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.

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
ad_account_create_request = PinterestSdkClient::AdAccountCreateRequest.new # AdAccountCreateRequest | Ad account to create.

begin
  # Create ad account
  result = api_instance.ad_accounts_create(ad_account_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->ad_accounts_create: #{e}"
end
```

#### Using the ad_accounts_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccount>, Integer, Hash)> ad_accounts_create_with_http_info(ad_account_create_request)

```ruby
begin
  # Create ad account
  data, status_code, headers = api_instance.ad_accounts_create_with_http_info(ad_account_create_request)
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
| **ad_account_create_request** | [**AdAccountCreateRequest**](AdAccountCreateRequest.md) | Ad account to create. |  |

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
end

api_instance = PinterestSdkClient::AdAccountsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

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
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_accounts_list

> <AdAccountsList200Response> ad_accounts_list(opts)

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
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
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
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **include_shared_accounts** | **Boolean** | Include shared ad accounts | [optional][default to true] |

### Return type

[**AdAccountsList200Response**](AdAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analytics_create_mmm_report

> <CreateMMMReportResponse> analytics_create_mmm_report(ad_account_id, create_mmm_report_request)

Create a request for a Marketing Mix Modeling (MMM) report

This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.

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
create_mmm_report_request = PinterestSdkClient::CreateMMMReportRequest.new({report_name: 'report_name_example', start_date: '2020-12-20', end_date: '2020-12-20', granularity: 'DAY', level: 'CAMPAIGN_TARGETING', targeting_types: ["GENDER"], columns: [PinterestSdkClient::MMMReportingColumn::SPEND_IN_DOLLAR]}) # CreateMMMReportRequest | 

begin
  # Create a request for a Marketing Mix Modeling (MMM) report
  result = api_instance.analytics_create_mmm_report(ad_account_id, create_mmm_report_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_create_mmm_report: #{e}"
end
```

#### Using the analytics_create_mmm_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateMMMReportResponse>, Integer, Hash)> analytics_create_mmm_report_with_http_info(ad_account_id, create_mmm_report_request)

```ruby
begin
  # Create a request for a Marketing Mix Modeling (MMM) report
  data, status_code, headers = api_instance.analytics_create_mmm_report_with_http_info(ad_account_id, create_mmm_report_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateMMMReportResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_create_mmm_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **create_mmm_report_request** | [**CreateMMMReportRequest**](CreateMMMReportRequest.md) |  |  |

### Return type

[**CreateMMMReportResponse**](CreateMMMReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## analytics_create_report

> <AdsAnalyticsCreateAsyncResponse> analytics_create_report(ad_account_id, ads_analytics_create_async_request)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

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


## analytics_create_template_report

> <AdsAnalyticsCreateAsyncResponse> analytics_create_template_report(ad_account_id, template_id, opts)

Create async request for an analytics report using a template

This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.

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
template_id = 'template_id_example' # String | Unique identifier of a template.
opts = {
  start_date: Date.parse('2013-10-20'), # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
  end_date: Date.parse('2013-10-20'), # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
  granularity: PinterestSdkClient::Granularity::TOTAL # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
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

> <Array(<AdsAnalyticsCreateAsyncResponse>, Integer, Hash)> analytics_create_template_report_with_http_info(ad_account_id, template_id, opts)

```ruby
begin
  # Create async request for an analytics report using a template
  data, status_code, headers = api_instance.analytics_create_template_report_with_http_info(ad_account_id, template_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdsAnalyticsCreateAsyncResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_create_template_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **template_id** | **String** | Unique identifier of a template. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional] |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional] |
| **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [optional] |

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analytics_get_mmm_report

> <GetMMMReportResponse> analytics_get_mmm_report(ad_account_id, token)

Get advertiser Marketing Mix Modeling (MMM) report.

Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.

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
  # Get advertiser Marketing Mix Modeling (MMM) report.
  result = api_instance.analytics_get_mmm_report(ad_account_id, token)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_get_mmm_report: #{e}"
end
```

#### Using the analytics_get_mmm_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetMMMReportResponse>, Integer, Hash)> analytics_get_mmm_report_with_http_info(ad_account_id, token)

```ruby
begin
  # Get advertiser Marketing Mix Modeling (MMM) report.
  data, status_code, headers = api_instance.analytics_get_mmm_report_with_http_info(ad_account_id, token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetMMMReportResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdAccountsApi->analytics_get_mmm_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **token** | **String** | Token returned from the post request creation call |  |

### Return type

[**GetMMMReportResponse**](GetMMMReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analytics_get_report

> <AdsAnalyticsGetAsyncResponse> analytics_get_report(ad_account_id, token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
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
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**TemplatesList200Response**](TemplatesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

