# PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAnalytics**](PinsApi.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsAnalyticsWithHttpInfo**](PinsApi.md#pinsAnalyticsWithHttpInfo) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](PinsApi.md#pinsCreate) | **POST** /pins | Create Pin
[**pinsCreateWithHttpInfo**](PinsApi.md#pinsCreateWithHttpInfo) | **POST** /pins | Create Pin
[**pinsDelete**](PinsApi.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsDeleteWithHttpInfo**](PinsApi.md#pinsDeleteWithHttpInfo) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](PinsApi.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin
[**pinsGetWithHttpInfo**](PinsApi.md#pinsGetWithHttpInfo) | **GET** /pins/{pin_id} | Get Pin
[**pinsList**](PinsApi.md#pinsList) | **GET** /pins | List Pins
[**pinsListWithHttpInfo**](PinsApi.md#pinsListWithHttpInfo) | **GET** /pins | List Pins
[**pinsSave**](PinsApi.md#pinsSave) | **POST** /pins/{pin_id}/save | Save Pin
[**pinsSaveWithHttpInfo**](PinsApi.md#pinsSaveWithHttpInfo) | **POST** /pins/{pin_id}/save | Save Pin
[**pinsUpdate**](PinsApi.md#pinsUpdate) | **PATCH** /pins/{pin_id} | Update Pin
[**pinsUpdateWithHttpInfo**](PinsApi.md#pinsUpdateWithHttpInfo) | **PATCH** /pins/{pin_id} | Update Pin



## pinsAnalytics

> pinsAnalytics(pinsAnalyticsRequest): ApiRequest[Map[String, PinAnalyticsMetricsResponse]]

Get Pin analytics

Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

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
    val apiInstance = PinsApi("https://api.pinterest.com/v5")
    val pinId: String = pinId_example // String | Unique identifier of a Pin.

    val startDate: LocalDate = 2013-10-20 // LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.

    val endDate: LocalDate = 2013-10-20 // LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.

    val metricTypes: Seq[PinsAnalyticsMetricTypesParameterInner] =  // Seq[PinsAnalyticsMetricTypesParameterInner] | Pin metric types to get data for, default is all.

    val appTypes: String = appTypes_example // String | Apps or devices to get data for, default is all.

    val splitField: String = splitField_example // String | How to split the data into groups. Not including this param means data won't be split.

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PinsApi#pinsAnalytics")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PinsApi#pinsAnalytics")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. |
 **startDate** | **LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **metricTypes** | [**Seq[PinsAnalyticsMetricTypesParameterInner]**](PinsAnalyticsMetricTypesParameterInner.md)| Pin metric types to get data for, default is all. |
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [enum: ALL, MOBILE, TABLET, WEB]
 **splitField** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [enum: NO_SPLIT, APP_TYPE]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**Map[String, PinAnalyticsMetricsResponse]**](PinAnalyticsMetricsResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **400** | Invalid pins analytics parameters. |  -  |
| **403** | Not authorized to access board or Pin. |  -  |
| **404** | Pin not found. |  -  |
| **0** | Unexpected error |  -  |


## pinsCreate

> pinsCreate(pinsCreateRequest): ApiRequest[Pin]

Create Pin

Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/content/content-creation/&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/content/content-creation/#Creating%20video%20Pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

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
    val apiInstance = PinsApi("https://api.pinterest.com/v5")
    val pinCreate: PinCreate =  // PinCreate | Create a new Pin.

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.pinsCreate(pinCreate, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PinsApi#pinsCreate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PinsApi#pinsCreate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinCreate** | [**PinCreate**](PinCreate.md)| Create a new Pin. |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**Pin**](Pin.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful pin creation. |  -  |
| **400** | Invalid Pin parameters response |  -  |
| **403** | The Pin&#39;s image is too small, too large or is broken |  -  |
| **404** | Board or section not found |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
| **0** | Unexpected error |  -  |


## pinsDelete

> pinsDelete(pinsDeleteRequest): ApiRequest[Unit]

Delete Pin

Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

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
    val apiInstance = PinsApi("https://api.pinterest.com/v5")
    val pinId: String = pinId_example // String | Unique identifier of a Pin.

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.pinsDelete(pinId, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PinsApi#pinsDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PinsApi#pinsDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type


ApiRequest[Unit] (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted Pin |  -  |
| **403** | Not authorized to access board or Pin. |  -  |
| **404** | Pin not found. |  -  |
| **0** | Unexpected error |  -  |


## pinsGet

> pinsGet(pinsGetRequest): ApiRequest[Pin]

Get Pin

Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

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
    val apiInstance = PinsApi("https://api.pinterest.com/v5")
    val pinId: String = pinId_example // String | Unique identifier of a Pin.

    val pinMetrics: Boolean = true // Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.pinsGet(pinId, pinMetrics, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PinsApi#pinsGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PinsApi#pinsGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. |
 **pinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**Pin**](Pin.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **403** | Not authorized to access board or Pin. |  -  |
| **404** | Pin not found. |  -  |
| **0** | Unexpected error |  -  |


## pinsList

> pinsList(pinsListRequest): ApiRequest[PinsList200Response]

List Pins

Get a list of the Pins owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

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
    val apiInstance = PinsApi("https://api.pinterest.com/v5")
    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.

    val pinFilter: String = pinFilter_example // String | Pin filter.

    val includeProtectedPins: Boolean = true // Boolean | Specify if return pins from protected boards

    val pinType: String = pinType_example // String | The type of pins to return, currently only enabled for private pins

    val creativeTypes: Seq[String] =  // Seq[String] | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val pinMetrics: Boolean = true // Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    
    val request = apiInstance.pinsList(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PinsApi#pinsList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PinsApi#pinsList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]
 **pinFilter** | **String**| Pin filter. | [optional] [enum: exclude_native, exclude_repins, has_been_promoted]
 **includeProtectedPins** | **Boolean**| Specify if return pins from protected boards | [optional]
 **pinType** | **String**| The type of pins to return, currently only enabled for private pins | [optional] [enum: PRIVATE]
 **creativeTypes** | [**Seq[String]**](String.md)| Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [enum: REGULAR, VIDEO, SHOPPING, CAROUSEL, MAX_VIDEO, SHOP_THE_PIN, COLLECTION, IDEA]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]
 **pinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional]

### Return type

ApiRequest[[**PinsList200Response**](PinsList200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid pin filter value |  -  |
| **0** | Unexpected error |  -  |


## pinsSave

> pinsSave(pinsSaveRequest): ApiRequest[Pin]

Save Pin

Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

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
    val apiInstance = PinsApi("https://api.pinterest.com/v5")
    val pinId: String = pinId_example // String | Unique identifier of a Pin.

    val pinsSaveRequest: PinsSaveRequest =  // PinsSaveRequest | Request object used to save an existing pin

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.pinsSave(pinId, pinsSaveRequest, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PinsApi#pinsSave")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PinsApi#pinsSave")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. |
 **pinsSaveRequest** | [**PinsSaveRequest**](PinsSaveRequest.md)| Request object used to save an existing pin |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**Pin**](Pin.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully saved pin. |  -  |
| **403** | Not authorized to access Board or Pin. |  -  |
| **404** | Board or Pin not found. |  -  |
| **0** | Unexpected error |  -  |


## pinsUpdate

> pinsUpdate(pinsUpdateRequest): ApiRequest[Pin]

Update Pin

Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

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
    val apiInstance = PinsApi("https://api.pinterest.com/v5")
    val pinId: String = pinId_example // String | Unique identifier of a Pin.

    val pinUpdate: PinUpdate =  // PinUpdate | 

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.pinsUpdate(pinId, pinUpdate, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling PinsApi#pinsUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling PinsApi#pinsUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. |
 **pinUpdate** | [**PinUpdate**](PinUpdate.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**Pin**](Pin.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **403** | Not authorized to update Pin. |  -  |
| **404** | Pin not found. |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
| **0** | Unexpected error |  -  |

