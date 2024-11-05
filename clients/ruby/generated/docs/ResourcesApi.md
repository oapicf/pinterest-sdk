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

> <AdAccountsCountryResponse> ad_account_countries_get

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

> <Array(<AdAccountsCountryResponse>, Integer, Hash)> ad_account_countries_get_with_http_info

```ruby
begin
  # Get ad accounts countries
  data, status_code, headers = api_instance.ad_account_countries_get_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountsCountryResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->ad_account_countries_get_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AdAccountsCountryResponse**](AdAccountsCountryResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## delivery_metrics_get

> <DeliveryMetricsResponse> delivery_metrics_get(opts)

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/api-features/analytics-overview/'>Organic Analytics</a> and <a href='/docs/api-features/ads-reporting/'>Ads Analytics</a> for more information.

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
opts = {
  report_type: 'SYNC' # String | Report type.
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

> <Array(<DeliveryMetricsResponse>, Integer, Hash)> delivery_metrics_get_with_http_info(opts)

```ruby
begin
  # Get available metrics' definitions
  data, status_code, headers = api_instance.delivery_metrics_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeliveryMetricsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->delivery_metrics_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_type** | **String** | Report type. | [optional] |

### Return type

[**DeliveryMetricsResponse**](DeliveryMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## interest_targeting_options_get

> <SingleInterestTargetingOptionResponse> interest_targeting_options_get(interest_id)

Get interest details

<p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>

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

> <Array(<SingleInterestTargetingOptionResponse>, Integer, Hash)> interest_targeting_options_get_with_http_info(interest_id)

```ruby
begin
  # Get interest details
  data, status_code, headers = api_instance.interest_targeting_options_get_with_http_info(interest_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SingleInterestTargetingOptionResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->interest_targeting_options_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **interest_id** | **String** | Unique identifier of an interest. |  |

### Return type

[**SingleInterestTargetingOptionResponse**](SingleInterestTargetingOptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## lead_form_questions_get

> lead_form_questions_get

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

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

> <BookClosedResponse> metrics_ready_state_get(date)

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
date = '2022-07-13' # String | Analytics reports request date (UTC). Format: YYYY-MM-DD

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

> <Array(<BookClosedResponse>, Integer, Hash)> metrics_ready_state_get_with_http_info(date)

```ruby
begin
  # Get metrics ready state
  data, status_code, headers = api_instance.metrics_ready_state_get_with_http_info(date)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BookClosedResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ResourcesApi->metrics_ready_state_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date** | **String** | Analytics reports request date (UTC). Format: YYYY-MM-DD |  |

### Return type

[**BookClosedResponse**](BookClosedResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## targeting_options_get

> Array&lt;Object&gt; targeting_options_get(targeting_type, opts)

Get targeting options

<p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>

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
targeting_type = 'APPTYPE' # String | Public targeting type.
opts = {
  client_id: '1094834', # String | Client ID.
  oauth_signature: '8209f', # String | Oauth signature
  timestamp: '1618338184277', # String | Timestamp
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
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
| **targeting_type** | **String** | Public targeting type. |  |
| **client_id** | **String** | Client ID. | [optional] |
| **oauth_signature** | **String** | Oauth signature | [optional] |
| **timestamp** | **String** | Timestamp | [optional] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

**Array&lt;Object&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

