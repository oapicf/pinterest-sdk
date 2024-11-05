# PinterestSdkClient::UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**boards_user_follows_list**](UserAccountApi.md#boards_user_follows_list) | **GET** /user_account/following/boards | List following boards |
| [**follow_user_update**](UserAccountApi.md#follow_user_update) | **POST** /user_account/following/{username} | Follow user |
| [**followers_list**](UserAccountApi.md#followers_list) | **GET** /user_account/followers | List followers |
| [**linked_business_accounts_get**](UserAccountApi.md#linked_business_accounts_get) | **GET** /user_account/businesses | List linked businesses |
| [**unverify_website_delete**](UserAccountApi.md#unverify_website_delete) | **DELETE** /user_account/websites | Unverify website |
| [**user_account_analytics**](UserAccountApi.md#user_account_analytics) | **GET** /user_account/analytics | Get user account analytics |
| [**user_account_analytics_top_pins**](UserAccountApi.md#user_account_analytics_top_pins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics |
| [**user_account_analytics_top_video_pins**](UserAccountApi.md#user_account_analytics_top_video_pins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics |
| [**user_account_followed_interests**](UserAccountApi.md#user_account_followed_interests) | **GET** /users/{username}/interests/follow | List following interests |
| [**user_account_get**](UserAccountApi.md#user_account_get) | **GET** /user_account | Get user account |
| [**user_following_get**](UserAccountApi.md#user_following_get) | **GET** /user_account/following | List following |
| [**user_websites_get**](UserAccountApi.md#user_websites_get) | **GET** /user_account/websites | Get user websites |
| [**verify_website_update**](UserAccountApi.md#verify_website_update) | **POST** /user_account/websites | Verify website |
| [**website_verification_get**](UserAccountApi.md#website_verification_get) | **GET** /user_account/websites/verification | Get user verification code for website claiming |


## boards_user_follows_list

> <BoardsUserFollowsList200Response> boards_user_follows_list(opts)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

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

api_instance = PinterestSdkClient::UserAccountApi.new
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  explicit_following: true, # Boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List following boards
  result = api_instance.boards_user_follows_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->boards_user_follows_list: #{e}"
end
```

#### Using the boards_user_follows_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BoardsUserFollowsList200Response>, Integer, Hash)> boards_user_follows_list_with_http_info(opts)

```ruby
begin
  # List following boards
  data, status_code, headers = api_instance.boards_user_follows_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BoardsUserFollowsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->boards_user_follows_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **explicit_following** | **Boolean** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional][default to false] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**BoardsUserFollowsList200Response**](BoardsUserFollowsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## follow_user_update

> <UserSummary> follow_user_update(username, follow_user_request)

Follow user

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.

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
username = 'username' # String | A valid username
follow_user_request = PinterestSdkClient::FollowUserRequest.new # FollowUserRequest | Follow a user.

begin
  # Follow user
  result = api_instance.follow_user_update(username, follow_user_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->follow_user_update: #{e}"
end
```

#### Using the follow_user_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserSummary>, Integer, Hash)> follow_user_update_with_http_info(username, follow_user_request)

```ruby
begin
  # Follow user
  data, status_code, headers = api_instance.follow_user_update_with_http_info(username, follow_user_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserSummary>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->follow_user_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **username** | **String** | A valid username |  |
| **follow_user_request** | [**FollowUserRequest**](FollowUserRequest.md) | Follow a user. |  |

### Return type

[**UserSummary**](UserSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## followers_list

> <FollowersList200Response> followers_list(opts)

List followers

Get a list of your followers.

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

api_instance = PinterestSdkClient::UserAccountApi.new
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # List followers
  result = api_instance.followers_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->followers_list: #{e}"
end
```

#### Using the followers_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FollowersList200Response>, Integer, Hash)> followers_list_with_http_info(opts)

```ruby
begin
  # List followers
  data, status_code, headers = api_instance.followers_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FollowersList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->followers_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## linked_business_accounts_get

> <Array<LinkedBusiness>> linked_business_accounts_get

List linked businesses

Get a list of your linked business accounts.

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

api_instance = PinterestSdkClient::UserAccountApi.new

begin
  # List linked businesses
  result = api_instance.linked_business_accounts_get
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->linked_business_accounts_get: #{e}"
end
```

#### Using the linked_business_accounts_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<LinkedBusiness>>, Integer, Hash)> linked_business_accounts_get_with_http_info

```ruby
begin
  # List linked businesses
  data, status_code, headers = api_instance.linked_business_accounts_get_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<LinkedBusiness>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->linked_business_accounts_get_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Array&lt;LinkedBusiness&gt;**](LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## unverify_website_delete

> unverify_website_delete(website)

Unverify website

Unverifu a website verified by the signed-in user.

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
website = 'mysite.test' # String | Website with path or domain only

begin
  # Unverify website
  api_instance.unverify_website_delete(website)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->unverify_website_delete: #{e}"
end
```

#### Using the unverify_website_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> unverify_website_delete_with_http_info(website)

```ruby
begin
  # Unverify website
  data, status_code, headers = api_instance.unverify_website_delete_with_http_info(website)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->unverify_website_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **website** | **String** | Website with path or domain only |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


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
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
opts = {
  from_claimed_content: 'OTHER', # String | Filter on Pins that match your claimed domain.
  pin_format: 'ALL', # String | Pin formats to get data for, default is all.
  app_types: 'ALL', # String | Apps or devices to get data for, default is all.
  content_type: 'ALL', # String | Filter to paid or organic data. Default is all.
  source: 'ALL', # String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
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
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **from_claimed_content** | **String** | Filter on Pins that match your claimed domain. | [optional][default to &#39;BOTH&#39;] |
| **pin_format** | **String** | Pin formats to get data for, default is all. | [optional][default to &#39;ALL&#39;] |
| **app_types** | **String** | Apps or devices to get data for, default is all. | [optional][default to &#39;ALL&#39;] |
| **content_type** | **String** | Filter to paid or organic data. Default is all. | [optional][default to &#39;ALL&#39;] |
| **source** | **String** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional][default to &#39;ALL&#39;] |
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


## user_account_analytics_top_pins

> <TopPinsAnalyticsResponse> user_account_analytics_top_pins(start_date, end_date, sort_by, opts)

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

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

api_instance = PinterestSdkClient::UserAccountApi.new
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
sort_by = 'ENGAGEMENT' # String | Specify sorting order for metrics
opts = {
  from_claimed_content: 'OTHER', # String | Filter on Pins that match your claimed domain.
  pin_format: 'ALL', # String | Pin formats to get data for, default is all.
  app_types: 'ALL', # String | Apps or devices to get data for, default is all.
  content_type: 'ALL', # String | Filter to paid or organic data. Default is all.
  source: 'ALL', # String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
  metric_types: ['ENGAGEMENT'], # Array<String> | Metric types to get data for, default is all. 
  num_of_pins: 25, # Integer | Number of pins to include, default is 10. Max is 50.
  created_in_last_n_days: 30, # Integer | Get metrics for pins created in the last \"n\" days.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get user account top pins analytics
  result = api_instance.user_account_analytics_top_pins(start_date, end_date, sort_by, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_account_analytics_top_pins: #{e}"
end
```

#### Using the user_account_analytics_top_pins_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TopPinsAnalyticsResponse>, Integer, Hash)> user_account_analytics_top_pins_with_http_info(start_date, end_date, sort_by, opts)

```ruby
begin
  # Get user account top pins analytics
  data, status_code, headers = api_instance.user_account_analytics_top_pins_with_http_info(start_date, end_date, sort_by, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TopPinsAnalyticsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_account_analytics_top_pins_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **sort_by** | **String** | Specify sorting order for metrics |  |
| **from_claimed_content** | **String** | Filter on Pins that match your claimed domain. | [optional][default to &#39;BOTH&#39;] |
| **pin_format** | **String** | Pin formats to get data for, default is all. | [optional][default to &#39;ALL&#39;] |
| **app_types** | **String** | Apps or devices to get data for, default is all. | [optional][default to &#39;ALL&#39;] |
| **content_type** | **String** | Filter to paid or organic data. Default is all. | [optional][default to &#39;ALL&#39;] |
| **source** | **String** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional][default to &#39;ALL&#39;] |
| **metric_types** | [**Array&lt;String&gt;**](String.md) | Metric types to get data for, default is all.  | [optional] |
| **num_of_pins** | **Integer** | Number of pins to include, default is 10. Max is 50. | [optional][default to 10] |
| **created_in_last_n_days** | **Integer** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## user_account_analytics_top_video_pins

> <TopVideoPinsAnalyticsResponse> user_account_analytics_top_video_pins(start_date, end_date, sort_by, opts)

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

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

api_instance = PinterestSdkClient::UserAccountApi.new
start_date = Date.parse('2013-10-20') # Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
end_date = Date.parse('2013-10-20') # Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
sort_by = 'IMPRESSION' # String | Specify sorting order for video metrics
opts = {
  from_claimed_content: 'OTHER', # String | Filter on Pins that match your claimed domain.
  pin_format: 'ALL', # String | Pin formats to get data for, default is all.
  app_types: 'ALL', # String | Apps or devices to get data for, default is all.
  content_type: 'ALL', # String | Filter to paid or organic data. Default is all.
  source: 'ALL', # String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
  metric_types: ['IMPRESSION'], # Array<String> | Metric types to get video data for, default is all. 
  num_of_pins: 25, # Integer | Number of pins to include, default is 10. Max is 50.
  created_in_last_n_days: 30, # Integer | Get metrics for pins created in the last \"n\" days.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get user account top video pins analytics
  result = api_instance.user_account_analytics_top_video_pins(start_date, end_date, sort_by, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_account_analytics_top_video_pins: #{e}"
end
```

#### Using the user_account_analytics_top_video_pins_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TopVideoPinsAnalyticsResponse>, Integer, Hash)> user_account_analytics_top_video_pins_with_http_info(start_date, end_date, sort_by, opts)

```ruby
begin
  # Get user account top video pins analytics
  data, status_code, headers = api_instance.user_account_analytics_top_video_pins_with_http_info(start_date, end_date, sort_by, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TopVideoPinsAnalyticsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_account_analytics_top_video_pins_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_date** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **end_date** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **sort_by** | **String** | Specify sorting order for video metrics |  |
| **from_claimed_content** | **String** | Filter on Pins that match your claimed domain. | [optional][default to &#39;BOTH&#39;] |
| **pin_format** | **String** | Pin formats to get data for, default is all. | [optional][default to &#39;ALL&#39;] |
| **app_types** | **String** | Apps or devices to get data for, default is all. | [optional][default to &#39;ALL&#39;] |
| **content_type** | **String** | Filter to paid or organic data. Default is all. | [optional][default to &#39;ALL&#39;] |
| **source** | **String** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional][default to &#39;ALL&#39;] |
| **metric_types** | [**Array&lt;String&gt;**](String.md) | Metric types to get video data for, default is all.  | [optional] |
| **num_of_pins** | **Integer** | Number of pins to include, default is 10. Max is 50. | [optional][default to 10] |
| **created_in_last_n_days** | **Integer** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## user_account_followed_interests

> <UserAccountFollowedInterests200Response> user_account_followed_interests(username, opts)

List following interests

Get a list of a user's following interests in one place.

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

api_instance = PinterestSdkClient::UserAccountApi.new
username = 'username' # String | A valid username
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # List following interests
  result = api_instance.user_account_followed_interests(username, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_account_followed_interests: #{e}"
end
```

#### Using the user_account_followed_interests_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserAccountFollowedInterests200Response>, Integer, Hash)> user_account_followed_interests_with_http_info(username, opts)

```ruby
begin
  # List following interests
  data, status_code, headers = api_instance.user_account_followed_interests_with_http_info(username, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserAccountFollowedInterests200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_account_followed_interests_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **username** | **String** | A valid username |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## user_account_get

> <Account> user_account_get(opts)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

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

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## user_following_get

> <UserFollowingGet200Response> user_following_get(opts)

List following

Get a list of who a certain user follows.

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

api_instance = PinterestSdkClient::UserAccountApi.new
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  feed_type: 'feed_type_example', # UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees.
  explicit_following: true, # Boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List following
  result = api_instance.user_following_get(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_following_get: #{e}"
end
```

#### Using the user_following_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserFollowingGet200Response>, Integer, Hash)> user_following_get_with_http_info(opts)

```ruby
begin
  # List following
  data, status_code, headers = api_instance.user_following_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserFollowingGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_following_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **feed_type** | **UserFollowingFeedType** | Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional][default to &#39;ALL&#39;] |
| **explicit_following** | **Boolean** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional][default to false] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**UserFollowingGet200Response**](UserFollowingGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## user_websites_get

> <UserWebsitesGet200Response> user_websites_get(opts)

Get user websites

Get user websites, claimed or not

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
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # Get user websites
  result = api_instance.user_websites_get(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_websites_get: #{e}"
end
```

#### Using the user_websites_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserWebsitesGet200Response>, Integer, Hash)> user_websites_get_with_http_info(opts)

```ruby
begin
  # Get user websites
  data, status_code, headers = api_instance.user_websites_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserWebsitesGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->user_websites_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## verify_website_update

> <UserWebsiteSummary> verify_website_update(user_website_verify_request, opts)

Verify website

Verify a website as a signed-in user.

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
user_website_verify_request = PinterestSdkClient::UserWebsiteVerifyRequest.new # UserWebsiteVerifyRequest | Verify a website.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Verify website
  result = api_instance.verify_website_update(user_website_verify_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->verify_website_update: #{e}"
end
```

#### Using the verify_website_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserWebsiteSummary>, Integer, Hash)> verify_website_update_with_http_info(user_website_verify_request, opts)

```ruby
begin
  # Verify website
  data, status_code, headers = api_instance.verify_website_update_with_http_info(user_website_verify_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserWebsiteSummary>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->verify_website_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_website_verify_request** | [**UserWebsiteVerifyRequest**](UserWebsiteVerifyRequest.md) | Verify a website. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**UserWebsiteSummary**](UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## website_verification_get

> <UserWebsiteVerificationCode> website_verification_get(opts)

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

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

api_instance = PinterestSdkClient::UserAccountApi.new
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get user verification code for website claiming
  result = api_instance.website_verification_get(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->website_verification_get: #{e}"
end
```

#### Using the website_verification_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserWebsiteVerificationCode>, Integer, Hash)> website_verification_get_with_http_info(opts)

```ruby
begin
  # Get user verification code for website claiming
  data, status_code, headers = api_instance.website_verification_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserWebsiteVerificationCode>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling UserAccountApi->website_verification_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**UserWebsiteVerificationCode**](UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

