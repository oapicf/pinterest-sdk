# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessMembershipWithHttpInfo**](BusinessAccessRelationshipsApi.md#deleteBusinessMembershipWithHttpInfo) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**deleteBusinessPartnersWithHttpInfo**](BusinessAccessRelationshipsApi.md#deleteBusinessPartnersWithHttpInfo) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](BusinessAccessRelationshipsApi.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessEmployersWithHttpInfo**](BusinessAccessRelationshipsApi.md#getBusinessEmployersWithHttpInfo) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](BusinessAccessRelationshipsApi.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessMembersWithHttpInfo**](BusinessAccessRelationshipsApi.md#getBusinessMembersWithHttpInfo) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](BusinessAccessRelationshipsApi.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**getBusinessPartnersWithHttpInfo**](BusinessAccessRelationshipsApi.md#getBusinessPartnersWithHttpInfo) | **GET** /businesses/{business_id}/partners | Get business partners
[**updateBusinessMemberships**](BusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role
[**updateBusinessMembershipsWithHttpInfo**](BusinessAccessRelationshipsApi.md#updateBusinessMembershipsWithHttpInfo) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role



## deleteBusinessMembership

> deleteBusinessMembership(deleteBusinessMembershipRequest): ApiRequest[DeletedMembersResponse]

Terminate business memberships

Terminate memberships between the specified members and your business.

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
    val apiInstance = BusinessAccessRelationshipsApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Business id

    val membersToDeleteBody: MembersToDeleteBody =  // MembersToDeleteBody | List of members with role to delete.
    
    val request = apiInstance.deleteBusinessMembership(businessId, membersToDeleteBody)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#deleteBusinessMembership")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#deleteBusinessMembership")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Business id |
 **membersToDeleteBody** | [**MembersToDeleteBody**](MembersToDeleteBody.md)| List of members with role to delete. |

### Return type

ApiRequest[[**DeletedMembersResponse**](DeletedMembersResponse.md)]


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


## deleteBusinessPartners

> deleteBusinessPartners(deleteBusinessPartnersRequest): ApiRequest[DeletePartnersResponse]

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

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
    val apiInstance = BusinessAccessRelationshipsApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Unique identifier of the requesting business.

    val deletePartnersRequest: DeletePartnersRequest =  // DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 
    
    val request = apiInstance.deleteBusinessPartners(businessId, deletePartnersRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#deleteBusinessPartners")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#deleteBusinessPartners")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. |
 **deletePartnersRequest** | [**DeletePartnersRequest**](DeletePartnersRequest.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  |

### Return type

ApiRequest[[**DeletePartnersResponse**](DeletePartnersResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | A supplied partner id doesn&#39;t exist |  -  |
| **0** | Unexpected error |  -  |


## getBusinessEmployers

> getBusinessEmployers(getBusinessEmployersRequest): ApiRequest[GetBusinessEmployers200Response]

List business employers for user

Get all of the viewing user&#39;s business employers.

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
    val apiInstance = BusinessAccessRelationshipsApi("https://api.pinterest.com/v5")
    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items
    
    val request = apiInstance.getBusinessEmployers(pageSize, bookmark)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#getBusinessEmployers")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#getBusinessEmployers")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]

### Return type

ApiRequest[[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)]


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


## getBusinessMembers

> getBusinessMembers(getBusinessMembersRequest): ApiRequest[GetBusinessMembers200Response]

Get business members

Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE

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
    val apiInstance = BusinessAccessRelationshipsApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Unique identifier of the requesting business.

    val assetsSummary: Boolean = true // Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are

    val businessRoles: Seq[MemberBusinessRole] =  // Seq[MemberBusinessRole] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.

    val memberIds: String = 00101010101,2222220101 // String | A list of business members ids separated by comma.

    val startIndex: Int = 0 // Int | An index to start fetching the results from. Only the results starting from this index will be returned.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    
    val request = apiInstance.getBusinessMembers(businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#getBusinessMembers")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#getBusinessMembers")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. |
 **assetsSummary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional]
 **businessRoles** | [**Seq[MemberBusinessRole]**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional]
 **memberIds** | **String**| A list of business members ids separated by comma. | [optional]
 **startIndex** | **Int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]

### Return type

ApiRequest[[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)]


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


## getBusinessPartners

> getBusinessPartners(getBusinessPartnersRequest): ApiRequest[GetBusinessPartners200Response]

Get business partners

Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.

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
    val apiInstance = BusinessAccessRelationshipsApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Unique identifier of the requesting business.

    val assetsSummary: Boolean = true // Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are

    val partnerType: PartnerType = INTERNAL // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.

    val partnerIds: String = 00101010101,2222220101 // String | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.

    val startIndex: Int = 0 // Int | An index to start fetching the results from. Only the results starting from this index will be returned.

    val pageSize: Int = 56 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

    val bookmark: String = bookmark_example // String | Cursor used to fetch the next page of items
    
    val request = apiInstance.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#getBusinessPartners")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#getBusinessPartners")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. |
 **assetsSummary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional]
 **partnerType** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [enum: INTERNAL, EXTERNAL]
 **partnerIds** | **String**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional]
 **startIndex** | **Int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional]
 **pageSize** | **Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]

### Return type

ApiRequest[[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)]


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


## updateBusinessMemberships

> updateBusinessMemberships(updateBusinessMembershipsRequest): ApiRequest[UpdateMemberResultsResponseArray]

Update member&#39;s business role

Update a member&#39;s business role within the business.

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
    val apiInstance = BusinessAccessRelationshipsApi("https://api.pinterest.com/v5")
    val businessId: String = 729090764583391194 // String | Business id

    val updateMemberBusinessRoleBody: Seq[UpdateMemberBusinessRoleBody] =  // Seq[UpdateMemberBusinessRoleBody] | List of objects with the member id and the business_role.
    
    val request = apiInstance.updateBusinessMemberships(businessId, updateMemberBusinessRoleBody)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#updateBusinessMemberships")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BusinessAccessRelationshipsApi#updateBusinessMemberships")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Business id |
 **updateMemberBusinessRoleBody** | [**Seq[UpdateMemberBusinessRoleBody]**](UpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. |

### Return type

ApiRequest[[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

