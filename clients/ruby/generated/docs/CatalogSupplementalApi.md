# PinterestSdkClient::CatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**catalogs_local_inventory_items_batch_operate**](CatalogSupplementalApi.md#catalogs_local_inventory_items_batch_operate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch |
| [**catalogs_local_inventory_items_post**](CatalogSupplementalApi.md#catalogs_local_inventory_items_post) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST) |
| [**catalogs_local_stores_create**](CatalogSupplementalApi.md#catalogs_local_stores_create) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores |
| [**catalogs_local_stores_delete**](CatalogSupplementalApi.md#catalogs_local_stores_delete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores |
| [**catalogs_local_stores_list**](CatalogSupplementalApi.md#catalogs_local_stores_list) | **GET** /catalogs/{catalog_id}/local_stores | List local stores |
| [**catalogs_local_stores_update**](CatalogSupplementalApi.md#catalogs_local_stores_update) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores |
| [**catalogs_supplemental_items_batch_get**](CatalogSupplementalApi.md#catalogs_supplemental_items_batch_get) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status |


## catalogs_local_inventory_items_batch_operate

> <SupplementalItemsBatchResponse> catalogs_local_inventory_items_batch_operate(catalog_id, local_inventory_items_batch_create, opts)

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogSupplementalApi.new
catalog_id = 'catalog_id_example' # String | Unique identifier of a catalog.
local_inventory_items_batch_create = PinterestSdkClient::LocalInventoryItemsBatchCreate.new({operations: [PinterestSdkClient::LocalInventoryCreateOperation.new({attributes: PinterestSdkClient::RetailLocalInventoryItemAttributes.new({availability: PinterestSdkClient::ItemAvailability::IN_STOCK, price: '49.99 USD'}), item_id: 'item_id_1', operation: 'CREATE', store_code: 'store_1'})]}) # LocalInventoryItemsBatchCreate | 
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Operate on local inventory item batch
  result = api_instance.catalogs_local_inventory_items_batch_operate(catalog_id, local_inventory_items_batch_create, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_inventory_items_batch_operate: #{e}"
end
```

#### Using the catalogs_local_inventory_items_batch_operate_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SupplementalItemsBatchResponse>, Integer, Hash)> catalogs_local_inventory_items_batch_operate_with_http_info(catalog_id, local_inventory_items_batch_create, opts)

```ruby
begin
  # Operate on local inventory item batch
  data, status_code, headers = api_instance.catalogs_local_inventory_items_batch_operate_with_http_info(catalog_id, local_inventory_items_batch_create, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SupplementalItemsBatchResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_inventory_items_batch_operate_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Unique identifier of a catalog. |  |
| **local_inventory_items_batch_create** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md) |  |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogs_local_inventory_items_post

> <LocalInventoryItemsGet> catalogs_local_inventory_items_post(catalog_id, local_inventory_items_get_create, opts)

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogSupplementalApi.new
catalog_id = 'catalog_id_example' # String | Unique identifier of a catalog.
local_inventory_items_get_create = PinterestSdkClient::LocalInventoryItemsGetCreate.new({item_filters: [PinterestSdkClient::ItemIdStoreCodePair.new({item_id: 'item_id_1', store_code: 'store_1'})]}) # LocalInventoryItemsGetCreate | 
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get local inventory items (POST)
  result = api_instance.catalogs_local_inventory_items_post(catalog_id, local_inventory_items_get_create, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_inventory_items_post: #{e}"
end
```

#### Using the catalogs_local_inventory_items_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LocalInventoryItemsGet>, Integer, Hash)> catalogs_local_inventory_items_post_with_http_info(catalog_id, local_inventory_items_get_create, opts)

```ruby
begin
  # Get local inventory items (POST)
  data, status_code, headers = api_instance.catalogs_local_inventory_items_post_with_http_info(catalog_id, local_inventory_items_get_create, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LocalInventoryItemsGet>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_inventory_items_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Unique identifier of a catalog. |  |
| **local_inventory_items_get_create** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md) |  |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**LocalInventoryItemsGet**](LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogs_local_stores_create

> <Array<CatalogsLocalStoresCreate200ResponseInner>> catalogs_local_stores_create(catalog_id, local_store_create, opts)

Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogSupplementalApi.new
catalog_id = 'catalog_id_example' # String | Unique identifier of a catalog.
local_store_create = [PinterestSdkClient::LocalStoreCreate.new({country: PinterestSdkClient::Country::AD, name: 'Sunnyvale Store', store_code: 'store_1'})] # Array<LocalStoreCreate> | 
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Create local stores
  result = api_instance.catalogs_local_stores_create(catalog_id, local_store_create, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_stores_create: #{e}"
end
```

#### Using the catalogs_local_stores_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<CatalogsLocalStoresCreate200ResponseInner>>, Integer, Hash)> catalogs_local_stores_create_with_http_info(catalog_id, local_store_create, opts)

```ruby
begin
  # Create local stores
  data, status_code, headers = api_instance.catalogs_local_stores_create_with_http_info(catalog_id, local_store_create, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<CatalogsLocalStoresCreate200ResponseInner>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_stores_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Unique identifier of a catalog. |  |
| **local_store_create** | [**Array&lt;LocalStoreCreate&gt;**](LocalStoreCreate.md) |  |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Array&lt;CatalogsLocalStoresCreate200ResponseInner&gt;**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogs_local_stores_delete

> <Array<CatalogsLocalStoresDelete200ResponseInner>> catalogs_local_stores_delete(catalog_id, ids, opts)

Delete local stores

  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogSupplementalApi.new
catalog_id = 'catalog_id_example' # String | Unique identifier of a catalog.
ids = ['inner_example'] # Array<String> | List of local store IDs to filter by.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Delete local stores
  result = api_instance.catalogs_local_stores_delete(catalog_id, ids, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_stores_delete: #{e}"
end
```

#### Using the catalogs_local_stores_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<CatalogsLocalStoresDelete200ResponseInner>>, Integer, Hash)> catalogs_local_stores_delete_with_http_info(catalog_id, ids, opts)

```ruby
begin
  # Delete local stores
  data, status_code, headers = api_instance.catalogs_local_stores_delete_with_http_info(catalog_id, ids, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<CatalogsLocalStoresDelete200ResponseInner>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_stores_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Unique identifier of a catalog. |  |
| **ids** | [**Array&lt;String&gt;**](String.md) | List of local store IDs to filter by. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Array&lt;CatalogsLocalStoresDelete200ResponseInner&gt;**](CatalogsLocalStoresDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_local_stores_list

> <CatalogsLocalStoresList200Response> catalogs_local_stores_list(catalog_id, opts)

List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogSupplementalApi.new
catalog_id = 'catalog_id_example' # String | Unique identifier of a catalog.
opts = {
  ids: ['inner_example'], # Array<String> | List of local store IDs to filter by.
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
}

begin
  # List local stores
  result = api_instance.catalogs_local_stores_list(catalog_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_stores_list: #{e}"
end
```

#### Using the catalogs_local_stores_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsLocalStoresList200Response>, Integer, Hash)> catalogs_local_stores_list_with_http_info(catalog_id, opts)

```ruby
begin
  # List local stores
  data, status_code, headers = api_instance.catalogs_local_stores_list_with_http_info(catalog_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsLocalStoresList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_stores_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Unique identifier of a catalog. |  |
| **ids** | [**Array&lt;String&gt;**](String.md) | List of local store IDs to filter by. | [optional] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

### Return type

[**CatalogsLocalStoresList200Response**](CatalogsLocalStoresList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_local_stores_update

> <Array<CatalogsLocalStoresCreate200ResponseInner>> catalogs_local_stores_update(catalog_id, local_store_batch_update, opts)

Update local stores

  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogSupplementalApi.new
catalog_id = 'catalog_id_example' # String | Unique identifier of a catalog.
local_store_batch_update = [PinterestSdkClient::LocalStoreBatchUpdate.new({id: '1234567890'})] # Array<LocalStoreBatchUpdate> | 
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Update local stores
  result = api_instance.catalogs_local_stores_update(catalog_id, local_store_batch_update, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_stores_update: #{e}"
end
```

#### Using the catalogs_local_stores_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<CatalogsLocalStoresCreate200ResponseInner>>, Integer, Hash)> catalogs_local_stores_update_with_http_info(catalog_id, local_store_batch_update, opts)

```ruby
begin
  # Update local stores
  data, status_code, headers = api_instance.catalogs_local_stores_update_with_http_info(catalog_id, local_store_batch_update, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<CatalogsLocalStoresCreate200ResponseInner>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_local_stores_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Unique identifier of a catalog. |  |
| **local_store_batch_update** | [**Array&lt;LocalStoreBatchUpdate&gt;**](LocalStoreBatchUpdate.md) |  |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Array&lt;CatalogsLocalStoresCreate200ResponseInner&gt;**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogs_supplemental_items_batch_get

> <SupplementalItemsBatchResponse> catalogs_supplemental_items_batch_get(catalog_id, batch_id, opts)

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogSupplementalApi.new
catalog_id = 'catalog_id_example' # String | Unique identifier of a catalog.
batch_id = 'batch_id_example' # String | Unique identifier of an items batch operation.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get supplemental items batch status
  result = api_instance.catalogs_supplemental_items_batch_get(catalog_id, batch_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_supplemental_items_batch_get: #{e}"
end
```

#### Using the catalogs_supplemental_items_batch_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SupplementalItemsBatchResponse>, Integer, Hash)> catalogs_supplemental_items_batch_get_with_http_info(catalog_id, batch_id, opts)

```ruby
begin
  # Get supplemental items batch status
  data, status_code, headers = api_instance.catalogs_supplemental_items_batch_get_with_http_info(catalog_id, batch_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SupplementalItemsBatchResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogSupplementalApi->catalogs_supplemental_items_batch_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Unique identifier of a catalog. |  |
| **batch_id** | **String** | Unique identifier of an items batch operation. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

