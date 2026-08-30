# \BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brand_accounts_slash_create**](BusinessAccessRelationshipsApi.md#brand_accounts_slash_create) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**brand_accounts_slash_update**](BusinessAccessRelationshipsApi.md#brand_accounts_slash_update) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**delete_business_membership**](BusinessAccessRelationshipsApi.md#delete_business_membership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**delete_business_partners**](BusinessAccessRelationshipsApi.md#delete_business_partners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**get_slash_business_employers**](BusinessAccessRelationshipsApi.md#get_slash_business_employers) | **GET** /businesses/employers | List business employers for user
[**get_slash_business_members**](BusinessAccessRelationshipsApi.md#get_slash_business_members) | **GET** /businesses/{business_id}/members | Get business members
[**get_slash_business_partners**](BusinessAccessRelationshipsApi.md#get_slash_business_partners) | **GET** /businesses/{business_id}/partners | Get business partners
[**system_user_slash_update**](BusinessAccessRelationshipsApi.md#system_user_slash_update) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**update_slash_business_memberships**](BusinessAccessRelationshipsApi.md#update_slash_business_memberships) | **PATCH** /businesses/{business_id}/members | Update member's business role



## brand_accounts_slash_create

> models::BrandAccount brand_accounts_slash_create(business_hierarchy_id, brand_account_create)
Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_hierarchy_id** | **String** | business hierarchy node id | [required] |
**brand_account_create** | [**BrandAccountCreate**](BrandAccountCreate.md) |  | [required] |

### Return type

[**models::BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## brand_accounts_slash_update

> models::BrandAccount brand_accounts_slash_update(brand_account_id, business_hierarchy_id, brand_account_update)
Update a Brand Account

Update an existing Brand Account

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**brand_account_id** | **String** |  | [required] |
**business_hierarchy_id** | **String** | business hierarchy node id | [required] |
**brand_account_update** | [**BrandAccountUpdate**](BrandAccountUpdate.md) |  | [required] |

### Return type

[**models::BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_business_membership

> models::DeleteBusinessMembership200Response delete_business_membership(business_id, delete_business_membership_body)
Terminate business memberships

Terminate memberships between the specified members and your business.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Business id | [required] |
**delete_business_membership_body** | [**DeleteBusinessMembershipBody**](DeleteBusinessMembershipBody.md) |  | [required] |

### Return type

[**models::DeleteBusinessMembership200Response**](delete_business_membership_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_business_partners

> models::DeleteBusinessPartners delete_business_partners(business_id, delete_business_partners_delete)
Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**delete_business_partners_delete** | [**DeleteBusinessPartnersDelete**](DeleteBusinessPartnersDelete.md) |  | [required] |

### Return type

[**models::DeleteBusinessPartners**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_slash_business_employers

> models::GetBusinessEmployers200Response get_slash_business_employers(assets_summary, bookmark, page_size)
List business employers for user

Get all of the viewing user's business employers.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**assets_summary** | Option<**bool**> | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are |  |[default to true]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]

### Return type

[**models::GetBusinessEmployers200Response**](get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_slash_business_members

> models::GetBusinessEmployers200Response get_slash_business_members(business_id, fetch_system_users, assets_summary, business_roles, member_ids, start_index, bookmark, page_size)
Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**fetch_system_users** | Option<**bool**> | Fetches system users if True. Fetches regular user employees if False. |  |[default to false]
**assets_summary** | Option<**bool**> | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are |  |[default to false]
**business_roles** | Option<[**Vec<models::MemberBusinessRole>**](Models__MemberBusinessRole.md)> | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. |  |
**member_ids** | Option<**String**> | A list of business members ids separated by comma. |  |
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]

### Return type

[**models::GetBusinessEmployers200Response**](get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_slash_business_partners

> models::GetBusinessEmployers200Response get_slash_business_partners(business_id, assets_summary, partner_type, partner_ids, start_index, sort_ascending, bookmark, page_size)
Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**assets_summary** | Option<**bool**> | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are |  |[default to false]
**partner_type** | Option<[**PartnerType**](PartnerType.md)> | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. |  |
**partner_ids** | Option<**String**> | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. |  |
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**sort_ascending** | Option<**bool**> | Sort ascending. |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]

### Return type

[**models::GetBusinessEmployers200Response**](get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## system_user_slash_update

> system_user_slash_update(business_id, system_user_id, system_user_update_with_required_body)
Update a system user information.

Update a system user information such as name.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**system_user_id** | **String** | Unique identifier of a system user. | [required] |
**system_user_update_with_required_body** | [**SystemUserUpdateWithRequiredBody**](SystemUserUpdateWithRequiredBody.md) |  | [required] |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_slash_business_memberships

> models::UpdateBusinessMembershipsResponse update_slash_business_memberships(business_id, business_membership_member)
Update member's business role

Update a member's business role within the business.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Business id | [required] |
**business_membership_member** | [**Vec<models::BusinessMembershipMember>**](BusinessMembershipMember.md) |  | [required] |

### Return type

[**models::UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

