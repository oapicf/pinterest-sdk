# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
| [**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
| [**get/businessEmployers**](BusinessAccessRelationshipsApi.md#get/businessEmployers) | **GET** /businesses/employers | List business employers for user |
| [**get/businessMembers**](BusinessAccessRelationshipsApi.md#get/businessMembers) | **GET** /businesses/{business_id}/members | Get business members |
| [**get/businessPartners**](BusinessAccessRelationshipsApi.md#get/businessPartners) | **GET** /businesses/{business_id}/partners | Get business partners |
| [**update/businessMemberships**](BusinessAccessRelationshipsApi.md#update/businessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role |


<a name="deleteBusinessMembership"></a>
# **deleteBusinessMembership**
> DeletedMembersResponse deleteBusinessMembership(business\_id, MembersToDeleteBody)

Terminate business memberships

    Terminate memberships between the specified members and your business.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Business id | [default to null] |
| **MembersToDeleteBody** | [**MembersToDeleteBody**](../Models/MembersToDeleteBody.md)| List of members with role to delete. | |

### Return type

[**DeletedMembersResponse**](../Models/DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteBusinessPartners"></a>
# **deleteBusinessPartners**
> DeletePartnersResponse deleteBusinessPartners(business\_id, DeletePartnersRequest)

Terminate business partnerships

    Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **DeletePartnersRequest** | [**DeletePartnersRequest**](../Models/DeletePartnersRequest.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | |

### Return type

[**DeletePartnersResponse**](../Models/DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="get/businessEmployers"></a>
# **get/businessEmployers**
> get_business_employers_200_response get/businessEmployers(page\_size, bookmark)

List business employers for user

    Get all of the viewing user&#39;s business employers.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**get_business_employers_200_response**](../Models/get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="get/businessMembers"></a>
# **get/businessMembers**
> get_business_members_200_response get/businessMembers(business\_id, assets\_summary, business\_roles, member\_ids, start\_index, bookmark, page\_size)

Get business members

    Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **assets\_summary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false] |
| **business\_roles** | [**List**](../Models/MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] [default to null] |
| **member\_ids** | **String**| A list of business members ids separated by comma. | [optional] [default to null] |
| **start\_index** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**get_business_members_200_response**](../Models/get_business_members_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="get/businessPartners"></a>
# **get/businessPartners**
> get_business_partners_200_response get/businessPartners(business\_id, assets\_summary, partner\_type, partner\_ids, start\_index, page\_size, bookmark)

Get business partners

    Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **assets\_summary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false] |
| **partner\_type** | [**PartnerType**](../Models/.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to null] [enum: INTERNAL, EXTERNAL] |
| **partner\_ids** | **String**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] [default to null] |
| **start\_index** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**get_business_partners_200_response**](../Models/get_business_partners_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="update/businessMemberships"></a>
# **update/businessMemberships**
> UpdateMemberResultsResponseArray update/businessMemberships(business\_id, UpdateMemberBusinessRoleBody)

Update member&#39;s business role

    Update a member&#39;s business role within the business.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Business id | [default to null] |
| **UpdateMemberBusinessRoleBody** | [**List**](../Models/UpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. | |

### Return type

[**UpdateMemberResultsResponseArray**](../Models/UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

