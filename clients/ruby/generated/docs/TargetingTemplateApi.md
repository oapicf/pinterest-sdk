# PinterestSdkClient::TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**targeting_template_create**](TargetingTemplateApi.md#targeting_template_create) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
| [**targeting_template_list**](TargetingTemplateApi.md#targeting_template_list) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
| [**targeting_template_update**](TargetingTemplateApi.md#targeting_template_update) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |


## targeting_template_create

> <TargetingTemplate> targeting_template_create(ad_account_id, targeting_template_create)

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

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
targeting_template_create = PinterestSdkClient::TargetingTemplateCreate.new({name: 'name_example', targeting_attributes: PinterestSdkClient::TargetingSpecOptimal.new}) # TargetingTemplateCreate | 

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

> <Array(<TargetingTemplate>, Integer, Hash)> targeting_template_create_with_http_info(ad_account_id, targeting_template_create)

```ruby
begin
  # Create targeting templates
  data, status_code, headers = api_instance.targeting_template_create_with_http_info(ad_account_id, targeting_template_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TargetingTemplate>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TargetingTemplateApi->targeting_template_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **targeting_template_create** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md) |  |  |

### Return type

[**TargetingTemplate**](TargetingTemplate.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## targeting_template_list

> <TargetingTemplateList200Response> targeting_template_list(ad_account_id, opts)

List targeting templates

Get a list of the targeting templates in the specified `ad_account_id`

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

api_instance = PinterestSdkClient::TargetingTemplateApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING, # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  include_sizing: true, # Boolean | Include audience sizing in result or not
  search_query: 'search_query_example' # String | Search query. Can contain pin description keywords or comma-separated pin IDs.
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
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **include_sizing** | **Boolean** | Include audience sizing in result or not | [optional][default to false] |
| **search_query** | **String** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] |

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## targeting_template_update

> targeting_template_update(ad_account_id, targeting_template_update_request_read_or_update)

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

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
targeting_template_update_request_read_or_update = PinterestSdkClient::TargetingTemplateUpdateRequestReadOrUpdate.new({id: '643', operation_type: PinterestSdkClient::AudienceUpdateOperationType::UPDATE}) # TargetingTemplateUpdateRequestReadOrUpdate | 

begin
  # Update targeting templates
  api_instance.targeting_template_update(ad_account_id, targeting_template_update_request_read_or_update)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TargetingTemplateApi->targeting_template_update: #{e}"
end
```

#### Using the targeting_template_update_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> targeting_template_update_with_http_info(ad_account_id, targeting_template_update_request_read_or_update)

```ruby
begin
  # Update targeting templates
  data, status_code, headers = api_instance.targeting_template_update_with_http_info(ad_account_id, targeting_template_update_request_read_or_update)
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
| **targeting_template_update_request_read_or_update** | [**TargetingTemplateUpdateRequestReadOrUpdate**](TargetingTemplateUpdateRequestReadOrUpdate.md) |  |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

