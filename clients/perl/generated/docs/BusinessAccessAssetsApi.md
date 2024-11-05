# WWW::OpenAPIClient::BusinessAccessAssetsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BusinessAccessAssetsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asset_group_create**](BusinessAccessAssetsApi.md#asset_group_create) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**asset_group_delete**](BusinessAccessAssetsApi.md#asset_group_delete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**asset_group_update**](BusinessAccessAssetsApi.md#asset_group_update) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**business_asset_members_get**](BusinessAccessAssetsApi.md#business_asset_members_get) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**business_asset_partners_get**](BusinessAccessAssetsApi.md#business_asset_partners_get) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**business_assets_get**](BusinessAccessAssetsApi.md#business_assets_get) | **GET** /businesses/{business_id}/assets | List business assets
[**business_member_assets_get**](BusinessAccessAssetsApi.md#business_member_assets_get) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**business_members_asset_access_delete**](BusinessAccessAssetsApi.md#business_members_asset_access_delete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**business_members_asset_access_update**](BusinessAccessAssetsApi.md#business_members_asset_access_update) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**business_partner_asset_access_get**](BusinessAccessAssetsApi.md#business_partner_asset_access_get) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**delete_partner_asset_access_handler_impl**](BusinessAccessAssetsApi.md#delete_partner_asset_access_handler_impl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**update_partner_asset_access_handler_impl**](BusinessAccessAssetsApi.md#update_partner_asset_access_handler_impl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions


# **asset_group_create**
> CreateAssetGroupResponse asset_group_create(business_id => $business_id, create_asset_group_body => $create_asset_group_body)

Create a new asset group.

Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $create_asset_group_body = WWW::OpenAPIClient::Object::CreateAssetGroupBody->new(); # CreateAssetGroupBody | 

eval {
    my $result = $api_instance->asset_group_create(business_id => $business_id, create_asset_group_body => $create_asset_group_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->asset_group_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **create_asset_group_body** | [**CreateAssetGroupBody**](CreateAssetGroupBody.md)|  | 

### Return type

[**CreateAssetGroupResponse**](CreateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_group_delete**
> DeleteAssetGroupResponse asset_group_delete(business_id => $business_id, delete_asset_group_body => $delete_asset_group_body)

Delete asset groups.

Delete a batch of asset groups.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $delete_asset_group_body = WWW::OpenAPIClient::Object::DeleteAssetGroupBody->new(); # DeleteAssetGroupBody | 

eval {
    my $result = $api_instance->asset_group_delete(business_id => $business_id, delete_asset_group_body => $delete_asset_group_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->asset_group_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **delete_asset_group_body** | [**DeleteAssetGroupBody**](DeleteAssetGroupBody.md)|  | 

### Return type

[**DeleteAssetGroupResponse**](DeleteAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_group_update**
> UpdateAssetGroupResponse asset_group_update(business_id => $business_id, update_asset_group_body => $update_asset_group_body)

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $update_asset_group_body = WWW::OpenAPIClient::Object::UpdateAssetGroupBody->new(); # UpdateAssetGroupBody | 

eval {
    my $result = $api_instance->asset_group_update(business_id => $business_id, update_asset_group_body => $update_asset_group_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->asset_group_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **update_asset_group_body** | [**UpdateAssetGroupBody**](UpdateAssetGroupBody.md)|  | 

### Return type

[**UpdateAssetGroupResponse**](UpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_asset_members_get**
> BusinessAssetMembersGet200Response business_asset_members_get(business_id => $business_id, asset_id => $asset_id, bookmark => $bookmark, page_size => $page_size, start_index => $start_index)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $asset_id = 729090764583391194; # string | Unique identifier of a business asset.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
my $start_index = 0; # int | An index to start fetching the results from. Only the results starting from this index will be returned.

eval {
    my $result = $api_instance->business_asset_members_get(business_id => $business_id, asset_id => $asset_id, bookmark => $bookmark, page_size => $page_size, start_index => $start_index);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->business_asset_members_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **asset_id** | **string**| Unique identifier of a business asset. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_asset_partners_get**
> BusinessAssetPartnersGet200Response business_asset_partners_get(business_id => $business_id, asset_id => $asset_id, start_index => $start_index, bookmark => $bookmark, page_size => $page_size)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $asset_id = 729090764583391194; # string | Unique identifier of a business asset.
my $start_index = 0; # int | An index to start fetching the results from. Only the results starting from this index will be returned.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

eval {
    my $result = $api_instance->business_asset_partners_get(business_id => $business_id, asset_id => $asset_id, start_index => $start_index, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->business_asset_partners_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **asset_id** | **string**| Unique identifier of a business asset. | 
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetPartnersGet200Response**](BusinessAssetPartnersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_assets_get**
> BusinessAssetsGet200Response business_assets_get(business_id => $business_id, permissions => $permissions, child_asset_id => $child_asset_id, asset_group_id => $asset_group_id, asset_type => $asset_type, start_index => $start_index, bookmark => $bookmark, page_size => $page_size)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $permissions = [(new WWW::OpenAPIClient.PermissionsWithOwner())]; # ARRAY[PermissionsWithOwner] | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
my $child_asset_id = 549764894835; # string | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
my $asset_group_id = 7078106104032; # string | An asset group unique identifier. Used to fetch assets contained within the specified asset group.
my $asset_type = AD_ACCOUNT; # string | A resource type to filter the assets by. Only assets of the specified type will be returned.
my $start_index = 0; # int | An index to start fetching the results from. Only the results starting from this index will be returned.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

eval {
    my $result = $api_instance->business_assets_get(business_id => $business_id, permissions => $permissions, child_asset_id => $child_asset_id, asset_group_id => $asset_group_id, asset_type => $asset_type, start_index => $start_index, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->business_assets_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **permissions** | [**ARRAY[PermissionsWithOwner]**](PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] 
 **child_asset_id** | **string**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] 
 **asset_group_id** | **string**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] 
 **asset_type** | **string**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_member_assets_get**
> BusinessMemberAssetsGet200Response business_member_assets_get(business_id => $business_id, member_id => $member_id, asset_type => $asset_type, start_index => $start_index, bookmark => $bookmark, page_size => $page_size)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $member_id = 729090764583391194; # string | The member id to fetch assets for.
my $asset_type = AD_ACCOUNT; # string | A resource type to filter the assets by. Only assets of the specified type will be returned.
my $start_index = 0; # int | An index to start fetching the results from. Only the results starting from this index will be returned.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

eval {
    my $result = $api_instance->business_member_assets_get(business_id => $business_id, member_id => $member_id, asset_type => $asset_type, start_index => $start_index, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->business_member_assets_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **member_id** | **string**| The member id to fetch assets for. | 
 **asset_type** | **string**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessMemberAssetsGet200Response**](BusinessMemberAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_members_asset_access_delete**
> DeleteMemberAccessResultsResponseArray business_members_asset_access_delete(business_id => $business_id, business_members_asset_access_delete_request => $business_members_asset_access_delete_request)

Delete member access to asset

Terminate multiple members' access to an asset.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $business_members_asset_access_delete_request = WWW::OpenAPIClient::Object::BusinessMembersAssetAccessDeleteRequest->new(); # BusinessMembersAssetAccessDeleteRequest | List member assset permissions to delete.

eval {
    my $result = $api_instance->business_members_asset_access_delete(business_id => $business_id, business_members_asset_access_delete_request => $business_members_asset_access_delete_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->business_members_asset_access_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **business_members_asset_access_delete_request** | [**BusinessMembersAssetAccessDeleteRequest**](BusinessMembersAssetAccessDeleteRequest.md)| List member assset permissions to delete. | 

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_members_asset_access_update**
> UpdateMemberAssetsResultsResponseArray business_members_asset_access_update(business_id => $business_id, update_member_asset_access_body => $update_member_asset_access_body)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $update_member_asset_access_body = WWW::OpenAPIClient::Object::UpdateMemberAssetAccessBody->new(); # UpdateMemberAssetAccessBody | List of member asset permissions to create or update.

eval {
    my $result = $api_instance->business_members_asset_access_update(business_id => $business_id, update_member_asset_access_body => $update_member_asset_access_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->business_members_asset_access_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **update_member_asset_access_body** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md)| List of member asset permissions to create or update. | 

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_partner_asset_access_get**
> BusinessPartnerAssetAccessGet200Response business_partner_asset_access_get(business_id => $business_id, partner_id => $partner_id, partner_type => $partner_type, asset_type => $asset_type, start_index => $start_index, page_size => $page_size, bookmark => $bookmark)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $partner_id = 729090764583391194; # string | The partner id to be bound to the Business
my $partner_type = INTERNAL; # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
my $asset_type = AD_ACCOUNT; # string | A resource type to filter the assets by. Only assets of the specified type will be returned.
my $start_index = 0; # int | An index to start fetching the results from. Only the results starting from this index will be returned.
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->business_partner_asset_access_get(business_id => $business_id, partner_id => $partner_id, partner_type => $partner_type, asset_type => $asset_type, start_index => $start_index, page_size => $page_size, bookmark => $bookmark);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->business_partner_asset_access_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **partner_id** | **string**| The partner id to be bound to the Business | 
 **partner_type** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **asset_type** | **string**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_partner_asset_access_handler_impl**
> DeletePartnerAssetsResultsResponseArray delete_partner_asset_access_handler_impl(business_id => $business_id, delete_partner_asset_access_body => $delete_partner_asset_access_body)

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $delete_partner_asset_access_body = WWW::OpenAPIClient::Object::DeletePartnerAssetAccessBody->new(); # DeletePartnerAssetAccessBody | 

eval {
    my $result = $api_instance->delete_partner_asset_access_handler_impl(business_id => $business_id, delete_partner_asset_access_body => $delete_partner_asset_access_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->delete_partner_asset_access_handler_impl: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **delete_partner_asset_access_body** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md)|  | 

### Return type

[**DeletePartnerAssetsResultsResponseArray**](DeletePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_partner_asset_access_handler_impl**
> UpdatePartnerAssetsResultsResponseArray update_partner_asset_access_handler_impl(business_id => $business_id, update_partner_asset_access_body => $update_partner_asset_access_body)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessAccessAssetsApi;
my $api_instance = WWW::OpenAPIClient::BusinessAccessAssetsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 729090764583391194; # string | Unique identifier of the requesting business.
my $update_partner_asset_access_body = WWW::OpenAPIClient::Object::UpdatePartnerAssetAccessBody->new(); # UpdatePartnerAssetAccessBody | A list of assets and permissions to assign to your partners.

eval {
    my $result = $api_instance->update_partner_asset_access_handler_impl(business_id => $business_id, update_partner_asset_access_body => $update_partner_asset_access_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessAccessAssetsApi->update_partner_asset_access_handler_impl: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **update_partner_asset_access_body** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md)| A list of assets and permissions to assign to your partners. | 

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

