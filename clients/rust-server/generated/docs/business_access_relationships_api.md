# business_access_relationships_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**get/business_employers**](business_access_relationships_api.md#get/business_employers) | **GET** /businesses/employers | List business employers for user
**brand_accounts/create**](business_access_relationships_api.md#brand_accounts/create) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
**delete_business_membership**](business_access_relationships_api.md#delete_business_membership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
**delete_business_partners**](business_access_relationships_api.md#delete_business_partners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
**get/business_members**](business_access_relationships_api.md#get/business_members) | **GET** /businesses/{business_id}/members | Get business members
**get/business_partners**](business_access_relationships_api.md#get/business_partners) | **GET** /businesses/{business_id}/partners | Get business partners
**update/business_memberships**](business_access_relationships_api.md#update/business_memberships) | **PATCH** /businesses/{business_id}/members | Update member's business role
**brand_accounts/update**](business_access_relationships_api.md#brand_accounts/update) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
**system_user/update**](business_access_relationships_api.md#system_user/update) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.


# **get/business_employers**
> models::GetBusinessEmployers200Response get/business_employers(ctx, optional)
List business employers for user

Get all of the viewing user's business employers.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assets_summary** | **bool**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [default to true]
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::GetBusinessEmployers200Response**](get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **brand_accounts/create**
> models::BrandAccount brand_accounts/create(ctx, business_hierarchy_id, brand_account_create)
Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_hierarchy_id** | **String**| business hierarchy node id | 
  **brand_account_create** | [**BrandAccountCreate**](BrandAccountCreate.md)|  | 

### Return type

[**models::BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_membership**
> models::DeleteBusinessMembership200Response delete_business_membership(ctx, business_id, delete_business_membership_body)
Terminate business memberships

Terminate memberships between the specified members and your business.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Business id | 
  **delete_business_membership_body** | [**DeleteBusinessMembershipBody**](DeleteBusinessMembershipBody.md)|  | 

### Return type

[**models::DeleteBusinessMembership200Response**](delete_business_membership_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_partners**
> models::DeleteBusinessPartners delete_business_partners(ctx, business_id, delete_business_partners_delete)
Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **delete_business_partners_delete** | [**DeleteBusinessPartnersDelete**](DeleteBusinessPartnersDelete.md)|  | 

### Return type

[**models::DeleteBusinessPartners**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get/business_members**
> models::GetBusinessEmployers200Response get/business_members(ctx, business_id, optional)
Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **String**| Unique identifier of the requesting business. | 
 **fetch_system_users** | **bool**| Fetches system users if True. Fetches regular user employees if False. | [default to false]
 **assets_summary** | **bool**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [default to false]
 **business_roles** | [**models::MemberBusinessRole**](models::MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | 
 **member_ids** | **String**| A list of business members ids separated by comma. | 
 **start_index** | **u32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::GetBusinessEmployers200Response**](get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get/business_partners**
> models::GetBusinessEmployers200Response get/business_partners(ctx, business_id, optional)
Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **String**| Unique identifier of the requesting business. | 
 **assets_summary** | **bool**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [default to false]
 **partner_type** | [****](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. | 
 **partner_ids** | **String**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | 
 **start_index** | **u32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **sort_ascending** | **bool**| Sort ascending. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::GetBusinessEmployers200Response**](get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update/business_memberships**
> models::UpdateBusinessMembershipsResponse update/business_memberships(ctx, business_id, business_membership_member)
Update member's business role

Update a member's business role within the business.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Business id | 
  **business_membership_member** | [**BusinessMembershipMember**](BusinessMembershipMember.md)|  | 

### Return type

[**models::UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **brand_accounts/update**
> models::BrandAccount brand_accounts/update(ctx, brand_account_id, business_hierarchy_id, brand_account_update)
Update a Brand Account

Update an existing Brand Account

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **brand_account_id** | **String**|  | 
  **business_hierarchy_id** | **String**| business hierarchy node id | 
  **brand_account_update** | [**BrandAccountUpdate**](BrandAccountUpdate.md)|  | 

### Return type

[**models::BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **system_user/update**
> system_user/update(ctx, business_id, system_user_id, system_user_update_with_required_body)
Update a system user information.

Update a system user information such as name.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **system_user_id** | **String**| Unique identifier of a system user. | 
  **system_user_update_with_required_body** | [**SystemUserUpdateWithRequiredBody**](SystemUserUpdateWithRequiredBody.md)|  | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

