# UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardsUserFollowsList**](UserAccountApi.md#boardsUserFollowsList) | **GET** /user_account/following/boards | List following boards
[**boardsUserFollowsListWithHttpInfo**](UserAccountApi.md#boardsUserFollowsListWithHttpInfo) | **GET** /user_account/following/boards | List following boards
[**followUserUpdate**](UserAccountApi.md#followUserUpdate) | **POST** /user_account/following/{username} | Follow user
[**followUserUpdateWithHttpInfo**](UserAccountApi.md#followUserUpdateWithHttpInfo) | **POST** /user_account/following/{username} | Follow user
[**followersList**](UserAccountApi.md#followersList) | **GET** /user_account/followers | List followers
[**followersListWithHttpInfo**](UserAccountApi.md#followersListWithHttpInfo) | **GET** /user_account/followers | List followers
[**linkedBusinessAccountsGet**](UserAccountApi.md#linkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses
[**linkedBusinessAccountsGetWithHttpInfo**](UserAccountApi.md#linkedBusinessAccountsGetWithHttpInfo) | **GET** /user_account/businesses | List linked businesses
[**unverifyWebsiteDelete**](UserAccountApi.md#unverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website
[**unverifyWebsiteDeleteWithHttpInfo**](UserAccountApi.md#unverifyWebsiteDeleteWithHttpInfo) | **DELETE** /user_account/websites | Unverify website
[**userAccountAnalytics**](UserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountAnalyticsWithHttpInfo**](UserAccountApi.md#userAccountAnalyticsWithHttpInfo) | **GET** /user_account/analytics | Get user account analytics
[**userAccountAnalyticsTopPins**](UserAccountApi.md#userAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**userAccountAnalyticsTopPinsWithHttpInfo**](UserAccountApi.md#userAccountAnalyticsTopPinsWithHttpInfo) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**userAccountAnalyticsTopVideoPins**](UserAccountApi.md#userAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**userAccountAnalyticsTopVideoPinsWithHttpInfo**](UserAccountApi.md#userAccountAnalyticsTopVideoPinsWithHttpInfo) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**userAccountFollowedInterests**](UserAccountApi.md#userAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests
[**userAccountFollowedInterestsWithHttpInfo**](UserAccountApi.md#userAccountFollowedInterestsWithHttpInfo) | **GET** /users/{username}/interests/follow | List following interests
[**userAccountGet**](UserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account
[**userAccountGetWithHttpInfo**](UserAccountApi.md#userAccountGetWithHttpInfo) | **GET** /user_account | Get user account
[**userFollowingGet**](UserAccountApi.md#userFollowingGet) | **GET** /user_account/following | List following
[**userFollowingGetWithHttpInfo**](UserAccountApi.md#userFollowingGetWithHttpInfo) | **GET** /user_account/following | List following
[**userWebsitesGet**](UserAccountApi.md#userWebsitesGet) | **GET** /user_account/websites | Get user websites
[**userWebsitesGetWithHttpInfo**](UserAccountApi.md#userWebsitesGetWithHttpInfo) | **GET** /user_account/websites | Get user websites
[**verifyWebsiteUpdate**](UserAccountApi.md#verifyWebsiteUpdate) | **POST** /user_account/websites | Verify website
[**verifyWebsiteUpdateWithHttpInfo**](UserAccountApi.md#verifyWebsiteUpdateWithHttpInfo) | **POST** /user_account/websites | Verify website
[**websiteVerificationGet**](UserAccountApi.md#websiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming
[**websiteVerificationGetWithHttpInfo**](UserAccountApi.md#websiteVerificationGetWithHttpInfo) | **GET** /user_account/websites/verification | Get user verification code for website claiming



## boardsUserFollowsList

> boardsUserFollowsList(boardsUserFollowsListRequest): ApiRequest[BoardsList200Response]

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val explicitFollowing: Boolean = true // Boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    
    val request = apiInstance.boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#boardsUserFollowsList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#boardsUserFollowsList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]
 **explicitFollowing** | **Boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional]

### Return type

ApiRequest[[**BoardsList200Response**](BoardsList200Response.md)]


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


## followUserUpdate

> followUserUpdate(followUserUpdateRequest): ApiRequest[FollowUser]

Follow user

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val username: String = username_example // String | A valid username

    val followUserCreate: FollowUserCreate =  // FollowUserCreate | 
    
    val request = apiInstance.followUserUpdate(username, followUserCreate)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#followUserUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#followUserUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| A valid username |
 **followUserCreate** | [**FollowUserCreate**](FollowUserCreate.md)|  |

### Return type

ApiRequest[[**FollowUser**](FollowUser.md)]


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


## followersList

> followersList(followersListRequest): ApiRequest[FollowersList200Response]

List followers

Get a list of your followers.

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    
    val request = apiInstance.followersList(bookmark, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#followersList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#followersList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional]

### Return type

ApiRequest[[**FollowersList200Response**](FollowersList200Response.md)]


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


## linkedBusinessAccountsGet

> linkedBusinessAccountsGet(): ApiRequest[Seq[LinkedBusiness]]

List linked businesses

Get a list of your linked business accounts.

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")    
    val request = apiInstance.linkedBusinessAccountsGet()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#linkedBusinessAccountsGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#linkedBusinessAccountsGet")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**Seq[LinkedBusiness]**](LinkedBusiness.md)]


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


## unverifyWebsiteDelete

> unverifyWebsiteDelete(unverifyWebsiteDeleteRequest): ApiRequest[UserWebsite]

Unverify website

Unverify a website verified by the signed-in user.

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val website: String = website_example // String | Website with path or domain only
    
    val request = apiInstance.unverifyWebsiteDelete(website)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#unverifyWebsiteDelete")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#unverifyWebsiteDelete")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **String**| Website with path or domain only |

### Return type

ApiRequest[[**UserWebsite**](UserWebsite.md)]


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


## userAccountAnalytics

> userAccountAnalytics(userAccountAnalyticsRequest): ApiRequest[Map[String, AnalyticsMetricsResponse]]

Get user account analytics

Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val startDate: LocalDate = 2013-10-20 // LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.

    val endDate: LocalDate = 2013-10-20 // LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.

    val fromClaimedContent: String = fromClaimedContent_example // String | Filter on Pins that match your claimed domain.

    val pinFormat: String = pinFormat_example // String | Pin formats to get data for, default is all.

    val appTypes: String = appTypes_example // String | Apps or devices to get data for, default is all.

    val contentType: String = contentType_example // String | Filter to paid or organic data. Default is all.

    val source: String = source_example // String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts

    val metricTypes: Seq[QuerymetrictypesItems] =  // Seq[QuerymetrictypesItems] | Metric types to get data for, default is all.

    val splitField: String = splitField_example // String | How to split the data into groups. Not including this param means data won't be split.

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#userAccountAnalytics")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#userAccountAnalytics")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **fromClaimedContent** | **String**| Filter on Pins that match your claimed domain. | [optional] [enum: OTHER, CLAIMED, BOTH]
 **pinFormat** | **String**| Pin formats to get data for, default is all. | [optional] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA]
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [enum: ALL, MOBILE, TABLET, WEB]
 **contentType** | **String**| Filter to paid or organic data. Default is all. | [optional] [enum: ALL, PAID, ORGANIC]
 **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [enum: ALL, YOUR_PINS, OTHER_PINS]
 **metricTypes** | [**Seq[QuerymetrictypesItems]**](QuerymetrictypesItems.md)| Metric types to get data for, default is all. | [optional]
 **splitField** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [enum: NO_SPLIT, APP_TYPE, OWNED_CONTENT, SOURCE, PIN_FORMAT]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**Map[String, AnalyticsMetricsResponse]**](AnalyticsMetricsResponse.md)]


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


## userAccountAnalyticsTopPins

> userAccountAnalyticsTopPins(userAccountAnalyticsTopPinsRequest): ApiRequest[TopPinsAnalyticsResponse]

Get user account top pins analytics

Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example

```scala
// Import classes:
import 
import 
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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val startDate: LocalDate = 2013-10-20 // LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.

    val endDate: LocalDate = 2013-10-20 // LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.

    val sortBy: TopPinsSortBy =  // TopPinsSortBy | Specify sorting order for metrics

    val fromClaimedContent: String = fromClaimedContent_example // String | Filter on Pins that match your claimed domain.

    val pinFormat: String = pinFormat_example // String | Pin formats to get data for, default is all.

    val appTypes: String = appTypes_example // String | Apps or devices to get data for, default is all.

    val contentType: String = contentType_example // String | Filter to paid or organic data. Default is all.

    val source: String = source_example // String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts

    val metricTypes: Seq[QuerymetrictypesItems] =  // Seq[QuerymetrictypesItems] | Metric types to get data for, default is all.

    val numOfPins: Int = 56 // Int | Number of pins to include, default is 10. Max is 50.

    val createdInLastNDays: BigDecimal = 8.14 // BigDecimal | Get metrics for pins created in the last \"n\" days.

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#userAccountAnalyticsTopPins")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#userAccountAnalyticsTopPins")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **sortBy** | [**TopPinsSortBy**](.md)| Specify sorting order for metrics | [enum: ENGAGEMENT, SAVE, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK]
 **fromClaimedContent** | **String**| Filter on Pins that match your claimed domain. | [optional] [enum: OTHER, CLAIMED, BOTH]
 **pinFormat** | **String**| Pin formats to get data for, default is all. | [optional] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA]
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [enum: ALL, MOBILE, TABLET, WEB]
 **contentType** | **String**| Filter to paid or organic data. Default is all. | [optional] [enum: ALL, PAID, ORGANIC]
 **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [enum: ALL, YOUR_PINS, OTHER_PINS]
 **metricTypes** | [**Seq[QuerymetrictypesItems]**](QuerymetrictypesItems.md)| Metric types to get data for, default is all. | [optional]
 **numOfPins** | **Int**| Number of pins to include, default is 10. Max is 50. | [optional]
 **createdInLastNDays** | **BigDecimal**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [enum: 30]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)]


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


## userAccountAnalyticsTopVideoPins

> userAccountAnalyticsTopVideoPins(userAccountAnalyticsTopVideoPinsRequest): ApiRequest[TopVideoPinsAnalyticsResponse]

Get user account top video pins analytics

Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example

```scala
// Import classes:
import 
import 
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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val startDate: LocalDate = 2013-10-20 // LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.

    val endDate: LocalDate = 2013-10-20 // LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.

    val sortBy: TopVideoPinsSortBy =  // TopVideoPinsSortBy | Specify sorting order for video metrics

    val fromClaimedContent: String = fromClaimedContent_example // String | Filter on Pins that match your claimed domain.

    val pinFormat: String = pinFormat_example // String | Pin formats to get data for, default is all.

    val appTypes: String = appTypes_example // String | Apps or devices to get data for, default is all.

    val contentType: String = contentType_example // String | Filter to paid or organic data. Default is all.

    val source: String = source_example // String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts

    val metricTypes: Seq[QueryvideopinmetrictypesItems] =  // Seq[QueryvideopinmetrictypesItems] | Metric types to get video data for, default is all.

    val numOfPins: Int = 56 // Int | Number of pins to include, default is 10. Max is 50.

    val createdInLastNDays: BigDecimal = 8.14 // BigDecimal | Get metrics for pins created in the last \"n\" days.

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#userAccountAnalyticsTopVideoPins")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#userAccountAnalyticsTopVideoPins")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **sortBy** | [**TopVideoPinsSortBy**](.md)| Specify sorting order for video metrics | [enum: SAVE, IMPRESSION, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START]
 **fromClaimedContent** | **String**| Filter on Pins that match your claimed domain. | [optional] [enum: OTHER, CLAIMED, BOTH]
 **pinFormat** | **String**| Pin formats to get data for, default is all. | [optional] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA]
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [enum: ALL, MOBILE, TABLET, WEB]
 **contentType** | **String**| Filter to paid or organic data. Default is all. | [optional] [enum: ALL, PAID, ORGANIC]
 **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [enum: ALL, YOUR_PINS, OTHER_PINS]
 **metricTypes** | [**Seq[QueryvideopinmetrictypesItems]**](QueryvideopinmetrictypesItems.md)| Metric types to get video data for, default is all. | [optional]
 **numOfPins** | **Int**| Number of pins to include, default is 10. Max is 50. | [optional]
 **createdInLastNDays** | **BigDecimal**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [enum: 30]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)]


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


## userAccountFollowedInterests

> userAccountFollowedInterests(userAccountFollowedInterestsRequest): ApiRequest[UserAccountFollowedInterests200Response]

List following interests

Get a list of a user&#39;s following interests in one place.

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val username: String = username_example // String | A valid username

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    
    val request = apiInstance.userAccountFollowedInterests(username, bookmark, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#userAccountFollowedInterests")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#userAccountFollowedInterests")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| A valid username |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional]

### Return type

ApiRequest[[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The server could not understand the request due to invalid syntax. |  -  |
| **401** | Access is unauthorized. |  -  |
| **404** | The server cannot find the requested resource. |  -  |
| **0** | Unexpected error |  -  |


## userAccountGet

> userAccountGet(userAccountGetRequest): ApiRequest[Account]

Get user account

Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \&quot;Understanding Business Access\&quot; If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access] for more information.

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.userAccountGet(adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#userAccountGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#userAccountGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**Account**](Account.md)]


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


## userFollowingGet

> userFollowingGet(userFollowingGetRequest): ApiRequest[FollowersList200Response]

List following

Get a list of who a certain user follows.

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val explicitFollowing: Boolean = true // Boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.

    val feedType: UserFollowingFeedType =  // UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    
    val request = apiInstance.userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#userFollowingGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#userFollowingGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]
 **explicitFollowing** | **Boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional]
 **feedType** | [**UserFollowingFeedType**](.md)| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] [enum: ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional]

### Return type

ApiRequest[[**FollowersList200Response**](FollowersList200Response.md)]


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


## userWebsitesGet

> userWebsitesGet(userWebsitesGetRequest): ApiRequest[UserWebsitesGet200Response]

Get user websites

Get user websites, claimed or not

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    
    val request = apiInstance.userWebsitesGet(bookmark, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#userWebsitesGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#userWebsitesGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional]

### Return type

ApiRequest[[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md)]


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


## verifyWebsiteUpdate

> verifyWebsiteUpdate(verifyWebsiteUpdateRequest): ApiRequest[UserWebsite]

Verify website

Verify a website as a signed-in user.

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val userWebsiteCreate: UserWebsiteCreate =  // UserWebsiteCreate | 

    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.verifyWebsiteUpdate(userWebsiteCreate, adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#verifyWebsiteUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#verifyWebsiteUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userWebsiteCreate** | [**UserWebsiteCreate**](UserWebsiteCreate.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**UserWebsite**](UserWebsite.md)]


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


## websiteVerificationGet

> websiteVerificationGet(websiteVerificationGetRequest): ApiRequest[UserWebsiteVerification]

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

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
    val apiInstance = UserAccountApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.websiteVerificationGet(adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UserAccountApi#websiteVerificationGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UserAccountApi#websiteVerificationGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

ApiRequest[[**UserWebsiteVerification**](UserWebsiteVerification.md)]


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

