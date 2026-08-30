# CatalogSupplementalController

All URIs are relative to `"/v5"`

The controller class is defined in **[CatalogSupplementalController.java](../../src/main/java/org/openapitools/controller/CatalogSupplementalController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsLocalInventoryItemsBatchOperate**](#catalogsLocalInventoryItemsBatchOperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogsLocalInventoryItemsPost**](#catalogsLocalInventoryItemsPost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogsLocalStoresCreate**](#catalogsLocalStoresCreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogsLocalStoresDelete**](#catalogsLocalStoresDelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogsLocalStoresList**](#catalogsLocalStoresList) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogsLocalStoresUpdate**](#catalogsLocalStoresUpdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogsSupplementalItemsBatchGet**](#catalogsSupplementalItemsBatchGet) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status

<a id="catalogsLocalInventoryItemsBatchOperate"></a>
# **catalogsLocalInventoryItemsBatchOperate**
```java
Mono<SupplementalItemsBatchResponse> CatalogSupplementalController.catalogsLocalInventoryItemsBatchOperate(catalogIdlocalInventoryItemsBatchCreateadAccountId)
```

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogId** | `String` | Unique identifier of a catalog. |
**localInventoryItemsBatchCreate** | [**LocalInventoryItemsBatchCreate**](../../docs/models/LocalInventoryItemsBatchCreate.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**SupplementalItemsBatchResponse**](../../docs/models/SupplementalItemsBatchResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="catalogsLocalInventoryItemsPost"></a>
# **catalogsLocalInventoryItemsPost**
```java
Mono<LocalInventoryItemsGet> CatalogSupplementalController.catalogsLocalInventoryItemsPost(catalogIdlocalInventoryItemsGetCreateadAccountId)
```

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogId** | `String` | Unique identifier of a catalog. |
**localInventoryItemsGetCreate** | [**LocalInventoryItemsGetCreate**](../../docs/models/LocalInventoryItemsGetCreate.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**LocalInventoryItemsGet**](../../docs/models/LocalInventoryItemsGet.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="catalogsLocalStoresCreate"></a>
# **catalogsLocalStoresCreate**
```java
Mono<List<CatalogsLocalStoresCreate200ResponseInner>> CatalogSupplementalController.catalogsLocalStoresCreate(catalogIdlocalStoreCreateadAccountId)
```

Create local stores

Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogId** | `String` | Unique identifier of a catalog. |
**localStoreCreate** | [**List&lt;@Valid LocalStoreCreate&gt;**](../../docs/models/LocalStoreCreate.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**List&lt;CatalogsLocalStoresCreate200ResponseInner&gt;**](../../docs/models/CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="catalogsLocalStoresDelete"></a>
# **catalogsLocalStoresDelete**
```java
Mono<List<CatalogsLocalStoresDelete200ResponseInner>> CatalogSupplementalController.catalogsLocalStoresDelete(catalogIdidsadAccountId)
```

Delete local stores

  Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogId** | `String` | Unique identifier of a catalog. |
**ids** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](../../docs/models/String.md) | List of local store IDs to filter by. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**List&lt;CatalogsLocalStoresDelete200ResponseInner&gt;**](../../docs/models/CatalogsLocalStoresDelete200ResponseInner.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="catalogsLocalStoresList"></a>
# **catalogsLocalStoresList**
```java
Mono<CatalogsLocalStoresList200Response> CatalogSupplementalController.catalogsLocalStoresList(catalogIdidsadAccountIdbookmarkpageSize)
```

List local stores

Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogId** | `String` | Unique identifier of a catalog. |
**ids** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](../../docs/models/String.md) | List of local store IDs to filter by. | [optional parameter]
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**CatalogsLocalStoresList200Response**](../../docs/models/CatalogsLocalStoresList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="catalogsLocalStoresUpdate"></a>
# **catalogsLocalStoresUpdate**
```java
Mono<List<CatalogsLocalStoresCreate200ResponseInner>> CatalogSupplementalController.catalogsLocalStoresUpdate(catalogIdlocalStoreBatchUpdateadAccountId)
```

Update local stores

  Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogId** | `String` | Unique identifier of a catalog. |
**localStoreBatchUpdate** | [**List&lt;@Valid LocalStoreBatchUpdate&gt;**](../../docs/models/LocalStoreBatchUpdate.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**List&lt;CatalogsLocalStoresCreate200ResponseInner&gt;**](../../docs/models/CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="catalogsSupplementalItemsBatchGet"></a>
# **catalogsSupplementalItemsBatchGet**
```java
Mono<SupplementalItemsBatchResponse> CatalogSupplementalController.catalogsSupplementalItemsBatchGet(catalogIdbatchIdadAccountId)
```

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogId** | `String` | Unique identifier of a catalog. |
**batchId** | `String` | Unique identifier of an items batch operation. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**SupplementalItemsBatchResponse**](../../docs/models/SupplementalItemsBatchResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

