# CatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_local_inventory_items_batch_operate**](CatalogSupplementalApi.md#catalogs_local_inventory_items_batch_operate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogs_local_inventory_items_post**](CatalogSupplementalApi.md#catalogs_local_inventory_items_post) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogs_local_stores_create**](CatalogSupplementalApi.md#catalogs_local_stores_create) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogs_local_stores_delete**](CatalogSupplementalApi.md#catalogs_local_stores_delete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogs_local_stores_list**](CatalogSupplementalApi.md#catalogs_local_stores_list) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogs_local_stores_update**](CatalogSupplementalApi.md#catalogs_local_stores_update) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogs_supplemental_items_batch_get**](CatalogSupplementalApi.md#catalogs_supplemental_items_batch_get) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


# **catalogs_local_inventory_items_batch_operate**
> `catalogs_local_inventory_items_batch_operate`(_api::`CatalogSupplementalApi`, `catalog_id`::`String`, `local_inventory_items_batch_create`::`LocalInventoryItemsBatchCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `SupplementalItemsBatchResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_local_inventory_items_batch_operate`(_api::`CatalogSupplementalApi`, response_stream::`Channel`, `catalog_id`::`String`, `local_inventory_items_batch_create`::`LocalInventoryItemsBatchCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `SupplementalItemsBatchResponse` }, `OpenAPI.Clients.ApiResponse`

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogSupplementalApi`** | API context | 
**`catalog_id`** | **`String`** | Unique identifier of a catalog. |
**`local_inventory_items_batch_create`** | [**`LocalInventoryItemsBatchCreate`**](LocalInventoryItemsBatchCreate.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`SupplementalItemsBatchResponse`**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_local_inventory_items_post**
> `catalogs_local_inventory_items_post`(_api::`CatalogSupplementalApi`, `catalog_id`::`String`, `local_inventory_items_get_create`::`LocalInventoryItemsGetCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `LocalInventoryItemsGet`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_local_inventory_items_post`(_api::`CatalogSupplementalApi`, response_stream::`Channel`, `catalog_id`::`String`, `local_inventory_items_get_create`::`LocalInventoryItemsGetCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `LocalInventoryItemsGet` }, `OpenAPI.Clients.ApiResponse`

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogSupplementalApi`** | API context | 
**`catalog_id`** | **`String`** | Unique identifier of a catalog. |
**`local_inventory_items_get_create`** | [**`LocalInventoryItemsGetCreate`**](LocalInventoryItemsGetCreate.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`LocalInventoryItemsGet`**](LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_local_stores_create**
> `catalogs_local_stores_create`(_api::`CatalogSupplementalApi`, `catalog_id`::`String`, `local_store_create`::`Vector{LocalStoreCreate}`; `ad_account_id`=nothing, _mediaType=nothing) -> `Vector{CatalogsLocalStoresCreate200ResponseInner}`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_local_stores_create`(_api::`CatalogSupplementalApi`, response_stream::`Channel`, `catalog_id`::`String`, `local_store_create`::`Vector{LocalStoreCreate}`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Vector{CatalogsLocalStoresCreate200ResponseInner}` }, `OpenAPI.Clients.ApiResponse`

Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogSupplementalApi`** | API context | 
**`catalog_id`** | **`String`** | Unique identifier of a catalog. |
**`local_store_create`** | [**`Vector{LocalStoreCreate}`**](LocalStoreCreate.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Vector{CatalogsLocalStoresCreate200ResponseInner}`**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_local_stores_delete**
> `catalogs_local_stores_delete`(_api::`CatalogSupplementalApi`, `catalog_id`::`String`, `ids`::`Vector{String}`; `ad_account_id`=nothing, _mediaType=nothing) -> `Vector{CatalogsLocalStoresDelete200ResponseInner}`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_local_stores_delete`(_api::`CatalogSupplementalApi`, response_stream::`Channel`, `catalog_id`::`String`, `ids`::`Vector{String}`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Vector{CatalogsLocalStoresDelete200ResponseInner}` }, `OpenAPI.Clients.ApiResponse`

Delete local stores

  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogSupplementalApi`** | API context | 
**`catalog_id`** | **`String`** | Unique identifier of a catalog. |
**`ids`** | [**`Vector{String}`**](String.md) | List of local store IDs to filter by. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Vector{CatalogsLocalStoresDelete200ResponseInner}`**](CatalogsLocalStoresDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_local_stores_list**
> `catalogs_local_stores_list`(_api::`CatalogSupplementalApi`, `catalog_id`::`String`; `ids`=nothing, `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `CatalogsLocalStoresList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_local_stores_list`(_api::`CatalogSupplementalApi`, response_stream::`Channel`, `catalog_id`::`String`; `ids`=nothing, `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsLocalStoresList200Response` }, `OpenAPI.Clients.ApiResponse`

List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogSupplementalApi`** | API context | 
**`catalog_id`** | **`String`** | Unique identifier of a catalog. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ids`** | [**`Vector{String}`**](String.md) | List of local store IDs to filter by. | [default to nothing]
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`CatalogsLocalStoresList200Response`**](CatalogsLocalStoresList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_local_stores_update**
> `catalogs_local_stores_update`(_api::`CatalogSupplementalApi`, `catalog_id`::`String`, `local_store_batch_update`::`Vector{LocalStoreBatchUpdate}`; `ad_account_id`=nothing, _mediaType=nothing) -> `Vector{CatalogsLocalStoresCreate200ResponseInner}`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_local_stores_update`(_api::`CatalogSupplementalApi`, response_stream::`Channel`, `catalog_id`::`String`, `local_store_batch_update`::`Vector{LocalStoreBatchUpdate}`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Vector{CatalogsLocalStoresCreate200ResponseInner}` }, `OpenAPI.Clients.ApiResponse`

Update local stores

  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogSupplementalApi`** | API context | 
**`catalog_id`** | **`String`** | Unique identifier of a catalog. |
**`local_store_batch_update`** | [**`Vector{LocalStoreBatchUpdate}`**](LocalStoreBatchUpdate.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Vector{CatalogsLocalStoresCreate200ResponseInner}`**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_supplemental_items_batch_get**
> `catalogs_supplemental_items_batch_get`(_api::`CatalogSupplementalApi`, `catalog_id`::`String`, `batch_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `SupplementalItemsBatchResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_supplemental_items_batch_get`(_api::`CatalogSupplementalApi`, response_stream::`Channel`, `catalog_id`::`String`, `batch_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `SupplementalItemsBatchResponse` }, `OpenAPI.Clients.ApiResponse`

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogSupplementalApi`** | API context | 
**`catalog_id`** | **`String`** | Unique identifier of a catalog. |
**`batch_id`** | **`String`** | Unique identifier of an items batch operation. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`SupplementalItemsBatchResponse`**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

