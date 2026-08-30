# CatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsLocalInventoryItemsBatchOperate**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsBatchOperate) | **Post** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogsLocalInventoryItemsPost**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsPost) | **Post** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogsLocalStoresCreate**](CatalogSupplementalApi.md#catalogsLocalStoresCreate) | **Post** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogsLocalStoresDelete**](CatalogSupplementalApi.md#catalogsLocalStoresDelete) | **Delete** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogsLocalStoresList**](CatalogSupplementalApi.md#catalogsLocalStoresList) | **Get** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogsLocalStoresUpdate**](CatalogSupplementalApi.md#catalogsLocalStoresUpdate) | **Patch** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogsSupplementalItemsBatchGet**](CatalogSupplementalApi.md#catalogsSupplementalItemsBatchGet) | **Get** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


<a name="catalogsLocalInventoryItemsBatchOperate"></a>
# **catalogsLocalInventoryItemsBatchOperate**
> SupplementalItemsBatchResponse catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId)

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogSupplementalApi()
val catalogId : kotlin.String = catalogId_example // kotlin.String | Unique identifier of a catalog.
val localInventoryItemsBatchCreate : LocalInventoryItemsBatchCreate =  // LocalInventoryItemsBatchCreate | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : SupplementalItemsBatchResponse = apiInstance.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogSupplementalApi#catalogsLocalInventoryItemsBatchOperate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogSupplementalApi#catalogsLocalInventoryItemsBatchOperate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **kotlin.String**| Unique identifier of a catalog. |
 **localInventoryItemsBatchCreate** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md)|  |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="catalogsLocalInventoryItemsPost"></a>
# **catalogsLocalInventoryItemsPost**
> LocalInventoryItemsGet catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId)

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogSupplementalApi()
val catalogId : kotlin.String = catalogId_example // kotlin.String | Unique identifier of a catalog.
val localInventoryItemsGetCreate : LocalInventoryItemsGetCreate =  // LocalInventoryItemsGetCreate | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : LocalInventoryItemsGet = apiInstance.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogSupplementalApi#catalogsLocalInventoryItemsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogSupplementalApi#catalogsLocalInventoryItemsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **kotlin.String**| Unique identifier of a catalog. |
 **localInventoryItemsGetCreate** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md)|  |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**LocalInventoryItemsGet**](LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="catalogsLocalStoresCreate"></a>
# **catalogsLocalStoresCreate**
> kotlin.collections.List&lt;CatalogsLocalStoresCreate200ResponseInner&gt; catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId)

Create local stores

Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogSupplementalApi()
val catalogId : kotlin.String = catalogId_example // kotlin.String | Unique identifier of a catalog.
val localStoreCreate : kotlin.collections.List<LocalStoreCreate> =  // kotlin.collections.List<LocalStoreCreate> | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : kotlin.collections.List<CatalogsLocalStoresCreate200ResponseInner> = apiInstance.catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogSupplementalApi#catalogsLocalStoresCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogSupplementalApi#catalogsLocalStoresCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **kotlin.String**| Unique identifier of a catalog. |
 **localStoreCreate** | [**kotlin.collections.List&lt;LocalStoreCreate&gt;**](LocalStoreCreate.md)|  |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**kotlin.collections.List&lt;CatalogsLocalStoresCreate200ResponseInner&gt;**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="catalogsLocalStoresDelete"></a>
# **catalogsLocalStoresDelete**
> kotlin.collections.List&lt;CatalogsLocalStoresDelete200ResponseInner&gt; catalogsLocalStoresDelete(catalogId, ids, adAccountId)

Delete local stores

  Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogSupplementalApi()
val catalogId : kotlin.String = catalogId_example // kotlin.String | Unique identifier of a catalog.
val ids : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of local store IDs to filter by.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : kotlin.collections.List<CatalogsLocalStoresDelete200ResponseInner> = apiInstance.catalogsLocalStoresDelete(catalogId, ids, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogSupplementalApi#catalogsLocalStoresDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogSupplementalApi#catalogsLocalStoresDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **kotlin.String**| Unique identifier of a catalog. |
 **ids** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of local store IDs to filter by. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**kotlin.collections.List&lt;CatalogsLocalStoresDelete200ResponseInner&gt;**](CatalogsLocalStoresDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="catalogsLocalStoresList"></a>
# **catalogsLocalStoresList**
> CatalogsLocalStoresList200Response catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize)

List local stores

Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogSupplementalApi()
val catalogId : kotlin.String = catalogId_example // kotlin.String | Unique identifier of a catalog.
val ids : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of local store IDs to filter by.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : CatalogsLocalStoresList200Response = apiInstance.catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogSupplementalApi#catalogsLocalStoresList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogSupplementalApi#catalogsLocalStoresList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **kotlin.String**| Unique identifier of a catalog. |
 **ids** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of local store IDs to filter by. | [optional]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsLocalStoresList200Response**](CatalogsLocalStoresList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="catalogsLocalStoresUpdate"></a>
# **catalogsLocalStoresUpdate**
> kotlin.collections.List&lt;CatalogsLocalStoresCreate200ResponseInner&gt; catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId)

Update local stores

  Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogSupplementalApi()
val catalogId : kotlin.String = catalogId_example // kotlin.String | Unique identifier of a catalog.
val localStoreBatchUpdate : kotlin.collections.List<LocalStoreBatchUpdate> =  // kotlin.collections.List<LocalStoreBatchUpdate> | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : kotlin.collections.List<CatalogsLocalStoresCreate200ResponseInner> = apiInstance.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogSupplementalApi#catalogsLocalStoresUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogSupplementalApi#catalogsLocalStoresUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **kotlin.String**| Unique identifier of a catalog. |
 **localStoreBatchUpdate** | [**kotlin.collections.List&lt;LocalStoreBatchUpdate&gt;**](LocalStoreBatchUpdate.md)|  |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**kotlin.collections.List&lt;CatalogsLocalStoresCreate200ResponseInner&gt;**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="catalogsSupplementalItemsBatchGet"></a>
# **catalogsSupplementalItemsBatchGet**
> SupplementalItemsBatchResponse catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId)

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogSupplementalApi()
val catalogId : kotlin.String = catalogId_example // kotlin.String | Unique identifier of a catalog.
val batchId : kotlin.String = batchId_example // kotlin.String | Unique identifier of an items batch operation.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : SupplementalItemsBatchResponse = apiInstance.catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogSupplementalApi#catalogsSupplementalItemsBatchGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogSupplementalApi#catalogsSupplementalItemsBatchGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **kotlin.String**| Unique identifier of a catalog. |
 **batchId** | **kotlin.String**| Unique identifier of an items batch operation. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

