# PinterestSdkClient::ResourcesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ad_account_countries_get**](ResourcesApi.md#ad_account_countries_get) | **GET** /resources/ad_account_countries | Get ad accounts countries |
| [**delivery_metrics_get**](ResourcesApi.md#delivery_metrics_get) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions |
| [**interest_targeting_options_get**](ResourcesApi.md#interest_targeting_options_get) | **GET** /resources/targeting/interests/{interest_id} | Get interest details |
| [**lead_form_questions_get**](ResourcesApi.md#lead_form_questions_get) | **GET** /resources/lead_form_questions | Get lead form questions |
| [**metrics_ready_state_get**](ResourcesApi.md#metrics_ready_state_get) | **GET** /resources/metrics_ready_state | Get metrics ready state |
| [**targeting_options_get**](ResourcesApi.md#targeting_options_get) | **GET** /resources/targeting/{targeting_type} | Get targeting options |


## ad_account_countries_get

> <AdAccountCountriesGet200Response> ad_account_countries_get

Get ad accounts countries

Get Ad Accounts countries

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

api_instance = PinterestSdkClient::ResourcesApi.new

begin
  # Get ad accounts countries
  result = api_instance.ad_account_countries_get
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->ad_account_countries_get: #{e}"
end
```

#### Using the ad_account_countries_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccountCountriesGet200Response>, Integer, Hash)> ad_account_countries_get_with_http_info

```ruby
begin
  # Get ad accounts countries
  data, status_code, headers = api_instance.ad_account_countries_get_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountCountriesGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->ad_account_countries_get_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AdAccountCountriesGet200Response**](AdAccountCountriesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## delivery_metrics_get

> <DeliveryMetricsGet200Response> delivery_metrics_get(opts)

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

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

api_instance = PinterestSdkClient::ResourcesApi.new
opts = {
  report_type: PinterestSdkClient::ReportType::SYNC # ReportType | Report type.
}

begin
  # Get available metrics' definitions
  result = api_instance.delivery_metrics_get(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->delivery_metrics_get: #{e}"
end
```

#### Using the delivery_metrics_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeliveryMetricsGet200Response>, Integer, Hash)> delivery_metrics_get_with_http_info(opts)

```ruby
begin
  # Get available metrics' definitions
  data, status_code, headers = api_instance.delivery_metrics_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeliveryMetricsGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->delivery_metrics_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_type** | [**ReportType**](.md) | Report type. | [optional] |

### Return type

[**DeliveryMetricsGet200Response**](DeliveryMetricsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## interest_targeting_options_get

> <SingleInterestTargetingOption> interest_targeting_options_get(interest_id)

Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.

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

api_instance = PinterestSdkClient::ResourcesApi.new
interest_id = 'interest_id_example' # String | Unique identifier of an interest.

begin
  # Get interest details
  result = api_instance.interest_targeting_options_get(interest_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->interest_targeting_options_get: #{e}"
end
```

#### Using the interest_targeting_options_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SingleInterestTargetingOption>, Integer, Hash)> interest_targeting_options_get_with_http_info(interest_id)

```ruby
begin
  # Get interest details
  data, status_code, headers = api_instance.interest_targeting_options_get_with_http_info(interest_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SingleInterestTargetingOption>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->interest_targeting_options_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **interest_id** | **String** | Unique identifier of an interest. |  |

### Return type

[**SingleInterestTargetingOption**](SingleInterestTargetingOption.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## lead_form_questions_get

> lead_form_questions_get

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ResourcesApi.new

begin
  # Get lead form questions
  api_instance.lead_form_questions_get
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->lead_form_questions_get: #{e}"
end
```

#### Using the lead_form_questions_get_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> lead_form_questions_get_with_http_info

```ruby
begin
  # Get lead form questions
  data, status_code, headers = api_instance.lead_form_questions_get_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->lead_form_questions_get_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## metrics_ready_state_get

> <BookClosed> metrics_ready_state_get(date)

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ResourcesApi.new
date = 'date_example' # String | Analytics reports request date (UTC). Format: YYYY-MM-DD

begin
  # Get metrics ready state
  result = api_instance.metrics_ready_state_get(date)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->metrics_ready_state_get: #{e}"
end
```

#### Using the metrics_ready_state_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BookClosed>, Integer, Hash)> metrics_ready_state_get_with_http_info(date)

```ruby
begin
  # Get metrics ready state
  data, status_code, headers = api_instance.metrics_ready_state_get_with_http_info(date)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BookClosed>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->metrics_ready_state_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date** | **String** | Analytics reports request date (UTC). Format: YYYY-MM-DD |  |

### Return type

[**BookClosed**](BookClosed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## targeting_options_get

> Array&lt;Object&gt; targeting_options_get(targeting_type, opts)

Get targeting options

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```

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

api_instance = PinterestSdkClient::ResourcesApi.new
targeting_type = PinterestSdkClient::PublicTargetingType::APPTYPE # PublicTargetingType | Public targeting type
opts = {
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  client_id: 'client_id_example', # String | Client ID
  oauth_signature: 'oauth_signature_example', # String | Oauth signature
  timestamp: 'timestamp_example' # String | Timestamp.
}

begin
  # Get targeting options
  result = api_instance.targeting_options_get(targeting_type, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->targeting_options_get: #{e}"
end
```

#### Using the targeting_options_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;Object&gt;, Integer, Hash)> targeting_options_get_with_http_info(targeting_type, opts)

```ruby
begin
  # Get targeting options
  data, status_code, headers = api_instance.targeting_options_get_with_http_info(targeting_type, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;Object&gt;
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->targeting_options_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **targeting_type** | [**PublicTargetingType**](.md) | Public targeting type |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **client_id** | **String** | Client ID | [optional] |
| **oauth_signature** | **String** | Oauth signature | [optional] |
| **timestamp** | **String** | Timestamp. | [optional] |

### Return type

**Array&lt;Object&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

