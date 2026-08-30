# CatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**catalogsLocalInventoryItems/post**](CatalogSupplementalApi.md#catalogsLocalInventoryItems/post) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST) |
| [**catalogsLocalInventoryItemsBatch/operate**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsBatch/operate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch |
| [**catalogsLocalStores/create**](CatalogSupplementalApi.md#catalogsLocalStores/create) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores |
| [**catalogsLocalStores/delete**](CatalogSupplementalApi.md#catalogsLocalStores/delete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores |
| [**catalogsLocalStores/list**](CatalogSupplementalApi.md#catalogsLocalStores/list) | **GET** /catalogs/{catalog_id}/local_stores | List local stores |
| [**catalogsLocalStores/update**](CatalogSupplementalApi.md#catalogsLocalStores/update) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores |
| [**catalogsSupplementalItemsBatch/get**](CatalogSupplementalApi.md#catalogsSupplementalItemsBatch/get) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status |


<a name="catalogsLocalInventoryItems/post"></a>
# **catalogsLocalInventoryItems/post**
> LocalInventoryItemsGet catalogsLocalInventoryItems/post(catalog\_id, LocalInventoryItemsGetCreate, ad\_account\_id)

Get local inventory items (POST)

    Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalog\_id** | **String**| Unique identifier of a catalog. | [default to null] |
| **LocalInventoryItemsGetCreate** | [**LocalInventoryItemsGetCreate**](../Models/LocalInventoryItemsGetCreate.md)|  | |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**LocalInventoryItemsGet**](../Models/LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="catalogsLocalInventoryItemsBatch/operate"></a>
# **catalogsLocalInventoryItemsBatch/operate**
> SupplementalItemsBatchResponse catalogsLocalInventoryItemsBatch/operate(catalog\_id, LocalInventoryItemsBatchCreate, ad\_account\_id)

Operate on local inventory item batch

    Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalog\_id** | **String**| Unique identifier of a catalog. | [default to null] |
| **LocalInventoryItemsBatchCreate** | [**LocalInventoryItemsBatchCreate**](../Models/LocalInventoryItemsBatchCreate.md)|  | |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**SupplementalItemsBatchResponse**](../Models/SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="catalogsLocalStores/create"></a>
# **catalogsLocalStores/create**
> List catalogsLocalStores/create(catalog\_id, LocalStoreCreate, ad\_account\_id)

Create local stores

    Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalog\_id** | **String**| Unique identifier of a catalog. | [default to null] |
| **LocalStoreCreate** | [**List**](../Models/LocalStoreCreate.md)|  | |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**List**](../Models/catalogs_local_stores_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="catalogsLocalStores/delete"></a>
# **catalogsLocalStores/delete**
> List catalogsLocalStores/delete(catalog\_id, ids, ad\_account\_id)

Delete local stores

      Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalog\_id** | **String**| Unique identifier of a catalog. | [default to null] |
| **ids** | [**List**](../Models/String.md)| List of local store IDs to filter by. | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**List**](../Models/catalogs_local_stores_delete_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsLocalStores/list"></a>
# **catalogsLocalStores/list**
> catalogs_local_stores_list_200_response catalogsLocalStores/list(catalog\_id, ids, ad\_account\_id, bookmark, page\_size)

List local stores

    Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalog\_id** | **String**| Unique identifier of a catalog. | [default to null] |
| **ids** | [**List**](../Models/String.md)| List of local store IDs to filter by. | [optional] [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**catalogs_local_stores_list_200_response**](../Models/catalogs_local_stores_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsLocalStores/update"></a>
# **catalogsLocalStores/update**
> List catalogsLocalStores/update(catalog\_id, LocalStoreBatchUpdate, ad\_account\_id)

Update local stores

      Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalog\_id** | **String**| Unique identifier of a catalog. | [default to null] |
| **LocalStoreBatchUpdate** | [**List**](../Models/LocalStoreBatchUpdate.md)|  | |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**List**](../Models/catalogs_local_stores_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="catalogsSupplementalItemsBatch/get"></a>
# **catalogsSupplementalItemsBatch/get**
> SupplementalItemsBatchResponse catalogsSupplementalItemsBatch/get(catalog\_id, batch\_id, ad\_account\_id)

Get supplemental items batch status

    Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalog\_id** | **String**| Unique identifier of a catalog. | [default to null] |
| **batch\_id** | **String**| Unique identifier of an items batch operation. | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**SupplementalItemsBatchResponse**](../Models/SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

