# PinterestSdkClient::AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**audience_insights_get**](AudienceInsightsApi.md#audience_insights_get) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights |
| [**audience_insights_scope_and_type_get**](AudienceInsightsApi.md#audience_insights_scope_and_type_get) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type |


## audience_insights_get

> <AudienceInsightsResponse> audience_insights_get(ad_account_id, audience_insight_type)

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
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

> <Array(<AudienceInsightsResponse>, Integer, Hash)> audience_insights_get_with_http_info(ad_account_id, audience_insight_type)

```ruby
begin
  # Get audience insights
  data, status_code, headers = api_instance.audience_insights_get_with_http_info(ad_account_id, audience_insight_type)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AudienceInsightsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceInsightsApi->audience_insights_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **audience_insight_type** | [**AudienceInsightType**](.md) | Type of audience insights. | [default to &#39;YOUR_TOTAL_AUDIENCE&#39;] |

### Return type

[**AudienceInsightsResponse**](AudienceInsightsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audience_insights_scope_and_type_get

> <AudienceDefinitionResponse> audience_insights_scope_and_type_get(ad_account_id)

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

> <Array(<AudienceDefinitionResponse>, Integer, Hash)> audience_insights_scope_and_type_get_with_http_info(ad_account_id)

```ruby
begin
  # Get audience insights scope and type
  data, status_code, headers = api_instance.audience_insights_scope_and_type_get_with_http_info(ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AudienceDefinitionResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceInsightsApi->audience_insights_scope_and_type_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**AudienceDefinitionResponse**](AudienceDefinitionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

