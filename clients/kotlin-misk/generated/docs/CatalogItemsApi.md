# CatalogItemsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemsBatchGet**](CatalogItemsApi.md#itemsBatchGet) | **Get** /catalogs/items/batch/{batch_id} | Get item batch status
[**itemsBatchPost**](CatalogItemsApi.md#itemsBatchPost) | **Post** /catalogs/items/batch | Operate on item batch
[**itemsPost**](CatalogItemsApi.md#itemsPost) | **Post** /catalogs/items | Get catalogs items (POST)


<a name="itemsBatchGet"></a>
# **itemsBatchGet**
> CatalogsItemsBatch itemsBatchGet(batchId, adAccountId)

Get item batch status

Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogItemsApi()
val batchId : kotlin.String = batchId_example // kotlin.String | Id of a catalogs items batch to fetch
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsItemsBatch = apiInstance.itemsBatchGet(batchId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogItemsApi#itemsBatchGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogItemsApi#itemsBatchGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.String**| Id of a catalogs items batch to fetch |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="itemsBatchPost"></a>
# **itemsBatchPost**
> CatalogsItemsBatch itemsBatchPost(catalogsItemsBatchPostRequest, adAccountId)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogItemsApi()
val catalogsItemsBatchPostRequest : CatalogsItemsBatchPostRequest =  // CatalogsItemsBatchPostRequest | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsItemsBatch = apiInstance.itemsBatchPost(catalogsItemsBatchPostRequest, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogItemsApi#itemsBatchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogItemsApi#itemsBatchPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsBatchPostRequest** | [**CatalogsItemsBatchPostRequest**](CatalogsItemsBatchPostRequest.md)|  |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="itemsPost"></a>
# **itemsPost**
> ItemsPost200Response itemsPost(catalogsItemsRequest, adAccountId)

Get catalogs items (POST)

Get the items of the catalog owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogItemsApi()
val catalogsItemsRequest : CatalogsItemsRequest =  // CatalogsItemsRequest | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : ItemsPost200Response = apiInstance.itemsPost(catalogsItemsRequest, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogItemsApi#itemsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogItemsApi#itemsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsRequest** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md)|  |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**ItemsPost200Response**](ItemsPost200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

