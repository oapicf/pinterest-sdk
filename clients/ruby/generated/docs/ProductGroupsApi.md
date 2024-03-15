# PinterestSdkClient::ProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ad_accounts_catalogs_product_groups_list**](ProductGroupsApi.md#ad_accounts_catalogs_product_groups_list) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups |


## ad_accounts_catalogs_product_groups_list

> <AdAccountsCatalogsProductGroupsList200Response> ad_accounts_catalogs_product_groups_list(ad_account_id, opts)

Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ProductGroupsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  feed_profile_id: 'feed_profile_id_example' # String | The feed profile id whose catalog product groups we want to return.
}

begin
  # Get catalog product groups
  result = api_instance.ad_accounts_catalogs_product_groups_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupsApi->ad_accounts_catalogs_product_groups_list: #{e}"
end
```

#### Using the ad_accounts_catalogs_product_groups_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccountsCatalogsProductGroupsList200Response>, Integer, Hash)> ad_accounts_catalogs_product_groups_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get catalog product groups
  data, status_code, headers = api_instance.ad_accounts_catalogs_product_groups_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountsCatalogsProductGroupsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductGroupsApi->ad_accounts_catalogs_product_groups_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **feed_profile_id** | **String** | The feed profile id whose catalog product groups we want to return. | [optional] |

### Return type

[**AdAccountsCatalogsProductGroupsList200Response**](AdAccountsCatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

