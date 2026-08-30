# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brandAccounts/create**](BusinessAccessRelationshipsApi.md#brandAccounts/create) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account |
| [**brandAccounts/update**](BusinessAccessRelationshipsApi.md#brandAccounts/update) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account |
| [**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
| [**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
| [**get/businessEmployers**](BusinessAccessRelationshipsApi.md#get/businessEmployers) | **GET** /businesses/employers | List business employers for user |
| [**get/businessMembers**](BusinessAccessRelationshipsApi.md#get/businessMembers) | **GET** /businesses/{business_id}/members | Get business members |
| [**get/businessPartners**](BusinessAccessRelationshipsApi.md#get/businessPartners) | **GET** /businesses/{business_id}/partners | Get business partners |
| [**systemUser/update**](BusinessAccessRelationshipsApi.md#systemUser/update) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information. |
| [**update/businessMemberships**](BusinessAccessRelationshipsApi.md#update/businessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role |


<a name="brandAccounts/create"></a>
# **brandAccounts/create**
> BrandAccount brandAccounts/create(business\_hierarchy\_id, BrandAccountCreate)

Create a Brand Account

    Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_hierarchy\_id** | **String**| business hierarchy node id | [default to null] |
| **BrandAccountCreate** | [**BrandAccountCreate**](../Models/BrandAccountCreate.md)|  | |

### Return type

[**BrandAccount**](../Models/BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="brandAccounts/update"></a>
# **brandAccounts/update**
> BrandAccount brandAccounts/update(brand\_account\_id, business\_hierarchy\_id, BrandAccountUpdate)

Update a Brand Account

    Update an existing Brand Account

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brand\_account\_id** | **String**|  | [default to null] |
| **business\_hierarchy\_id** | **String**| business hierarchy node id | [default to null] |
| **BrandAccountUpdate** | [**BrandAccountUpdate**](../Models/BrandAccountUpdate.md)|  | |

### Return type

[**BrandAccount**](../Models/BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteBusinessMembership"></a>
# **deleteBusinessMembership**
> delete_business_membership_200_response deleteBusinessMembership(business\_id, DeleteBusinessMembershipBody)

Terminate business memberships

    Terminate memberships between the specified members and your business.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Business id | [default to null] |
| **DeleteBusinessMembershipBody** | [**DeleteBusinessMembershipBody**](../Models/DeleteBusinessMembershipBody.md)|  | |

### Return type

[**delete_business_membership_200_response**](../Models/delete_business_membership_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteBusinessPartners"></a>
# **deleteBusinessPartners**
> DeleteBusinessPartners deleteBusinessPartners(business\_id, DeleteBusinessPartnersDelete)

Terminate business partnerships

    Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **DeleteBusinessPartnersDelete** | [**DeleteBusinessPartnersDelete**](../Models/DeleteBusinessPartnersDelete.md)|  | |

### Return type

[**DeleteBusinessPartners**](../Models/DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="get/businessEmployers"></a>
# **get/businessEmployers**
> get_business_employers_200_response get/businessEmployers(assets\_summary, bookmark, page\_size)

List business employers for user

    Get all of the viewing user&#39;s business employers.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assets\_summary** | **Boolean**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to true] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**get_business_employers_200_response**](../Models/get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="get/businessMembers"></a>
# **get/businessMembers**
> get_business_employers_200_response get/businessMembers(business\_id, fetch\_system\_users, assets\_summary, business\_roles, member\_ids, start\_index, bookmark, page\_size)

Get business members

    Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **fetch\_system\_users** | **Boolean**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false] |
| **assets\_summary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false] |
| **business\_roles** | [**List**](../Models/MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] [default to null] |
| **member\_ids** | **String**| A list of business members ids separated by comma. | [optional] [default to null] |
| **start\_index** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**get_business_employers_200_response**](../Models/get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="get/businessPartners"></a>
# **get/businessPartners**
> get_business_employers_200_response get/businessPartners(business\_id, assets\_summary, partner\_type, partner\_ids, start\_index, sort\_ascending, bookmark, page\_size)

Get business partners

    Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **assets\_summary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false] |
| **partner\_type** | [**PartnerType**](../Models/.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to null] [enum: INTERNAL, EXTERNAL] |
| **partner\_ids** | **String**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] [default to null] |
| **start\_index** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **sort\_ascending** | **Boolean**| Sort ascending. | [optional] [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**get_business_employers_200_response**](../Models/get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="systemUser/update"></a>
# **systemUser/update**
> systemUser/update(business\_id, system\_user\_id, SystemUserUpdateWithRequiredBody)

Update a system user information.

    Update a system user information such as name.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **system\_user\_id** | **String**| Unique identifier of a system user. | [default to null] |
| **SystemUserUpdateWithRequiredBody** | [**SystemUserUpdateWithRequiredBody**](../Models/SystemUserUpdateWithRequiredBody.md)|  | |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="update/businessMemberships"></a>
# **update/businessMemberships**
> UpdateBusinessMembershipsResponse update/businessMemberships(business\_id, BusinessMembershipMember)

Update member&#39;s business role

    Update a member&#39;s business role within the business.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Business id | [default to null] |
| **BusinessMembershipMember** | [**List**](../Models/BusinessMembershipMember.md)|  | |

### Return type

[**UpdateBusinessMembershipsResponse**](../Models/UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

