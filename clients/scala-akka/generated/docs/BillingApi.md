# BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsCreditRedeem**](BillingApi.md#adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditRedeemWithHttpInfo**](BillingApi.md#adsCreditRedeemWithHttpInfo) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditsDiscountsGet**](BillingApi.md#adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**adsCreditsDiscountsGetWithHttpInfo**](BillingApi.md#adsCreditsDiscountsGetWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billingProfilesGet**](BillingApi.md#billingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**billingProfilesGetWithHttpInfo**](BillingApi.md#billingProfilesGetWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssioAccountsGet**](BillingApi.md#ssioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssioAccountsGetWithHttpInfo**](BillingApi.md#ssioAccountsGetWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssioInsertionOrderCreate**](BillingApi.md#ssioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssioInsertionOrderCreateWithHttpInfo**](BillingApi.md#ssioInsertionOrderCreateWithHttpInfo) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssioInsertionOrderEdit**](BillingApi.md#ssioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssioInsertionOrderEditWithHttpInfo**](BillingApi.md#ssioInsertionOrderEditWithHttpInfo) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssioInsertionOrdersStatusGetByAdAccount**](BillingApi.md#ssioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo**](BillingApi.md#ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssioInsertionOrdersStatusGetByPinOrderId**](BillingApi.md#ssioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo**](BillingApi.md#ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssioOrderLinesGetByAdAccount**](BillingApi.md#ssioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.
[**ssioOrderLinesGetByAdAccountWithHttpInfo**](BillingApi.md#ssioOrderLinesGetByAdAccountWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.



## adsCreditRedeem

> adsCreditRedeem(adsCreditRedeemRequest): ApiRequest[AdsCreditRedeemResponse]

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

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
    val apiInstance = BillingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val adsCreditRedeemRequest: AdsCreditRedeemRequest =  // AdsCreditRedeemRequest | Redeem ad credits request.
    
    val request = apiInstance.adsCreditRedeem(adAccountId, adsCreditRedeemRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BillingApi#adsCreditRedeem")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BillingApi#adsCreditRedeem")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **adsCreditRedeemRequest** | [**AdsCreditRedeemRequest**](AdsCreditRedeemRequest.md)| Redeem ad credits request. |

### Return type

ApiRequest[[**AdsCreditRedeemResponse**](AdsCreditRedeemResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully redeemed ad credits. |  -  |
| **400** | Error thrown when unable to redeem offer code. |  -  |
| **0** | Unexpected error |  -  |


## adsCreditsDiscountsGet

> adsCreditsDiscountsGet(adsCreditsDiscountsGetRequest): ApiRequest[AdsCreditsDiscountsGet200Response]

Get ads credit discounts

Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

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
    val apiInstance = BillingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
    
    val request = apiInstance.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BillingApi#adsCreditsDiscountsGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BillingApi#adsCreditsDiscountsGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]

### Return type

ApiRequest[[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error. |  -  |


## billingProfilesGet

> billingProfilesGet(billingProfilesGetRequest): ApiRequest[BillingProfilesGet200Response]

Get billing profiles

Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

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
    val apiInstance = BillingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val isActive: Boolean = true // Boolean | Return active billing profiles, if false return all billing profiles.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
    
    val request = apiInstance.billingProfilesGet(adAccountId, isActive, bookmark, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BillingApi#billingProfilesGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BillingApi#billingProfilesGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **isActive** | **Boolean**| Return active billing profiles, if false return all billing profiles. |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]

### Return type

ApiRequest[[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error. |  -  |


## ssioAccountsGet

> ssioAccountsGet(ssioAccountsGetRequest): ApiRequest[SSIOAccountResponse]

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

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
    val apiInstance = BillingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.
    
    val request = apiInstance.ssioAccountsGet(adAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BillingApi#ssioAccountsGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BillingApi#ssioAccountsGet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |

### Return type

ApiRequest[[**SSIOAccountResponse**](SSIOAccountResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request parameter. |  -  |
| **0** | Unexpected error |  -  |


## ssioInsertionOrderCreate

> ssioInsertionOrderCreate(ssioInsertionOrderCreateRequest): ApiRequest[SSIOCreateInsertionOrderResponse]

Create insertion order through SSIO.

Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

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
    val apiInstance = BillingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest =  // SSIOCreateInsertionOrderRequest | Order line to create.
    
    val request = apiInstance.ssioInsertionOrderCreate(adAccountId, sSIOCreateInsertionOrderRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BillingApi#ssioInsertionOrderCreate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BillingApi#ssioInsertionOrderCreate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **sSIOCreateInsertionOrderRequest** | [**SSIOCreateInsertionOrderRequest**](SSIOCreateInsertionOrderRequest.md)| Order line to create. |

### Return type

ApiRequest[[**SSIOCreateInsertionOrderResponse**](SSIOCreateInsertionOrderResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request. |  -  |
| **0** | Unexpected error |  -  |


## ssioInsertionOrderEdit

> ssioInsertionOrderEdit(ssioInsertionOrderEditRequest): ApiRequest[SSIOEditInsertionOrderResponse]

Edit insertion order through SSIO.

Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

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
    val apiInstance = BillingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest =  // SSIOEditInsertionOrderRequest | Order line to create.
    
    val request = apiInstance.ssioInsertionOrderEdit(adAccountId, sSIOEditInsertionOrderRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BillingApi#ssioInsertionOrderEdit")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BillingApi#ssioInsertionOrderEdit")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **sSIOEditInsertionOrderRequest** | [**SSIOEditInsertionOrderRequest**](SSIOEditInsertionOrderRequest.md)| Order line to create. |

### Return type

ApiRequest[[**SSIOEditInsertionOrderResponse**](SSIOEditInsertionOrderResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request. |  -  |
| **0** | Unexpected error |  -  |


## ssioInsertionOrdersStatusGetByAdAccount

> ssioInsertionOrdersStatusGetByAdAccount(ssioInsertionOrdersStatusGetByAdAccountRequest): ApiRequest[SsioInsertionOrdersStatusGetByAdAccount200Response]

Get insertion order status by ad account id.

Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

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
    val apiInstance = BillingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
    
    val request = apiInstance.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BillingApi#ssioInsertionOrdersStatusGetByAdAccount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BillingApi#ssioInsertionOrdersStatusGetByAdAccount")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]

### Return type

ApiRequest[[**SsioInsertionOrdersStatusGetByAdAccount200Response**](SsioInsertionOrdersStatusGetByAdAccount200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request parameter. |  -  |
| **0** | Unexpected error |  -  |


## ssioInsertionOrdersStatusGetByPinOrderId

> ssioInsertionOrdersStatusGetByPinOrderId(ssioInsertionOrdersStatusGetByPinOrderIdRequest): ApiRequest[SSIOInsertionOrderStatusResponse]

Get insertion order status by pin order id.

Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

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
    val apiInstance = BillingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val pinOrderId: String = 0Q01N0000015hekSVDFDC // String | The pin order id associated with the ssio insertion order
    
    val request = apiInstance.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BillingApi#ssioInsertionOrdersStatusGetByPinOrderId")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BillingApi#ssioInsertionOrdersStatusGetByPinOrderId")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **pinOrderId** | **String**| The pin order id associated with the ssio insertion order |

### Return type

ApiRequest[[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request parameter. |  -  |
| **0** | Unexpected error |  -  |


## ssioOrderLinesGetByAdAccount

> ssioOrderLinesGetByAdAccount(ssioOrderLinesGetByAdAccountRequest): ApiRequest[SsioOrderLinesGetByAdAccount200Response]

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

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
    val apiInstance = BillingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.

    val pinOrderId: String = 0Q01N0000015hekSVDFDC // String | The pin order id associated with the ssio insertino order
    
    val request = apiInstance.ssioOrderLinesGetByAdAccount(adAccountId, bookmark, pageSize, pinOrderId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BillingApi#ssioOrderLinesGetByAdAccount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BillingApi#ssioOrderLinesGetByAdAccount")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]
 **pinOrderId** | **String**| The pin order id associated with the ssio insertino order | [optional]

### Return type

ApiRequest[[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request parameter. |  -  |
| **0** | Unexpected error |  -  |

