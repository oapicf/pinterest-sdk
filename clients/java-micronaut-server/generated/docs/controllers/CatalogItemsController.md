# CatalogItemsController

All URIs are relative to `"/v5"`

The controller class is defined in **[CatalogItemsController.java](../../src/main/java/org/openapitools/controller/CatalogItemsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemsBatchGet**](#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**itemsBatchPost**](#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**itemsPost**](#itemsPost) | **POST** /catalogs/items | Get catalogs items (POST)

<a id="itemsBatchGet"></a>
# **itemsBatchGet**
```java
Mono<CatalogsItemsBatch> CatalogItemsController.itemsBatchGet(batchIdadAccountId)
```

Get item batch status

Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**batchId** | `String` | Id of a catalogs items batch to fetch |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**CatalogsItemsBatch**](../../docs/models/CatalogsItemsBatch.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`
* **client_credentials**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="itemsBatchPost"></a>
# **itemsBatchPost**
```java
Mono<CatalogsItemsBatch> CatalogItemsController.itemsBatchPost(catalogsItemsBatchPostRequestadAccountId)
```

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogsItemsBatchPostRequest** | [**CatalogsItemsBatchPostRequest**](../../docs/models/CatalogsItemsBatchPostRequest.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**CatalogsItemsBatch**](../../docs/models/CatalogsItemsBatch.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`, `catalogs:write`
* **client_credentials**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="itemsPost"></a>
# **itemsPost**
```java
Mono<ItemsPost200Response> CatalogItemsController.itemsPost(catalogsItemsRequestadAccountId)
```

Get catalogs items (POST)

Get the items of the catalog owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogsItemsRequest** | [**CatalogsItemsRequest**](../../docs/models/CatalogsItemsRequest.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**ItemsPost200Response**](../../docs/models/ItemsPost200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

