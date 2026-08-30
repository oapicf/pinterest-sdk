# CatalogItemsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemsBatchGet**](CatalogItemsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**itemsBatchGetWithHttpInfo**](CatalogItemsApi.md#itemsBatchGetWithHttpInfo) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**itemsBatchPost**](CatalogItemsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**itemsBatchPostWithHttpInfo**](CatalogItemsApi.md#itemsBatchPostWithHttpInfo) | **POST** /catalogs/items/batch | Operate on item batch
[**itemsPost**](CatalogItemsApi.md#itemsPost) | **POST** /catalogs/items | Get catalogs items (POST)
[**itemsPostWithHttpInfo**](CatalogItemsApi.md#itemsPostWithHttpInfo) | **POST** /catalogs/items | Get catalogs items (POST)



## itemsBatchGet

> itemsBatchGet(itemsBatchGetRequest): ApiRequest[CatalogsItemsBatch]

Get item batch status

Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    val apiInvoker = ApiInvoker()
    val apiInstance = CatalogItemsApi("https://api.pinterest.com/v5")
    val batchId: String = batchId_example // String | Id of a catalogs items batch to fetch

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.itemsBatchGet(batchId, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CatalogItemsApi#itemsBatchGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CatalogItemsApi#itemsBatchGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| Id of a catalogs items batch to fetch |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**CatalogsItemsBatch**](CatalogsItemsBatch.md)]


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


## itemsBatchPost

> itemsBatchPost(itemsBatchPostRequest): ApiRequest[CatalogsItemsBatch]

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    val apiInvoker = ApiInvoker()
    val apiInstance = CatalogItemsApi("https://api.pinterest.com/v5")
    val catalogsItemsBatchPostRequest: CatalogsItemsBatchPostRequest =  // CatalogsItemsBatchPostRequest | 

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.itemsBatchPost(catalogsItemsBatchPostRequest, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CatalogItemsApi#itemsBatchPost")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CatalogItemsApi#itemsBatchPost")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsBatchPostRequest** | [**CatalogsItemsBatchPostRequest**](CatalogsItemsBatchPostRequest.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**CatalogsItemsBatch**](CatalogsItemsBatch.md)]


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


## itemsPost

> itemsPost(itemsPostRequest): ApiRequest[ItemsPost200Response]

Get catalogs items (POST)

Get the items of the catalog owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    val apiInvoker = ApiInvoker()
    val apiInstance = CatalogItemsApi("https://api.pinterest.com/v5")
    val catalogsItemsRequest: CatalogsItemsRequest =  // CatalogsItemsRequest | 

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.itemsPost(catalogsItemsRequest, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CatalogItemsApi#itemsPost")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CatalogItemsApi#itemsPost")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsRequest** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**ItemsPost200Response**](ItemsPost200Response.md)]


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

