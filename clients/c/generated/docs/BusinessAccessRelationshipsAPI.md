# BusinessAccessRelationshipsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BusinessAccessRelationshipsAPI_deleteBusinessMembership**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**BusinessAccessRelationshipsAPI_deleteBusinessPartners**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**BusinessAccessRelationshipsAPI_getBusinessEmployers**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**BusinessAccessRelationshipsAPI_getBusinessMembers**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**BusinessAccessRelationshipsAPI_getBusinessPartners**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**BusinessAccessRelationshipsAPI_updateBusinessMemberships**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


# **BusinessAccessRelationshipsAPI_deleteBusinessMembership**
```c
// Terminate business memberships
//
// Terminate memberships between the specified members and your business.
//
deleted_members_response_t* BusinessAccessRelationshipsAPI_deleteBusinessMembership(apiClient_t *apiClient, char *business_id, members_to_delete_body_t *members_to_delete_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Business id | 
**members_to_delete_body** | **[members_to_delete_body_t](members_to_delete_body.md) \*** | List of members with role to delete. | 

### Return type

[deleted_members_response_t](deleted_members_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessRelationshipsAPI_deleteBusinessPartners**
```c
// Terminate business partnerships
//
// Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
//
delete_partners_response_t* BusinessAccessRelationshipsAPI_deleteBusinessPartners(apiClient_t *apiClient, char *business_id, delete_partners_request_t *delete_partners_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**delete_partners_request** | **[delete_partners_request_t](delete_partners_request.md) \*** | An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | 

### Return type

[delete_partners_response_t](delete_partners_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessRelationshipsAPI_getBusinessEmployers**
```c
// List business employers for user
//
// Get all of the viewing user's business employers.
//
get_business_employers_200_response_t* BusinessAccessRelationshipsAPI_getBusinessEmployers(apiClient_t *apiClient, int *page_size, char *bookmark);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 

### Return type

[get_business_employers_200_response_t](get_business_employers_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessRelationshipsAPI_getBusinessMembers**
```c
// Get business members
//
// Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
//
get_business_members_200_response_t* BusinessAccessRelationshipsAPI_getBusinessMembers(apiClient_t *apiClient, char *business_id, int *assets_summary, list_t *business_roles, char *member_ids, int *start_index, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**assets_summary** | **int \*** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
**business_roles** | **[list_t](member_business_role.md) \*** | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
**member_ids** | **char \*** | A list of business members ids separated by comma. | [optional] 
**start_index** | **int \*** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[get_business_members_200_response_t](get_business_members_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessRelationshipsAPI_getBusinessPartners**
```c
// Get business partners
//
// Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
//
get_business_partners_200_response_t* BusinessAccessRelationshipsAPI_getBusinessPartners(apiClient_t *apiClient, char *business_id, int *assets_summary, partner_type_e partner_type, char *partner_ids, int *start_index, int *page_size, char *bookmark);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**assets_summary** | **int \*** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
**partner_type** | **partner_type_e** | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
**partner_ids** | **char \*** | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
**start_index** | **int \*** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 

### Return type

[get_business_partners_200_response_t](get_business_partners_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessRelationshipsAPI_updateBusinessMemberships**
```c
// Update member's business role
//
// Update a member's business role within the business.
//
update_member_results_response_array_t* BusinessAccessRelationshipsAPI_updateBusinessMemberships(apiClient_t *apiClient, char *business_id, list_t *update_member_business_role_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Business id | 
**update_member_business_role_body** | **[list_t](update_member_business_role_body.md) \*** | List of objects with the member id and the business_role. | 

### Return type

[update_member_results_response_array_t](update_member_results_response_array.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

