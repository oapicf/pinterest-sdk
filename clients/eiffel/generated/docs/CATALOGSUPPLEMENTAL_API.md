# CATALOGSUPPLEMENTAL_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_local_inventory_items_batch_operate**](CATALOGSUPPLEMENTAL_API.md#catalogs_local_inventory_items_batch_operate) | **Post** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogs_local_inventory_items_post**](CATALOGSUPPLEMENTAL_API.md#catalogs_local_inventory_items_post) | **Post** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogs_local_stores_create**](CATALOGSUPPLEMENTAL_API.md#catalogs_local_stores_create) | **Post** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogs_local_stores_delete**](CATALOGSUPPLEMENTAL_API.md#catalogs_local_stores_delete) | **Delete** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogs_local_stores_list**](CATALOGSUPPLEMENTAL_API.md#catalogs_local_stores_list) | **Get** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogs_local_stores_update**](CATALOGSUPPLEMENTAL_API.md#catalogs_local_stores_update) | **Patch** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogs_supplemental_items_batch_get**](CATALOGSUPPLEMENTAL_API.md#catalogs_supplemental_items_batch_get) | **Get** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


# **catalogs_local_inventory_items_batch_operate**
> catalogs_local_inventory_items_batch_operate (catalog_id: STRING_32 ; local_inventory_items_batch_create: LOCAL_INVENTORY_ITEMS_BATCH_CREATE ; ad_account_id:  detachable STRING_32 ): detachable SUPPLEMENTAL_ITEMS_BATCH_RESPONSE


Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **STRING_32**| Unique identifier of a catalog. | [default to null]
 **local_inventory_items_batch_create** | [**LOCAL_INVENTORY_ITEMS_BATCH_CREATE**](LOCAL_INVENTORY_ITEMS_BATCH_CREATE.md)|  | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**SUPPLEMENTAL_ITEMS_BATCH_RESPONSE**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_inventory_items_post**
> catalogs_local_inventory_items_post (catalog_id: STRING_32 ; local_inventory_items_get_create: LOCAL_INVENTORY_ITEMS_GET_CREATE ; ad_account_id:  detachable STRING_32 ): detachable LOCAL_INVENTORY_ITEMS_GET


Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **STRING_32**| Unique identifier of a catalog. | [default to null]
 **local_inventory_items_get_create** | [**LOCAL_INVENTORY_ITEMS_GET_CREATE**](LOCAL_INVENTORY_ITEMS_GET_CREATE.md)|  | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**LOCAL_INVENTORY_ITEMS_GET**](LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores_create**
> catalogs_local_stores_create (catalog_id: STRING_32 ; local_store_create: LIST [LOCAL_STORE_CREATE] ; ad_account_id:  detachable STRING_32 ): detachable LIST [CATALOGS_LOCAL_STORES_CREATE_200_RESPONSE_INNER]


Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **STRING_32**| Unique identifier of a catalog. | [default to null]
 **local_store_create** | [**LIST [LOCAL_STORE_CREATE]**](LocalStoreCreate.md)|  | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**LIST [CATALOGS_LOCAL_STORES_CREATE_200_RESPONSE_INNER]**](catalogs_local_stores_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores_delete**
> catalogs_local_stores_delete (catalog_id: STRING_32 ; ids: LIST [STRING_32] ; ad_account_id:  detachable STRING_32 ): detachable LIST [CATALOGS_LOCAL_STORES_DELETE_200_RESPONSE_INNER]


Delete local stores

  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **STRING_32**| Unique identifier of a catalog. | [default to null]
 **ids** | [**LIST [STRING_32]**](STRING_32.md)| List of local store IDs to filter by. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**LIST [CATALOGS_LOCAL_STORES_DELETE_200_RESPONSE_INNER]**](catalogs_local_stores_delete_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores_list**
> catalogs_local_stores_list (catalog_id: STRING_32 ; ids:  detachable LIST [STRING_32] ; ad_account_id:  detachable STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable CATALOGS_LOCAL_STORES_LIST_200_RESPONSE


List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **STRING_32**| Unique identifier of a catalog. | [default to null]
 **ids** | [**LIST [STRING_32]**](STRING_32.md)| List of local store IDs to filter by. | [optional] [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CATALOGS_LOCAL_STORES_LIST_200_RESPONSE**](catalogs_local_stores_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores_update**
> catalogs_local_stores_update (catalog_id: STRING_32 ; local_store_batch_update: LIST [LOCAL_STORE_BATCH_UPDATE] ; ad_account_id:  detachable STRING_32 ): detachable LIST [CATALOGS_LOCAL_STORES_CREATE_200_RESPONSE_INNER]


Update local stores

  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **STRING_32**| Unique identifier of a catalog. | [default to null]
 **local_store_batch_update** | [**LIST [LOCAL_STORE_BATCH_UPDATE]**](LocalStoreBatchUpdate.md)|  | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**LIST [CATALOGS_LOCAL_STORES_CREATE_200_RESPONSE_INNER]**](catalogs_local_stores_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_supplemental_items_batch_get**
> catalogs_supplemental_items_batch_get (catalog_id: STRING_32 ; batch_id: STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable SUPPLEMENTAL_ITEMS_BATCH_RESPONSE


Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **STRING_32**| Unique identifier of a catalog. | [default to null]
 **batch_id** | **STRING_32**| Unique identifier of an items batch operation. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**SUPPLEMENTAL_ITEMS_BATCH_RESPONSE**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

