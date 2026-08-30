# PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotionsCreate**](PromotionsApi.md#promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotionsCreateWithHttpInfo**](PromotionsApi.md#promotionsCreateWithHttpInfo) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotionsDelete**](PromotionsApi.md#promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotionsDeleteWithHttpInfo**](PromotionsApi.md#promotionsDeleteWithHttpInfo) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotionsGet**](PromotionsApi.md#promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotionsGetWithHttpInfo**](PromotionsApi.md#promotionsGetWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotionsList**](PromotionsApi.md#promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotionsListWithHttpInfo**](PromotionsApi.md#promotionsListWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotionsUpdate**](PromotionsApi.md#promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions
[**promotionsUpdateWithHttpInfo**](PromotionsApi.md#promotionsUpdateWithHttpInfo) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions



## promotionsCreate

> promotionsCreate(promotionsCreateRequest): ApiRequest[PromotionsResponse]

Create promotions

Create multiple new promotions.

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
    val apiInstance = PromotionsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val promotionCreate: Seq[PromotionCreate] =  // Seq[PromotionCreate] | 
    
    val request = apiInstance.promotionsCreate(adAccountId, promotionCreate)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PromotionsApi#promotionsCreate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PromotionsApi#promotionsCreate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **promotionCreate** | [**Seq[PromotionCreate]**](PromotionCreate.md)|  |

### Return type

ApiRequest[[**PromotionsResponse**](PromotionsResponse.md)]


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


## promotionsDelete

> promotionsDelete(promotionsDeleteRequest): ApiRequest[Promotion]

Delete promotion by id

Delete a promotion within Pinterest.

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
    val apiInstance = PromotionsApi("https://api.pinterest.com/v5")
    val promotionId: String = promotionId_example // String | Promotion ID

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.promotionsDelete(promotionId, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PromotionsApi#promotionsDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PromotionsApi#promotionsDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **String**| Promotion ID |
 **adAccountId** | **String**| Unique identifier of an ad account. |

### Return type

ApiRequest[[**Promotion**](Promotion.md)]


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


## promotionsGet

> promotionsGet(promotionsGetRequest): ApiRequest[Promotion]

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

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
    val apiInstance = PromotionsApi("https://api.pinterest.com/v5")
    val promotionId: String = promotionId_example // String | Promotion ID

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.promotionsGet(promotionId, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PromotionsApi#promotionsGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PromotionsApi#promotionsGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **String**| Promotion ID |
 **adAccountId** | **String**| Unique identifier of an ad account. |

### Return type

ApiRequest[[**Promotion**](Promotion.md)]


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


## promotionsList

> promotionsList(promotionsListRequest): ApiRequest[PromotionsList200Response]

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

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
    val apiInstance = PromotionsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

    val order: PaginationOrder =  // PaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    
    val request = apiInstance.promotionsList(adAccountId, bookmark, pageSize, order)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PromotionsApi#promotionsList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PromotionsApi#promotionsList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional]
 **order** | [**PaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]

### Return type

ApiRequest[[**PromotionsList200Response**](PromotionsList200Response.md)]


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


## promotionsUpdate

> promotionsUpdate(promotionsUpdateRequest): ApiRequest[PromotionsResponse]

Update promotions

Update multiple promotions.

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
    val apiInstance = PromotionsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val promotionBatchUpdate: Seq[PromotionBatchUpdate] =  // Seq[PromotionBatchUpdate] | 
    
    val request = apiInstance.promotionsUpdate(adAccountId, promotionBatchUpdate)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PromotionsApi#promotionsUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PromotionsApi#promotionsUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **promotionBatchUpdate** | [**Seq[PromotionBatchUpdate]**](PromotionBatchUpdate.md)|  |

### Return type

ApiRequest[[**PromotionsResponse**](PromotionsResponse.md)]


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

