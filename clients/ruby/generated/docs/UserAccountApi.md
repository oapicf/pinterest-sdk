# PinterestSdkClient::UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**user_account_analytics**](UserAccountApi.md#user_account_analytics) | **GET** /user_account/analytics | Get user account analytics |
| [**user_account_get**](UserAccountApi.md#user_account_get) | **GET** /user_account | Get user account |


## user_account_analytics

> <Hash<String, AnalyticsMetricsResponse>> user_account_analytics(start_date, end_date, opts)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::UserAccountApi.new
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD
opts = {
  from_claimed_content: 'OTHER', # String | Filter on Pins that match your claimed domain.
  pin_format: 'ALL', # String | Pin formats to get data for, default is all.
  app_types: 'ALL', # String | Apps or devices to get data for, default is all.
  metric_types: ['ENGAGEMENT'], # Array<String> | Metric types to get data for, default is all. 
  split_field: 'NO_SPLIT', # String | How to split the data into groups. Not including this param means data won't be split.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get user account analytics
  result = api_instance.user_account_analytics(start_date, end_date, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_account_analytics: #{e}"
end
```

#### Using the user_account_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Hash<String, AnalyticsMetricsResponse>>, Integer, Hash)> user_account_analytics_with_http_info(start_date, end_date, opts)

```ruby
begin
  # Get user account analytics
  data, status_code, headers = api_instance.user_account_analytics_with_http_info(start_date, end_date, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Hash<String, AnalyticsMetricsResponse>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_account_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **from_claimed_content** | **String** | Filter on Pins that match your claimed domain. | [optional][default to &#39;BOTH&#39;] |
| **pin_format** | **String** | Pin formats to get data for, default is all. | [optional][default to &#39;ALL&#39;] |
| **app_types** | **String** | Apps or devices to get data for, default is all. | [optional][default to &#39;ALL&#39;] |
| **metric_types** | [**Array&lt;String&gt;**](String.md) | Metric types to get data for, default is all.  | [optional] |
| **split_field** | **String** | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional][default to &#39;NO_SPLIT&#39;] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Hash&lt;String, AnalyticsMetricsResponse&gt;**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## user_account_get

> <Account> user_account_get(opts)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::UserAccountApi.new
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get user account
  result = api_instance.user_account_get(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_account_get: #{e}"
end
```

#### Using the user_account_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Account>, Integer, Hash)> user_account_get_with_http_info(opts)

```ruby
begin
  # Get user account
  data, status_code, headers = api_instance.user_account_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Account>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_account_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

