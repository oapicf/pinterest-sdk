# ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionEqsList**](ConversionEqsApi.md#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)
[**conversionEqsListWithHttpInfo**](ConversionEqsApi.md#conversionEqsListWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)



## conversionEqsList

> conversionEqsList(conversionEqsListRequest): ApiRequest[Seq[EventQualityScore]]

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example

```scala
// Import classes:
import 
import 
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
    val apiInstance = ConversionEqsApi("https://api.pinterest.com/v5")
    val lookbackPeriod: LookbackPeriodOptions =  // LookbackPeriodOptions | Lookback window (number of days).

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val sourcePlatform: SourcePlatformOptions =  // SourcePlatformOptions | Source platform of event.

    val ingestionSource: IngestionSourceOptions =  // IngestionSourceOptions | Ingestion source of event.
    
    val request = apiInstance.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ConversionEqsApi#conversionEqsList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ConversionEqsApi#conversionEqsList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookbackPeriod** | [**LookbackPeriodOptions**](.md)| Lookback window (number of days). | [enum: 1d, 14d]
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **sourcePlatform** | [**SourcePlatformOptions**](.md)| Source platform of event. | [optional] [enum: WEB, MOBILE, MOBILE_ANDROID, MOBILE_IOS, OFFLINE, PINTEREST_WEB, PINTEREST_ANDROID, PINTEREST_IOS, POINT_OF_SALE]
 **ingestionSource** | [**IngestionSourceOptions**](.md)| Ingestion source of event. | [optional] [enum: TAG, MMP, FILE_UPLOAD, CONVERSIONS_API, NATIVE]

### Return type

ApiRequest[[**Seq[EventQualityScore]**](EventQualityScore.md)]


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

