# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandAccountsCreate**](BusinessAccessRelationshipsApi.md#brandAccountsCreate) | **Post** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**brandAccountsUpdate**](BusinessAccessRelationshipsApi.md#brandAccountsUpdate) | **Patch** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **Delete** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **Delete** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](BusinessAccessRelationshipsApi.md#getBusinessEmployers) | **Get** /businesses/employers | List business employers for user
[**getBusinessMembers**](BusinessAccessRelationshipsApi.md#getBusinessMembers) | **Get** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](BusinessAccessRelationshipsApi.md#getBusinessPartners) | **Get** /businesses/{business_id}/partners | Get business partners
[**systemUserUpdate**](BusinessAccessRelationshipsApi.md#systemUserUpdate) | **Patch** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**updateBusinessMemberships**](BusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **Patch** /businesses/{business_id}/members | Update member&#39;s business role


<a name="brandAccountsCreate"></a>
# **brandAccountsCreate**
> BrandAccount brandAccountsCreate(businessHierarchyId, brandAccountCreate)

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessHierarchyId : kotlin.String = businessHierarchyId_example // kotlin.String | business hierarchy node id
val brandAccountCreate : BrandAccountCreate =  // BrandAccountCreate | 
try {
    val result : BrandAccount = apiInstance.brandAccountsCreate(businessHierarchyId, brandAccountCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessRelationshipsApi#brandAccountsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessRelationshipsApi#brandAccountsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessHierarchyId** | **kotlin.String**| business hierarchy node id |
 **brandAccountCreate** | [**BrandAccountCreate**](BrandAccountCreate.md)|  |

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="brandAccountsUpdate"></a>
# **brandAccountsUpdate**
> BrandAccount brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate)

Update a Brand Account

Update an existing Brand Account

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BusinessAccessRelationshipsApi()
val brandAccountId : kotlin.String = brandAccountId_example // kotlin.String | 
val businessHierarchyId : kotlin.String = businessHierarchyId_example // kotlin.String | business hierarchy node id
val brandAccountUpdate : BrandAccountUpdate =  // BrandAccountUpdate | 
try {
    val result : BrandAccount = apiInstance.brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessRelationshipsApi#brandAccountsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessRelationshipsApi#brandAccountsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandAccountId** | **kotlin.String**|  |
 **businessHierarchyId** | **kotlin.String**| business hierarchy node id |
 **brandAccountUpdate** | [**BrandAccountUpdate**](BrandAccountUpdate.md)|  |

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="deleteBusinessMembership"></a>
# **deleteBusinessMembership**
> DeleteBusinessMembership200Response deleteBusinessMembership(businessId, deleteBusinessMembershipBody)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessId : kotlin.String = businessId_example // kotlin.String | Business id
val deleteBusinessMembershipBody : DeleteBusinessMembershipBody =  // DeleteBusinessMembershipBody | 
try {
    val result : DeleteBusinessMembership200Response = apiInstance.deleteBusinessMembership(businessId, deleteBusinessMembershipBody)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **kotlin.String**| Business id |
 **deleteBusinessMembershipBody** | [**DeleteBusinessMembershipBody**](DeleteBusinessMembershipBody.md)|  |

### Return type

[**DeleteBusinessMembership200Response**](DeleteBusinessMembership200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="deleteBusinessPartners"></a>
# **deleteBusinessPartners**
> DeleteBusinessPartners deleteBusinessPartners(businessId, deleteBusinessPartnersDelete)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessId : kotlin.String = businessId_example // kotlin.String | Unique identifier of the requesting business.
val deleteBusinessPartnersDelete : DeleteBusinessPartnersDelete =  // DeleteBusinessPartnersDelete | 
try {
    val result : DeleteBusinessPartners = apiInstance.deleteBusinessPartners(businessId, deleteBusinessPartnersDelete)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **kotlin.String**| Unique identifier of the requesting business. |
 **deleteBusinessPartnersDelete** | [**DeleteBusinessPartnersDelete**](DeleteBusinessPartnersDelete.md)|  |

### Return type

[**DeleteBusinessPartners**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="getBusinessEmployers"></a>
# **getBusinessEmployers**
> GetBusinessEmployers200Response getBusinessEmployers(assetsSummary, bookmark, pageSize)

List business employers for user

Get all of the viewing user&#39;s business employers.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BusinessAccessRelationshipsApi()
val assetsSummary : kotlin.Boolean = true // kotlin.Boolean | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : GetBusinessEmployers200Response = apiInstance.getBusinessEmployers(assetsSummary, bookmark, pageSize)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsSummary** | **kotlin.Boolean**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to true]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="getBusinessMembers"></a>
# **getBusinessMembers**
> GetBusinessEmployers200Response getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)

Get business members

Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessId : kotlin.String = businessId_example // kotlin.String | Unique identifier of the requesting business.
val fetchSystemUsers : kotlin.Boolean = true // kotlin.Boolean | Fetches system users if True. Fetches regular user employees if False.
val assetsSummary : kotlin.Boolean = true // kotlin.Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
val businessRoles : kotlin.collections.List<MemberBusinessRole> =  // kotlin.collections.List<MemberBusinessRole> | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
val memberIds : kotlin.String = memberIds_example // kotlin.String | A list of business members ids separated by comma.
val startIndex : kotlin.Int = 56 // kotlin.Int | An index to start fetching the results from. Only the results starting from this index will be returned.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : GetBusinessEmployers200Response = apiInstance.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **kotlin.String**| Unique identifier of the requesting business. |
 **fetchSystemUsers** | **kotlin.Boolean**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false]
 **assetsSummary** | **kotlin.Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **businessRoles** | [**kotlin.collections.List&lt;MemberBusinessRole&gt;**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional]
 **memberIds** | **kotlin.String**| A list of business members ids separated by comma. | [optional]
 **startIndex** | **kotlin.Int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="getBusinessPartners"></a>
# **getBusinessPartners**
> GetBusinessEmployers200Response getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize)

Get business partners

Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessId : kotlin.String = businessId_example // kotlin.String | Unique identifier of the requesting business.
val assetsSummary : kotlin.Boolean = true // kotlin.Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
val partnerType : PartnerType =  // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
val partnerIds : kotlin.String = partnerIds_example // kotlin.String | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
val startIndex : kotlin.Int = 56 // kotlin.Int | An index to start fetching the results from. Only the results starting from this index will be returned.
val sortAscending : kotlin.Boolean = true // kotlin.Boolean | Sort ascending.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : GetBusinessEmployers200Response = apiInstance.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **kotlin.String**| Unique identifier of the requesting business. |
 **assetsSummary** | **kotlin.Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **partnerType** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [enum: INTERNAL, EXTERNAL]
 **partnerIds** | **kotlin.String**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional]
 **startIndex** | **kotlin.Int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sortAscending** | **kotlin.Boolean**| Sort ascending. | [optional]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="systemUserUpdate"></a>
# **systemUserUpdate**
> systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody)

Update a system user information.

Update a system user information such as name.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessId : kotlin.String = businessId_example // kotlin.String | Unique identifier of the requesting business.
val systemUserId : kotlin.String = systemUserId_example // kotlin.String | Unique identifier of a system user.
val systemUserUpdateWithRequiredBody : SystemUserUpdateWithRequiredBody =  // SystemUserUpdateWithRequiredBody | 
try {
    apiInstance.systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessRelationshipsApi#systemUserUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessRelationshipsApi#systemUserUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **kotlin.String**| Unique identifier of the requesting business. |
 **systemUserId** | **kotlin.String**| Unique identifier of a system user. |
 **systemUserUpdateWithRequiredBody** | [**SystemUserUpdateWithRequiredBody**](SystemUserUpdateWithRequiredBody.md)|  |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="updateBusinessMemberships"></a>
# **updateBusinessMemberships**
> UpdateBusinessMembershipsResponse updateBusinessMemberships(businessId, businessMembershipMember)

Update member&#39;s business role

Update a member&#39;s business role within the business.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BusinessAccessRelationshipsApi()
val businessId : kotlin.String = businessId_example // kotlin.String | Business id
val businessMembershipMember : kotlin.collections.List<BusinessMembershipMember> =  // kotlin.collections.List<BusinessMembershipMember> | 
try {
    val result : UpdateBusinessMembershipsResponse = apiInstance.updateBusinessMemberships(businessId, businessMembershipMember)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **kotlin.String**| Business id |
 **businessMembershipMember** | [**kotlin.collections.List&lt;BusinessMembershipMember&gt;**](BusinessMembershipMember.md)|  |

### Return type

[**UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

