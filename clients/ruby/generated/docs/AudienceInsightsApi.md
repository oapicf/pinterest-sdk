# PinterestSdkClient::AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**audience_insights_get**](AudienceInsightsApi.md#audience_insights_get) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights |
| [**audience_insights_scope_and_type_get**](AudienceInsightsApi.md#audience_insights_scope_and_type_get) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type |


## audience_insights_get

> <AudienceInsights> audience_insights_get(ad_account_id, audience_insight_type)

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).

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

api_instance = PinterestSdkClient::AudienceInsightsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
audience_insight_type = PinterestSdkClient::AudienceInsightType::YOUR_TOTAL_AUDIENCE # AudienceInsightType | Type of audience insights.

begin
  # Get audience insights
  result = api_instance.audience_insights_get(ad_account_id, audience_insight_type)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceInsightsApi->audience_insights_get: #{e}"
end
```

#### Using the audience_insights_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AudienceInsights>, Integer, Hash)> audience_insights_get_with_http_info(ad_account_id, audience_insight_type)

```ruby
begin
  # Get audience insights
  data, status_code, headers = api_instance.audience_insights_get_with_http_info(ad_account_id, audience_insight_type)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AudienceInsights>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceInsightsApi->audience_insights_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **audience_insight_type** | [**AudienceInsightType**](.md) | Type of audience insights. |  |

### Return type

[**AudienceInsights**](AudienceInsights.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audience_insights_scope_and_type_get

> <AudienceInsightsScopeAndTypeGet200Response> audience_insights_scope_and_type_get(ad_account_id)

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

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

api_instance = PinterestSdkClient::AudienceInsightsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get audience insights scope and type
  result = api_instance.audience_insights_scope_and_type_get(ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceInsightsApi->audience_insights_scope_and_type_get: #{e}"
end
```

#### Using the audience_insights_scope_and_type_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AudienceInsightsScopeAndTypeGet200Response>, Integer, Hash)> audience_insights_scope_and_type_get_with_http_info(ad_account_id)

```ruby
begin
  # Get audience insights scope and type
  data, status_code, headers = api_instance.audience_insights_scope_and_type_get_with_http_info(ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AudienceInsightsScopeAndTypeGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceInsightsApi->audience_insights_scope_and_type_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**AudienceInsightsScopeAndTypeGet200Response**](AudienceInsightsScopeAndTypeGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

