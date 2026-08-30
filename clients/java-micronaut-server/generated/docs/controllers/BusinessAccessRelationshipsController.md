# BusinessAccessRelationshipsController

All URIs are relative to `"/v5"`

The controller class is defined in **[BusinessAccessRelationshipsController.java](../../src/main/java/org/openapitools/controller/BusinessAccessRelationshipsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandAccountsCreate**](#brandAccountsCreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**brandAccountsUpdate**](#brandAccountsUpdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**deleteBusinessMembership**](#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**systemUserUpdate**](#systemUserUpdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**updateBusinessMemberships**](#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role

<a id="brandAccountsCreate"></a>
# **brandAccountsCreate**
```java
Mono<BrandAccount> BusinessAccessRelationshipsController.brandAccountsCreate(businessHierarchyIdbrandAccountCreate)
```

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessHierarchyId** | `String` | business hierarchy node id |
**brandAccountCreate** | [**BrandAccountCreate**](../../docs/models/BrandAccountCreate.md) |  |

### Return type
[**BrandAccount**](../../docs/models/BrandAccount.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="brandAccountsUpdate"></a>
# **brandAccountsUpdate**
```java
Mono<BrandAccount> BusinessAccessRelationshipsController.brandAccountsUpdate(brandAccountIdbusinessHierarchyIdbrandAccountUpdate)
```

Update a Brand Account

Update an existing Brand Account

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**brandAccountId** | `String` |  |
**businessHierarchyId** | `String` | business hierarchy node id |
**brandAccountUpdate** | [**BrandAccountUpdate**](../../docs/models/BrandAccountUpdate.md) |  |

### Return type
[**BrandAccount**](../../docs/models/BrandAccount.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="deleteBusinessMembership"></a>
# **deleteBusinessMembership**
```java
Mono<DeleteBusinessMembership200Response> BusinessAccessRelationshipsController.deleteBusinessMembership(businessIddeleteBusinessMembershipBody)
```

Terminate business memberships

Terminate memberships between the specified members and your business.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Business id |
**deleteBusinessMembershipBody** | [**DeleteBusinessMembershipBody**](../../docs/models/DeleteBusinessMembershipBody.md) |  |

### Return type
[**DeleteBusinessMembership200Response**](../../docs/models/DeleteBusinessMembership200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="deleteBusinessPartners"></a>
# **deleteBusinessPartners**
```java
Mono<DeleteBusinessPartners> BusinessAccessRelationshipsController.deleteBusinessPartners(businessIddeleteBusinessPartnersDelete)
```

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**deleteBusinessPartnersDelete** | [**DeleteBusinessPartnersDelete**](../../docs/models/DeleteBusinessPartnersDelete.md) |  |

### Return type
[**DeleteBusinessPartners**](../../docs/models/DeleteBusinessPartners.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="getBusinessEmployers"></a>
# **getBusinessEmployers**
```java
Mono<GetBusinessEmployers200Response> BusinessAccessRelationshipsController.getBusinessEmployers(assetsSummarybookmarkpageSize)
```

List business employers for user

Get all of the viewing user&#39;s business employers.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**assetsSummary** | `Boolean` | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional parameter] [default to `true`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**GetBusinessEmployers200Response**](../../docs/models/GetBusinessEmployers200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getBusinessMembers"></a>
# **getBusinessMembers**
```java
Mono<GetBusinessEmployers200Response> BusinessAccessRelationshipsController.getBusinessMembers(businessIdfetchSystemUsersassetsSummarybusinessRolesmemberIdsstartIndexbookmarkpageSize)
```

Get business members

Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**fetchSystemUsers** | `Boolean` | Fetches system users if True. Fetches regular user employees if False. | [optional parameter] [default to `false`]
**assetsSummary** | `Boolean` | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional parameter] [default to `false`]
**businessRoles** | [**List&lt;MemberBusinessRole&gt;**](../../docs/models/MemberBusinessRole.md) | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional parameter]
**memberIds** | `String` | A list of business members ids separated by comma. | [optional parameter]
**startIndex** | `Integer` | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional parameter] [default to `0`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**GetBusinessEmployers200Response**](../../docs/models/GetBusinessEmployers200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getBusinessPartners"></a>
# **getBusinessPartners**
```java
Mono<GetBusinessEmployers200Response> BusinessAccessRelationshipsController.getBusinessPartners(businessIdassetsSummarypartnerTypepartnerIdsstartIndexsortAscendingbookmarkpageSize)
```

Get business partners

Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**assetsSummary** | `Boolean` | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional parameter] [default to `false`]
**partnerType** | [**PartnerType**](../../docs/models/.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional parameter] [enum: `INTERNAL`, `EXTERNAL`]
**partnerIds** | `String` | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional parameter]
**startIndex** | `Integer` | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional parameter] [default to `0`]
**sortAscending** | `Boolean` | Sort ascending. | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**GetBusinessEmployers200Response**](../../docs/models/GetBusinessEmployers200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="systemUserUpdate"></a>
# **systemUserUpdate**
```java
Mono<Object> BusinessAccessRelationshipsController.systemUserUpdate(businessIdsystemUserIdsystemUserUpdateWithRequiredBody)
```

Update a system user information.

Update a system user information such as name.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**systemUserId** | `String` | Unique identifier of a system user. |
**systemUserUpdateWithRequiredBody** | [**SystemUserUpdateWithRequiredBody**](../../docs/models/SystemUserUpdateWithRequiredBody.md) |  |


### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="updateBusinessMemberships"></a>
# **updateBusinessMemberships**
```java
Mono<UpdateBusinessMembershipsResponse> BusinessAccessRelationshipsController.updateBusinessMemberships(businessIdbusinessMembershipMember)
```

Update member&#39;s business role

Update a member&#39;s business role within the business.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Business id |
**businessMembershipMember** | [**List&lt;@Valid BusinessMembershipMember&gt;**](../../docs/models/BusinessMembershipMember.md) |  |

### Return type
[**UpdateBusinessMembershipsResponse**](../../docs/models/UpdateBusinessMembershipsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

