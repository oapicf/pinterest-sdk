# ProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productGroupPromotionsCreate**](ProductGroupPromotionsApi.md#productGroupPromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**productGroupPromotionsCreateWithHttpInfo**](ProductGroupPromotionsApi.md#productGroupPromotionsCreateWithHttpInfo) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**productGroupPromotionsGet**](ProductGroupPromotionsApi.md#productGroupPromotionsGet) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**productGroupPromotionsGetWithHttpInfo**](ProductGroupPromotionsApi.md#productGroupPromotionsGetWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**productGroupPromotionsList**](ProductGroupPromotionsApi.md#productGroupPromotionsList) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**productGroupPromotionsListWithHttpInfo**](ProductGroupPromotionsApi.md#productGroupPromotionsListWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**productGroupPromotionsUpdate**](ProductGroupPromotionsApi.md#productGroupPromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**productGroupPromotionsUpdateWithHttpInfo**](ProductGroupPromotionsApi.md#productGroupPromotionsUpdateWithHttpInfo) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**productGroupsAnalytics**](ProductGroupPromotionsApi.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
[**productGroupsAnalyticsWithHttpInfo**](ProductGroupPromotionsApi.md#productGroupsAnalyticsWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics



## productGroupPromotionsCreate

> productGroupPromotionsCreate(productGroupPromotionsCreateRequest): ApiRequest[ProductGroupPromotionResponse]

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)

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
    val apiInstance = ProductGroupPromotionsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest =  // ProductGroupPromotionCreateRequest | List of Product Group Promotions to create, size limit [1, 30].
    
    val request = apiInstance.productGroupPromotionsCreate(adAccountId, productGroupPromotionCreateRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProductGroupPromotionsApi#productGroupPromotionsCreate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProductGroupPromotionsApi#productGroupPromotionsCreate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **productGroupPromotionCreateRequest** | [**ProductGroupPromotionCreateRequest**](ProductGroupPromotionCreateRequest.md)| List of Product Group Promotions to create, size limit [1, 30]. |

### Return type

ApiRequest[[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |


## productGroupPromotionsGet

> productGroupPromotionsGet(productGroupPromotionsGetRequest): ApiRequest[ProductGroupPromotionResponse]

Get a product group promotion by id

Get a product group promotion by id

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
    val apiInstance = ProductGroupPromotionsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val productGroupPromotionId: String = productGroupPromotionId_example // String | Unique identifier of a product group promotion
    
    val request = apiInstance.productGroupPromotionsGet(adAccountId, productGroupPromotionId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProductGroupPromotionsApi#productGroupPromotionsGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProductGroupPromotionsApi#productGroupPromotionsGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **productGroupPromotionId** | **String**| Unique identifier of a product group promotion |

### Return type

ApiRequest[[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)]


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


## productGroupPromotionsList

> productGroupPromotionsList(productGroupPromotionsListRequest): ApiRequest[ProductGroupPromotionsList200Response]

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  &lt;b&gt;Note:&lt;/b&gt; ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

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
    val apiInstance = ProductGroupPromotionsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val productGroupPromotionIds: Seq[String] =  // Seq[String] | List of Product group promotion Ids.

    val entityStatuses: Seq[String] =  // Seq[String] | Entity status

    val adGroupId: String = 123123123 // String | Ad group Id.

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.

    val order: String = ASCENDING // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items
    
    val request = apiInstance.productGroupPromotionsList(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProductGroupPromotionsApi#productGroupPromotionsList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProductGroupPromotionsApi#productGroupPromotionsList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **productGroupPromotionIds** | [**Seq[String]**](String.md)| List of Product group promotion Ids. | [optional]
 **entityStatuses** | [**Seq[String]**](String.md)| Entity status | [optional] [enum: ACTIVE, PAUSED, ARCHIVED, DRAFT, DELETED_DRAFT]
 **adGroupId** | **String**| Ad group Id. | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]

### Return type

ApiRequest[[**ProductGroupPromotionsList200Response**](ProductGroupPromotionsList200Response.md)]


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


## productGroupPromotionsUpdate

> productGroupPromotionsUpdate(productGroupPromotionsUpdateRequest): ApiRequest[ProductGroupPromotionResponse]

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

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
    val apiInstance = ProductGroupPromotionsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest =  // ProductGroupPromotionUpdateRequest | Parameters to update Product group promotions
    
    val request = apiInstance.productGroupPromotionsUpdate(adAccountId, productGroupPromotionUpdateRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProductGroupPromotionsApi#productGroupPromotionsUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProductGroupPromotionsApi#productGroupPromotionsUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **productGroupPromotionUpdateRequest** | [**ProductGroupPromotionUpdateRequest**](ProductGroupPromotionUpdateRequest.md)| Parameters to update Product group promotions |

### Return type

ApiRequest[[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |


## productGroupsAnalytics

> productGroupsAnalytics(productGroupsAnalyticsRequest): ApiRequest[Seq[ProductGroupAnalyticsResponseInner]]

Get product group analytics

Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

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
    val apiInstance = ProductGroupPromotionsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val startDate: LocalDate = 2013-10-20 // LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.

    val endDate: LocalDate = 2013-10-20 // LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.

    val productGroupIds: Seq[String] =  // Seq[String] | List of Product group Ids to use to filter the results.

    val columns: Seq[String] =  // Seq[String] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned

    val granularity: Granularity = DAY // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly

    val clickWindowDays: Int = 1 // Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.

    val engagementWindowDays: Int = 56 // Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.

    val viewWindowDays: Int = 56 // Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.

    val conversionReportTime: String = TIME_OF_AD_ACTION // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    
    val request = apiInstance.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProductGroupPromotionsApi#productGroupsAnalytics")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProductGroupPromotionsApi#productGroupsAnalytics")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **startDate** | **LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **productGroupIds** | [**Seq[String]**](String.md)| List of Product group Ids to use to filter the results. |
 **columns** | [**Seq[String]**](String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [enum: SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE]
 **granularity** | [**Granularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH]
 **clickWindowDays** | **Int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [enum: 0, 1, 7, 14, 30, 60]
 **engagementWindowDays** | **Int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [enum: 0, 1, 7, 14, 30, 60]
 **viewWindowDays** | **Int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [enum: 0, 1, 7, 14, 30, 60]
 **conversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION]

### Return type

ApiRequest[[**Seq[ProductGroupAnalyticsResponseInner]**](ProductGroupAnalyticsResponseInner.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

