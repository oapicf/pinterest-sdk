# WWW::OpenAPIClient::BusinessAccessRelationshipsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BusinessAccessRelationshipsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_business_membership**](BusinessAccessRelationshipsApi.md#delete_business_membership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**delete_business_partners**](BusinessAccessRelationshipsApi.md#delete_business_partners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**get_business_employers**](BusinessAccessRelationshipsApi.md#get_business_employers) | **GET** /businesses/employers | List business employers for user
[**get_business_members**](BusinessAccessRelationshipsApi.md#get_business_members) | **GET** /businesses/{business_id}/members | Get business members
[**get_business_partners**](BusinessAccessRelationshipsApi.md#get_business_partners) | **GET** /businesses/{business_id}/partners | Get business partners
[**update_business_memberships**](BusinessAccessRelationshipsApi.md#update_business_memberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


# **delete_business_membership**
> DeletedMembersResponse delete_business_membership(business_id => $business_id, members_to_delete_body => $members_to_delete_body)

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

my $business_id = 729090764583391194; # string | Business id
my $members_to_delete_body = WWW::OpenAPIClient::Object::MembersToDeleteBody->new(); # MembersToDeleteBody | List of members with role to delete.

eval {
    my $result = $api_instance->delete_business_membership(business_id => $business_id, members_to_delete_body => $members_to_delete_body);
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
 **members_to_delete_body** | [**MembersToDeleteBody**](MembersToDeleteBody.md)| List of members with role to delete. | 

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_partners**
> DeletePartnersResponse delete_business_partners(business_id => $business_id, delete_partners_request => $delete_partners_request)

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

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $delete_partners_request = WWW::OpenAPIClient::Object::DeletePartnersRequest->new(); # DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 

eval {
    my $result = $api_instance->delete_business_partners(business_id => $business_id, delete_partners_request => $delete_partners_request);
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
 **delete_partners_request** | [**DeletePartnersRequest**](DeletePartnersRequest.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | 

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_employers**
> GetBusinessEmployers200Response get_business_employers(page_size => $page_size, bookmark => $bookmark)

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

my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->get_business_employers(page_size => $page_size, bookmark => $bookmark);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessRelationshipsApi->get_business_employers: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_members**
> GetBusinessMembers200Response get_business_members(business_id => $business_id, assets_summary => $assets_summary, business_roles => $business_roles, member_ids => $member_ids, start_index => $start_index, bookmark => $bookmark, page_size => $page_size)

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

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $assets_summary = false; # boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
my $business_roles = [(new WWW::OpenAPIClient.MemberBusinessRole())]; # ARRAY[MemberBusinessRole] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
my $member_ids = 00101010101,2222220101; # string | A list of business members ids separated by comma.
my $start_index = 0; # int | An index to start fetching the results from. Only the results starting from this index will be returned.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

eval {
    my $result = $api_instance->get_business_members(business_id => $business_id, assets_summary => $assets_summary, business_roles => $business_roles, member_ids => $member_ids, start_index => $start_index, bookmark => $bookmark, page_size => $page_size);
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
 **assets_summary** | **boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **business_roles** | [**ARRAY[MemberBusinessRole]**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **member_ids** | **string**| A list of business members ids separated by comma. | [optional] 
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_partners**
> GetBusinessPartners200Response get_business_partners(business_id => $business_id, assets_summary => $assets_summary, partner_type => $partner_type, partner_ids => $partner_ids, start_index => $start_index, page_size => $page_size, bookmark => $bookmark)

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

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $assets_summary = false; # boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
my $partner_type = INTERNAL; # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
my $partner_ids = 00101010101,2222220101; # string | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
my $start_index = 0; # int | An index to start fetching the results from. Only the results starting from this index will be returned.
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->get_business_partners(business_id => $business_id, assets_summary => $assets_summary, partner_type => $partner_type, partner_ids => $partner_ids, start_index => $start_index, page_size => $page_size, bookmark => $bookmark);
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
 **partner_type** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **partner_ids** | **string**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_memberships**
> UpdateMemberResultsResponseArray update_business_memberships(business_id => $business_id, update_member_business_role_body => $update_member_business_role_body)

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

my $business_id = 729090764583391194; # string | Business id
my $update_member_business_role_body = [WWW::OpenAPIClient::Object::ARRAY[UpdateMemberBusinessRoleBody]->new()]; # ARRAY[UpdateMemberBusinessRoleBody] | List of objects with the member id and the business_role.

eval {
    my $result = $api_instance->update_business_memberships(business_id => $business_id, update_member_business_role_body => $update_member_business_role_body);
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
 **update_member_business_role_body** | [**ARRAY[UpdateMemberBusinessRoleBody]**](UpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. | 

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

