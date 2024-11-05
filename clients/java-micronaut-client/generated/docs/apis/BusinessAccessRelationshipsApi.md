# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
| [**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
| [**getBusinessEmployers**](BusinessAccessRelationshipsApi.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user |
| [**getBusinessMembers**](BusinessAccessRelationshipsApi.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members |
| [**getBusinessPartners**](BusinessAccessRelationshipsApi.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners |
| [**updateBusinessMemberships**](BusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role |


## Creating BusinessAccessRelationshipsApi

To initiate an instance of `BusinessAccessRelationshipsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.BusinessAccessRelationshipsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(BusinessAccessRelationshipsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    BusinessAccessRelationshipsApi businessAccessRelationshipsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="deleteBusinessMembership"></a>
# **deleteBusinessMembership**
```java
Mono<DeletedMembersResponse> BusinessAccessRelationshipsApi.deleteBusinessMembership(businessIdmembersToDeleteBody)
```

Terminate business memberships

Terminate memberships between the specified members and your business.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Business id | |
| **membersToDeleteBody** | [**MembersToDeleteBody**](MembersToDeleteBody.md)| List of members with role to delete. | |


### Return type
[**DeletedMembersResponse**](DeletedMembersResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="deleteBusinessPartners"></a>
# **deleteBusinessPartners**
```java
Mono<DeletePartnersResponse> BusinessAccessRelationshipsApi.deleteBusinessPartners(businessIddeletePartnersRequest)
```

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Unique identifier of the requesting business. | |
| **deletePartnersRequest** | [**DeletePartnersRequest**](DeletePartnersRequest.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | |


### Return type
[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getBusinessEmployers"></a>
# **getBusinessEmployers**
```java
Mono<GetBusinessEmployers200Response> BusinessAccessRelationshipsApi.getBusinessEmployers(pageSizebookmark)
```

List business employers for user

Get all of the viewing user&#39;s business employers.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |


### Return type
[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getBusinessMembers"></a>
# **getBusinessMembers**
```java
Mono<GetBusinessMembers200Response> BusinessAccessRelationshipsApi.getBusinessMembers(businessIdassetsSummarybusinessRolesmemberIdsstartIndexbookmarkpageSize)
```

Get business members

Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Unique identifier of the requesting business. | |
| **assetsSummary** | `Boolean`| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional parameter] [default to `false`] |
| **businessRoles** | [**List&lt;MemberBusinessRole&gt;**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional parameter] |
| **memberIds** | `String`| A list of business members ids separated by comma. | [optional parameter] |
| **startIndex** | `Integer`| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional parameter] [default to `0`] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |


### Return type
[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getBusinessPartners"></a>
# **getBusinessPartners**
```java
Mono<GetBusinessPartners200Response> BusinessAccessRelationshipsApi.getBusinessPartners(businessIdassetsSummarypartnerTypepartnerIdsstartIndexpageSizebookmark)
```

Get business partners

Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Unique identifier of the requesting business. | |
| **assetsSummary** | `Boolean`| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional parameter] [default to `false`] |
| **partnerType** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional parameter] [enum: `INTERNAL`, `EXTERNAL`] |
| **partnerIds** | `String`| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional parameter] |
| **startIndex** | `Integer`| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional parameter] [default to `0`] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |


### Return type
[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="updateBusinessMemberships"></a>
# **updateBusinessMemberships**
```java
Mono<UpdateMemberResultsResponseArray> BusinessAccessRelationshipsApi.updateBusinessMemberships(businessIdupdateMemberBusinessRoleBody)
```

Update member&#39;s business role

Update a member&#39;s business role within the business.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Business id | |
| **updateMemberBusinessRoleBody** | [**List&lt;@Valid UpdateMemberBusinessRoleBody&gt;**](UpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. | |


### Return type
[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

