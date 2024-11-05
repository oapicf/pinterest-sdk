# PinterestSdkClient::TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**targeting_template_create**](TargetingTemplateApi.md#targeting_template_create) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
| [**targeting_template_list**](TargetingTemplateApi.md#targeting_template_list) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
| [**targeting_template_update**](TargetingTemplateApi.md#targeting_template_update) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |


## targeting_template_create

> <TargetingTemplateGetResponseData> targeting_template_create(ad_account_id, targeting_template_create)

Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::TargetingTemplateApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
targeting_template_create = PinterestSdkClient::TargetingTemplateCreate.new({name: 'Gaming', targeting_attributes: PinterestSdkClient::TargetingSpec.new}) # TargetingTemplateCreate | targeting template creation entity

begin
  # Create targeting templates
  result = api_instance.targeting_template_create(ad_account_id, targeting_template_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TargetingTemplateApi->targeting_template_create: #{e}"
end
```

#### Using the targeting_template_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TargetingTemplateGetResponseData>, Integer, Hash)> targeting_template_create_with_http_info(ad_account_id, targeting_template_create)

```ruby
begin
  # Create targeting templates
  data, status_code, headers = api_instance.targeting_template_create_with_http_info(ad_account_id, targeting_template_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TargetingTemplateGetResponseData>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TargetingTemplateApi->targeting_template_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **targeting_template_create** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md) | targeting template creation entity |  |

### Return type

[**TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## targeting_template_list

> <TargetingTemplateList200Response> targeting_template_list(ad_account_id, opts)

List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::TargetingTemplateApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  include_sizing: true, # Boolean | Include audience sizing in result or not
  search_query: 'gaming', # String | Search keyword for targeting templates
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # List targeting templates
  result = api_instance.targeting_template_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TargetingTemplateApi->targeting_template_list: #{e}"
end
```

#### Using the targeting_template_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TargetingTemplateList200Response>, Integer, Hash)> targeting_template_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List targeting templates
  data, status_code, headers = api_instance.targeting_template_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TargetingTemplateList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TargetingTemplateApi->targeting_template_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **include_sizing** | **Boolean** | Include audience sizing in result or not | [optional][default to false] |
| **search_query** | **String** | Search keyword for targeting templates | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## targeting_template_update

> targeting_template_update(ad_account_id, targeting_template_update_request)

Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::TargetingTemplateApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
targeting_template_update_request = PinterestSdkClient::TargetingTemplateUpdateRequest.new({operation_type: 'REMOVE', id: '643'}) # TargetingTemplateUpdateRequest | Operation type and targeting template ID

begin
  # Update targeting templates
  api_instance.targeting_template_update(ad_account_id, targeting_template_update_request)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TargetingTemplateApi->targeting_template_update: #{e}"
end
```

#### Using the targeting_template_update_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> targeting_template_update_with_http_info(ad_account_id, targeting_template_update_request)

```ruby
begin
  # Update targeting templates
  data, status_code, headers = api_instance.targeting_template_update_with_http_info(ad_account_id, targeting_template_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TargetingTemplateApi->targeting_template_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **targeting_template_update_request** | [**TargetingTemplateUpdateRequest**](TargetingTemplateUpdateRequest.md) | Operation type and targeting template ID |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

