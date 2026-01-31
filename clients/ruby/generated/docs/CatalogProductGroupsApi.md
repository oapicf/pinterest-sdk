# PinterestSdkClient::CatalogProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**catalogs_product_group_pins_list**](CatalogProductGroupsApi.md#catalogs_product_group_pins_list) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group |
| [**catalogs_product_groups_create**](CatalogProductGroupsApi.md#catalogs_product_groups_create) | **POST** /catalogs/product_groups | Create product group |
| [**catalogs_product_groups_create_many**](CatalogProductGroupsApi.md#catalogs_product_groups_create_many) | **POST** /catalogs/product_groups/multiple | Create product groups |
| [**catalogs_product_groups_delete**](CatalogProductGroupsApi.md#catalogs_product_groups_delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
| [**catalogs_product_groups_delete_many**](CatalogProductGroupsApi.md#catalogs_product_groups_delete_many) | **DELETE** /catalogs/product_groups/multiple | Delete product groups |
| [**catalogs_product_groups_get**](CatalogProductGroupsApi.md#catalogs_product_groups_get) | **GET** /catalogs/product_groups/{product_group_id} | Get product group |
| [**catalogs_product_groups_list**](CatalogProductGroupsApi.md#catalogs_product_groups_list) | **GET** /catalogs/product_groups | List product groups |
| [**catalogs_product_groups_product_counts_get**](CatalogProductGroupsApi.md#catalogs_product_groups_product_counts_get) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts |
| [**catalogs_product_groups_update**](CatalogProductGroupsApi.md#catalogs_product_groups_update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group |
| [**products_by_product_group_filter_list**](CatalogProductGroupsApi.md#products_by_product_group_filter_list) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter |


## catalogs_product_group_pins_list

> <CatalogsProductGroupPinsList200Response> catalogs_product_group_pins_list(product_group_id, opts)

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogProductGroupsApi.new
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  pin_metrics: true # Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
}

begin
  # List products by product group
  result = api_instance.catalogs_product_group_pins_list(product_group_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_group_pins_list: #{e}"
end
```

#### Using the catalogs_product_group_pins_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsProductGroupPinsList200Response>, Integer, Hash)> catalogs_product_group_pins_list_with_http_info(product_group_id, opts)

```ruby
begin
  # List products by product group
  data, status_code, headers = api_instance.catalogs_product_group_pins_list_with_http_info(product_group_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsProductGroupPinsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_group_pins_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | Unique identifier of a product group |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **pin_metrics** | **Boolean** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional][default to false] |

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_create

> <CatalogsVerticalProductGroup> catalogs_product_groups_create(multiple_product_groups_inner, opts)

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogProductGroupsApi.new
multiple_product_groups_inner = PinterestSdkClient::CatalogsProductGroupCreateRequest.new({feed_id: '2680059592705', filters: PinterestSdkClient::CatalogsProductGroupFiltersRequest.new({any_of: [PinterestSdkClient::CatalogsProductGroupFilterKeys.new({min_price: PinterestSdkClient::CatalogsProductGroupPricingCriteria.new({values: 3.56}), max_price: PinterestSdkClient::CatalogsProductGroupPricingCriteria.new({values: 3.56}), currency: PinterestSdkClient::CatalogsProductGroupCurrencyCriteria.new({values: PinterestSdkClient::NonNullableCatalogsCurrency::AED}), item_id: PinterestSdkClient::CatalogsProductGroupMultipleStringCriteria.new({values: ['values_example']}), availability: PinterestSdkClient::CatalogsProductGroupMultipleStringCriteria.new({values: ['values_example']}), brand: , condition: , custom_label_0: PinterestSdkClient::CatalogsProductGroupFilterOperatorTypeCriteria.new({values: ['values_example']}), custom_label_1: PinterestSdkClient::CatalogsProductGroupFilterOperatorTypeCriteria.new({values: ['values_example']}), custom_label_2: , custom_label_3: , custom_label_4: , item_group_id: , gender: PinterestSdkClient::CatalogsProductGroupMultipleGenderCriteria.new({values: [PinterestSdkClient::Gender::FEMALE]}), media_type: PinterestSdkClient::CatalogsProductGroupMultipleMediaTypesCriteria.new({values: [PinterestSdkClient::MediaType::IMAGE]}), product_type_4: PinterestSdkClient::CatalogsProductGroupMultipleStringListCriteria.new({values: [['values_example']]}), product_type_3: PinterestSdkClient::CatalogsProductGroupMultipleStringListCriteria.new({values: [['values_example']]}), product_type_2: , product_type_1: , product_type_0: , google_product_category_6: , google_product_category_5: , google_product_category_4: , google_product_category_3: , google_product_category_2: , google_product_category_1: , google_product_category_0: , product_group: , custom_number_0: PinterestSdkClient::CatalogsProductGroupUint32Criteria.new({operator: 'GREATER_THAN', value: 37}), custom_number_1: PinterestSdkClient::CatalogsProductGroupUint32Criteria.new({operator: 'GREATER_THAN', value: 37}), custom_number_2: , custom_number_3: , custom_number_4: , title_keywords: })], all_of: [PinterestSdkClient::CatalogsProductGroupFilterKeys.new({min_price: , max_price: , currency: PinterestSdkClient::CatalogsProductGroupCurrencyCriteria.new({values: PinterestSdkClient::NonNullableCatalogsCurrency::AED}), item_id: , availability: , brand: , condition: , custom_label_0: , custom_label_1: , custom_label_2: , custom_label_3: , custom_label_4: , item_group_id: , gender: PinterestSdkClient::CatalogsProductGroupMultipleGenderCriteria.new({values: [PinterestSdkClient::Gender::FEMALE]}), media_type: PinterestSdkClient::CatalogsProductGroupMultipleMediaTypesCriteria.new({values: [PinterestSdkClient::MediaType::IMAGE]}), product_type_4: , product_type_3: , product_type_2: , product_type_1: , product_type_0: , google_product_category_6: , google_product_category_5: , google_product_category_4: , google_product_category_3: , google_product_category_2: , google_product_category_1: , google_product_category_0: , product_group: , custom_number_0: , custom_number_1: , custom_number_2: , custom_number_3: , custom_number_4: , title_keywords: })]}), name: 'name_example'}) # MultipleProductGroupsInner | Request object used to create a single catalogs product groups.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Create product group
  result = api_instance.catalogs_product_groups_create(multiple_product_groups_inner, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_create: #{e}"
end
```

#### Using the catalogs_product_groups_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsVerticalProductGroup>, Integer, Hash)> catalogs_product_groups_create_with_http_info(multiple_product_groups_inner, opts)

```ruby
begin
  # Create product group
  data, status_code, headers = api_instance.catalogs_product_groups_create_with_http_info(multiple_product_groups_inner, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsVerticalProductGroup>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **multiple_product_groups_inner** | [**MultipleProductGroupsInner**](MultipleProductGroupsInner.md) | Request object used to create a single catalogs product groups. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogs_product_groups_create_many

> Array&lt;String&gt; catalogs_product_groups_create_many(multiple_product_groups_inner, opts)

Create product groups

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogProductGroupsApi.new
multiple_product_groups_inner = [PinterestSdkClient::CatalogsProductGroupCreateRequest.new({feed_id: '2680059592705', filters: PinterestSdkClient::CatalogsProductGroupFiltersRequest.new({any_of: [PinterestSdkClient::CatalogsProductGroupFilterKeys.new({min_price: PinterestSdkClient::CatalogsProductGroupPricingCriteria.new({values: 3.56}), max_price: PinterestSdkClient::CatalogsProductGroupPricingCriteria.new({values: 3.56}), currency: PinterestSdkClient::CatalogsProductGroupCurrencyCriteria.new({values: PinterestSdkClient::NonNullableCatalogsCurrency::AED}), item_id: PinterestSdkClient::CatalogsProductGroupMultipleStringCriteria.new({values: ['values_example']}), availability: PinterestSdkClient::CatalogsProductGroupMultipleStringCriteria.new({values: ['values_example']}), brand: , condition: , custom_label_0: PinterestSdkClient::CatalogsProductGroupFilterOperatorTypeCriteria.new({values: ['values_example']}), custom_label_1: PinterestSdkClient::CatalogsProductGroupFilterOperatorTypeCriteria.new({values: ['values_example']}), custom_label_2: , custom_label_3: , custom_label_4: , item_group_id: , gender: PinterestSdkClient::CatalogsProductGroupMultipleGenderCriteria.new({values: [PinterestSdkClient::Gender::FEMALE]}), media_type: PinterestSdkClient::CatalogsProductGroupMultipleMediaTypesCriteria.new({values: [PinterestSdkClient::MediaType::IMAGE]}), product_type_4: PinterestSdkClient::CatalogsProductGroupMultipleStringListCriteria.new({values: [['values_example']]}), product_type_3: PinterestSdkClient::CatalogsProductGroupMultipleStringListCriteria.new({values: [['values_example']]}), product_type_2: , product_type_1: , product_type_0: , google_product_category_6: , google_product_category_5: , google_product_category_4: , google_product_category_3: , google_product_category_2: , google_product_category_1: , google_product_category_0: , product_group: , custom_number_0: PinterestSdkClient::CatalogsProductGroupUint32Criteria.new({operator: 'GREATER_THAN', value: 37}), custom_number_1: PinterestSdkClient::CatalogsProductGroupUint32Criteria.new({operator: 'GREATER_THAN', value: 37}), custom_number_2: , custom_number_3: , custom_number_4: , title_keywords: })], all_of: [PinterestSdkClient::CatalogsProductGroupFilterKeys.new({min_price: , max_price: , currency: PinterestSdkClient::CatalogsProductGroupCurrencyCriteria.new({values: PinterestSdkClient::NonNullableCatalogsCurrency::AED}), item_id: , availability: , brand: , condition: , custom_label_0: , custom_label_1: , custom_label_2: , custom_label_3: , custom_label_4: , item_group_id: , gender: PinterestSdkClient::CatalogsProductGroupMultipleGenderCriteria.new({values: [PinterestSdkClient::Gender::FEMALE]}), media_type: PinterestSdkClient::CatalogsProductGroupMultipleMediaTypesCriteria.new({values: [PinterestSdkClient::MediaType::IMAGE]}), product_type_4: , product_type_3: , product_type_2: , product_type_1: , product_type_0: , google_product_category_6: , google_product_category_5: , google_product_category_4: , google_product_category_3: , google_product_category_2: , google_product_category_1: , google_product_category_0: , product_group: , custom_number_0: , custom_number_1: , custom_number_2: , custom_number_3: , custom_number_4: , title_keywords: })]}), name: 'name_example'})] # Array<MultipleProductGroupsInner> | Request object used to create one or more catalogs product groups.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Create product groups
  result = api_instance.catalogs_product_groups_create_many(multiple_product_groups_inner, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_create_many: #{e}"
end
```

#### Using the catalogs_product_groups_create_many_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;String&gt;, Integer, Hash)> catalogs_product_groups_create_many_with_http_info(multiple_product_groups_inner, opts)

```ruby
begin
  # Create product groups
  data, status_code, headers = api_instance.catalogs_product_groups_create_many_with_http_info(multiple_product_groups_inner, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;String&gt;
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_create_many_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **multiple_product_groups_inner** | [**Array&lt;MultipleProductGroupsInner&gt;**](MultipleProductGroupsInner.md) | Request object used to create one or more catalogs product groups. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

**Array&lt;String&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogs_product_groups_delete

> catalogs_product_groups_delete(product_group_id, opts)

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogProductGroupsApi.new
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Delete product group
  api_instance.catalogs_product_groups_delete(product_group_id, opts)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_delete: #{e}"
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
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_delete_with_http_info: #{e}"
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


## catalogs_product_groups_delete_many

> catalogs_product_groups_delete_many(id, opts)

Delete product groups

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogProductGroupsApi.new
id = [37] # Array<Integer> | Comma-separated list of product group ids
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Delete product groups
  api_instance.catalogs_product_groups_delete_many(id, opts)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_delete_many: #{e}"
end
```

#### Using the catalogs_product_groups_delete_many_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> catalogs_product_groups_delete_many_with_http_info(id, opts)

```ruby
begin
  # Delete product groups
  data, status_code, headers = api_instance.catalogs_product_groups_delete_many_with_http_info(id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_delete_many_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | [**Array&lt;Integer&gt;**](Integer.md) | Comma-separated list of product group ids |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_get

> <CatalogsVerticalProductGroup> catalogs_product_groups_get(product_group_id, opts)

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogProductGroupsApi.new
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get product group
  result = api_instance.catalogs_product_groups_get(product_group_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_get: #{e}"
end
```

#### Using the catalogs_product_groups_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsVerticalProductGroup>, Integer, Hash)> catalogs_product_groups_get_with_http_info(product_group_id, opts)

```ruby
begin
  # Get product group
  data, status_code, headers = api_instance.catalogs_product_groups_get_with_http_info(product_group_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsVerticalProductGroup>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | Unique identifier of a product group |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_list

> <CatalogsProductGroupsList200Response> catalogs_product_groups_list(opts)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogProductGroupsApi.new
opts = {
  id: [37], # Array<Integer> | Comma-separated list of product group ids
  feed_id: 'feed_id_example', # String | Filter entities for a given feed_id. If not given, all feeds are considered.
  catalog_id: 'catalog_id_example', # String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List product groups
  result = api_instance.catalogs_product_groups_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_list: #{e}"
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
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | [**Array&lt;Integer&gt;**](Integer.md) | Comma-separated list of product group ids | [optional] |
| **feed_id** | **String** | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] |
| **catalog_id** | **String** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_product_counts_get

> <CatalogsProductGroupProductCountsVertical> catalogs_product_groups_product_counts_get(product_group_id, opts)

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogProductGroupsApi.new
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get product counts
  result = api_instance.catalogs_product_groups_product_counts_get(product_group_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_product_counts_get: #{e}"
end
```

#### Using the catalogs_product_groups_product_counts_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsProductGroupProductCountsVertical>, Integer, Hash)> catalogs_product_groups_product_counts_get_with_http_info(product_group_id, opts)

```ruby
begin
  # Get product counts
  data, status_code, headers = api_instance.catalogs_product_groups_product_counts_get_with_http_info(product_group_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsProductGroupProductCountsVertical>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_product_counts_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | Unique identifier of a product group |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupProductCountsVertical**](CatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_update

> <CatalogsVerticalProductGroup> catalogs_product_groups_update(product_group_id, catalogs_product_groups_update_request, opts)

Update single product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogProductGroupsApi.new
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group
catalogs_product_groups_update_request = PinterestSdkClient::CatalogsProductGroupUpdateRequest.new # CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Update single product group
  result = api_instance.catalogs_product_groups_update(product_group_id, catalogs_product_groups_update_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_update: #{e}"
end
```

#### Using the catalogs_product_groups_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsVerticalProductGroup>, Integer, Hash)> catalogs_product_groups_update_with_http_info(product_group_id, catalogs_product_groups_update_request, opts)

```ruby
begin
  # Update single product group
  data, status_code, headers = api_instance.catalogs_product_groups_update_with_http_info(product_group_id, catalogs_product_groups_update_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsVerticalProductGroup>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->catalogs_product_groups_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | Unique identifier of a product group |  |
| **catalogs_product_groups_update_request** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md) | Request object used to Update a catalogs product group. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## products_by_product_group_filter_list

> <CatalogsProductGroupPinsList200Response> products_by_product_group_filter_list(catalogs_list_products_by_filter_request, opts)

List products by filter

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogProductGroupsApi.new
catalogs_list_products_by_filter_request = PinterestSdkClient::CatalogsListProductsByFeedBasedFilter.new({feed_id: '2680059592705', filters: PinterestSdkClient::CatalogsProductGroupFilters.new({any_of: [PinterestSdkClient::CatalogsProductGroupFilterKeys.new({min_price: PinterestSdkClient::CatalogsProductGroupPricingCriteria.new({values: 3.56}), max_price: PinterestSdkClient::CatalogsProductGroupPricingCriteria.new({values: 3.56}), currency: PinterestSdkClient::CatalogsProductGroupCurrencyCriteria.new({values: PinterestSdkClient::NonNullableCatalogsCurrency::AED}), item_id: PinterestSdkClient::CatalogsProductGroupMultipleStringCriteria.new({values: ['values_example']}), availability: PinterestSdkClient::CatalogsProductGroupMultipleStringCriteria.new({values: ['values_example']}), brand: , condition: , custom_label_0: PinterestSdkClient::CatalogsProductGroupFilterOperatorTypeCriteria.new({values: ['values_example']}), custom_label_1: PinterestSdkClient::CatalogsProductGroupFilterOperatorTypeCriteria.new({values: ['values_example']}), custom_label_2: , custom_label_3: , custom_label_4: , item_group_id: , gender: PinterestSdkClient::CatalogsProductGroupMultipleGenderCriteria.new({values: [PinterestSdkClient::Gender::FEMALE]}), media_type: PinterestSdkClient::CatalogsProductGroupMultipleMediaTypesCriteria.new({values: [PinterestSdkClient::MediaType::IMAGE]}), product_type_4: PinterestSdkClient::CatalogsProductGroupMultipleStringListCriteria.new({values: [['values_example']]}), product_type_3: PinterestSdkClient::CatalogsProductGroupMultipleStringListCriteria.new({values: [['values_example']]}), product_type_2: , product_type_1: , product_type_0: , google_product_category_6: , google_product_category_5: , google_product_category_4: , google_product_category_3: , google_product_category_2: , google_product_category_1: , google_product_category_0: , product_group: , custom_number_0: PinterestSdkClient::CatalogsProductGroupUint32Criteria.new({operator: 'GREATER_THAN', value: 37}), custom_number_1: PinterestSdkClient::CatalogsProductGroupUint32Criteria.new({operator: 'GREATER_THAN', value: 37}), custom_number_2: , custom_number_3: , custom_number_4: , title_keywords: })], all_of: [PinterestSdkClient::CatalogsProductGroupFilterKeys.new({min_price: , max_price: , currency: PinterestSdkClient::CatalogsProductGroupCurrencyCriteria.new({values: PinterestSdkClient::NonNullableCatalogsCurrency::AED}), item_id: , availability: , brand: , condition: , custom_label_0: , custom_label_1: , custom_label_2: , custom_label_3: , custom_label_4: , item_group_id: , gender: PinterestSdkClient::CatalogsProductGroupMultipleGenderCriteria.new({values: [PinterestSdkClient::Gender::FEMALE]}), media_type: PinterestSdkClient::CatalogsProductGroupMultipleMediaTypesCriteria.new({values: [PinterestSdkClient::MediaType::IMAGE]}), product_type_4: , product_type_3: , product_type_2: , product_type_1: , product_type_0: , google_product_category_6: , google_product_category_5: , google_product_category_4: , google_product_category_3: , google_product_category_2: , google_product_category_1: , google_product_category_0: , product_group: , custom_number_0: , custom_number_1: , custom_number_2: , custom_number_3: , custom_number_4: , title_keywords: })]})}) # CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  pin_metrics: true # Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
}

begin
  # List products by filter
  result = api_instance.products_by_product_group_filter_list(catalogs_list_products_by_filter_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->products_by_product_group_filter_list: #{e}"
end
```

#### Using the products_by_product_group_filter_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsProductGroupPinsList200Response>, Integer, Hash)> products_by_product_group_filter_list_with_http_info(catalogs_list_products_by_filter_request, opts)

```ruby
begin
  # List products by filter
  data, status_code, headers = api_instance.products_by_product_group_filter_list_with_http_info(catalogs_list_products_by_filter_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsProductGroupPinsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogProductGroupsApi->products_by_product_group_filter_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalogs_list_products_by_filter_request** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md) | Object holding a group of filters for a catalog product group |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **pin_metrics** | **Boolean** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional][default to false] |

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

