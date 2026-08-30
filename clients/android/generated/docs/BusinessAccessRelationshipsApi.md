# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandAccountsCreate**](BusinessAccessRelationshipsApi.md#brandAccountsCreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**brandAccountsUpdate**](BusinessAccessRelationshipsApi.md#brandAccountsUpdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](BusinessAccessRelationshipsApi.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](BusinessAccessRelationshipsApi.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](BusinessAccessRelationshipsApi.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**systemUserUpdate**](BusinessAccessRelationshipsApi.md#systemUserUpdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**updateBusinessMemberships**](BusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role



## brandAccountsCreate

> BrandAccount brandAccountsCreate(businessHierarchyId, brandAccountCreate)

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessRelationshipsApi;

BusinessAccessRelationshipsApi apiInstance = new BusinessAccessRelationshipsApi();
String businessHierarchyId = null; // String | business hierarchy node id
BrandAccountCreate brandAccountCreate = new BrandAccountCreate(); // BrandAccountCreate | 
try {
    BrandAccount result = apiInstance.brandAccountsCreate(businessHierarchyId, brandAccountCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessRelationshipsApi#brandAccountsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessHierarchyId** | **String**| business hierarchy node id | [default to null]
 **brandAccountCreate** | [**BrandAccountCreate**](BrandAccountCreate.md)|  |

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## brandAccountsUpdate

> BrandAccount brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate)

Update a Brand Account

Update an existing Brand Account

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessRelationshipsApi;

BusinessAccessRelationshipsApi apiInstance = new BusinessAccessRelationshipsApi();
String brandAccountId = null; // String | 
String businessHierarchyId = null; // String | business hierarchy node id
BrandAccountUpdate brandAccountUpdate = new BrandAccountUpdate(); // BrandAccountUpdate | 
try {
    BrandAccount result = apiInstance.brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessRelationshipsApi#brandAccountsUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandAccountId** | **String**|  | [default to null]
 **businessHierarchyId** | **String**| business hierarchy node id | [default to null]
 **brandAccountUpdate** | [**BrandAccountUpdate**](BrandAccountUpdate.md)|  |

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteBusinessMembership

> DeleteBusinessMembership200Response deleteBusinessMembership(businessId, deleteBusinessMembershipBody)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessRelationshipsApi;

BusinessAccessRelationshipsApi apiInstance = new BusinessAccessRelationshipsApi();
String businessId = null; // String | Business id
DeleteBusinessMembershipBody deleteBusinessMembershipBody = new DeleteBusinessMembershipBody(); // DeleteBusinessMembershipBody | 
try {
    DeleteBusinessMembership200Response result = apiInstance.deleteBusinessMembership(businessId, deleteBusinessMembershipBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessRelationshipsApi#deleteBusinessMembership");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Business id | [default to null]
 **deleteBusinessMembershipBody** | [**DeleteBusinessMembershipBody**](DeleteBusinessMembershipBody.md)|  |

### Return type

[**DeleteBusinessMembership200Response**](DeleteBusinessMembership200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteBusinessPartners

> DeleteBusinessPartners deleteBusinessPartners(businessId, deleteBusinessPartnersDelete)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessRelationshipsApi;

BusinessAccessRelationshipsApi apiInstance = new BusinessAccessRelationshipsApi();
String businessId = null; // String | Unique identifier of the requesting business.
DeleteBusinessPartnersDelete deleteBusinessPartnersDelete = new DeleteBusinessPartnersDelete(); // DeleteBusinessPartnersDelete | 
try {
    DeleteBusinessPartners result = apiInstance.deleteBusinessPartners(businessId, deleteBusinessPartnersDelete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessRelationshipsApi#deleteBusinessPartners");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **deleteBusinessPartnersDelete** | [**DeleteBusinessPartnersDelete**](DeleteBusinessPartnersDelete.md)|  |

### Return type

[**DeleteBusinessPartners**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getBusinessEmployers

> GetBusinessEmployers200Response getBusinessEmployers(assetsSummary, bookmark, pageSize)

List business employers for user

Get all of the viewing user&#39;s business employers.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessRelationshipsApi;

BusinessAccessRelationshipsApi apiInstance = new BusinessAccessRelationshipsApi();
Boolean assetsSummary = true; // Boolean | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    GetBusinessEmployers200Response result = apiInstance.getBusinessEmployers(assetsSummary, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessRelationshipsApi#getBusinessEmployers");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsSummary** | **Boolean**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to true]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBusinessMembers

> GetBusinessEmployers200Response getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)

Get business members

Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessRelationshipsApi;

BusinessAccessRelationshipsApi apiInstance = new BusinessAccessRelationshipsApi();
String businessId = null; // String | Unique identifier of the requesting business.
Boolean fetchSystemUsers = false; // Boolean | Fetches system users if True. Fetches regular user employees if False.
Boolean assetsSummary = false; // Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
List<MemberBusinessRole> businessRoles = null; // List<MemberBusinessRole> | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
String memberIds = null; // String | A list of business members ids separated by comma.
Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    GetBusinessEmployers200Response result = apiInstance.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessRelationshipsApi#getBusinessMembers");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **fetchSystemUsers** | **Boolean**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false]
 **assetsSummary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **businessRoles** | [**List&lt;MemberBusinessRole&gt;**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] [default to null]
 **memberIds** | **String**| A list of business members ids separated by comma. | [optional] [default to null]
 **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBusinessPartners

> GetBusinessEmployers200Response getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize)

Get business partners

Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessRelationshipsApi;

BusinessAccessRelationshipsApi apiInstance = new BusinessAccessRelationshipsApi();
String businessId = null; // String | Unique identifier of the requesting business.
Boolean assetsSummary = false; // Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
PartnerType partnerType = null; // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
String partnerIds = null; // String | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
Boolean sortAscending = null; // Boolean | Sort ascending.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    GetBusinessEmployers200Response result = apiInstance.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessRelationshipsApi#getBusinessPartners");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **assetsSummary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **partnerType** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to null] [enum: INTERNAL, EXTERNAL]
 **partnerIds** | **String**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] [default to null]
 **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sortAscending** | **Boolean**| Sort ascending. | [optional] [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## systemUserUpdate

> systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody)

Update a system user information.

Update a system user information such as name.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessRelationshipsApi;

BusinessAccessRelationshipsApi apiInstance = new BusinessAccessRelationshipsApi();
String businessId = null; // String | Unique identifier of the requesting business.
String systemUserId = null; // String | Unique identifier of a system user.
SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody = new SystemUserUpdateWithRequiredBody(); // SystemUserUpdateWithRequiredBody | 
try {
    apiInstance.systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessRelationshipsApi#systemUserUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **systemUserId** | **String**| Unique identifier of a system user. | [default to null]
 **systemUserUpdateWithRequiredBody** | [**SystemUserUpdateWithRequiredBody**](SystemUserUpdateWithRequiredBody.md)|  |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateBusinessMemberships

> UpdateBusinessMembershipsResponse updateBusinessMemberships(businessId, businessMembershipMember)

Update member&#39;s business role

Update a member&#39;s business role within the business.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessRelationshipsApi;

BusinessAccessRelationshipsApi apiInstance = new BusinessAccessRelationshipsApi();
String businessId = null; // String | Business id
List<BusinessMembershipMember> businessMembershipMember = Arrays.asList(new BusinessMembershipMember()); // List<BusinessMembershipMember> | 
try {
    UpdateBusinessMembershipsResponse result = apiInstance.updateBusinessMemberships(businessId, businessMembershipMember);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessRelationshipsApi#updateBusinessMemberships");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Business id | [default to null]
 **businessMembershipMember** | [**List&lt;BusinessMembershipMember&gt;**](BusinessMembershipMember.md)|  |

### Return type

[**UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

