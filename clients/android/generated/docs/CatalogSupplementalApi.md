# CatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsLocalInventoryItemsBatchOperate**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsBatchOperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogsLocalInventoryItemsPost**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsPost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogsLocalStoresCreate**](CatalogSupplementalApi.md#catalogsLocalStoresCreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogsLocalStoresDelete**](CatalogSupplementalApi.md#catalogsLocalStoresDelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogsLocalStoresList**](CatalogSupplementalApi.md#catalogsLocalStoresList) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogsLocalStoresUpdate**](CatalogSupplementalApi.md#catalogsLocalStoresUpdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogsSupplementalItemsBatchGet**](CatalogSupplementalApi.md#catalogsSupplementalItemsBatchGet) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status



## catalogsLocalInventoryItemsBatchOperate

> SupplementalItemsBatchResponse catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId)

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogSupplementalApi;

CatalogSupplementalApi apiInstance = new CatalogSupplementalApi();
String catalogId = null; // String | Unique identifier of a catalog.
LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate = new LocalInventoryItemsBatchCreate(); // LocalInventoryItemsBatchCreate | 
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    SupplementalItemsBatchResponse result = apiInstance.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalInventoryItemsBatchOperate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | [default to null]
 **localInventoryItemsBatchCreate** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogsLocalInventoryItemsPost

> LocalInventoryItemsGet catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId)

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogSupplementalApi;

CatalogSupplementalApi apiInstance = new CatalogSupplementalApi();
String catalogId = null; // String | Unique identifier of a catalog.
LocalInventoryItemsGetCreate localInventoryItemsGetCreate = new LocalInventoryItemsGetCreate(); // LocalInventoryItemsGetCreate | 
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    LocalInventoryItemsGet result = apiInstance.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalInventoryItemsPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | [default to null]
 **localInventoryItemsGetCreate** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**LocalInventoryItemsGet**](LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogsLocalStoresCreate

> List&lt;CatalogsLocalStoresCreate200ResponseInner&gt; catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId)

Create local stores

Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogSupplementalApi;

CatalogSupplementalApi apiInstance = new CatalogSupplementalApi();
String catalogId = null; // String | Unique identifier of a catalog.
List<LocalStoreCreate> localStoreCreate = Arrays.asList(new LocalStoreCreate()); // List<LocalStoreCreate> | 
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    List<CatalogsLocalStoresCreate200ResponseInner> result = apiInstance.catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | [default to null]
 **localStoreCreate** | [**List&lt;LocalStoreCreate&gt;**](LocalStoreCreate.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**List&lt;CatalogsLocalStoresCreate200ResponseInner&gt;**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogsLocalStoresDelete

> List&lt;CatalogsLocalStoresDelete200ResponseInner&gt; catalogsLocalStoresDelete(catalogId, ids, adAccountId)

Delete local stores

  Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogSupplementalApi;

CatalogSupplementalApi apiInstance = new CatalogSupplementalApi();
String catalogId = null; // String | Unique identifier of a catalog.
List<String> ids = null; // List<String> | List of local store IDs to filter by.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    List<CatalogsLocalStoresDelete200ResponseInner> result = apiInstance.catalogsLocalStoresDelete(catalogId, ids, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | [default to null]
 **ids** | [**List&lt;String&gt;**](String.md)| List of local store IDs to filter by. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**List&lt;CatalogsLocalStoresDelete200ResponseInner&gt;**](CatalogsLocalStoresDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsLocalStoresList

> CatalogsLocalStoresList200Response catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize)

List local stores

Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogSupplementalApi;

CatalogSupplementalApi apiInstance = new CatalogSupplementalApi();
String catalogId = null; // String | Unique identifier of a catalog.
List<String> ids = null; // List<String> | List of local store IDs to filter by.
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    CatalogsLocalStoresList200Response result = apiInstance.catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | [default to null]
 **ids** | [**List&lt;String&gt;**](String.md)| List of local store IDs to filter by. | [optional] [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsLocalStoresList200Response**](CatalogsLocalStoresList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsLocalStoresUpdate

> List&lt;CatalogsLocalStoresCreate200ResponseInner&gt; catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId)

Update local stores

  Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogSupplementalApi;

CatalogSupplementalApi apiInstance = new CatalogSupplementalApi();
String catalogId = null; // String | Unique identifier of a catalog.
List<LocalStoreBatchUpdate> localStoreBatchUpdate = Arrays.asList(new LocalStoreBatchUpdate()); // List<LocalStoreBatchUpdate> | 
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    List<CatalogsLocalStoresCreate200ResponseInner> result = apiInstance.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | [default to null]
 **localStoreBatchUpdate** | [**List&lt;LocalStoreBatchUpdate&gt;**](LocalStoreBatchUpdate.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**List&lt;CatalogsLocalStoresCreate200ResponseInner&gt;**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogsSupplementalItemsBatchGet

> SupplementalItemsBatchResponse catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId)

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogSupplementalApi;

CatalogSupplementalApi apiInstance = new CatalogSupplementalApi();
String catalogId = null; // String | Unique identifier of a catalog.
String batchId = null; // String | Unique identifier of an items batch operation.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    SupplementalItemsBatchResponse result = apiInstance.catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogSupplementalApi#catalogsSupplementalItemsBatchGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | [default to null]
 **batchId** | **String**| Unique identifier of an items batch operation. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

