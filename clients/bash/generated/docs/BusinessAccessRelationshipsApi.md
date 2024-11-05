# BusinessAccessRelationshipsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](BusinessAccessRelationshipsApi.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](BusinessAccessRelationshipsApi.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](BusinessAccessRelationshipsApi.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**updateBusinessMemberships**](BusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role



## deleteBusinessMembership

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example

```bash
 deleteBusinessMembership business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Business id | [default to null]
 **membersToDeleteBody** | [**MembersToDeleteBody**](MembersToDeleteBody.md) | List of members with role to delete. |

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteBusinessPartners

Terminate business partnerships

Terminate partnerships between the specified partners and your business.
Note: You may only batch terminate partners of the same partner type.

### Example

```bash
 deleteBusinessPartners business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **deletePartnersRequest** | [**DeletePartnersRequest**](DeletePartnersRequest.md) | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. |

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getBusinessEmployers

List business employers for user

Get all of the viewing user's business employers.

### Example

```bash
 getBusinessEmployers  page_size=value  bookmark=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. | [optional] [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getBusinessMembers

Get business members

Get all members of the specified business.
The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example

```bash
 getBusinessMembers business_id=value  assets_summary=value  Specify as:  business_roles=value1 business_roles=value2 business_roles=...  member_ids=value  start_index=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **assetsSummary** | **boolean** | Include assets summary in the response if this is true.

The assets summary returns a dictionary representing a summary of the assets
for the business user ID, with information like the ad accounts and profiles
the user has permissions for and what those permissions are | [optional] [default to false]
 **businessRoles** | [**array[MemberBusinessRole]**](MemberBusinessRole.md) | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] [default to null]
 **memberIds** | **string** | A list of business members ids separated by comma. | [optional] [default to null]
 **startIndex** | **integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getBusinessPartners

Get business partners

Get all partners of the specified business.

If the assets_summary=TRUE and:
- partner_type=INTERNAL, the business assets returned are your business assets the partner has access to.
- partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you
  access to.

### Example

```bash
 getBusinessPartners business_id=value  assets_summary=value  partner_type=value  partner_ids=value  start_index=value  page_size=value  bookmark=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **assetsSummary** | **boolean** | Include assets summary in the response if this is true.

The assets summary returns a dictionary representing a summary of the assets
for the business user ID, with information like the ad accounts and profiles
the user has permissions for and what those permissions are | [optional] [default to false]
 **partnerType** | [**PartnerType**](.md) | Specifies whether to fetch internal or external (shared) partners.
If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br>
If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. | [optional] [default to null]
 **partnerIds** | **string** | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] [default to null]
 **startIndex** | **integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. | [optional] [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateBusinessMemberships

Update member's business role

Update a member's business role within the business.

### Example

```bash
 updateBusinessMemberships business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Business id | [default to null]
 **updateMemberBusinessRoleBody** | [**array[UpdateMemberBusinessRoleBody]**](UpdateMemberBusinessRoleBody.md) | List of objects with the member id and the business_role. |

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

