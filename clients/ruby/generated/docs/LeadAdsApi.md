# PinterestSdkClient::LeadAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ad_accounts_subscriptions_del_by_id**](LeadAdsApi.md#ad_accounts_subscriptions_del_by_id) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription |
| [**ad_accounts_subscriptions_get_by_id**](LeadAdsApi.md#ad_accounts_subscriptions_get_by_id) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription |
| [**ad_accounts_subscriptions_get_list**](LeadAdsApi.md#ad_accounts_subscriptions_get_list) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions |
| [**ad_accounts_subscriptions_post**](LeadAdsApi.md#ad_accounts_subscriptions_post) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription |


## ad_accounts_subscriptions_del_by_id

> ad_accounts_subscriptions_del_by_id(ad_account_id, subscription_id)

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LeadAdsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
subscription_id = 'subscription_id_example' # String | Unique identifier of a subscription.

begin
  # Delete lead ads subscription
  api_instance.ad_accounts_subscriptions_del_by_id(ad_account_id, subscription_id)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadAdsApi->ad_accounts_subscriptions_del_by_id: #{e}"
end
```

#### Using the ad_accounts_subscriptions_del_by_id_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> ad_accounts_subscriptions_del_by_id_with_http_info(ad_account_id, subscription_id)

```ruby
begin
  # Delete lead ads subscription
  data, status_code, headers = api_instance.ad_accounts_subscriptions_del_by_id_with_http_info(ad_account_id, subscription_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadAdsApi->ad_accounts_subscriptions_del_by_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **subscription_id** | **String** | Unique identifier of a subscription. |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_accounts_subscriptions_get_by_id

> <AdAccountGetSubscriptionResponse> ad_accounts_subscriptions_get_by_id(ad_account_id, subscription_id)

Get lead ads subscription

Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LeadAdsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
subscription_id = 'subscription_id_example' # String | Unique identifier of a subscription.

begin
  # Get lead ads subscription
  result = api_instance.ad_accounts_subscriptions_get_by_id(ad_account_id, subscription_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadAdsApi->ad_accounts_subscriptions_get_by_id: #{e}"
end
```

#### Using the ad_accounts_subscriptions_get_by_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccountGetSubscriptionResponse>, Integer, Hash)> ad_accounts_subscriptions_get_by_id_with_http_info(ad_account_id, subscription_id)

```ruby
begin
  # Get lead ads subscription
  data, status_code, headers = api_instance.ad_accounts_subscriptions_get_by_id_with_http_info(ad_account_id, subscription_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountGetSubscriptionResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadAdsApi->ad_accounts_subscriptions_get_by_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **subscription_id** | **String** | Unique identifier of a subscription. |  |

### Return type

[**AdAccountGetSubscriptionResponse**](AdAccountGetSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_accounts_subscriptions_get_list

> <AdAccountsSubscriptionsGetList200Response> ad_accounts_subscriptions_get_list(ad_account_id, opts)

Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LeadAdsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # Get lead ads subscriptions
  result = api_instance.ad_accounts_subscriptions_get_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadAdsApi->ad_accounts_subscriptions_get_list: #{e}"
end
```

#### Using the ad_accounts_subscriptions_get_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccountsSubscriptionsGetList200Response>, Integer, Hash)> ad_accounts_subscriptions_get_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get lead ads subscriptions
  data, status_code, headers = api_instance.ad_accounts_subscriptions_get_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountsSubscriptionsGetList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadAdsApi->ad_accounts_subscriptions_get_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**AdAccountsSubscriptionsGetList200Response**](AdAccountsSubscriptionsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ad_accounts_subscriptions_post

> <AdAccountCreateSubscriptionResponse> ad_accounts_subscriptions_post(ad_account_id, ad_account_create_subscription_request)

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records. - For data security, egress lead data is encrypted with AES-256-GCM.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LeadAdsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_account_create_subscription_request = PinterestSdkClient::AdAccountCreateSubscriptionRequest.new({webhook_url: 'https://webhook.example.com/xyz'}) # AdAccountCreateSubscriptionRequest | Subscription to create.

begin
  # Create lead ads subscription
  result = api_instance.ad_accounts_subscriptions_post(ad_account_id, ad_account_create_subscription_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadAdsApi->ad_accounts_subscriptions_post: #{e}"
end
```

#### Using the ad_accounts_subscriptions_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccountCreateSubscriptionResponse>, Integer, Hash)> ad_accounts_subscriptions_post_with_http_info(ad_account_id, ad_account_create_subscription_request)

```ruby
begin
  # Create lead ads subscription
  data, status_code, headers = api_instance.ad_accounts_subscriptions_post_with_http_info(ad_account_id, ad_account_create_subscription_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountCreateSubscriptionResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadAdsApi->ad_accounts_subscriptions_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_account_create_subscription_request** | [**AdAccountCreateSubscriptionRequest**](AdAccountCreateSubscriptionRequest.md) | Subscription to create. |  |

### Return type

[**AdAccountCreateSubscriptionResponse**](AdAccountCreateSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

