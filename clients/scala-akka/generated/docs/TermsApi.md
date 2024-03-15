# TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsRelatedList**](TermsApi.md#termsRelatedList) | **GET** /terms/related | List related terms
[**termsRelatedListWithHttpInfo**](TermsApi.md#termsRelatedListWithHttpInfo) | **GET** /terms/related | List related terms
[**termsSuggestedList**](TermsApi.md#termsSuggestedList) | **GET** /terms/suggested | List suggested terms
[**termsSuggestedListWithHttpInfo**](TermsApi.md#termsSuggestedListWithHttpInfo) | **GET** /terms/suggested | List suggested terms



## termsRelatedList

> termsRelatedList(termsRelatedListRequest): ApiRequest[RelatedTerms]

List related terms

Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.

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
    val apiInstance = TermsApi("https://api.pinterest.com/v5")
    val terms: Seq[String] =  // Seq[String] | List of input terms.
    
    val request = apiInstance.termsRelatedList(terms)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling TermsApi#termsRelatedList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling TermsApi#termsRelatedList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | [**Seq[String]**](String.md)| List of input terms. |

### Return type

ApiRequest[[**RelatedTerms**](RelatedTerms.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid terms related parameters. |  -  |
| **0** | Unexpected error |  -  |


## termsSuggestedList

> termsSuggestedList(termsSuggestedListRequest): ApiRequest[Seq[String]]

List suggested terms

Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.

### Example

```scala
// Import classes:
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
    val apiInstance = TermsApi("https://api.pinterest.com/v5")
    val term: String = sports // String | Input term.

    val limit: Int = 4 // Int | Max suggested terms to return.
    
    val request = apiInstance.termsSuggestedList(term, limit)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling TermsApi#termsSuggestedList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling TermsApi#termsSuggestedList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**| Input term. |
 **limit** | **Int**| Max suggested terms to return. | [optional]

### Return type

ApiRequest[**Seq[String]**]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid terms suggested parameters. |  -  |
| **0** | Unexpected error |  -  |

