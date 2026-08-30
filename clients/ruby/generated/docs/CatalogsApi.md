# PinterestSdkClient::CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**catalogs_available_filter_values**](CatalogsApi.md#catalogs_available_filter_values) | **GET** /catalogs/available_filter_values | List available filter values |
| [**catalogs_create**](CatalogsApi.md#catalogs_create) | **POST** /catalogs | Create catalog |
| [**catalogs_list**](CatalogsApi.md#catalogs_list) | **GET** /catalogs | List catalogs |


## catalogs_available_filter_values

> <CatalogsAvailableFilterValues> catalogs_available_filter_values(catalog_id, opts)

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
catalog_id = 'catalog_id_example' # String | Filter entities for a given catalog_id.
opts = {
  feed_id: 'feed_id_example', # String | Filter entities for a given feed_id. If not given, all feeds are considered.
  country: PinterestSdkClient::Country::AD, # Country | Country for the Catalogs Items
  language: PinterestSdkClient::CatalogsLocale::AF_ZA, # CatalogsLocale | Language for the Catalogs Items
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List available filter values
  result = api_instance.catalogs_available_filter_values(catalog_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_available_filter_values: #{e}"
end
```

#### Using the catalogs_available_filter_values_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsAvailableFilterValues>, Integer, Hash)> catalogs_available_filter_values_with_http_info(catalog_id, opts)

```ruby
begin
  # List available filter values
  data, status_code, headers = api_instance.catalogs_available_filter_values_with_http_info(catalog_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsAvailableFilterValues>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_available_filter_values_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Filter entities for a given catalog_id. |  |
| **feed_id** | **String** | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] |
| **country** | [**Country**](.md) | Country for the Catalogs Items | [optional] |
| **language** | [**CatalogsLocale**](.md) | Language for the Catalogs Items | [optional] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsAvailableFilterValues**](CatalogsAvailableFilterValues.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_create

> <Catalog> catalogs_create(catalog_create, opts)

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
catalog_create = PinterestSdkClient::CatalogCreate.new({catalog_type: PinterestSdkClient::CatalogsType::RETAIL, name: 'name_example'}) # CatalogCreate | 
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Create catalog
  result = api_instance.catalogs_create(catalog_create, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_create: #{e}"
end
```

#### Using the catalogs_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Catalog>, Integer, Hash)> catalogs_create_with_http_info(catalog_create, opts)

```ruby
begin
  # Create catalog
  data, status_code, headers = api_instance.catalogs_create_with_http_info(catalog_create, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Catalog>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_create** | [**CatalogCreate**](CatalogCreate.md) |  |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Catalog**](Catalog.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogs_list

> <CatalogsList200Response> catalogs_list(opts)

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
opts = {
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
}

begin
  # List catalogs
  result = api_instance.catalogs_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_list: #{e}"
end
```

#### Using the catalogs_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsList200Response>, Integer, Hash)> catalogs_list_with_http_info(opts)

```ruby
begin
  # List catalogs
  data, status_code, headers = api_instance.catalogs_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

