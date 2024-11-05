# BusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assetAccessRequestsCreate**](BusinessAccessInviteApi.md#assetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets. |
| [**cancelInvitesOrRequests**](BusinessAccessInviteApi.md#cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests |
| [**createAssetInvites**](BusinessAccessInviteApi.md#createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission |
| [**createMembershipOrPartnershipInvites**](BusinessAccessInviteApi.md#createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests |
| [**getInvites**](BusinessAccessInviteApi.md#getInvites) | **GET** /businesses/{business_id}/invites | Get invites/requests |
| [**respondBusinessAccessInvites**](BusinessAccessInviteApi.md#respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request |


## Creating BusinessAccessInviteApi

To initiate an instance of `BusinessAccessInviteApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.BusinessAccessInviteApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(BusinessAccessInviteApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    BusinessAccessInviteApi businessAccessInviteApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="assetAccessRequestsCreate"></a>
# **assetAccessRequestsCreate**
```java
Mono<CreateAssetAccessRequestResponse> BusinessAccessInviteApi.assetAccessRequestsCreate(businessIdcreateAssetAccessRequestBody)
```

Create a request to access an existing partner&#39;s assets.

Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Unique identifier of the requesting business. | |
| **createAssetAccessRequestBody** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md)|  | |


### Return type
[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="cancelInvitesOrRequests"></a>
# **cancelInvitesOrRequests**
```java
Mono<DeleteInvitesResultsResponseArray> BusinessAccessInviteApi.cancelInvitesOrRequests(businessIdcancelInvitesBody)
```

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Business id | |
| **cancelInvitesBody** | [**CancelInvitesBody**](CancelInvitesBody.md)| A list with invite ids | |


### Return type
[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createAssetInvites"></a>
# **createAssetInvites**
```java
Mono<UpdateInvitesResultsResponseArray> BusinessAccessInviteApi.createAssetInvites(businessIdcreateAssetInvitesRequest)
```

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Unique identifier of the requesting business. | |
| **createAssetInvitesRequest** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md)| A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | |


### Return type
[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createMembershipOrPartnershipInvites"></a>
# **createMembershipOrPartnershipInvites**
```java
Mono<CreateInvitesResultsResponseArray> BusinessAccessInviteApi.createMembershipOrPartnershipInvites(businessIdcreateMembershipOrPartnershipInvitesBody)
```

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Business id | |
| **createMembershipOrPartnershipInvitesBody** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md)| An object with the properties: invite_type, partners, members, business_role | |


### Return type
[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getInvites"></a>
# **getInvites**
```java
Mono<GetInvites200Response> BusinessAccessInviteApi.getInvites(businessIdisMemberinviteStatusinviteTypebookmarkpageSize)
```

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Unique identifier of the requesting business. | |
| **isMember** | `Boolean`| A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional parameter] [default to `true`] |
| **inviteStatus** | [**List&lt;String&gt;**](String.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional parameter] [enum: `PENDING`, `EXPIRED`] |
| **inviteType** | [**InviteType**](.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional parameter] [enum: `MEMBER_INVITE`, `PARTNER_INVITE`, `PARTNER_REQUEST`] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |


### Return type
[**GetInvites200Response**](GetInvites200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="respondBusinessAccessInvites"></a>
# **respondBusinessAccessInvites**
```java
Mono<RespondToInvitesResponseArray> BusinessAccessInviteApi.respondBusinessAccessInvites(authRespondInvitesBody)
```

Accept or decline an invite/request

Accept or decline invites or requests.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authRespondInvitesBody** | [**AuthRespondInvitesBody**](AuthRespondInvitesBody.md)|  | |


### Return type
[**RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

