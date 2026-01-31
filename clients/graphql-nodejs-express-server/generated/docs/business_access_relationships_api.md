# business_access_relationships_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BrandAccountsCreate**](business_access_relationships_api.md#BrandAccountsCreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**BrandAccountsUpdate**](business_access_relationships_api.md#BrandAccountsUpdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**DeleteBusinessMembership**](business_access_relationships_api.md#DeleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**DeleteBusinessPartners**](business_access_relationships_api.md#DeleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**GetBusinessEmployers**](business_access_relationships_api.md#GetBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**GetBusinessMembers**](business_access_relationships_api.md#GetBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**GetBusinessPartners**](business_access_relationships_api.md#GetBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**SystemUserUpdate**](business_access_relationships_api.md#SystemUserUpdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**UpdateBusinessMemberships**](business_access_relationships_api.md#UpdateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


<a name="BrandAccountsCreate"></a>
# **BrandAccountsCreate**
> BrandAccountsCreate200Response BrandAccountsCreate(businessHierarchyId, brandAccountsCreateRequest)

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
<a name="BrandAccountsUpdate"></a>
# **BrandAccountsUpdate**
> BrandAccountsCreate200Response BrandAccountsUpdate(businessHierarchyId, brandAccountId, brandAccountsUpdateRequest)

Update a Brand Account

Update an existing Brand Account
<a name="DeleteBusinessMembership"></a>
# **DeleteBusinessMembership**
> DeletedMembersResponse DeleteBusinessMembership(businessId, membersToDeleteBody)

Terminate business memberships

Terminate memberships between the specified members and your business.
<a name="DeleteBusinessPartners"></a>
# **DeleteBusinessPartners**
> DeletePartnersResponse DeleteBusinessPartners(businessId, deletePartnersRequest)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
<a name="GetBusinessEmployers"></a>
# **GetBusinessEmployers**
> GetBusinessEmployers200Response GetBusinessEmployers(pageSize, bookmark)

List business employers for user

Get all of the viewing user&#39;s business employers.
<a name="GetBusinessMembers"></a>
# **GetBusinessMembers**
> GetBusinessMembers200Response GetBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)

Get business members

Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
<a name="GetBusinessPartners"></a>
# **GetBusinessPartners**
> GetBusinessPartners200Response GetBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark)

Get business partners

Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
<a name="SystemUserUpdate"></a>
# **SystemUserUpdate**
> SystemUserUpdate(businessId, systemUserId, systemUserUpdateRequest)

Update a system user information.

Update a system user information such as name.
<a name="UpdateBusinessMemberships"></a>
# **UpdateBusinessMemberships**
> UpdateMemberResultsResponseArray UpdateBusinessMemberships(businessId, updateMemberBusinessRoleBody)

Update member&#39;s business role

Update a member&#39;s business role within the business.
