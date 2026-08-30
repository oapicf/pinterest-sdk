# CatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsLocalInventoryItemsBatchOperate**](CatalogSupplementalApi.md#CatalogsLocalInventoryItemsBatchOperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**CatalogsLocalInventoryItemsPost**](CatalogSupplementalApi.md#CatalogsLocalInventoryItemsPost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**CatalogsLocalStoresCreate**](CatalogSupplementalApi.md#CatalogsLocalStoresCreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**CatalogsLocalStoresDelete**](CatalogSupplementalApi.md#CatalogsLocalStoresDelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**CatalogsLocalStoresList**](CatalogSupplementalApi.md#CatalogsLocalStoresList) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**CatalogsLocalStoresUpdate**](CatalogSupplementalApi.md#CatalogsLocalStoresUpdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**CatalogsSupplementalItemsBatchGet**](CatalogSupplementalApi.md#CatalogsSupplementalItemsBatchGet) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


# **CatalogsLocalInventoryItemsBatchOperate**
> SupplementalItemsBatchResponse CatalogsLocalInventoryItemsBatchOperate(catalog_id, local_inventory_items_batch_create, ad_account_id = var.ad_account_id)

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# Operate on local inventory item batch
#
# prepare function argument(s)
var_catalog_id <- "catalog_id_example" # character | Unique identifier of a catalog.
var_local_inventory_items_batch_create <- LocalInventoryItemsBatchCreate$new(c(LocalInventoryOperation$new(RetailLocalInventoryItemAttributes$new(ItemAvailability$new(), "price_example", "ad_link_example", "sale_price_example"), "item_id_example", "DELETE", "store_code_example"))) # LocalInventoryItemsBatchCreate | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogSupplementalApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsLocalInventoryItemsBatchOperate(var_catalog_id, var_local_inventory_items_batch_create, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsLocalInventoryItemsBatchOperate(var_catalog_id, var_local_inventory_items_batch_create, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **character**| Unique identifier of a catalog. | 
 **local_inventory_items_batch_create** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md)|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsLocalInventoryItemsPost**
> LocalInventoryItemsGet CatalogsLocalInventoryItemsPost(catalog_id, local_inventory_items_get_create, ad_account_id = var.ad_account_id)

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# Get local inventory items (POST)
#
# prepare function argument(s)
var_catalog_id <- "catalog_id_example" # character | Unique identifier of a catalog.
var_local_inventory_items_get_create <- LocalInventoryItemsGetCreate$new(c(ItemIdStoreCodePair$new("item_id_example", "store_code_example"))) # LocalInventoryItemsGetCreate | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogSupplementalApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsLocalInventoryItemsPost(var_catalog_id, var_local_inventory_items_get_create, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsLocalInventoryItemsPost(var_catalog_id, var_local_inventory_items_get_create, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **character**| Unique identifier of a catalog. | 
 **local_inventory_items_get_create** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md)|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**LocalInventoryItemsGet**](LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsLocalStoresCreate**
> array[CatalogsLocalStoresCreate200ResponseInner] CatalogsLocalStoresCreate(catalog_id, local_store_create, ad_account_id = var.ad_account_id)

Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# Create local stores
#
# prepare function argument(s)
var_catalog_id <- "catalog_id_example" # character | Unique identifier of a catalog.
var_local_store_create <- c(LocalStoreCreate$new(Country$new(), "name_example", "store_code_example", "address_primary_example", "address_secondary_example", "city_example", 123, 123, "postal_code_example", "region_example")) # array[LocalStoreCreate] | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogSupplementalApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsLocalStoresCreate(var_catalog_id, var_local_store_create, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsLocalStoresCreate(var_catalog_id, var_local_store_create, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **character**| Unique identifier of a catalog. | 
 **local_store_create** | list( [**LocalStoreCreate**](LocalStoreCreate.md) )|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**array[CatalogsLocalStoresCreate200ResponseInner]**](catalogs_local_stores_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsLocalStoresDelete**
> array[CatalogsLocalStoresDelete200ResponseInner] CatalogsLocalStoresDelete(catalog_id, ids, ad_account_id = var.ad_account_id)

Delete local stores

  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# Delete local stores
#
# prepare function argument(s)
var_catalog_id <- "catalog_id_example" # character | Unique identifier of a catalog.
var_ids <- c("inner_example") # array[character] | List of local store IDs to filter by.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogSupplementalApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsLocalStoresDelete(var_catalog_id, var_ids, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsLocalStoresDelete(var_catalog_id, var_ids, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **character**| Unique identifier of a catalog. | 
 **ids** | list( **character** )| List of local store IDs to filter by. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**array[CatalogsLocalStoresDelete200ResponseInner]**](catalogs_local_stores_delete_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsLocalStoresList**
> CatalogsLocalStoresList200Response CatalogsLocalStoresList(catalog_id, ids = var.ids, ad_account_id = var.ad_account_id, bookmark = var.bookmark, page_size = 25)

List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# List local stores
#
# prepare function argument(s)
var_catalog_id <- "catalog_id_example" # character | Unique identifier of a catalog.
var_ids <- c("inner_example") # array[character] | List of local store IDs to filter by. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- CatalogSupplementalApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsLocalStoresList(var_catalog_id, ids = var_ids, ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$CatalogsLocalStoresList(var_catalog_id, ids = var_ids, ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **character**| Unique identifier of a catalog. | 
 **ids** | list( **character** )| List of local store IDs to filter by. | [optional] 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsLocalStoresList200Response**](catalogs_local_stores_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsLocalStoresUpdate**
> array[CatalogsLocalStoresCreate200ResponseInner] CatalogsLocalStoresUpdate(catalog_id, local_store_batch_update, ad_account_id = var.ad_account_id)

Update local stores

  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# Update local stores
#
# prepare function argument(s)
var_catalog_id <- "catalog_id_example" # character | Unique identifier of a catalog.
var_local_store_batch_update <- c(LocalStoreBatchUpdate$new("id_example", "address_primary_example", "address_secondary_example", "city_example", Country$new(), 123, 123, "name_example", "postal_code_example", "region_example", "store_code_example")) # array[LocalStoreBatchUpdate] | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogSupplementalApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsLocalStoresUpdate(var_catalog_id, var_local_store_batch_update, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsLocalStoresUpdate(var_catalog_id, var_local_store_batch_update, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **character**| Unique identifier of a catalog. | 
 **local_store_batch_update** | list( [**LocalStoreBatchUpdate**](LocalStoreBatchUpdate.md) )|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**array[CatalogsLocalStoresCreate200ResponseInner]**](catalogs_local_stores_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsSupplementalItemsBatchGet**
> SupplementalItemsBatchResponse CatalogsSupplementalItemsBatchGet(catalog_id, batch_id, ad_account_id = var.ad_account_id)

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# Get supplemental items batch status
#
# prepare function argument(s)
var_catalog_id <- "catalog_id_example" # character | Unique identifier of a catalog.
var_batch_id <- "batch_id_example" # character | Unique identifier of an items batch operation.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogSupplementalApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsSupplementalItemsBatchGet(var_catalog_id, var_batch_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsSupplementalItemsBatchGet(var_catalog_id, var_batch_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **character**| Unique identifier of a catalog. | 
 **batch_id** | **character**| Unique identifier of an items batch operation. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

