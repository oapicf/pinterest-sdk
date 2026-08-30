# CatalogSupplementalAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogSupplementalAPI_catalogsLocalInventoryItemsBatchOperate**](CatalogSupplementalAPI.md#CatalogSupplementalAPI_catalogsLocalInventoryItemsBatchOperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**CatalogSupplementalAPI_catalogsLocalInventoryItemsPost**](CatalogSupplementalAPI.md#CatalogSupplementalAPI_catalogsLocalInventoryItemsPost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**CatalogSupplementalAPI_catalogsLocalStoresCreate**](CatalogSupplementalAPI.md#CatalogSupplementalAPI_catalogsLocalStoresCreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**CatalogSupplementalAPI_catalogsLocalStoresDelete**](CatalogSupplementalAPI.md#CatalogSupplementalAPI_catalogsLocalStoresDelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**CatalogSupplementalAPI_catalogsLocalStoresList**](CatalogSupplementalAPI.md#CatalogSupplementalAPI_catalogsLocalStoresList) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**CatalogSupplementalAPI_catalogsLocalStoresUpdate**](CatalogSupplementalAPI.md#CatalogSupplementalAPI_catalogsLocalStoresUpdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**CatalogSupplementalAPI_catalogsSupplementalItemsBatchGet**](CatalogSupplementalAPI.md#CatalogSupplementalAPI_catalogsSupplementalItemsBatchGet) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


# **CatalogSupplementalAPI_catalogsLocalInventoryItemsBatchOperate**
```c
// Operate on local inventory item batch
//
// Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
supplemental_items_batch_response_t* CatalogSupplementalAPI_catalogsLocalInventoryItemsBatchOperate(apiClient_t *apiClient, char *catalog_id, local_inventory_items_batch_create_t *local_inventory_items_batch_create, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalog_id** | **char \*** | Unique identifier of a catalog. | 
**local_inventory_items_batch_create** | **[local_inventory_items_batch_create_t](local_inventory_items_batch_create.md) \*** |  | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[supplemental_items_batch_response_t](supplemental_items_batch_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogSupplementalAPI_catalogsLocalInventoryItemsPost**
```c
// Get local inventory items (POST)
//
// Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
local_inventory_items_get_t* CatalogSupplementalAPI_catalogsLocalInventoryItemsPost(apiClient_t *apiClient, char *catalog_id, local_inventory_items_get_create_t *local_inventory_items_get_create, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalog_id** | **char \*** | Unique identifier of a catalog. | 
**local_inventory_items_get_create** | **[local_inventory_items_get_create_t](local_inventory_items_get_create.md) \*** |  | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[local_inventory_items_get_t](local_inventory_items_get.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogSupplementalAPI_catalogsLocalStoresCreate**
```c
// Create local stores
//
// Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
list_t* CatalogSupplementalAPI_catalogsLocalStoresCreate(apiClient_t *apiClient, char *catalog_id, list_t *local_store_create, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalog_id** | **char \*** | Unique identifier of a catalog. | 
**local_store_create** | **[list_t](local_store_create.md) \*** |  | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[list_t](catalogs_local_stores_create_200_response_inner.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogSupplementalAPI_catalogsLocalStoresDelete**
```c
// Delete local stores
//
//   Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
//
list_t* CatalogSupplementalAPI_catalogsLocalStoresDelete(apiClient_t *apiClient, char *catalog_id, list_t *ids, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalog_id** | **char \*** | Unique identifier of a catalog. | 
**ids** | **[list_t](char.md) \*** | List of local store IDs to filter by. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[list_t](catalogs_local_stores_delete_200_response_inner.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogSupplementalAPI_catalogsLocalStoresList**
```c
// List local stores
//
// Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
catalogs_local_stores_list_200_response_t* CatalogSupplementalAPI_catalogsLocalStoresList(apiClient_t *apiClient, char *catalog_id, list_t *ids, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalog_id** | **char \*** | Unique identifier of a catalog. | 
**ids** | **[list_t](char.md) \*** | List of local store IDs to filter by. | [optional] 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[catalogs_local_stores_list_200_response_t](catalogs_local_stores_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogSupplementalAPI_catalogsLocalStoresUpdate**
```c
// Update local stores
//
//   Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
//
list_t* CatalogSupplementalAPI_catalogsLocalStoresUpdate(apiClient_t *apiClient, char *catalog_id, list_t *local_store_batch_update, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalog_id** | **char \*** | Unique identifier of a catalog. | 
**local_store_batch_update** | **[list_t](local_store_batch_update.md) \*** |  | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[list_t](catalogs_local_stores_create_200_response_inner.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogSupplementalAPI_catalogsSupplementalItemsBatchGet**
```c
// Get supplemental items batch status
//
// Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
supplemental_items_batch_response_t* CatalogSupplementalAPI_catalogsSupplementalItemsBatchGet(apiClient_t *apiClient, char *catalog_id, char *batch_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalog_id** | **char \*** | Unique identifier of a catalog. | 
**batch_id** | **char \*** | Unique identifier of an items batch operation. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[supplemental_items_batch_response_t](supplemental_items_batch_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

