# TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetingTemplateCreate**](TargetingTemplateApi.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targetingTemplateCreateWithHttpInfo**](TargetingTemplateApi.md#targetingTemplateCreateWithHttpInfo) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targetingTemplateList**](TargetingTemplateApi.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targetingTemplateListWithHttpInfo**](TargetingTemplateApi.md#targetingTemplateListWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targetingTemplateUpdate**](TargetingTemplateApi.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates
[**targetingTemplateUpdateWithHttpInfo**](TargetingTemplateApi.md#targetingTemplateUpdateWithHttpInfo) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates



## targetingTemplateCreate

> targetingTemplateCreate(targetingTemplateCreateRequest): ApiRequest[TargetingTemplateGetResponseData]

Create targeting templates

&lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;

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
    val apiInstance = TargetingTemplateApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val targetingTemplateCreate: TargetingTemplateCreate =  // TargetingTemplateCreate | targeting template creation entity
    
    val request = apiInstance.targetingTemplateCreate(adAccountId, targetingTemplateCreate)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateCreate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateCreate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **targetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md)| targeting template creation entity |

### Return type

ApiRequest[[**TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |


## targetingTemplateList

> targetingTemplateList(targetingTemplateListRequest): ApiRequest[TargetingTemplateList200Response]

List targeting templates

Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;

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
    val apiInstance = TargetingTemplateApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val order: String = ASCENDING // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.

    val includeSizing: Boolean = true // Boolean | Include audience sizing in result or not

    val searchQuery: String = gaming // String | Search keyword for targeting templates

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items
    
    val request = apiInstance.targetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **includeSizing** | **Boolean**| Include audience sizing in result or not | [optional]
 **searchQuery** | **String**| Search keyword for targeting templates | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]

### Return type

ApiRequest[[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |


## targetingTemplateUpdate

> targetingTemplateUpdate(targetingTemplateUpdateRequest): ApiRequest[Unit]

Update targeting templates

&lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;

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
    val apiInstance = TargetingTemplateApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest =  // TargetingTemplateUpdateRequest | Operation type and targeting template ID
    
    val request = apiInstance.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **targetingTemplateUpdateRequest** | [**TargetingTemplateUpdateRequest**](TargetingTemplateUpdateRequest.md)| Operation type and targeting template ID |

### Return type


ApiRequest[Unit] (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

