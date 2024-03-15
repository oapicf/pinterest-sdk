# TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsOfServiceGet**](TermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
[**termsOfServiceGetWithHttpInfo**](TermsOfServiceApi.md#termsOfServiceGetWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service



## termsOfServiceGet

> termsOfServiceGet(termsOfServiceGetRequest): ApiRequest[TermsOfService]

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

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
    val apiInstance = TermsOfServiceApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val includeHtml: Boolean = true // Boolean | Return HTML in TOS text.

    val tosType: String = tosType_example // String | Request type.
    
    val request = apiInstance.termsOfServiceGet(adAccountId, includeHtml, tosType)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling TermsOfServiceApi#termsOfServiceGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling TermsOfServiceApi#termsOfServiceGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **includeHtml** | **Boolean**| Return HTML in TOS text. | [optional]
 **tosType** | **String**| Request type. | [optional]

### Return type

ApiRequest[[**TermsOfService**](TermsOfService.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

