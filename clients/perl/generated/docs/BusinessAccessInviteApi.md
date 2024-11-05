# WWW::OpenAPIClient::BusinessAccessInviteApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BusinessAccessInviteApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asset_access_requests_create**](BusinessAccessInviteApi.md#asset_access_requests_create) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**cancel_invites_or_requests**](BusinessAccessInviteApi.md#cancel_invites_or_requests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**create_asset_invites**](BusinessAccessInviteApi.md#create_asset_invites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**create_membership_or_partnership_invites**](BusinessAccessInviteApi.md#create_membership_or_partnership_invites) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**get_invites**](BusinessAccessInviteApi.md#get_invites) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**respond_business_access_invites**](BusinessAccessInviteApi.md#respond_business_access_invites) | **PATCH** /businesses/invites | Accept or decline an invite/request


# **asset_access_requests_create**
> CreateAssetAccessRequestResponse asset_access_requests_create(business_id => $business_id, create_asset_access_request_body => $create_asset_access_request_body)

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessInviteApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessInviteApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $create_asset_access_request_body = WWW::OpenAPIClient::Object::CreateAssetAccessRequestBody->new(); # CreateAssetAccessRequestBody | 

eval {
    my $result = $api_instance->asset_access_requests_create(business_id => $business_id, create_asset_access_request_body => $create_asset_access_request_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessInviteApi->asset_access_requests_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **create_asset_access_request_body** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md)|  | 

### Return type

[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_invites_or_requests**
> DeleteInvitesResultsResponseArray cancel_invites_or_requests(business_id => $business_id, cancel_invites_body => $cancel_invites_body)

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessInviteApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessInviteApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Business id
my $cancel_invites_body = WWW::OpenAPIClient::Object::CancelInvitesBody->new(); # CancelInvitesBody | A list with invite ids

eval {
    my $result = $api_instance->cancel_invites_or_requests(business_id => $business_id, cancel_invites_body => $cancel_invites_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessInviteApi->cancel_invites_or_requests: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Business id | 
 **cancel_invites_body** | [**CancelInvitesBody**](CancelInvitesBody.md)| A list with invite ids | 

### Return type

[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_asset_invites**
> UpdateInvitesResultsResponseArray create_asset_invites(business_id => $business_id, create_asset_invites_request => $create_asset_invites_request)

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessInviteApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessInviteApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $create_asset_invites_request = WWW::OpenAPIClient::Object::CreateAssetInvitesRequest->new(); # CreateAssetInvitesRequest | A list of invites/requests together with the asset permissions to be assigned to the invite/request. 

eval {
    my $result = $api_instance->create_asset_invites(business_id => $business_id, create_asset_invites_request => $create_asset_invites_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessInviteApi->create_asset_invites: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **create_asset_invites_request** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md)| A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | 

### Return type

[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_membership_or_partnership_invites**
> CreateInvitesResultsResponseArray create_membership_or_partnership_invites(business_id => $business_id, create_membership_or_partnership_invites_body => $create_membership_or_partnership_invites_body)

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessInviteApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessInviteApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Business id
my $create_membership_or_partnership_invites_body = WWW::OpenAPIClient::Object::CreateMembershipOrPartnershipInvitesBody->new(); # CreateMembershipOrPartnershipInvitesBody | An object with the properties: invite_type, partners, members, business_role

eval {
    my $result = $api_instance->create_membership_or_partnership_invites(business_id => $business_id, create_membership_or_partnership_invites_body => $create_membership_or_partnership_invites_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessInviteApi->create_membership_or_partnership_invites: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Business id | 
 **create_membership_or_partnership_invites_body** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md)| An object with the properties: invite_type, partners, members, business_role | 

### Return type

[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_invites**
> GetInvites200Response get_invites(business_id => $business_id, is_member => $is_member, invite_status => $invite_status, invite_type => $invite_type, bookmark => $bookmark, page_size => $page_size)

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessInviteApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessInviteApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $is_member = true; # boolean | A boolean field to indicate whether the invite is to create a partnership or a membership.
my $invite_status = [("PENDING")]; # ARRAY[string] | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
my $invite_type = new WWW::OpenAPIClient.InviteType(); # InviteType | Invite type to filter invites by. Only invites of the specified type will be returned.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

eval {
    my $result = $api_instance->get_invites(business_id => $business_id, is_member => $is_member, invite_status => $invite_status, invite_type => $invite_type, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessInviteApi->get_invites: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **is_member** | **boolean**| A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to true]
 **invite_status** | [**ARRAY[string]**](string.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] 
 **invite_type** | [**InviteType**](.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**GetInvites200Response**](GetInvites200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **respond_business_access_invites**
> RespondToInvitesResponseArray respond_business_access_invites(auth_respond_invites_body => $auth_respond_invites_body)

Accept or decline an invite/request

Accept or decline invites or requests.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessInviteApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessInviteApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $auth_respond_invites_body = WWW::OpenAPIClient::Object::AuthRespondInvitesBody->new(); # AuthRespondInvitesBody | 

eval {
    my $result = $api_instance->respond_business_access_invites(auth_respond_invites_body => $auth_respond_invites_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessInviteApi->respond_business_access_invites: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auth_respond_invites_body** | [**AuthRespondInvitesBody**](AuthRespondInvitesBody.md)|  | 

### Return type

[**RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

