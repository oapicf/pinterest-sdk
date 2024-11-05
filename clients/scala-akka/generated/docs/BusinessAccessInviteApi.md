# BusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetAccessRequestsCreate**](BusinessAccessInviteApi.md#assetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**assetAccessRequestsCreateWithHttpInfo**](BusinessAccessInviteApi.md#assetAccessRequestsCreateWithHttpInfo) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**cancelInvitesOrRequests**](BusinessAccessInviteApi.md#cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**cancelInvitesOrRequestsWithHttpInfo**](BusinessAccessInviteApi.md#cancelInvitesOrRequestsWithHttpInfo) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**createAssetInvites**](BusinessAccessInviteApi.md#createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**createAssetInvitesWithHttpInfo**](BusinessAccessInviteApi.md#createAssetInvitesWithHttpInfo) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**createMembershipOrPartnershipInvites**](BusinessAccessInviteApi.md#createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**createMembershipOrPartnershipInvitesWithHttpInfo**](BusinessAccessInviteApi.md#createMembershipOrPartnershipInvitesWithHttpInfo) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**getInvites**](BusinessAccessInviteApi.md#getInvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**getInvitesWithHttpInfo**](BusinessAccessInviteApi.md#getInvitesWithHttpInfo) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**respondBusinessAccessInvites**](BusinessAccessInviteApi.md#respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request
[**respondBusinessAccessInvitesWithHttpInfo**](BusinessAccessInviteApi.md#respondBusinessAccessInvitesWithHttpInfo) | **PATCH** /businesses/invites | Accept or decline an invite/request



## assetAccessRequestsCreate

> assetAccessRequestsCreate(assetAccessRequestsCreateRequest): ApiRequest[CreateAssetAccessRequestResponse]

Create a request to access an existing partner&#39;s assets.

Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

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
    val apiInstance = BusinessAccessInviteApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Unique identifier of the requesting business.

    val createAssetAccessRequestBody: CreateAssetAccessRequestBody =  // CreateAssetAccessRequestBody | 
    
    val request = apiInstance.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessInviteApi#assetAccessRequestsCreate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessInviteApi#assetAccessRequestsCreate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. |
 **createAssetAccessRequestBody** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md)|  |

### Return type

ApiRequest[[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)]


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


## cancelInvitesOrRequests

> cancelInvitesOrRequests(cancelInvitesOrRequestsRequest): ApiRequest[DeleteInvitesResultsResponseArray]

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

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
    val apiInstance = BusinessAccessInviteApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Business id

    val cancelInvitesBody: CancelInvitesBody =  // CancelInvitesBody | A list with invite ids
    
    val request = apiInstance.cancelInvitesOrRequests(businessId, cancelInvitesBody)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessInviteApi#cancelInvitesOrRequests")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessInviteApi#cancelInvitesOrRequests")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Business id |
 **cancelInvitesBody** | [**CancelInvitesBody**](CancelInvitesBody.md)| A list with invite ids |

### Return type

ApiRequest[[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md)]


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


## createAssetInvites

> createAssetInvites(createAssetInvitesRequest): ApiRequest[UpdateInvitesResultsResponseArray]

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

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
    val apiInstance = BusinessAccessInviteApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Unique identifier of the requesting business.

    val createAssetInvitesRequest: CreateAssetInvitesRequest =  // CreateAssetInvitesRequest | A list of invites/requests together with the asset permissions to be assigned to the invite/request. 
    
    val request = apiInstance.createAssetInvites(businessId, createAssetInvitesRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessInviteApi#createAssetInvites")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessInviteApi#createAssetInvites")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. |
 **createAssetInvitesRequest** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md)| A list of invites/requests together with the asset permissions to be assigned to the invite/request.  |

### Return type

ApiRequest[[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)]


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


## createMembershipOrPartnershipInvites

> createMembershipOrPartnershipInvites(createMembershipOrPartnershipInvitesRequest): ApiRequest[CreateInvitesResultsResponseArray]

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners

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
    val apiInstance = BusinessAccessInviteApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Business id

    val createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody =  // CreateMembershipOrPartnershipInvitesBody | An object with the properties: invite_type, partners, members, business_role
    
    val request = apiInstance.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessInviteApi#createMembershipOrPartnershipInvites")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessInviteApi#createMembershipOrPartnershipInvites")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Business id |
 **createMembershipOrPartnershipInvitesBody** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md)| An object with the properties: invite_type, partners, members, business_role |

### Return type

ApiRequest[[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)]


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


## getInvites

> getInvites(getInvitesRequest): ApiRequest[GetInvites200Response]

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

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
    val apiInstance = BusinessAccessInviteApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Unique identifier of the requesting business.

    val isMember: Boolean = true // Boolean | A boolean field to indicate whether the invite is to create a partnership or a membership.

    val inviteStatus: Seq[String] =  // Seq[String] | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.

    val inviteType: InviteType =  // InviteType | Invite type to filter invites by. Only invites of the specified type will be returned.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    
    val request = apiInstance.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessInviteApi#getInvites")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessInviteApi#getInvites")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. |
 **isMember** | **Boolean**| A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional]
 **inviteStatus** | [**Seq[String]**](String.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] [enum: PENDING, EXPIRED]
 **inviteType** | [**InviteType**](.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] [enum: MEMBER_INVITE, PARTNER_INVITE, PARTNER_REQUEST]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]

### Return type

ApiRequest[[**GetInvites200Response**](GetInvites200Response.md)]


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


## respondBusinessAccessInvites

> respondBusinessAccessInvites(respondBusinessAccessInvitesRequest): ApiRequest[RespondToInvitesResponseArray]

Accept or decline an invite/request

Accept or decline invites or requests.

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
    val apiInstance = BusinessAccessInviteApi("https://api.pinterest.com/v5")
    val authRespondInvitesBody: AuthRespondInvitesBody =  // AuthRespondInvitesBody | 
    
    val request = apiInstance.respondBusinessAccessInvites(authRespondInvitesBody)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessInviteApi#respondBusinessAccessInvites")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessInviteApi#respondBusinessAccessInvites")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authRespondInvitesBody** | [**AuthRespondInvitesBody**](AuthRespondInvitesBody.md)|  |

### Return type

ApiRequest[[**RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md)]


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

