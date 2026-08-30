# catalog_supplemental_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**catalogs_local_inventory_items_batch/operate**](catalog_supplemental_api.md#catalogs_local_inventory_items_batch/operate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
**catalogs_local_inventory_items/post**](catalog_supplemental_api.md#catalogs_local_inventory_items/post) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
**catalogs_local_stores/create**](catalog_supplemental_api.md#catalogs_local_stores/create) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
**catalogs_local_stores/delete**](catalog_supplemental_api.md#catalogs_local_stores/delete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
**catalogs_local_stores/list**](catalog_supplemental_api.md#catalogs_local_stores/list) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
**catalogs_local_stores/update**](catalog_supplemental_api.md#catalogs_local_stores/update) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
**catalogs_supplemental_items_batch/get**](catalog_supplemental_api.md#catalogs_supplemental_items_batch/get) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


# **catalogs_local_inventory_items_batch/operate**
> models::SupplementalItemsBatchResponse catalogs_local_inventory_items_batch/operate(ctx, catalog_id, local_inventory_items_batch_create, optional)
Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **catalog_id** | **String**| Unique identifier of a catalog. | 
  **local_inventory_items_batch_create** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md)|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **String**| Unique identifier of a catalog. | 
 **local_inventory_items_batch_create** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md)|  | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_inventory_items/post**
> models::LocalInventoryItemsGet catalogs_local_inventory_items/post(ctx, catalog_id, local_inventory_items_get_create, optional)
Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **catalog_id** | **String**| Unique identifier of a catalog. | 
  **local_inventory_items_get_create** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md)|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **String**| Unique identifier of a catalog. | 
 **local_inventory_items_get_create** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md)|  | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::LocalInventoryItemsGet**](LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores/create**
> Vec<models::CatalogsLocalStoresCreate200ResponseInner> catalogs_local_stores/create(ctx, catalog_id, local_store_create, optional)
Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **catalog_id** | **String**| Unique identifier of a catalog. | 
  **local_store_create** | [**LocalStoreCreate**](LocalStoreCreate.md)|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **String**| Unique identifier of a catalog. | 
 **local_store_create** | [**LocalStoreCreate**](LocalStoreCreate.md)|  | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**Vec<models::CatalogsLocalStoresCreate200ResponseInner>**](catalogs_local_stores_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores/delete**
> Vec<models::CatalogsLocalStoresDelete200ResponseInner> catalogs_local_stores/delete(ctx, catalog_id, ids, optional)
Delete local stores

  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **catalog_id** | **String**| Unique identifier of a catalog. | 
  **ids** | [**String**](String.md)| List of local store IDs to filter by. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **String**| Unique identifier of a catalog. | 
 **ids** | [**String**](String.md)| List of local store IDs to filter by. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**Vec<models::CatalogsLocalStoresDelete200ResponseInner>**](catalogs_local_stores_delete_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores/list**
> models::CatalogsLocalStoresList200Response catalogs_local_stores/list(ctx, catalog_id, optional)
List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **catalog_id** | **String**| Unique identifier of a catalog. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **String**| Unique identifier of a catalog. | 
 **ids** | [**String**](String.md)| List of local store IDs to filter by. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::CatalogsLocalStoresList200Response**](catalogs_local_stores_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores/update**
> Vec<models::CatalogsLocalStoresCreate200ResponseInner> catalogs_local_stores/update(ctx, catalog_id, local_store_batch_update, optional)
Update local stores

  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **catalog_id** | **String**| Unique identifier of a catalog. | 
  **local_store_batch_update** | [**LocalStoreBatchUpdate**](LocalStoreBatchUpdate.md)|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **String**| Unique identifier of a catalog. | 
 **local_store_batch_update** | [**LocalStoreBatchUpdate**](LocalStoreBatchUpdate.md)|  | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**Vec<models::CatalogsLocalStoresCreate200ResponseInner>**](catalogs_local_stores_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_supplemental_items_batch/get**
> models::SupplementalItemsBatchResponse catalogs_supplemental_items_batch/get(ctx, catalog_id, batch_id, optional)
Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **catalog_id** | **String**| Unique identifier of a catalog. | 
  **batch_id** | **String**| Unique identifier of an items batch operation. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **String**| Unique identifier of a catalog. | 
 **batch_id** | **String**| Unique identifier of an items batch operation. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

