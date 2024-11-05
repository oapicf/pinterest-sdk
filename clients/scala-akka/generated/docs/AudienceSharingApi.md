# AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsAudiencesSharedAccountsList**](AudienceSharingApi.md#adAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**adAccountsAudiencesSharedAccountsListWithHttpInfo**](AudienceSharingApi.md#adAccountsAudiencesSharedAccountsListWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**businessAccountAudiencesSharedAccountsList**](AudienceSharingApi.md#businessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**businessAccountAudiencesSharedAccountsListWithHttpInfo**](AudienceSharingApi.md#businessAccountAudiencesSharedAccountsListWithHttpInfo) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**sharedAudiencesForBusinessList**](AudienceSharingApi.md#sharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**sharedAudiencesForBusinessListWithHttpInfo**](AudienceSharingApi.md#sharedAudiencesForBusinessListWithHttpInfo) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**updateAdAccountToAdAccountSharedAudience**](AudienceSharingApi.md#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**updateAdAccountToAdAccountSharedAudienceWithHttpInfo**](AudienceSharingApi.md#updateAdAccountToAdAccountSharedAudienceWithHttpInfo) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**updateAdAccountToBusinessSharedAudience**](AudienceSharingApi.md#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**updateAdAccountToBusinessSharedAudienceWithHttpInfo**](AudienceSharingApi.md#updateAdAccountToBusinessSharedAudienceWithHttpInfo) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**updateBusinessToAdAccountSharedAudience**](AudienceSharingApi.md#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**updateBusinessToAdAccountSharedAudienceWithHttpInfo**](AudienceSharingApi.md#updateBusinessToAdAccountSharedAudienceWithHttpInfo) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**updateBusinessToBusinessSharedAudience**](AudienceSharingApi.md#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses
[**updateBusinessToBusinessSharedAudienceWithHttpInfo**](AudienceSharingApi.md#updateBusinessToBusinessSharedAudienceWithHttpInfo) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses



## adAccountsAudiencesSharedAccountsList

> adAccountsAudiencesSharedAccountsList(adAccountsAudiencesSharedAccountsListRequest): ApiRequest[AdAccountsAudiencesSharedAccountsList200Response]

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

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
    val apiInstance = AudienceSharingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val audienceId: String = audienceId_example // String | Unique identifier of the audience to use to filter the results.

    val accountType: AudienceAccountType =  // AudienceAccountType | Filter accounts by account type.

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items
    
    val request = apiInstance.adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AudienceSharingApi#adAccountsAudiencesSharedAccountsList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AudienceSharingApi#adAccountsAudiencesSharedAccountsList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **audienceId** | **String**| Unique identifier of the audience to use to filter the results. |
 **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [enum: AD_ACCOUNT, BUSINESS_ACCOUNT]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]

### Return type

ApiRequest[[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account audiences shared accounts parameters. |  -  |
| **404** | Shared accounts not found. |  -  |
| **0** | Unexpected error. |  -  |


## businessAccountAudiencesSharedAccountsList

> businessAccountAudiencesSharedAccountsList(businessAccountAudiencesSharedAccountsListRequest): ApiRequest[AdAccountsAudiencesSharedAccountsList200Response]

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

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
    val apiInstance = AudienceSharingApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Unique identifier of the requesting business.

    val audienceId: String = audienceId_example // String | Unique identifier of the audience to use to filter the results.

    val accountType: AudienceAccountType =  // AudienceAccountType | Filter accounts by account type.

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items
    
    val request = apiInstance.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AudienceSharingApi#businessAccountAudiencesSharedAccountsList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AudienceSharingApi#businessAccountAudiencesSharedAccountsList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. |
 **audienceId** | **String**| Unique identifier of the audience to use to filter the results. |
 **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [enum: AD_ACCOUNT, BUSINESS_ACCOUNT]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]

### Return type

ApiRequest[[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid business audiences shared accounts parameters. |  -  |
| **404** | Shared accounts not found. |  -  |
| **0** | Unexpected error. |  -  |


## sharedAudiencesForBusinessList

> sharedAudiencesForBusinessList(sharedAudiencesForBusinessListRequest): ApiRequest[AudiencesList200Response]

List received audiences for a business

Get a list of received audiences for the given business.

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
    val apiInstance = AudienceSharingApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Unique identifier of the requesting business.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val order: String = ASCENDING // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    
    val request = apiInstance.sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AudienceSharingApi#sharedAudiencesForBusinessList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AudienceSharingApi#sharedAudiencesForBusinessList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]

### Return type

ApiRequest[[**AudiencesList200Response**](AudiencesList200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |


## updateAdAccountToAdAccountSharedAudience

> updateAdAccountToAdAccountSharedAudience(updateAdAccountToAdAccountSharedAudienceRequest): ApiRequest[SharedAudienceResponse]

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

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
    val apiInstance = AudienceSharingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val sharedAudience: SharedAudience =  // SharedAudience | 
    
    val request = apiInstance.updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AudienceSharingApi#updateAdAccountToAdAccountSharedAudience")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AudienceSharingApi#updateAdAccountToAdAccountSharedAudience")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **sharedAudience** | [**SharedAudience**](SharedAudience.md)|  |

### Return type

ApiRequest[[**SharedAudienceResponse**](SharedAudienceResponse.md)]


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


## updateAdAccountToBusinessSharedAudience

> updateAdAccountToBusinessSharedAudience(updateAdAccountToBusinessSharedAudienceRequest): ApiRequest[BusinessSharedAudienceResponse]

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

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
    val apiInstance = AudienceSharingApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val businessSharedAudience: BusinessSharedAudience =  // BusinessSharedAudience | 
    
    val request = apiInstance.updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AudienceSharingApi#updateAdAccountToBusinessSharedAudience")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AudienceSharingApi#updateAdAccountToBusinessSharedAudience")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  |

### Return type

ApiRequest[[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)]


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


## updateBusinessToAdAccountSharedAudience

> updateBusinessToAdAccountSharedAudience(updateBusinessToAdAccountSharedAudienceRequest): ApiRequest[SharedAudienceResponse]

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

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
    val apiInstance = AudienceSharingApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Unique identifier of the requesting business.

    val sharedAudience: SharedAudience =  // SharedAudience | 
    
    val request = apiInstance.updateBusinessToAdAccountSharedAudience(businessId, sharedAudience)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AudienceSharingApi#updateBusinessToAdAccountSharedAudience")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AudienceSharingApi#updateBusinessToAdAccountSharedAudience")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. |
 **sharedAudience** | [**SharedAudience**](SharedAudience.md)|  |

### Return type

ApiRequest[[**SharedAudienceResponse**](SharedAudienceResponse.md)]


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
| **0** | Unexpected error |  -  |


## updateBusinessToBusinessSharedAudience

> updateBusinessToBusinessSharedAudience(updateBusinessToBusinessSharedAudienceRequest): ApiRequest[BusinessSharedAudienceResponse]

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

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
    val apiInstance = AudienceSharingApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Unique identifier of the requesting business.

    val businessSharedAudience: BusinessSharedAudience =  // BusinessSharedAudience | 
    
    val request = apiInstance.updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AudienceSharingApi#updateBusinessToBusinessSharedAudience")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AudienceSharingApi#updateBusinessToBusinessSharedAudience")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. |
 **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  |

### Return type

ApiRequest[[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)]


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
| **0** | Unexpected error |  -  |

