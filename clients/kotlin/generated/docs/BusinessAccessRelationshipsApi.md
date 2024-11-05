# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
| [**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
| [**getBusinessEmployers**](BusinessAccessRelationshipsApi.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user |
| [**getBusinessMembers**](BusinessAccessRelationshipsApi.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members |
| [**getBusinessPartners**](BusinessAccessRelationshipsApi.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners |
| [**updateBusinessMemberships**](BusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role |


<a id="deleteBusinessMembership"></a>
# **deleteBusinessMembership**
> DeletedMembersResponse deleteBusinessMembership(businessId, membersToDeleteBody)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Business id
val membersToDeleteBody : MembersToDeleteBody =  // MembersToDeleteBody | List of members with role to delete.
try {
    val result : DeletedMembersResponse = apiInstance.deleteBusinessMembership(businessId, membersToDeleteBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessRelationshipsApi#deleteBusinessMembership")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessRelationshipsApi#deleteBusinessMembership")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Business id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **membersToDeleteBody** | [**MembersToDeleteBody**](MembersToDeleteBody.md)| List of members with role to delete. | |

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteBusinessPartners"></a>
# **deleteBusinessPartners**
> DeletePartnersResponse deleteBusinessPartners(businessId, deletePartnersRequest)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val deletePartnersRequest : DeletePartnersRequest =  // DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 
try {
    val result : DeletePartnersResponse = apiInstance.deleteBusinessPartners(businessId, deletePartnersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessRelationshipsApi#deleteBusinessPartners")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessRelationshipsApi#deleteBusinessPartners")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deletePartnersRequest** | [**DeletePartnersRequest**](DeletePartnersRequest.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | |

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBusinessEmployers"></a>
# **getBusinessEmployers**
> GetBusinessEmployers200Response getBusinessEmployers(pageSize, bookmark)

List business employers for user

Get all of the viewing user&#39;s business employers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessRelationshipsApi()
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : GetBusinessEmployers200Response = apiInstance.getBusinessEmployers(pageSize, bookmark)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessRelationshipsApi#getBusinessEmployers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessRelationshipsApi#getBusinessEmployers")
    e.printStackTrace()
}
```

### Parameters
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBusinessMembers"></a>
# **getBusinessMembers**
> GetBusinessMembers200Response getBusinessMembers(businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)

Get business members

Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val assetsSummary : kotlin.Boolean = true // kotlin.Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
val businessRoles : kotlin.collections.List<MemberBusinessRole> =  // kotlin.collections.List<MemberBusinessRole> | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
val memberIds : kotlin.String = 00101010101,2222220101 // kotlin.String | A list of business members ids separated by comma.
val startIndex : kotlin.Int = 0 // kotlin.Int | An index to start fetching the results from. Only the results starting from this index will be returned.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    val result : GetBusinessMembers200Response = apiInstance.getBusinessMembers(businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessRelationshipsApi#getBusinessMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessRelationshipsApi#getBusinessMembers")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| **assetsSummary** | **kotlin.Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false] |
| **businessRoles** | [**kotlin.collections.List&lt;MemberBusinessRole&gt;**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] |
| **memberIds** | **kotlin.String**| A list of business members ids separated by comma. | [optional] |
| **startIndex** | **kotlin.Int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBusinessPartners"></a>
# **getBusinessPartners**
> GetBusinessPartners200Response getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark)

Get business partners

Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val assetsSummary : kotlin.Boolean = true // kotlin.Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
val partnerType : PartnerType = INTERNAL // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
val partnerIds : kotlin.String = 00101010101,2222220101 // kotlin.String | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
val startIndex : kotlin.Int = 0 // kotlin.Int | An index to start fetching the results from. Only the results starting from this index will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : GetBusinessPartners200Response = apiInstance.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessRelationshipsApi#getBusinessPartners")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessRelationshipsApi#getBusinessPartners")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| **assetsSummary** | **kotlin.Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false] |
| **partnerType** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [enum: INTERNAL, EXTERNAL] |
| **partnerIds** | **kotlin.String**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] |
| **startIndex** | **kotlin.Int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateBusinessMemberships"></a>
# **updateBusinessMemberships**
> UpdateMemberResultsResponseArray updateBusinessMemberships(businessId, updateMemberBusinessRoleBody)

Update member&#39;s business role

Update a member&#39;s business role within the business.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Business id
val updateMemberBusinessRoleBody : kotlin.collections.List<UpdateMemberBusinessRoleBody> =  // kotlin.collections.List<UpdateMemberBusinessRoleBody> | List of objects with the member id and the business_role.
try {
    val result : UpdateMemberResultsResponseArray = apiInstance.updateBusinessMemberships(businessId, updateMemberBusinessRoleBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessRelationshipsApi#updateBusinessMemberships")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessRelationshipsApi#updateBusinessMemberships")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Business id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMemberBusinessRoleBody** | [**kotlin.collections.List&lt;UpdateMemberBusinessRoleBody&gt;**](UpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. | |

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

