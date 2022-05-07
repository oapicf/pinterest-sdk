# PinterestSdkClient::PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**pins_analytics**](PinsApi.md#pins_analytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics |
| [**pins_create**](PinsApi.md#pins_create) | **POST** /pins | Create Pin |
| [**pins_delete**](PinsApi.md#pins_delete) | **DELETE** /pins/{pin_id} | Delete Pin |
| [**pins_get**](PinsApi.md#pins_get) | **GET** /pins/{pin_id} | Get Pin |


## pins_analytics

> <Hash<String, AnalyticsMetricsResponse>> pins_analytics(pin_id, start_date, end_date, metric_types, opts)

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::PinsApi.new
pin_id = 'pin_id_example' # String | Unique identifier of a Pin.
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD
metric_types = ['IMPRESSION'] # Array<String> | Pin metric types to get data for, default is all.
opts = {
  app_types: 'ALL', # String | Apps or devices to get data for, default is all.
  split_field: 'NO_SPLIT', # String | How to split the data into groups. Not including this param means data won't be split.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get Pin analytics
  result = api_instance.pins_analytics(pin_id, start_date, end_date, metric_types, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_analytics: #{e}"
end
```

#### Using the pins_analytics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Hash<String, AnalyticsMetricsResponse>>, Integer, Hash)> pins_analytics_with_http_info(pin_id, start_date, end_date, metric_types, opts)

```ruby
begin
  # Get Pin analytics
  data, status_code, headers = api_instance.pins_analytics_with_http_info(pin_id, start_date, end_date, metric_types, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Hash<String, AnalyticsMetricsResponse>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pin_id** | **String** | Unique identifier of a Pin. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **metric_types** | [**Array&lt;String&gt;**](String.md) | Pin metric types to get data for, default is all. |  |
| **app_types** | **String** | Apps or devices to get data for, default is all. | [optional][default to &#39;ALL&#39;] |
| **split_field** | **String** | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional][default to &#39;NO_SPLIT&#39;] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Hash&lt;String, AnalyticsMetricsResponse&gt;**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pins_create

> <Pin> pins_create(pin)

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::PinsApi.new
pin = PinterestSdkClient::Pin.new # Pin | Create a new Pin.

begin
  # Create Pin
  result = api_instance.pins_create(pin)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_create: #{e}"
end
```

#### Using the pins_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Pin>, Integer, Hash)> pins_create_with_http_info(pin)

```ruby
begin
  # Create Pin
  data, status_code, headers = api_instance.pins_create_with_http_info(pin)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Pin>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pin** | [**Pin**](Pin.md) | Create a new Pin. |  |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## pins_delete

> pins_delete(pin_id)

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::PinsApi.new
pin_id = 'pin_id_example' # String | Unique identifier of a Pin.

begin
  # Delete Pin
  api_instance.pins_delete(pin_id)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_delete: #{e}"
end
```

#### Using the pins_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> pins_delete_with_http_info(pin_id)

```ruby
begin
  # Delete Pin
  data, status_code, headers = api_instance.pins_delete_with_http_info(pin_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pin_id** | **String** | Unique identifier of a Pin. |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pins_get

> <Pin> pins_get(pin_id, opts)

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::PinsApi.new
pin_id = 'pin_id_example' # String | Unique identifier of a Pin.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get Pin
  result = api_instance.pins_get(pin_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_get: #{e}"
end
```

#### Using the pins_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Pin>, Integer, Hash)> pins_get_with_http_info(pin_id, opts)

```ruby
begin
  # Get Pin
  data, status_code, headers = api_instance.pins_get_with_http_info(pin_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Pin>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pin_id** | **String** | Unique identifier of a Pin. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

