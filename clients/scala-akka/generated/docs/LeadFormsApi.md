# LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](LeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormGetWithHttpInfo**](LeadFormsApi.md#leadFormGetWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](LeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormTestCreateWithHttpInfo**](LeadFormsApi.md#leadFormTestCreateWithHttpInfo) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsList**](LeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms
[**leadFormsListWithHttpInfo**](LeadFormsApi.md#leadFormsListWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms



## leadFormGet

> leadFormGet(leadFormGetRequest): ApiRequest[LeadFormResponse]

Get lead form by id

Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser&#39;s lead form will only contain results if you&#39;re a part of the Lead ads beta. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

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
    val apiInstance = LeadFormsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val leadFormId: String = 1234567890123 // String | Unique identifier of a lead form.
    
    val request = apiInstance.leadFormGet(adAccountId, leadFormId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling LeadFormsApi#leadFormGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling LeadFormsApi#leadFormGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **leadFormId** | **String**| Unique identifier of a lead form. |

### Return type

ApiRequest[[**LeadFormResponse**](LeadFormResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account lead forms parameters. |  -  |
| **404** | The lead form ID for the given ad account ID does not exist. |  -  |
| **0** | Unexpected error |  -  |


## leadFormTestCreate

> leadFormTestCreate(leadFormTestCreateRequest): ApiRequest[LeadFormTestResponse]

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

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
    val apiInstance = LeadFormsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val leadFormId: String = 1234567890123 // String | Unique identifier of a lead form.

    val leadFormTestRequest: LeadFormTestRequest =  // LeadFormTestRequest | Subscription to create.
    
    val request = apiInstance.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling LeadFormsApi#leadFormTestCreate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling LeadFormsApi#leadFormTestCreate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **leadFormId** | **String**| Unique identifier of a lead form. |
 **leadFormTestRequest** | [**LeadFormTestRequest**](LeadFormTestRequest.md)| Subscription to create. |

### Return type

ApiRequest[[**LeadFormTestResponse**](LeadFormTestResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **404** | Lead not found. |  -  |
| **0** | Unexpected error |  -  |


## leadFormsList

> leadFormsList(leadFormsListRequest): ApiRequest[LeadFormsList200Response]

Get lead forms

Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser&#39;s list of lead forms will only contain results if you&#39;re a part of the Lead ads beta.  If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

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
    val apiInstance = LeadFormsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.

    val order: String = ASCENDING // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items
    
    val request = apiInstance.leadFormsList(adAccountId, pageSize, order, bookmark)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling LeadFormsApi#leadFormsList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling LeadFormsApi#leadFormsList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]

### Return type

ApiRequest[[**LeadFormsList200Response**](LeadFormsList200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account lead forms parameters. |  -  |
| **0** | Unexpected error |  -  |

