# CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListUploadsCreate**](CustomerListUploadsApi.md#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customerListUploadsCreateWithHttpInfo**](CustomerListUploadsApi.md#customerListUploadsCreateWithHttpInfo) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customerListUploadsGet**](CustomerListUploadsApi.md#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customerListUploadsGetWithHttpInfo**](CustomerListUploadsApi.md#customerListUploadsGetWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customerListUploadsRun**](CustomerListUploadsApi.md#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload
[**customerListUploadsRunWithHttpInfo**](CustomerListUploadsApi.md#customerListUploadsRunWithHttpInfo) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload



## customerListUploadsCreate

> customerListUploadsCreate(customerListUploadsCreateRequest): ApiRequest[CustomerListUploadCreateResponse]

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

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
    val apiInstance = CustomerListUploadsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | 

    val customerListId: String = customerListId_example // String | Customer list ID.

    val customerListUploadCreateRequest: CustomerListUploadCreateRequest =  // CustomerListUploadCreateRequest | 
    
    val request = apiInstance.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerListUploadsApi#customerListUploadsCreate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerListUploadsApi#customerListUploadsCreate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  |
 **customerListId** | **String**| Customer list ID. |
 **customerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)|  |

### Return type

ApiRequest[[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)]


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


## customerListUploadsGet

> customerListUploadsGet(customerListUploadsGetRequest): ApiRequest[CustomerListUpload]

Get customer list upload

Get the metadata for a given upload by its ID.

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
    val apiInstance = CustomerListUploadsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | 

    val customerListId: String = customerListId_example // String | Customer list ID.

    val customerListUploadId: String = customerListUploadId_example // String | Customer List Upload ID.
    
    val request = apiInstance.customerListUploadsGet(adAccountId, customerListId, customerListUploadId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerListUploadsApi#customerListUploadsGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerListUploadsApi#customerListUploadsGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  |
 **customerListId** | **String**| Customer list ID. |
 **customerListUploadId** | **String**| Customer List Upload ID. |

### Return type

ApiRequest[[**CustomerListUpload**](CustomerListUpload.md)]


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


## customerListUploadsRun

> customerListUploadsRun(customerListUploadsRunRequest): ApiRequest[CustomerListUpload]

Run customer list upload

Begin processing a customer list upload.

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
    val apiInstance = CustomerListUploadsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | 

    val customerListId: String = customerListId_example // String | Customer list ID.

    val customerListUploadId: String = customerListUploadId_example // String | Customer List Upload ID.
    
    val request = apiInstance.customerListUploadsRun(adAccountId, customerListId, customerListUploadId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomerListUploadsApi#customerListUploadsRun")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomerListUploadsApi#customerListUploadsRun")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  |
 **customerListId** | **String**| Customer list ID. |
 **customerListUploadId** | **String**| Customer List Upload ID. |

### Return type

ApiRequest[[**CustomerListUpload**](CustomerListUpload.md)]


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

