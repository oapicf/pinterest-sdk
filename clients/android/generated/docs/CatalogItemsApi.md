# CatalogItemsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemsBatchGet**](CatalogItemsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**itemsBatchPost**](CatalogItemsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**itemsPost**](CatalogItemsApi.md#itemsPost) | **POST** /catalogs/items | Get catalogs items (POST)



## itemsBatchGet

> CatalogsItemsBatch itemsBatchGet(batchId, adAccountId)

Get item batch status

Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogItemsApi;

CatalogItemsApi apiInstance = new CatalogItemsApi();
String batchId = null; // String | Id of a catalogs items batch to fetch
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    CatalogsItemsBatch result = apiInstance.itemsBatchGet(batchId, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogItemsApi#itemsBatchGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| Id of a catalogs items batch to fetch | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemsBatchPost

> CatalogsItemsBatch itemsBatchPost(catalogsItemsBatchPostRequest, adAccountId)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogItemsApi;

CatalogItemsApi apiInstance = new CatalogItemsApi();
CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest = new CatalogsItemsBatchPostRequest(); // CatalogsItemsBatchPostRequest | 
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    CatalogsItemsBatch result = apiInstance.itemsBatchPost(catalogsItemsBatchPostRequest, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogItemsApi#itemsBatchPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsBatchPostRequest** | [**CatalogsItemsBatchPostRequest**](CatalogsItemsBatchPostRequest.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## itemsPost

> ItemsPost200Response itemsPost(catalogsItemsRequest, adAccountId)

Get catalogs items (POST)

Get the items of the catalog owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogItemsApi;

CatalogItemsApi apiInstance = new CatalogItemsApi();
CatalogsItemsRequest catalogsItemsRequest = new CatalogsItemsRequest(); // CatalogsItemsRequest | 
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    ItemsPost200Response result = apiInstance.itemsPost(catalogsItemsRequest, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogItemsApi#itemsPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsRequest** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**ItemsPost200Response**](ItemsPost200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

