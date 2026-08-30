# BUSINESSACCESSRELATIONSHIPS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**brand_accounts_create**](BUSINESSACCESSRELATIONSHIPS_API.md#brand_accounts_create) | **Post** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**brand_accounts_update**](BUSINESSACCESSRELATIONSHIPS_API.md#brand_accounts_update) | **Patch** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**business_employers**](BUSINESSACCESSRELATIONSHIPS_API.md#business_employers) | **Get** /businesses/employers | List business employers for user
[**business_members**](BUSINESSACCESSRELATIONSHIPS_API.md#business_members) | **Get** /businesses/{business_id}/members | Get business members
[**business_partners**](BUSINESSACCESSRELATIONSHIPS_API.md#business_partners) | **Get** /businesses/{business_id}/partners | Get business partners
[**delete_business_membership**](BUSINESSACCESSRELATIONSHIPS_API.md#delete_business_membership) | **Delete** /businesses/{business_id}/members | Terminate business memberships
[**delete_business_partners**](BUSINESSACCESSRELATIONSHIPS_API.md#delete_business_partners) | **Delete** /businesses/{business_id}/partners | Terminate business partnerships
[**system_user_update**](BUSINESSACCESSRELATIONSHIPS_API.md#system_user_update) | **Patch** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**update_business_memberships**](BUSINESSACCESSRELATIONSHIPS_API.md#update_business_memberships) | **Patch** /businesses/{business_id}/members | Update member&#39;s business role


# **brand_accounts_create**
> brand_accounts_create (business_hierarchy_id: STRING_32 ; brand_account_create: BRAND_ACCOUNT_CREATE ): detachable BRAND_ACCOUNT


Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_hierarchy_id** | **STRING_32**| business hierarchy node id | [default to null]
 **brand_account_create** | [**BRAND_ACCOUNT_CREATE**](BRAND_ACCOUNT_CREATE.md)|  | 

### Return type

[**BRAND_ACCOUNT**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **brand_accounts_update**
> brand_accounts_update (brand_account_id: STRING_32 ; business_hierarchy_id: STRING_32 ; brand_account_update: BRAND_ACCOUNT_UPDATE ): detachable BRAND_ACCOUNT


Update a Brand Account

Update an existing Brand Account


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand_account_id** | **STRING_32**|  | [default to null]
 **business_hierarchy_id** | **STRING_32**| business hierarchy node id | [default to null]
 **brand_account_update** | [**BRAND_ACCOUNT_UPDATE**](BRAND_ACCOUNT_UPDATE.md)|  | 

### Return type

[**BRAND_ACCOUNT**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_employers**
> business_employers (assets_summary:  detachable BOOLEAN ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable GET_BUSINESS_EMPLOYERS_200_RESPONSE


List business employers for user

Get all of the viewing user's business employers.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assets_summary** | **BOOLEAN**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to true]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GET_BUSINESS_EMPLOYERS_200_RESPONSE**](get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_members**
> business_members (business_id: STRING_32 ; fetch_system_users:  detachable BOOLEAN ; assets_summary:  detachable BOOLEAN ; business_roles:  detachable LIST [MEMBER_BUSINESS_ROLE] ; member_ids:  detachable STRING_32 ; start_index:  detachable INTEGER_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable GET_BUSINESS_EMPLOYERS_200_RESPONSE


Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **fetch_system_users** | **BOOLEAN**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false]
 **assets_summary** | **BOOLEAN**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **business_roles** | [**LIST [MEMBER_BUSINESS_ROLE]**](MEMBER_BUSINESS_ROLE.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] [default to null]
 **member_ids** | **STRING_32**| A list of business members ids separated by comma. | [optional] [default to null]
 **start_index** | **INTEGER_32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GET_BUSINESS_EMPLOYERS_200_RESPONSE**](get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_partners**
> business_partners (business_id: STRING_32 ; assets_summary:  detachable BOOLEAN ; partner_type:  detachable PARTNER_TYPE ; partner_ids:  detachable STRING_32 ; start_index:  detachable INTEGER_32 ; sort_ascending:  detachable BOOLEAN ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable GET_BUSINESS_EMPLOYERS_200_RESPONSE


Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **assets_summary** | **BOOLEAN**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **partner_type** | [**PARTNER_TYPE**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to null]
 **partner_ids** | **STRING_32**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] [default to null]
 **start_index** | **INTEGER_32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sort_ascending** | **BOOLEAN**| Sort ascending. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GET_BUSINESS_EMPLOYERS_200_RESPONSE**](get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_membership**
> delete_business_membership (business_id: STRING_32 ; delete_business_membership_body: DELETE_BUSINESS_MEMBERSHIP_BODY ): detachable DELETE_BUSINESS_MEMBERSHIP_200_RESPONSE


Terminate business memberships

Terminate memberships between the specified members and your business.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Business id | [default to null]
 **delete_business_membership_body** | [**DELETE_BUSINESS_MEMBERSHIP_BODY**](DELETE_BUSINESS_MEMBERSHIP_BODY.md)|  | 

### Return type

[**DELETE_BUSINESS_MEMBERSHIP_200_RESPONSE**](delete_business_membership_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_partners**
> delete_business_partners (business_id: STRING_32 ; delete_business_partners_delete: DELETE_BUSINESS_PARTNERS_DELETE ): detachable DELETE_BUSINESS_PARTNERS


Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **delete_business_partners_delete** | [**DELETE_BUSINESS_PARTNERS_DELETE**](DELETE_BUSINESS_PARTNERS_DELETE.md)|  | 

### Return type

[**DELETE_BUSINESS_PARTNERS**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **system_user_update**
> system_user_update (business_id: STRING_32 ; system_user_id: STRING_32 ; system_user_update_with_required_body: SYSTEM_USER_UPDATE_WITH_REQUIRED_BODY )


Update a system user information.

Update a system user information such as name.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **system_user_id** | **STRING_32**| Unique identifier of a system user. | [default to null]
 **system_user_update_with_required_body** | [**SYSTEM_USER_UPDATE_WITH_REQUIRED_BODY**](SYSTEM_USER_UPDATE_WITH_REQUIRED_BODY.md)|  | 

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_memberships**
> update_business_memberships (business_id: STRING_32 ; business_membership_member: LIST [BUSINESS_MEMBERSHIP_MEMBER] ): detachable UPDATE_BUSINESS_MEMBERSHIPS_RESPONSE


Update member's business role

Update a member's business role within the business.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Business id | [default to null]
 **business_membership_member** | [**LIST [BUSINESS_MEMBERSHIP_MEMBER]**](BusinessMembershipMember.md)|  | 

### Return type

[**UPDATE_BUSINESS_MEMBERSHIPS_RESPONSE**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

