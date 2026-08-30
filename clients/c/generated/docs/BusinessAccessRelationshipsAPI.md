# BusinessAccessRelationshipsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BusinessAccessRelationshipsAPI_brandAccountsCreate**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_brandAccountsCreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**BusinessAccessRelationshipsAPI_brandAccountsUpdate**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_brandAccountsUpdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**BusinessAccessRelationshipsAPI_deleteBusinessMembership**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**BusinessAccessRelationshipsAPI_deleteBusinessPartners**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**BusinessAccessRelationshipsAPI_getBusinessEmployers**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**BusinessAccessRelationshipsAPI_getBusinessMembers**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**BusinessAccessRelationshipsAPI_getBusinessPartners**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**BusinessAccessRelationshipsAPI_systemUserUpdate**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_systemUserUpdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**BusinessAccessRelationshipsAPI_updateBusinessMemberships**](BusinessAccessRelationshipsAPI.md#BusinessAccessRelationshipsAPI_updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


# **BusinessAccessRelationshipsAPI_brandAccountsCreate**
```c
// Create a Brand Account
//
// Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
//
brand_account_t* BusinessAccessRelationshipsAPI_brandAccountsCreate(apiClient_t *apiClient, char *business_hierarchy_id, brand_account_create_t *brand_account_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_hierarchy_id** | **char \*** | business hierarchy node id | 
**brand_account_create** | **[brand_account_create_t](brand_account_create.md) \*** |  | 

### Return type

[brand_account_t](brand_account.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessRelationshipsAPI_brandAccountsUpdate**
```c
// Update a Brand Account
//
// Update an existing Brand Account
//
brand_account_t* BusinessAccessRelationshipsAPI_brandAccountsUpdate(apiClient_t *apiClient, char *brand_account_id, char *business_hierarchy_id, brand_account_update_t *brand_account_update);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**brand_account_id** | **char \*** |  | 
**business_hierarchy_id** | **char \*** | business hierarchy node id | 
**brand_account_update** | **[brand_account_update_t](brand_account_update.md) \*** |  | 

### Return type

[brand_account_t](brand_account.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessRelationshipsAPI_deleteBusinessMembership**
```c
// Terminate business memberships
//
// Terminate memberships between the specified members and your business.
//
delete_business_membership_200_response_t* BusinessAccessRelationshipsAPI_deleteBusinessMembership(apiClient_t *apiClient, char *business_id, delete_business_membership_body_t *delete_business_membership_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Business id | 
**delete_business_membership_body** | **[delete_business_membership_body_t](delete_business_membership_body.md) \*** |  | 

### Return type

[delete_business_membership_200_response_t](delete_business_membership_200_response.md) *


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
delete_business_partners_t* BusinessAccessRelationshipsAPI_deleteBusinessPartners(apiClient_t *apiClient, char *business_id, delete_business_partners_delete_t *delete_business_partners_delete);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**delete_business_partners_delete** | **[delete_business_partners_delete_t](delete_business_partners_delete.md) \*** |  | 

### Return type

[delete_business_partners_t](delete_business_partners.md) *


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
get_business_employers_200_response_t* BusinessAccessRelationshipsAPI_getBusinessEmployers(apiClient_t *apiClient, int *assets_summary, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**assets_summary** | **int \*** | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to true]
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
get_business_employers_200_response_t* BusinessAccessRelationshipsAPI_getBusinessMembers(apiClient_t *apiClient, char *business_id, int *fetch_system_users, int *assets_summary, list_t *business_roles, char *member_ids, int *start_index, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**fetch_system_users** | **int \*** | Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false]
**assets_summary** | **int \*** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
**business_roles** | **[list_t](member_business_role.md) \*** | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
**member_ids** | **char \*** | A list of business members ids separated by comma. | [optional] 
**start_index** | **int \*** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[get_business_employers_200_response_t](get_business_employers_200_response.md) *


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
get_business_employers_200_response_t* BusinessAccessRelationshipsAPI_getBusinessPartners(apiClient_t *apiClient, char *business_id, int *assets_summary, partner_type_e partner_type, char *partner_ids, int *start_index, int *sort_ascending, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**assets_summary** | **int \*** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
**partner_type** | **partner_type_e** | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
**partner_ids** | **char \*** | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
**start_index** | **int \*** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
**sort_ascending** | **int \*** | Sort ascending. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[get_business_employers_200_response_t](get_business_employers_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessRelationshipsAPI_systemUserUpdate**
```c
// Update a system user information.
//
// Update a system user information such as name.
//
void BusinessAccessRelationshipsAPI_systemUserUpdate(apiClient_t *apiClient, char *business_id, char *system_user_id, system_user_update_with_required_body_t *system_user_update_with_required_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**system_user_id** | **char \*** | Unique identifier of a system user. | 
**system_user_update_with_required_body** | **[system_user_update_with_required_body_t](system_user_update_with_required_body.md) \*** |  | 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessRelationshipsAPI_updateBusinessMemberships**
```c
// Update member's business role
//
// Update a member's business role within the business.
//
update_business_memberships_response_t* BusinessAccessRelationshipsAPI_updateBusinessMemberships(apiClient_t *apiClient, char *business_id, list_t *business_membership_member);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Business id | 
**business_membership_member** | **[list_t](business_membership_member.md) \*** |  | 

### Return type

[update_business_memberships_response_t](update_business_memberships_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

