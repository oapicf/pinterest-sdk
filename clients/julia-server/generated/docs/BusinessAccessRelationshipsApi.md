# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brand_accounts_create**](BusinessAccessRelationshipsApi.md#brand_accounts_create) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**brand_accounts_update**](BusinessAccessRelationshipsApi.md#brand_accounts_update) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**delete_business_membership**](BusinessAccessRelationshipsApi.md#delete_business_membership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**delete_business_partners**](BusinessAccessRelationshipsApi.md#delete_business_partners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**get_business_employers**](BusinessAccessRelationshipsApi.md#get_business_employers) | **GET** /businesses/employers | List business employers for user
[**get_business_members**](BusinessAccessRelationshipsApi.md#get_business_members) | **GET** /businesses/{business_id}/members | Get business members
[**get_business_partners**](BusinessAccessRelationshipsApi.md#get_business_partners) | **GET** /businesses/{business_id}/partners | Get business partners
[**system_user_update**](BusinessAccessRelationshipsApi.md#system_user_update) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**update_business_memberships**](BusinessAccessRelationshipsApi.md#update_business_memberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


# **brand_accounts_create**
> `brand_accounts_create`(req::`HTTP.Request`, `business_hierarchy_id`::`String`, `brand_account_create`::`BrandAccountCreate`;) -> `BrandAccount`

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_hierarchy_id`** | **`String`**| business hierarchy node id |
**`brand_account_create`** | [**`BrandAccountCreate`**](BrandAccountCreate.md)|  |

### Return type

[**`BrandAccount`**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **brand_accounts_update**
> `brand_accounts_update`(req::`HTTP.Request`, `brand_account_id`::`String`, `business_hierarchy_id`::`String`, `brand_account_update`::`BrandAccountUpdate`;) -> `BrandAccount`

Update a Brand Account

Update an existing Brand Account

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`brand_account_id`** | **`String`**|  |
**`business_hierarchy_id`** | **`String`**| business hierarchy node id |
**`brand_account_update`** | [**`BrandAccountUpdate`**](BrandAccountUpdate.md)|  |

### Return type

[**`BrandAccount`**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_membership**
> `delete_business_membership`(req::`HTTP.Request`, `business_id`::`String`, `delete_business_membership_body`::`DeleteBusinessMembershipBody`;) -> `DeleteBusinessMembership200Response`

Terminate business memberships

Terminate memberships between the specified members and your business.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Business id |
**`delete_business_membership_body`** | [**`DeleteBusinessMembershipBody`**](DeleteBusinessMembershipBody.md)|  |

### Return type

[**`DeleteBusinessMembership200Response`**](DeleteBusinessMembership200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_partners**
> `delete_business_partners`(req::`HTTP.Request`, `business_id`::`String`, `delete_business_partners_delete`::`DeleteBusinessPartnersDelete`;) -> `DeleteBusinessPartners`

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`delete_business_partners_delete`** | [**`DeleteBusinessPartnersDelete`**](DeleteBusinessPartnersDelete.md)|  |

### Return type

[**`DeleteBusinessPartners`**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_employers**
> `get_business_employers`(req::`HTTP.Request`; `assets_summary`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `GetBusinessEmployers200Response`

List business employers for user

Get all of the viewing user's business employers.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`assets_summary`** | **`Bool`**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [default to true]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`GetBusinessEmployers200Response`**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_members**
> `get_business_members`(req::`HTTP.Request`, `business_id`::`String`; `fetch_system_users`=nothing, `assets_summary`=nothing, `business_roles`=nothing, `member_ids`=nothing, `start_index`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `GetBusinessEmployers200Response`

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`fetch_system_users`** | **`Bool`**| Fetches system users if True. Fetches regular user employees if False. | [default to false]
 **`assets_summary`** | **`Bool`**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [default to false]
 **`business_roles`** | [**`Vector{MemberBusinessRole}`**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [default to nothing]
 **`member_ids`** | **`String`**| A list of business members ids separated by comma. | [default to nothing]
 **`start_index`** | **`Int64`**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`GetBusinessEmployers200Response`**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_partners**
> `get_business_partners`(req::`HTTP.Request`, `business_id`::`String`; `assets_summary`=nothing, `partner_type`=nothing, `partner_ids`=nothing, `start_index`=nothing, `sort_ascending`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `GetBusinessEmployers200Response`

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`assets_summary`** | **`Bool`**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [default to false]
 **`partner_type`** | [**`PartnerType`**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [default to nothing]
 **`partner_ids`** | **`String`**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [default to nothing]
 **`start_index`** | **`Int64`**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **`sort_ascending`** | **`Bool`**| Sort ascending. | [default to nothing]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`GetBusinessEmployers200Response`**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **system_user_update**
> `system_user_update`(req::`HTTP.Request`, `business_id`::`String`, `system_user_id`::`String`, `system_user_update_with_required_body`::`SystemUserUpdateWithRequiredBody`;) -> `Nothing`

Update a system user information.

Update a system user information such as name.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`system_user_id`** | **`String`**| Unique identifier of a system user. |
**`system_user_update_with_required_body`** | [**`SystemUserUpdateWithRequiredBody`**](SystemUserUpdateWithRequiredBody.md)|  |

### Return type

`Nothing`

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_memberships**
> `update_business_memberships`(req::`HTTP.Request`, `business_id`::`String`, `business_membership_member`::`Vector{BusinessMembershipMember}`;) -> `UpdateBusinessMembershipsResponse`

Update member's business role

Update a member's business role within the business.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Business id |
**`business_membership_member`** | [**`Vector{BusinessMembershipMember}`**](BusinessMembershipMember.md)|  |

### Return type

[**`UpdateBusinessMembershipsResponse`**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

