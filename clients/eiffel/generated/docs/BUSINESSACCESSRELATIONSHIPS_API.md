# BUSINESSACCESSRELATIONSHIPS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**business_employers**](BUSINESSACCESSRELATIONSHIPS_API.md#business_employers) | **Get** /businesses/employers | List business employers for user
[**business_members**](BUSINESSACCESSRELATIONSHIPS_API.md#business_members) | **Get** /businesses/{business_id}/members | Get business members
[**business_partners**](BUSINESSACCESSRELATIONSHIPS_API.md#business_partners) | **Get** /businesses/{business_id}/partners | Get business partners
[**delete_business_membership**](BUSINESSACCESSRELATIONSHIPS_API.md#delete_business_membership) | **Delete** /businesses/{business_id}/members | Terminate business memberships
[**delete_business_partners**](BUSINESSACCESSRELATIONSHIPS_API.md#delete_business_partners) | **Delete** /businesses/{business_id}/partners | Terminate business partnerships
[**update_business_memberships**](BUSINESSACCESSRELATIONSHIPS_API.md#update_business_memberships) | **Patch** /businesses/{business_id}/members | Update member&#39;s business role


# **business_employers**
> business_employers (page_size:  detachable INTEGER_32 ; bookmark:  detachable STRING_32 ): detachable GET_BUSINESS_EMPLOYERS_200_RESPONSE


List business employers for user

Get all of the viewing user's business employers.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**GET_BUSINESS_EMPLOYERS_200_RESPONSE**](get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_members**
> business_members (business_id: STRING_32 ; assets_summary:  detachable BOOLEAN ; business_roles:  detachable LIST [MEMBER_BUSINESS_ROLE] ; member_ids:  detachable STRING_32 ; start_index:  detachable INTEGER_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable GET_BUSINESS_MEMBERS_200_RESPONSE


Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **assets_summary** | **BOOLEAN**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **business_roles** | [**LIST [MEMBER_BUSINESS_ROLE]**](MEMBER_BUSINESS_ROLE.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] [default to null]
 **member_ids** | **STRING_32**| A list of business members ids separated by comma. | [optional] [default to null]
 **start_index** | **INTEGER_32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**GET_BUSINESS_MEMBERS_200_RESPONSE**](get_business_members_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_partners**
> business_partners (business_id: STRING_32 ; assets_summary:  detachable BOOLEAN ; partner_type:  detachable PARTNER_TYPE ; partner_ids:  detachable STRING_32 ; start_index:  detachable INTEGER_32 ; page_size:  detachable INTEGER_32 ; bookmark:  detachable STRING_32 ): detachable GET_BUSINESS_PARTNERS_200_RESPONSE


Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **assets_summary** | **BOOLEAN**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **partner_type** | [**PARTNER_TYPE**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to null]
 **partner_ids** | **STRING_32**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] [default to null]
 **start_index** | **INTEGER_32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**GET_BUSINESS_PARTNERS_200_RESPONSE**](get_business_partners_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_membership**
> delete_business_membership (business_id: STRING_32 ; members_to_delete_body: MEMBERS_TO_DELETE_BODY ): detachable DELETED_MEMBERS_RESPONSE


Terminate business memberships

Terminate memberships between the specified members and your business.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Business id | [default to null]
 **members_to_delete_body** | [**MEMBERS_TO_DELETE_BODY**](MEMBERS_TO_DELETE_BODY.md)| List of members with role to delete. | 

### Return type

[**DELETED_MEMBERS_RESPONSE**](DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_partners**
> delete_business_partners (business_id: STRING_32 ; delete_partners_request: DELETE_PARTNERS_REQUEST ): detachable DELETE_PARTNERS_RESPONSE


Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **delete_partners_request** | [**DELETE_PARTNERS_REQUEST**](DELETE_PARTNERS_REQUEST.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | 

### Return type

[**DELETE_PARTNERS_RESPONSE**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_memberships**
> update_business_memberships (business_id: STRING_32 ; update_member_business_role_body: LIST [UPDATE_MEMBER_BUSINESS_ROLE_BODY] ): detachable UPDATE_MEMBER_RESULTS_RESPONSE_ARRAY


Update member's business role

Update a member's business role within the business.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Business id | [default to null]
 **update_member_business_role_body** | [**LIST [UPDATE_MEMBER_BUSINESS_ROLE_BODY]**](UpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. | 

### Return type

[**UPDATE_MEMBER_RESULTS_RESPONSE_ARRAY**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

