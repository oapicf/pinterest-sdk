# PinterestSdkClient::CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**catalogs_list**](CatalogsApi.md#catalogs_list) | **GET** /catalogs | List catalogs |
| [**catalogs_product_group_pins_list**](CatalogsApi.md#catalogs_product_group_pins_list) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group |
| [**catalogs_product_groups_create**](CatalogsApi.md#catalogs_product_groups_create) | **POST** /catalogs/product_groups | Create product group |
| [**catalogs_product_groups_delete**](CatalogsApi.md#catalogs_product_groups_delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
| [**catalogs_product_groups_get**](CatalogsApi.md#catalogs_product_groups_get) | **GET** /catalogs/product_groups/{product_group_id} | Get product group |
| [**catalogs_product_groups_list**](CatalogsApi.md#catalogs_product_groups_list) | **GET** /catalogs/product_groups | List product groups |
| [**catalogs_product_groups_product_counts_get**](CatalogsApi.md#catalogs_product_groups_product_counts_get) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group |
| [**catalogs_product_groups_update**](CatalogsApi.md#catalogs_product_groups_update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group |
| [**feed_processing_results_list**](CatalogsApi.md#feed_processing_results_list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed |
| [**feeds_create**](CatalogsApi.md#feeds_create) | **POST** /catalogs/feeds | Create feed |
| [**feeds_delete**](CatalogsApi.md#feeds_delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
| [**feeds_get**](CatalogsApi.md#feeds_get) | **GET** /catalogs/feeds/{feed_id} | Get feed |
| [**feeds_list**](CatalogsApi.md#feeds_list) | **GET** /catalogs/feeds | List feeds |
| [**feeds_update**](CatalogsApi.md#feeds_update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
| [**items_batch_get**](CatalogsApi.md#items_batch_get) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status |
| [**items_batch_post**](CatalogsApi.md#items_batch_post) | **POST** /catalogs/items/batch | Operate on item batch |
| [**items_get**](CatalogsApi.md#items_get) | **GET** /catalogs/items | Get catalogs items |
| [**items_issues_list**](CatalogsApi.md#items_issues_list) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result |
| [**products_by_product_group_filter_list**](CatalogsApi.md#products_by_product_group_filter_list) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products |


## catalogs_list

> <CatalogsList200Response> catalogs_list(opts)

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
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
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_group_pins_list

> <CatalogsProductGroupPinsList200Response> catalogs_product_group_pins_list(product_group_id, opts)

List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List products for a Product Group
  result = api_instance.catalogs_product_group_pins_list(product_group_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_group_pins_list: #{e}"
end
```

#### Using the catalogs_product_group_pins_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsProductGroupPinsList200Response>, Integer, Hash)> catalogs_product_group_pins_list_with_http_info(product_group_id, opts)

```ruby
begin
  # List products for a Product Group
  data, status_code, headers = api_instance.catalogs_product_group_pins_list_with_http_info(product_group_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsProductGroupPinsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_group_pins_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | Unique identifier of a product group |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_create

> <CatalogsProductGroupsCreate201Response> catalogs_product_groups_create(catalogs_product_groups_create_request, opts)

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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
catalogs_product_groups_create_request = PinterestSdkClient::CatalogsProductGroupCreateRequest.new({name: 'name_example', filters: PinterestSdkClient::CatalogsProductGroupFiltersRequest.new({any_of: [PinterestSdkClient::CatalogsProductGroupFilterKeys.new({min_price: PinterestSdkClient::CatalogsProductGroupPricingCriteria.new({values: 3.56}), max_price: PinterestSdkClient::CatalogsProductGroupPricingCriteria.new({values: 3.56}), currency: PinterestSdkClient::CatalogsProductGroupCurrencyCriteria.new({values: PinterestSdkClient::NonNullableCatalogsCurrency::AED}), item_id: PinterestSdkClient::CatalogsProductGroupMultipleStringCriteria.new({values: ['values_example']}), availability: PinterestSdkClient::CatalogsProductGroupMultipleStringCriteria.new({values: ['values_example']}), brand: , condition: , custom_label_0: , custom_label_1: , custom_label_2: , custom_label_3: , custom_label_4: , item_group_id: , gender: PinterestSdkClient::CatalogsProductGroupMultipleGenderCriteria.new({values: [PinterestSdkClient::Gender::FEMALE]}), product_type_4: PinterestSdkClient::CatalogsProductGroupMultipleStringListCriteria.new({values: [['values_example']]}), product_type_3: PinterestSdkClient::CatalogsProductGroupMultipleStringListCriteria.new({values: [['values_example']]}), product_type_2: , product_type_1: , product_type_0: , google_product_category_6: , google_product_category_5: , google_product_category_4: , google_product_category_3: , google_product_category_2: , google_product_category_1: , google_product_category_0: })], all_of: [PinterestSdkClient::CatalogsProductGroupFilterKeys.new({min_price: , max_price: , currency: PinterestSdkClient::CatalogsProductGroupCurrencyCriteria.new({values: PinterestSdkClient::NonNullableCatalogsCurrency::AED}), item_id: , availability: , brand: , condition: , custom_label_0: , custom_label_1: , custom_label_2: , custom_label_3: , custom_label_4: , item_group_id: , gender: PinterestSdkClient::CatalogsProductGroupMultipleGenderCriteria.new({values: [PinterestSdkClient::Gender::FEMALE]}), product_type_4: , product_type_3: , product_type_2: , product_type_1: , product_type_0: , google_product_category_6: , google_product_category_5: , google_product_category_4: , google_product_category_3: , google_product_category_2: , google_product_category_1: , google_product_category_0: })]}), feed_id: '2680059592705'}) # CatalogsProductGroupsCreateRequest | Request object used to created a catalogs product group.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Create product group
  result = api_instance.catalogs_product_groups_create(catalogs_product_groups_create_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_create: #{e}"
end
```

#### Using the catalogs_product_groups_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsProductGroupsCreate201Response>, Integer, Hash)> catalogs_product_groups_create_with_http_info(catalogs_product_groups_create_request, opts)

```ruby
begin
  # Create product group
  data, status_code, headers = api_instance.catalogs_product_groups_create_with_http_info(catalogs_product_groups_create_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsProductGroupsCreate201Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalogs_product_groups_create_request** | [**CatalogsProductGroupsCreateRequest**](CatalogsProductGroupsCreateRequest.md) | Request object used to created a catalogs product group. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogs_product_groups_delete

> catalogs_product_groups_delete(product_group_id, opts)

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Delete product group
  api_instance.catalogs_product_groups_delete(product_group_id, opts)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_delete: #{e}"
end
```

#### Using the catalogs_product_groups_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> catalogs_product_groups_delete_with_http_info(product_group_id, opts)

```ruby
begin
  # Delete product group
  data, status_code, headers = api_instance.catalogs_product_groups_delete_with_http_info(product_group_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | Unique identifier of a product group |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_get

> <CatalogsProductGroupsCreate201Response> catalogs_product_groups_get(product_group_id, opts)

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get product group
  result = api_instance.catalogs_product_groups_get(product_group_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_get: #{e}"
end
```

#### Using the catalogs_product_groups_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsProductGroupsCreate201Response>, Integer, Hash)> catalogs_product_groups_get_with_http_info(product_group_id, opts)

```ruby
begin
  # Get product group
  data, status_code, headers = api_instance.catalogs_product_groups_get_with_http_info(product_group_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsProductGroupsCreate201Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | Unique identifier of a product group |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_list

> <CatalogsProductGroupsList200Response> catalogs_product_groups_list(opts)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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
  feed_id: 'feed_id_example', # String | Filter entities for a given feed_id. If not given, all feeds are considered.
  catalog_id: 'catalog_id_example', # String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List product groups
  result = api_instance.catalogs_product_groups_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_list: #{e}"
end
```

#### Using the catalogs_product_groups_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsProductGroupsList200Response>, Integer, Hash)> catalogs_product_groups_list_with_http_info(opts)

```ruby
begin
  # List product groups
  data, status_code, headers = api_instance.catalogs_product_groups_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsProductGroupsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] |
| **catalog_id** | **String** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_product_counts_get

> <CatalogsProductGroupProductCounts> catalogs_product_groups_product_counts_get(product_group_id, opts)

Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get product counts for a Product Group
  result = api_instance.catalogs_product_groups_product_counts_get(product_group_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_product_counts_get: #{e}"
end
```

#### Using the catalogs_product_groups_product_counts_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsProductGroupProductCounts>, Integer, Hash)> catalogs_product_groups_product_counts_get_with_http_info(product_group_id, opts)

```ruby
begin
  # Get product counts for a Product Group
  data, status_code, headers = api_instance.catalogs_product_groups_product_counts_get_with_http_info(product_group_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsProductGroupProductCounts>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_product_counts_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | Unique identifier of a product group |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupProductCounts**](CatalogsProductGroupProductCounts.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_update

> <CatalogsProductGroupsCreate201Response> catalogs_product_groups_update(product_group_id, catalogs_product_groups_update_request, opts)

Update product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group
catalogs_product_groups_update_request = PinterestSdkClient::CatalogsProductGroupUpdateRequest.new # CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Update product group
  result = api_instance.catalogs_product_groups_update(product_group_id, catalogs_product_groups_update_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_update: #{e}"
end
```

#### Using the catalogs_product_groups_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsProductGroupsCreate201Response>, Integer, Hash)> catalogs_product_groups_update_with_http_info(product_group_id, catalogs_product_groups_update_request, opts)

```ruby
begin
  # Update product group
  data, status_code, headers = api_instance.catalogs_product_groups_update_with_http_info(product_group_id, catalogs_product_groups_update_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsProductGroupsCreate201Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | Unique identifier of a product group |  |
| **catalogs_product_groups_update_request** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md) | Request object used to Update a catalogs product group. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## feed_processing_results_list

> <FeedProcessingResultsList200Response> feed_processing_results_list(feed_id, opts)

List processing results for a given feed

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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
feed_id = 'feed_id_example' # String | Unique identifier of a feed
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List processing results for a given feed
  result = api_instance.feed_processing_results_list(feed_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feed_processing_results_list: #{e}"
end
```

#### Using the feed_processing_results_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FeedProcessingResultsList200Response>, Integer, Hash)> feed_processing_results_list_with_http_info(feed_id, opts)

```ruby
begin
  # List processing results for a given feed
  data, status_code, headers = api_instance.feed_processing_results_list_with_http_info(feed_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FeedProcessingResultsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feed_processing_results_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**FeedProcessingResultsList200Response**](FeedProcessingResultsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_create

> <CatalogsFeed> feeds_create(feeds_create_request, opts)

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

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
feeds_create_request = PinterestSdkClient::CatalogsFeedsCreateRequest.new({name: 'name_example', format: PinterestSdkClient::CatalogsFormat::TSV, location: 'location_example'}) # FeedsCreateRequest | Request object used to created a feed.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Create feed
  result = api_instance.feeds_create(feeds_create_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_create: #{e}"
end
```

#### Using the feeds_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsFeed>, Integer, Hash)> feeds_create_with_http_info(feeds_create_request, opts)

```ruby
begin
  # Create feed
  data, status_code, headers = api_instance.feeds_create_with_http_info(feeds_create_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsFeed>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feeds_create_request** | [**FeedsCreateRequest**](FeedsCreateRequest.md) | Request object used to created a feed. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## feeds_delete

> feeds_delete(feed_id, opts)

Delete feed

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

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
feed_id = 'feed_id_example' # String | Unique identifier of a feed
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Delete feed
  api_instance.feeds_delete(feed_id, opts)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_delete: #{e}"
end
```

#### Using the feeds_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> feeds_delete_with_http_info(feed_id, opts)

```ruby
begin
  # Delete feed
  data, status_code, headers = api_instance.feeds_delete_with_http_info(feed_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_get

> <CatalogsFeed> feeds_get(feed_id, opts)

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

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
feed_id = 'feed_id_example' # String | Unique identifier of a feed
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get feed
  result = api_instance.feeds_get(feed_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_get: #{e}"
end
```

#### Using the feeds_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsFeed>, Integer, Hash)> feeds_get_with_http_info(feed_id, opts)

```ruby
begin
  # Get feed
  data, status_code, headers = api_instance.feeds_get_with_http_info(feed_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsFeed>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_list

> <FeedsList200Response> feeds_list(opts)

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

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
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  catalog_id: 'catalog_id_example', # String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List feeds
  result = api_instance.feeds_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_list: #{e}"
end
```

#### Using the feeds_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FeedsList200Response>, Integer, Hash)> feeds_list_with_http_info(opts)

```ruby
begin
  # List feeds
  data, status_code, headers = api_instance.feeds_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FeedsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **catalog_id** | **String** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**FeedsList200Response**](FeedsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_update

> <CatalogsFeed> feeds_update(feed_id, feeds_update_request, opts)

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

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
feed_id = 'feed_id_example' # String | Unique identifier of a feed
feeds_update_request = PinterestSdkClient::CatalogsFeedsUpdateRequest.new # FeedsUpdateRequest | Request object used to update a feed.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Update feed
  result = api_instance.feeds_update(feed_id, feeds_update_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_update: #{e}"
end
```

#### Using the feeds_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsFeed>, Integer, Hash)> feeds_update_with_http_info(feed_id, feeds_update_request, opts)

```ruby
begin
  # Update feed
  data, status_code, headers = api_instance.feeds_update_with_http_info(feed_id, feeds_update_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsFeed>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **feeds_update_request** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md) | Request object used to update a feed. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## items_batch_get

> <CatalogsItemsBatch> items_batch_get(batch_id, opts)

Get catalogs item batch status

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

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
batch_id = '595953100599279259-66753b9bb65c46c49bd8503b27fecf9e' # String | Id of a catalogs items batch to fetch
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get catalogs item batch status
  result = api_instance.items_batch_get(batch_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_batch_get: #{e}"
end
```

#### Using the items_batch_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsItemsBatch>, Integer, Hash)> items_batch_get_with_http_info(batch_id, opts)

```ruby
begin
  # Get catalogs item batch status
  data, status_code, headers = api_instance.items_batch_get_with_http_info(batch_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsItemsBatch>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_batch_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **batch_id** | **String** | Id of a catalogs items batch to fetch |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## items_batch_post

> <CatalogsItemsBatch> items_batch_post(items_batch_post_request, opts)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

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
items_batch_post_request = PinterestSdkClient::CatalogsItemsCreateBatchRequest.new({country: PinterestSdkClient::Country::AD, language: PinterestSdkClient::Language::AM, operation: PinterestSdkClient::BatchOperation::UPDATE, items: [PinterestSdkClient::ItemCreateBatchRecord.new]}) # ItemsBatchPostRequest | Request object used to create catalogs items in a batch
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Operate on item batch
  result = api_instance.items_batch_post(items_batch_post_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_batch_post: #{e}"
end
```

#### Using the items_batch_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsItemsBatch>, Integer, Hash)> items_batch_post_with_http_info(items_batch_post_request, opts)

```ruby
begin
  # Operate on item batch
  data, status_code, headers = api_instance.items_batch_post_with_http_info(items_batch_post_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsItemsBatch>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_batch_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items_batch_post_request** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md) | Request object used to create catalogs items in a batch |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## items_get

> <CatalogsItems> items_get(country, language, opts)

Get catalogs items

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

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
country = 'US' # String | Country for the Catalogs Items
language = 'EN' # String | Language for the Catalogs Items
opts = {
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  item_ids: ['inner_example'], # Array<String> | This parameter is deprecated. Use filters instead.
  filters: PinterestSdkClient::CatalogsHotelItemsFilter.new({catalog_type: 'HOTEL', hotel_ids: ['hotel_ids_example']}) # CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter.
}

begin
  # Get catalogs items
  result = api_instance.items_get(country, language, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_get: #{e}"
end
```

#### Using the items_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsItems>, Integer, Hash)> items_get_with_http_info(country, language, opts)

```ruby
begin
  # Get catalogs items
  data, status_code, headers = api_instance.items_get_with_http_info(country, language, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsItems>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | **String** | Country for the Catalogs Items |  |
| **language** | **String** | Language for the Catalogs Items |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **item_ids** | [**Array&lt;String&gt;**](String.md) | This parameter is deprecated. Use filters instead. | [optional] |
| **filters** | [**CatalogsItemsFilters**](.md) | Identifies items to be retrieved. This is a required parameter. | [optional] |

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## items_issues_list

> <ItemsIssuesList200Response> items_issues_list(processing_result_id, opts)

List item issues for a given processing result

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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
processing_result_id = '5224831246441439241' # String | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  item_numbers: [37], # Array<Integer> | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
  item_validation_issue: PinterestSdkClient::CatalogsItemValidationIssue::AD_LINK_FORMAT_WARNING, # CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List item issues for a given processing result
  result = api_instance.items_issues_list(processing_result_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_issues_list: #{e}"
end
```

#### Using the items_issues_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ItemsIssuesList200Response>, Integer, Hash)> items_issues_list_with_http_info(processing_result_id, opts)

```ruby
begin
  # List item issues for a given processing result
  data, status_code, headers = api_instance.items_issues_list_with_http_info(processing_result_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ItemsIssuesList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_issues_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **processing_result_id** | **String** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **item_numbers** | [**Array&lt;Integer&gt;**](Integer.md) | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] |
| **item_validation_issue** | [**CatalogsItemValidationIssue**](.md) | Filter item validation issues that have a given type of item validation issue. | [optional] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## products_by_product_group_filter_list

> <CatalogsProductGroupPinsList200Response> products_by_product_group_filter_list(catalogs_list_products_by_filter_request, opts)

List filtered products

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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
catalogs_list_products_by_filter_request = PinterestSdkClient::CatalogsListProductsByFilterRequestOneOf.new({feed_id: '2680059592705', filters: PinterestSdkClient::CatalogsProductGroupFilters.new({any_of: [PinterestSdkClient::CatalogsProductGroupFilterKeys.new({min_price: PinterestSdkClient::CatalogsProductGroupPricingCriteria.new({values: 3.56}), max_price: PinterestSdkClient::CatalogsProductGroupPricingCriteria.new({values: 3.56}), currency: PinterestSdkClient::CatalogsProductGroupCurrencyCriteria.new({values: PinterestSdkClient::NonNullableCatalogsCurrency::AED}), item_id: PinterestSdkClient::CatalogsProductGroupMultipleStringCriteria.new({values: ['values_example']}), availability: PinterestSdkClient::CatalogsProductGroupMultipleStringCriteria.new({values: ['values_example']}), brand: , condition: , custom_label_0: , custom_label_1: , custom_label_2: , custom_label_3: , custom_label_4: , item_group_id: , gender: PinterestSdkClient::CatalogsProductGroupMultipleGenderCriteria.new({values: [PinterestSdkClient::Gender::FEMALE]}), product_type_4: PinterestSdkClient::CatalogsProductGroupMultipleStringListCriteria.new({values: [['values_example']]}), product_type_3: PinterestSdkClient::CatalogsProductGroupMultipleStringListCriteria.new({values: [['values_example']]}), product_type_2: , product_type_1: , product_type_0: , google_product_category_6: , google_product_category_5: , google_product_category_4: , google_product_category_3: , google_product_category_2: , google_product_category_1: , google_product_category_0: })], all_of: [PinterestSdkClient::CatalogsProductGroupFilterKeys.new({min_price: , max_price: , currency: PinterestSdkClient::CatalogsProductGroupCurrencyCriteria.new({values: PinterestSdkClient::NonNullableCatalogsCurrency::AED}), item_id: , availability: , brand: , condition: , custom_label_0: , custom_label_1: , custom_label_2: , custom_label_3: , custom_label_4: , item_group_id: , gender: PinterestSdkClient::CatalogsProductGroupMultipleGenderCriteria.new({values: [PinterestSdkClient::Gender::FEMALE]}), product_type_4: , product_type_3: , product_type_2: , product_type_1: , product_type_0: , google_product_category_6: , google_product_category_5: , google_product_category_4: , google_product_category_3: , google_product_category_2: , google_product_category_1: , google_product_category_0: })]})}) # CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List filtered products
  result = api_instance.products_by_product_group_filter_list(catalogs_list_products_by_filter_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->products_by_product_group_filter_list: #{e}"
end
```

#### Using the products_by_product_group_filter_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsProductGroupPinsList200Response>, Integer, Hash)> products_by_product_group_filter_list_with_http_info(catalogs_list_products_by_filter_request, opts)

```ruby
begin
  # List filtered products
  data, status_code, headers = api_instance.products_by_product_group_filter_list_with_http_info(catalogs_list_products_by_filter_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsProductGroupPinsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->products_by_product_group_filter_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalogs_list_products_by_filter_request** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md) | Object holding a group of filters for a catalog product group |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

