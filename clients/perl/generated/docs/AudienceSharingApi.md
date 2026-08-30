# WWW::OpenAPIClient::AudienceSharingApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AudienceSharingApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_accounts_audiences_shared_accounts_list**](AudienceSharingApi.md#ad_accounts_audiences_shared_accounts_list) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**business_account_audiences_shared_accounts_list**](AudienceSharingApi.md#business_account_audiences_shared_accounts_list) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**shared_audiences_for_business_list**](AudienceSharingApi.md#shared_audiences_for_business_list) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**update_ad_account_to_ad_account_shared_audience**](AudienceSharingApi.md#update_ad_account_to_ad_account_shared_audience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**update_ad_account_to_business_shared_audience**](AudienceSharingApi.md#update_ad_account_to_business_shared_audience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**update_business_to_ad_account_shared_audience**](AudienceSharingApi.md#update_business_to_ad_account_shared_audience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**update_business_to_business_shared_audience**](AudienceSharingApi.md#update_business_to_business_shared_audience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses


# **ad_accounts_audiences_shared_accounts_list**
> AdAccountsAudiencesSharedAccountsList200Response ad_accounts_audiences_shared_accounts_list(audience_id => $audience_id, account_type => $account_type, ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudienceSharingApi;
my $api_instance = WWW::OpenAPIClient::AudienceSharingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $audience_id = "audience_id_example"; # string | Unique identifier of the audience to use to filter the results.
my $account_type = new WWW::OpenAPIClient.AudienceAccountType(); # AudienceAccountType | Filter accounts by account type.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->ad_accounts_audiences_shared_accounts_list(audience_id => $audience_id, account_type => $account_type, ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudienceSharingApi->ad_accounts_audiences_shared_accounts_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audience_id** | **string**| Unique identifier of the audience to use to filter the results. | 
 **account_type** | [**AudienceAccountType**](.md)| Filter accounts by account type. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_account_audiences_shared_accounts_list**
> AdAccountsAudiencesSharedAccountsList200Response business_account_audiences_shared_accounts_list(business_id => $business_id, audience_id => $audience_id, account_type => $account_type, bookmark => $bookmark, page_size => $page_size)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudienceSharingApi;
my $api_instance = WWW::OpenAPIClient::AudienceSharingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = "business_id_example"; # string | Unique identifier of the requesting business.
my $audience_id = "audience_id_example"; # string | Unique identifier of the audience to use to filter the results.
my $account_type = new WWW::OpenAPIClient.AudienceAccountType(); # AudienceAccountType | Filter accounts by account type.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->business_account_audiences_shared_accounts_list(business_id => $business_id, audience_id => $audience_id, account_type => $account_type, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudienceSharingApi->business_account_audiences_shared_accounts_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **audience_id** | **string**| Unique identifier of the audience to use to filter the results. | 
 **account_type** | [**AudienceAccountType**](.md)| Filter accounts by account type. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shared_audiences_for_business_list**
> SharedAudiencesForBusinessList200Response shared_audiences_for_business_list(business_id => $business_id, order => $order, bookmark => $bookmark, page_size => $page_size)

List received audiences for a business

Get a list of received audiences for the given business.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudienceSharingApi;
my $api_instance = WWW::OpenAPIClient::AudienceSharingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = "business_id_example"; # string | Unique identifier of the requesting business.
my $order = new WWW::OpenAPIClient.Order(); # Order | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->shared_audiences_for_business_list(business_id => $business_id, order => $order, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudienceSharingApi->shared_audiences_for_business_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **order** | [**Order**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SharedAudiencesForBusinessList200Response**](SharedAudiencesForBusinessList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_ad_account_to_ad_account_shared_audience**
> AdAccountToAdAccountSharedAudience update_ad_account_to_ad_account_shared_audience(ad_account_id => $ad_account_id, ad_account_to_ad_account_shared_audience_update_with_required_body => $ad_account_to_ad_account_shared_audience_update_with_required_body)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudienceSharingApi;
my $api_instance = WWW::OpenAPIClient::AudienceSharingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_account_to_ad_account_shared_audience_update_with_required_body = WWW::OpenAPIClient::Object::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody->new(); # AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody | 

eval {
    my $result = $api_instance->update_ad_account_to_ad_account_shared_audience(ad_account_id => $ad_account_id, ad_account_to_ad_account_shared_audience_update_with_required_body => $ad_account_to_ad_account_shared_audience_update_with_required_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudienceSharingApi->update_ad_account_to_ad_account_shared_audience: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_account_to_ad_account_shared_audience_update_with_required_body** | [**AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody**](AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**AdAccountToAdAccountSharedAudience**](AdAccountToAdAccountSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_ad_account_to_business_shared_audience**
> AdAccountToBusinessSharedAudience update_ad_account_to_business_shared_audience(ad_account_id => $ad_account_id, ad_account_to_business_shared_audience_update_with_required_body => $ad_account_to_business_shared_audience_update_with_required_body)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudienceSharingApi;
my $api_instance = WWW::OpenAPIClient::AudienceSharingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_account_to_business_shared_audience_update_with_required_body = WWW::OpenAPIClient::Object::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody->new(); # AdAccountToBusinessSharedAudienceUpdateWithRequiredBody | 

eval {
    my $result = $api_instance->update_ad_account_to_business_shared_audience(ad_account_id => $ad_account_id, ad_account_to_business_shared_audience_update_with_required_body => $ad_account_to_business_shared_audience_update_with_required_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudienceSharingApi->update_ad_account_to_business_shared_audience: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_account_to_business_shared_audience_update_with_required_body** | [**AdAccountToBusinessSharedAudienceUpdateWithRequiredBody**](AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**AdAccountToBusinessSharedAudience**](AdAccountToBusinessSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_to_ad_account_shared_audience**
> BusinessToAdAccountSharedAudience update_business_to_ad_account_shared_audience(business_id => $business_id, business_to_ad_account_shared_audience_update_with_required_body => $business_to_ad_account_shared_audience_update_with_required_body)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudienceSharingApi;
my $api_instance = WWW::OpenAPIClient::AudienceSharingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = "business_id_example"; # string | Unique identifier of the requesting business.
my $business_to_ad_account_shared_audience_update_with_required_body = WWW::OpenAPIClient::Object::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody->new(); # BusinessToAdAccountSharedAudienceUpdateWithRequiredBody | 

eval {
    my $result = $api_instance->update_business_to_ad_account_shared_audience(business_id => $business_id, business_to_ad_account_shared_audience_update_with_required_body => $business_to_ad_account_shared_audience_update_with_required_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudienceSharingApi->update_business_to_ad_account_shared_audience: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **business_to_ad_account_shared_audience_update_with_required_body** | [**BusinessToAdAccountSharedAudienceUpdateWithRequiredBody**](BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**BusinessToAdAccountSharedAudience**](BusinessToAdAccountSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_to_business_shared_audience**
> BusinessToBusinessSharedAudience update_business_to_business_shared_audience(business_id => $business_id, business_to_business_shared_audience_update_with_required_body => $business_to_business_shared_audience_update_with_required_body)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudienceSharingApi;
my $api_instance = WWW::OpenAPIClient::AudienceSharingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = "business_id_example"; # string | Unique identifier of the requesting business.
my $business_to_business_shared_audience_update_with_required_body = WWW::OpenAPIClient::Object::BusinessToBusinessSharedAudienceUpdateWithRequiredBody->new(); # BusinessToBusinessSharedAudienceUpdateWithRequiredBody | 

eval {
    my $result = $api_instance->update_business_to_business_shared_audience(business_id => $business_id, business_to_business_shared_audience_update_with_required_body => $business_to_business_shared_audience_update_with_required_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudienceSharingApi->update_business_to_business_shared_audience: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **string**| Unique identifier of the requesting business. | 
 **business_to_business_shared_audience_update_with_required_body** | [**BusinessToBusinessSharedAudienceUpdateWithRequiredBody**](BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**BusinessToBusinessSharedAudience**](BusinessToBusinessSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

