# PinterestSdkClient::PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**pins_analytics**](PinsApi.md#pins_analytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics |
| [**pins_create**](PinsApi.md#pins_create) | **POST** /pins | Create Pin |
| [**pins_delete**](PinsApi.md#pins_delete) | **DELETE** /pins/{pin_id} | Delete Pin |
| [**pins_get**](PinsApi.md#pins_get) | **GET** /pins/{pin_id} | Get Pin |
| [**pins_list**](PinsApi.md#pins_list) | **GET** /pins | List Pins |
| [**pins_save**](PinsApi.md#pins_save) | **POST** /pins/{pin_id}/save | Save Pin |
| [**pins_update**](PinsApi.md#pins_update) | **PATCH** /pins/{pin_id} | Update Pin |


## pins_analytics

> <Hash<String, PinAnalyticsMetricsResponse>> pins_analytics(pin_id, start_date, end_date, metric_types, opts)

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

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
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
metric_types = [nil] # Array<PinsAnalyticsMetricTypesParameterInner> | Pin metric types to get data for, default is all.
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

> <Array(<Hash<String, PinAnalyticsMetricsResponse>>, Integer, Hash)> pins_analytics_with_http_info(pin_id, start_date, end_date, metric_types, opts)

```ruby
begin
  # Get Pin analytics
  data, status_code, headers = api_instance.pins_analytics_with_http_info(pin_id, start_date, end_date, metric_types, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Hash<String, PinAnalyticsMetricsResponse>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_analytics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pin_id** | **String** | Unique identifier of a Pin. |  |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **metric_types** | [**Array&lt;PinsAnalyticsMetricTypesParameterInner&gt;**](PinsAnalyticsMetricTypesParameterInner.md) | Pin metric types to get data for, default is all. |  |
| **app_types** | **String** | Apps or devices to get data for, default is all. | [optional][default to &#39;ALL&#39;] |
| **split_field** | **String** | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional][default to &#39;NO_SPLIT&#39;] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Hash&lt;String, PinAnalyticsMetricsResponse&gt;**](PinAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pins_create

> <Pin> pins_create(pin_create, opts)

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/content/content-creation/'>Content App Solutions Guide</a>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

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
pin_create = PinterestSdkClient::PinCreate.new # PinCreate | Create a new Pin.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Create Pin
  result = api_instance.pins_create(pin_create, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_create: #{e}"
end
```

#### Using the pins_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Pin>, Integer, Hash)> pins_create_with_http_info(pin_create, opts)

```ruby
begin
  # Create Pin
  data, status_code, headers = api_instance.pins_create_with_http_info(pin_create, opts)
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
| **pin_create** | [**PinCreate**](PinCreate.md) | Create a new Pin. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## pins_delete

> pins_delete(pin_id, opts)

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

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
  # Delete Pin
  api_instance.pins_delete(pin_id, opts)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_delete: #{e}"
end
```

#### Using the pins_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> pins_delete_with_http_info(pin_id, opts)

```ruby
begin
  # Delete Pin
  data, status_code, headers = api_instance.pins_delete_with_http_info(pin_id, opts)
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
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

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
  pin_metrics: true, # Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
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
| **pin_metrics** | **Boolean** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional][default to false] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pins_list

> <PinsList200Response> pins_list(opts)

List Pins

Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

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
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  pin_filter: 'exclude_native', # String | Pin filter.
  include_protected_pins: true, # Boolean | Specify if return pins from protected boards
  pin_type: 'PRIVATE', # String | The type of pins to return, currently only enabled for private pins
  creative_types: ['REGULAR'], # Array<String> | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  pin_metrics: true # Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
}

begin
  # List Pins
  result = api_instance.pins_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_list: #{e}"
end
```

#### Using the pins_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PinsList200Response>, Integer, Hash)> pins_list_with_http_info(opts)

```ruby
begin
  # List Pins
  data, status_code, headers = api_instance.pins_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PinsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **pin_filter** | **String** | Pin filter. | [optional] |
| **include_protected_pins** | **Boolean** | Specify if return pins from protected boards | [optional][default to false] |
| **pin_type** | **String** | The type of pins to return, currently only enabled for private pins | [optional] |
| **creative_types** | [**Array&lt;String&gt;**](String.md) | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **pin_metrics** | **Boolean** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional][default to false] |

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pins_save

> <Pin> pins_save(pin_id, pins_save_request, opts)

Save Pin

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

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
pins_save_request = PinterestSdkClient::PinsSaveRequest.new # PinsSaveRequest | Request object used to save an existing pin
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Save Pin
  result = api_instance.pins_save(pin_id, pins_save_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_save: #{e}"
end
```

#### Using the pins_save_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Pin>, Integer, Hash)> pins_save_with_http_info(pin_id, pins_save_request, opts)

```ruby
begin
  # Save Pin
  data, status_code, headers = api_instance.pins_save_with_http_info(pin_id, pins_save_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Pin>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_save_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pin_id** | **String** | Unique identifier of a Pin. |  |
| **pins_save_request** | [**PinsSaveRequest**](PinsSaveRequest.md) | Request object used to save an existing pin |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## pins_update

> <Pin> pins_update(pin_id, pin_update, opts)

Update Pin

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

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
pin_update = PinterestSdkClient::PinUpdate.new # PinUpdate | 
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Update Pin
  result = api_instance.pins_update(pin_id, pin_update, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_update: #{e}"
end
```

#### Using the pins_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Pin>, Integer, Hash)> pins_update_with_http_info(pin_id, pin_update, opts)

```ruby
begin
  # Update Pin
  data, status_code, headers = api_instance.pins_update_with_http_info(pin_id, pin_update, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Pin>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling PinsApi->pins_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pin_id** | **String** | Unique identifier of a Pin. |  |
| **pin_update** | [**PinUpdate**](PinUpdate.md) |  |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

