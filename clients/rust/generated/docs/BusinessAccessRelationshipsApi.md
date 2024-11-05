# \BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_business_membership**](BusinessAccessRelationshipsApi.md#delete_business_membership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**delete_business_partners**](BusinessAccessRelationshipsApi.md#delete_business_partners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**get_slash_business_employers**](BusinessAccessRelationshipsApi.md#get_slash_business_employers) | **GET** /businesses/employers | List business employers for user
[**get_slash_business_members**](BusinessAccessRelationshipsApi.md#get_slash_business_members) | **GET** /businesses/{business_id}/members | Get business members
[**get_slash_business_partners**](BusinessAccessRelationshipsApi.md#get_slash_business_partners) | **GET** /businesses/{business_id}/partners | Get business partners
[**update_slash_business_memberships**](BusinessAccessRelationshipsApi.md#update_slash_business_memberships) | **PATCH** /businesses/{business_id}/members | Update member's business role



## delete_business_membership

> models::DeletedMembersResponse delete_business_membership(business_id, members_to_delete_body)
Terminate business memberships

Terminate memberships between the specified members and your business.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Business id | [required] |
**members_to_delete_body** | [**MembersToDeleteBody**](MembersToDeleteBody.md) | List of members with role to delete. | [required] |

### Return type

[**models::DeletedMembersResponse**](DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_business_partners

> models::DeletePartnersResponse delete_business_partners(business_id, delete_partners_request)
Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**delete_partners_request** | [**DeletePartnersRequest**](DeletePartnersRequest.md) | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete.  | [required] |

### Return type

[**models::DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_slash_business_employers

> models::GetBusinessEmployers200Response get_slash_business_employers(page_size, bookmark)
List business employers for user

Get all of the viewing user's business employers.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |

### Return type

[**models::GetBusinessEmployers200Response**](get_business_employers_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_slash_business_members

> models::GetBusinessMembers200Response get_slash_business_members(business_id, assets_summary, business_roles, member_ids, start_index, bookmark, page_size)
Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**assets_summary** | Option<**bool**> | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are |  |[default to false]
**business_roles** | Option<[**Vec<models::MemberBusinessRole>**](models::MemberBusinessRole.md)> | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. |  |
**member_ids** | Option<**String**> | A list of business members ids separated by comma. |  |
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**models::GetBusinessMembers200Response**](get_business_members_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_slash_business_partners

> models::GetBusinessPartners200Response get_slash_business_partners(business_id, assets_summary, partner_type, partner_ids, start_index, page_size, bookmark)
Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**assets_summary** | Option<**bool**> | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are |  |[default to false]
**partner_type** | Option<[**PartnerType**](.md)> | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. |  |
**partner_ids** | Option<**String**> | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. |  |
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |

### Return type

[**models::GetBusinessPartners200Response**](get_business_partners_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_slash_business_memberships

> models::UpdateMemberResultsResponseArray update_slash_business_memberships(business_id, update_member_business_role_body)
Update member's business role

Update a member's business role within the business.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Business id | [required] |
**update_member_business_role_body** | [**Vec<models::UpdateMemberBusinessRoleBody>**](UpdateMemberBusinessRoleBody.md) | List of objects with the member id and the business_role. | [required] |

### Return type

[**models::UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

