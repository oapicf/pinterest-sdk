# Org.OpenAPITools.Api.CatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CatalogsLocalInventoryItemsBatchOperate**](CatalogSupplementalApi.md#catalogslocalinventoryitemsbatchoperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch |
| [**CatalogsLocalInventoryItemsPost**](CatalogSupplementalApi.md#catalogslocalinventoryitemspost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST) |
| [**CatalogsLocalStoresCreate**](CatalogSupplementalApi.md#catalogslocalstorescreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores |
| [**CatalogsLocalStoresDelete**](CatalogSupplementalApi.md#catalogslocalstoresdelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores |
| [**CatalogsLocalStoresList**](CatalogSupplementalApi.md#catalogslocalstoreslist) | **GET** /catalogs/{catalog_id}/local_stores | List local stores |
| [**CatalogsLocalStoresUpdate**](CatalogSupplementalApi.md#catalogslocalstoresupdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores |
| [**CatalogsSupplementalItemsBatchGet**](CatalogSupplementalApi.md#catalogssupplementalitemsbatchget) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status |

<a id="catalogslocalinventoryitemsbatchoperate"></a>
# **CatalogsLocalInventoryItemsBatchOperate**
> SupplementalItemsBatchResponse CatalogsLocalInventoryItemsBatchOperate (string catalogId, LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate, string adAccountId = null)

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **catalogId** | **string** | Unique identifier of a catalog. |  |
| **localInventoryItemsBatchCreate** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md) |  |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="catalogslocalinventoryitemspost"></a>
# **CatalogsLocalInventoryItemsPost**
> LocalInventoryItemsGet CatalogsLocalInventoryItemsPost (string catalogId, LocalInventoryItemsGetCreate localInventoryItemsGetCreate, string adAccountId = null)

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **catalogId** | **string** | Unique identifier of a catalog. |  |
| **localInventoryItemsGetCreate** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md) |  |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="catalogslocalstorescreate"></a>
# **CatalogsLocalStoresCreate**
> List&lt;CatalogsLocalStoresCreate200ResponseInner&gt; CatalogsLocalStoresCreate (string catalogId, List<LocalStoreCreate> localStoreCreate, string adAccountId = null)

Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **catalogId** | **string** | Unique identifier of a catalog. |  |
| **localStoreCreate** | [**List&lt;LocalStoreCreate&gt;**](LocalStoreCreate.md) |  |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

### Return type

[**List&lt;CatalogsLocalStoresCreate200ResponseInner&gt;**](CatalogsLocalStoresCreate200ResponseInner.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="catalogslocalstoresdelete"></a>
# **CatalogsLocalStoresDelete**
> List&lt;CatalogsLocalStoresDelete200ResponseInner&gt; CatalogsLocalStoresDelete (string catalogId, List<string> ids, string adAccountId = null)

Delete local stores

  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **catalogId** | **string** | Unique identifier of a catalog. |  |
| **ids** | [**List&lt;string&gt;**](string.md) | List of local store IDs to filter by. |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

### Return type

[**List&lt;CatalogsLocalStoresDelete200ResponseInner&gt;**](CatalogsLocalStoresDelete200ResponseInner.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="catalogslocalstoreslist"></a>
# **CatalogsLocalStoresList**
> CatalogsLocalStoresList200Response CatalogsLocalStoresList (string catalogId, List<string> ids = null, string adAccountId = null, string bookmark = null, int pageSize = null)

List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **catalogId** | **string** | Unique identifier of a catalog. |  |
| **ids** | [**List&lt;string&gt;**](string.md) | List of local store IDs to filter by. | [optional]  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**CatalogsLocalStoresList200Response**](CatalogsLocalStoresList200Response.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="catalogslocalstoresupdate"></a>
# **CatalogsLocalStoresUpdate**
> List&lt;CatalogsLocalStoresCreate200ResponseInner&gt; CatalogsLocalStoresUpdate (string catalogId, List<LocalStoreBatchUpdate> localStoreBatchUpdate, string adAccountId = null)

Update local stores

  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **catalogId** | **string** | Unique identifier of a catalog. |  |
| **localStoreBatchUpdate** | [**List&lt;LocalStoreBatchUpdate&gt;**](LocalStoreBatchUpdate.md) |  |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

### Return type

[**List&lt;CatalogsLocalStoresCreate200ResponseInner&gt;**](CatalogsLocalStoresCreate200ResponseInner.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="catalogssupplementalitemsbatchget"></a>
# **CatalogsSupplementalItemsBatchGet**
> SupplementalItemsBatchResponse CatalogsSupplementalItemsBatchGet (string catalogId, string batchId, string adAccountId = null)

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **catalogId** | **string** | Unique identifier of a catalog. |  |
| **batchId** | **string** | Unique identifier of an items batch operation. |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

