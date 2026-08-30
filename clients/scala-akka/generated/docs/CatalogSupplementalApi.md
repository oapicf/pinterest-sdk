# CatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsLocalInventoryItemsBatchOperate**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsBatchOperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogsLocalInventoryItemsBatchOperateWithHttpInfo**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsBatchOperateWithHttpInfo) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogsLocalInventoryItemsPost**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsPost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogsLocalInventoryItemsPostWithHttpInfo**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsPostWithHttpInfo) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogsLocalStoresCreate**](CatalogSupplementalApi.md#catalogsLocalStoresCreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogsLocalStoresCreateWithHttpInfo**](CatalogSupplementalApi.md#catalogsLocalStoresCreateWithHttpInfo) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogsLocalStoresDelete**](CatalogSupplementalApi.md#catalogsLocalStoresDelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogsLocalStoresDeleteWithHttpInfo**](CatalogSupplementalApi.md#catalogsLocalStoresDeleteWithHttpInfo) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogsLocalStoresList**](CatalogSupplementalApi.md#catalogsLocalStoresList) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogsLocalStoresListWithHttpInfo**](CatalogSupplementalApi.md#catalogsLocalStoresListWithHttpInfo) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogsLocalStoresUpdate**](CatalogSupplementalApi.md#catalogsLocalStoresUpdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogsLocalStoresUpdateWithHttpInfo**](CatalogSupplementalApi.md#catalogsLocalStoresUpdateWithHttpInfo) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogsSupplementalItemsBatchGet**](CatalogSupplementalApi.md#catalogsSupplementalItemsBatchGet) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status
[**catalogsSupplementalItemsBatchGetWithHttpInfo**](CatalogSupplementalApi.md#catalogsSupplementalItemsBatchGetWithHttpInfo) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status



## catalogsLocalInventoryItemsBatchOperate

> catalogsLocalInventoryItemsBatchOperate(catalogsLocalInventoryItemsBatchOperateRequest): ApiRequest[SupplementalItemsBatchResponse]

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```scala
// Import classes:
import 
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    val apiInvoker = ApiInvoker()
    val apiInstance = CatalogSupplementalApi("https://api.pinterest.com/v5")
    val catalogId: String = catalogId_example // String | Unique identifier of a catalog.

    val localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate =  // LocalInventoryItemsBatchCreate | 

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalInventoryItemsBatchOperate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalInventoryItemsBatchOperate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. |
 **localInventoryItemsBatchCreate** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)]


### Authorization

No authorization required

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


## catalogsLocalInventoryItemsPost

> catalogsLocalInventoryItemsPost(catalogsLocalInventoryItemsPostRequest): ApiRequest[LocalInventoryItemsGet]

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    val apiInvoker = ApiInvoker()
    val apiInstance = CatalogSupplementalApi("https://api.pinterest.com/v5")
    val catalogId: String = catalogId_example // String | Unique identifier of a catalog.

    val localInventoryItemsGetCreate: LocalInventoryItemsGetCreate =  // LocalInventoryItemsGetCreate | 

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalInventoryItemsPost")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalInventoryItemsPost")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. |
 **localInventoryItemsGetCreate** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**LocalInventoryItemsGet**](LocalInventoryItemsGet.md)]


### Authorization

No authorization required

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


## catalogsLocalStoresCreate

> catalogsLocalStoresCreate(catalogsLocalStoresCreateRequest): ApiRequest[Seq[CatalogsLocalStoresCreate200ResponseInner]]

Create local stores

Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```scala
// Import classes:
import 
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    val apiInvoker = ApiInvoker()
    val apiInstance = CatalogSupplementalApi("https://api.pinterest.com/v5")
    val catalogId: String = catalogId_example // String | Unique identifier of a catalog.

    val localStoreCreate: Seq[LocalStoreCreate] =  // Seq[LocalStoreCreate] | 

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresCreate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresCreate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. |
 **localStoreCreate** | [**Seq[LocalStoreCreate]**](LocalStoreCreate.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**Seq[CatalogsLocalStoresCreate200ResponseInner]**](CatalogsLocalStoresCreate200ResponseInner.md)]


### Authorization

No authorization required

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


## catalogsLocalStoresDelete

> catalogsLocalStoresDelete(catalogsLocalStoresDeleteRequest): ApiRequest[Seq[CatalogsLocalStoresDelete200ResponseInner]]

Delete local stores

  Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    val apiInvoker = ApiInvoker()
    val apiInstance = CatalogSupplementalApi("https://api.pinterest.com/v5")
    val catalogId: String = catalogId_example // String | Unique identifier of a catalog.

    val ids: Seq[String] =  // Seq[String] | List of local store IDs to filter by.

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.catalogsLocalStoresDelete(catalogId, ids, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. |
 **ids** | [**Seq[String]**](String.md)| List of local store IDs to filter by. |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**Seq[CatalogsLocalStoresDelete200ResponseInner]**](CatalogsLocalStoresDelete200ResponseInner.md)]


### Authorization

No authorization required

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


## catalogsLocalStoresList

> catalogsLocalStoresList(catalogsLocalStoresListRequest): ApiRequest[CatalogsLocalStoresList200Response]

List local stores

Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    val apiInvoker = ApiInvoker()
    val apiInstance = CatalogSupplementalApi("https://api.pinterest.com/v5")
    val catalogId: String = catalogId_example // String | Unique identifier of a catalog.

    val ids: Seq[String] =  // Seq[String] | List of local store IDs to filter by.

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    
    val request = apiInstance.catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. |
 **ids** | [**Seq[String]**](String.md)| List of local store IDs to filter by. | [optional]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional]

### Return type

ApiRequest[[**CatalogsLocalStoresList200Response**](CatalogsLocalStoresList200Response.md)]


### Authorization

No authorization required

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


## catalogsLocalStoresUpdate

> catalogsLocalStoresUpdate(catalogsLocalStoresUpdateRequest): ApiRequest[Seq[CatalogsLocalStoresCreate200ResponseInner]]

Update local stores

  Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    val apiInvoker = ApiInvoker()
    val apiInstance = CatalogSupplementalApi("https://api.pinterest.com/v5")
    val catalogId: String = catalogId_example // String | Unique identifier of a catalog.

    val localStoreBatchUpdate: Seq[LocalStoreBatchUpdate] =  // Seq[LocalStoreBatchUpdate] | 

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsLocalStoresUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. |
 **localStoreBatchUpdate** | [**Seq[LocalStoreBatchUpdate]**](LocalStoreBatchUpdate.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**Seq[CatalogsLocalStoresCreate200ResponseInner]**](CatalogsLocalStoresCreate200ResponseInner.md)]


### Authorization

No authorization required

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


## catalogsSupplementalItemsBatchGet

> catalogsSupplementalItemsBatchGet(catalogsSupplementalItemsBatchGetRequest): ApiRequest[SupplementalItemsBatchResponse]

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    val apiInvoker = ApiInvoker()
    val apiInstance = CatalogSupplementalApi("https://api.pinterest.com/v5")
    val catalogId: String = catalogId_example // String | Unique identifier of a catalog.

    val batchId: String = batchId_example // String | Unique identifier of an items batch operation.

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsSupplementalItemsBatchGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CatalogSupplementalApi#catalogsSupplementalItemsBatchGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. |
 **batchId** | **String**| Unique identifier of an items batch operation. |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)]


### Authorization

No authorization required

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

