# WWW::OpenAPIClient::BusinessAccessRelationshipsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BusinessAccessRelationshipsApi;
```

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
> BrandAccount brand_accounts_create(business_hierarchy_id => $business_hierarchy_id, brand_account_create => $brand_account_create)

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessRelationshipsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessRelationshipsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_hierarchy_id = "business_hierarchy_id_example"; # string | business hierarchy node id
my $brand_account_create = WWW::OpenAPIClient::Object::BrandAccountCreate->new(); # BrandAccountCreate | 

eval {
    my $result = $api_instance->brand_accounts_create(business_hierarchy_id => $business_hierarchy_id, brand_account_create => $brand_account_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessRelationshipsApi->brand_accounts_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_hierarchy_id** | **string**| business hierarchy node id | 
 **brand_account_create** | [**BrandAccountCreate**](BrandAccountCreate.md)|  | 

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **brand_accounts_update**
> BrandAccount brand_accounts_update(brand_account_id => $brand_account_id, business_hierarchy_id => $business_hierarchy_id, brand_account_update => $brand_account_update)

Update a Brand Account

Update an existing Brand Account

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessRelationshipsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessRelationshipsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $brand_account_id = "brand_account_id_example"; # string | 
my $business_hierarchy_id = "business_hierarchy_id_example"; # string | business hierarchy node id
my $brand_account_update = WWW::OpenAPIClient::Object::BrandAccountUpdate->new(); # BrandAccountUpdate | 

eval {
    my $result = $api_instance->brand_accounts_update(brand_account_id => $brand_account_id, business_hierarchy_id => $business_hierarchy_id, brand_account_update => $brand_account_update);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessRelationshipsApi->brand_accounts_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand_account_id** | **string**|  | 
 **business_hierarchy_id** | **string**| business hierarchy node id | 
 **brand_account_update** | [**BrandAccountUpdate**](BrandAccountUpdate.md)|  | 

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_membership**
> DeleteBusinessMembership200Response delete_business_membership(business_id => $business_id, delete_business_membership_body => $delete_business_membership_body)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessRelationshipsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessRelationshipsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = "business_id_example"; # string | Business id
my $delete_business_membership_body = WWW::OpenAPIClient::Object::DeleteBusinessMembershipBody->new(); # DeleteBusinessMembershipBody | 

eval {
    my $result = $api_instance->delete_business_membership(business_id => $business_id, delete_business_membership_body => $delete_business_membership_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessRelationshipsApi->delete_business_membership: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Business id | 
 **delete_business_membership_body** | [**DeleteBusinessMembershipBody**](DeleteBusinessMembershipBody.md)|  | 

### Return type

[**DeleteBusinessMembership200Response**](DeleteBusinessMembership200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_partners**
> DeleteBusinessPartners delete_business_partners(business_id => $business_id, delete_business_partners_delete => $delete_business_partners_delete)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessRelationshipsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessRelationshipsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = "business_id_example"; # string | Unique identifier of the requesting business.
my $delete_business_partners_delete = WWW::OpenAPIClient::Object::DeleteBusinessPartnersDelete->new(); # DeleteBusinessPartnersDelete | 

eval {
    my $result = $api_instance->delete_business_partners(business_id => $business_id, delete_business_partners_delete => $delete_business_partners_delete);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessRelationshipsApi->delete_business_partners: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **delete_business_partners_delete** | [**DeleteBusinessPartnersDelete**](DeleteBusinessPartnersDelete.md)|  | 

### Return type

[**DeleteBusinessPartners**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_employers**
> GetBusinessEmployers200Response get_business_employers(assets_summary => $assets_summary, bookmark => $bookmark, page_size => $page_size)

List business employers for user

Get all of the viewing user's business employers.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessRelationshipsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessRelationshipsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $assets_summary = true; # boolean | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->get_business_employers(assets_summary => $assets_summary, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessRelationshipsApi->get_business_employers: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assets_summary** | **boolean**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to true]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_members**
> GetBusinessEmployers200Response get_business_members(business_id => $business_id, fetch_system_users => $fetch_system_users, assets_summary => $assets_summary, business_roles => $business_roles, member_ids => $member_ids, start_index => $start_index, bookmark => $bookmark, page_size => $page_size)

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessRelationshipsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessRelationshipsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = "business_id_example"; # string | Unique identifier of the requesting business.
my $fetch_system_users = false; # boolean | Fetches system users if True. Fetches regular user employees if False.
my $assets_summary = false; # boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
my $business_roles = [(new WWW::OpenAPIClient.MemberBusinessRole())]; # ARRAY[MemberBusinessRole] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
my $member_ids = "member_ids_example"; # string | A list of business members ids separated by comma.
my $start_index = 0; # int | An index to start fetching the results from. Only the results starting from this index will be returned.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->get_business_members(business_id => $business_id, fetch_system_users => $fetch_system_users, assets_summary => $assets_summary, business_roles => $business_roles, member_ids => $member_ids, start_index => $start_index, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessRelationshipsApi->get_business_members: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **fetch_system_users** | **boolean**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false]
 **assets_summary** | **boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **business_roles** | [**ARRAY[MemberBusinessRole]**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **member_ids** | **string**| A list of business members ids separated by comma. | [optional] 
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_partners**
> GetBusinessEmployers200Response get_business_partners(business_id => $business_id, assets_summary => $assets_summary, partner_type => $partner_type, partner_ids => $partner_ids, start_index => $start_index, sort_ascending => $sort_ascending, bookmark => $bookmark, page_size => $page_size)

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessRelationshipsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessRelationshipsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = "business_id_example"; # string | Unique identifier of the requesting business.
my $assets_summary = false; # boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
my $partner_type = new WWW::OpenAPIClient.PartnerType(); # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
my $partner_ids = "partner_ids_example"; # string | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
my $start_index = 0; # int | An index to start fetching the results from. Only the results starting from this index will be returned.
my $sort_ascending = null; # boolean | Sort ascending.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->get_business_partners(business_id => $business_id, assets_summary => $assets_summary, partner_type => $partner_type, partner_ids => $partner_ids, start_index => $start_index, sort_ascending => $sort_ascending, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessRelationshipsApi->get_business_partners: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **assets_summary** | **boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **partner_type** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **partner_ids** | **string**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sort_ascending** | **boolean**| Sort ascending. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **system_user_update**
> system_user_update(business_id => $business_id, system_user_id => $system_user_id, system_user_update_with_required_body => $system_user_update_with_required_body)

Update a system user information.

Update a system user information such as name.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessRelationshipsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessRelationshipsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = "business_id_example"; # string | Unique identifier of the requesting business.
my $system_user_id = "system_user_id_example"; # string | Unique identifier of a system user.
my $system_user_update_with_required_body = WWW::OpenAPIClient::Object::SystemUserUpdateWithRequiredBody->new(); # SystemUserUpdateWithRequiredBody | 

eval {
    $api_instance->system_user_update(business_id => $business_id, system_user_id => $system_user_id, system_user_update_with_required_body => $system_user_update_with_required_body);
};
if ($@) {
    warn "Exception when calling BusinessAccessRelationshipsApi->system_user_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **system_user_id** | **string**| Unique identifier of a system user. | 
 **system_user_update_with_required_body** | [**SystemUserUpdateWithRequiredBody**](SystemUserUpdateWithRequiredBody.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_memberships**
> UpdateBusinessMembershipsResponse update_business_memberships(business_id => $business_id, business_membership_member => $business_membership_member)

Update member's business role

Update a member's business role within the business.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessRelationshipsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessRelationshipsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = "business_id_example"; # string | Business id
my $business_membership_member = [WWW::OpenAPIClient::Object::ARRAY[BusinessMembershipMember]->new()]; # ARRAY[BusinessMembershipMember] | 

eval {
    my $result = $api_instance->update_business_memberships(business_id => $business_id, business_membership_member => $business_membership_member);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessRelationshipsApi->update_business_memberships: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Business id | 
 **business_membership_member** | [**ARRAY[BusinessMembershipMember]**](BusinessMembershipMember.md)|  | 

### Return type

[**UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

