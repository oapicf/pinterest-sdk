# BusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**assetAccessRequestsCreate**](BusinessAccessInviteApi.md#assetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets. |
| [**cancelInvitesOrRequests**](BusinessAccessInviteApi.md#cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests |
| [**createAssetInvites**](BusinessAccessInviteApi.md#createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission |
| [**createMembershipOrPartnershipInvites**](BusinessAccessInviteApi.md#createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests |
| [**getInvites**](BusinessAccessInviteApi.md#getInvites) | **GET** /businesses/{business_id}/invites | Get invites/requests |
| [**respondBusinessAccessInvites**](BusinessAccessInviteApi.md#respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request |


<a id="assetAccessRequestsCreate"></a>
# **assetAccessRequestsCreate**
> CreateAssetAccessRequestResponse assetAccessRequestsCreate(businessId, createAssetAccessRequestBody)

Create a request to access an existing partner&#39;s assets.

Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessInviteApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val createAssetAccessRequestBody : CreateAssetAccessRequestBody =  // CreateAssetAccessRequestBody | 
try {
    val result : CreateAssetAccessRequestResponse = apiInstance.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessInviteApi#assetAccessRequestsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessInviteApi#assetAccessRequestsCreate")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createAssetAccessRequestBody** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md)|  | |

### Return type

[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="cancelInvitesOrRequests"></a>
# **cancelInvitesOrRequests**
> DeleteInvitesResultsResponseArray cancelInvitesOrRequests(businessId, cancelInvitesBody)

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessInviteApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Business id
val cancelInvitesBody : CancelInvitesBody =  // CancelInvitesBody | A list with invite ids
try {
    val result : DeleteInvitesResultsResponseArray = apiInstance.cancelInvitesOrRequests(businessId, cancelInvitesBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessInviteApi#cancelInvitesOrRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessInviteApi#cancelInvitesOrRequests")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Business id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cancelInvitesBody** | [**CancelInvitesBody**](CancelInvitesBody.md)| A list with invite ids | |

### Return type

[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAssetInvites"></a>
# **createAssetInvites**
> UpdateInvitesResultsResponseArray createAssetInvites(businessId, createAssetInvitesRequest)

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessInviteApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val createAssetInvitesRequest : CreateAssetInvitesRequest =  // CreateAssetInvitesRequest | A list of invites/requests together with the asset permissions to be assigned to the invite/request. 
try {
    val result : UpdateInvitesResultsResponseArray = apiInstance.createAssetInvites(businessId, createAssetInvitesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessInviteApi#createAssetInvites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessInviteApi#createAssetInvites")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createAssetInvitesRequest** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md)| A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | |

### Return type

[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createMembershipOrPartnershipInvites"></a>
# **createMembershipOrPartnershipInvites**
> CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody)

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessInviteApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Business id
val createMembershipOrPartnershipInvitesBody : CreateMembershipOrPartnershipInvitesBody =  // CreateMembershipOrPartnershipInvitesBody | An object with the properties: invite_type, partners, members, business_role
try {
    val result : CreateInvitesResultsResponseArray = apiInstance.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessInviteApi#createMembershipOrPartnershipInvites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessInviteApi#createMembershipOrPartnershipInvites")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Business id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createMembershipOrPartnershipInvitesBody** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md)| An object with the properties: invite_type, partners, members, business_role | |

### Return type

[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getInvites"></a>
# **getInvites**
> GetInvites200Response getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize)

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessInviteApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val isMember : kotlin.Boolean = true // kotlin.Boolean | A boolean field to indicate whether the invite is to create a partnership or a membership.
val inviteStatus : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
val inviteType : InviteType =  // InviteType | Invite type to filter invites by. Only invites of the specified type will be returned.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    val result : GetInvites200Response = apiInstance.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessInviteApi#getInvites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessInviteApi#getInvites")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| **isMember** | **kotlin.Boolean**| A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to true] |
| **inviteStatus** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] [enum: PENDING, EXPIRED] |
| **inviteType** | [**InviteType**](.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] [enum: MEMBER_INVITE, PARTNER_INVITE, PARTNER_REQUEST] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**GetInvites200Response**](GetInvites200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="respondBusinessAccessInvites"></a>
# **respondBusinessAccessInvites**
> RespondToInvitesResponseArray respondBusinessAccessInvites(authRespondInvitesBody)

Accept or decline an invite/request

Accept or decline invites or requests.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessInviteApi()
val authRespondInvitesBody : AuthRespondInvitesBody =  // AuthRespondInvitesBody | 
try {
    val result : RespondToInvitesResponseArray = apiInstance.respondBusinessAccessInvites(authRespondInvitesBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessInviteApi#respondBusinessAccessInvites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessInviteApi#respondBusinessAccessInvites")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **authRespondInvitesBody** | [**AuthRespondInvitesBody**](AuthRespondInvitesBody.md)|  | |

### Return type

[**RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

