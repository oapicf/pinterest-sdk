# WWW::OpenAPIClient::AudiencesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AudiencesApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiences_create**](AudiencesApi.md#audiences_create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiences_get**](AudiencesApi.md#audiences_get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiences_list**](AudiencesApi.md#audiences_list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiences_update**](AudiencesApi.md#audiences_update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiences_create**
> AdAccountsAudience audiences_create(ad_account_id => $ad_account_id, ad_accounts_audience_create => $ad_accounts_audience_create)

Create audience

Create a new audience for the ad account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudiencesApi;
my $api_instance = WWW::OpenAPIClient::AudiencesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_accounts_audience_create = WWW::OpenAPIClient::Object::AdAccountsAudienceCreate->new(); # AdAccountsAudienceCreate | 

eval {
    my $result = $api_instance->audiences_create(ad_account_id => $ad_account_id, ad_accounts_audience_create => $ad_accounts_audience_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudiencesApi->audiences_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_accounts_audience_create** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md)|  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_get**
> AdAccountsAudience audiences_get(audience_id => $audience_id, ad_account_id => $ad_account_id)

Get audience

Get a specific audience given the audience ID.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudiencesApi;
my $api_instance = WWW::OpenAPIClient::AudiencesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $audience_id = "audience_id_example"; # string | Audience ID.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->audiences_get(audience_id => $audience_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudiencesApi->audiences_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audience_id** | **string**| Audience ID. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_list**
> AudiencesList200Response audiences_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, ownership_type => $ownership_type, exclude_nca => $exclude_nca)

List audiences

Get list of audiences for the ad account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudiencesApi;
my $api_instance = WWW::OpenAPIClient::AudiencesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
my $order = new WWW::OpenAPIClient.PinterestLibPaginationOrder(); # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
my $ownership_type = new WWW::OpenAPIClient.AudienceOwnershipType(); # AudienceOwnershipType | 
my $exclude_nca = false; # boolean | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).

eval {
    my $result = $api_instance->audiences_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, ownership_type => $ownership_type, exclude_nca => $exclude_nca);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudiencesApi->audiences_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **ownership_type** | [**AudienceOwnershipType**](.md)|  | [optional] 
 **exclude_nca** | **boolean**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_update**
> AdAccountsAudience audiences_update(audience_id => $audience_id, ad_account_id => $ad_account_id, ad_accounts_audience_update => $ad_accounts_audience_update)

Update audience

Update an existing audience for the ad account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudiencesApi;
my $api_instance = WWW::OpenAPIClient::AudiencesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $audience_id = "audience_id_example"; # string | Audience ID.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_accounts_audience_update = WWW::OpenAPIClient::Object::AdAccountsAudienceUpdate->new(); # AdAccountsAudienceUpdate | 

eval {
    my $result = $api_instance->audiences_update(audience_id => $audience_id, ad_account_id => $ad_account_id, ad_accounts_audience_update => $ad_accounts_audience_update);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudiencesApi->audiences_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audience_id** | **string**| Audience ID. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_accounts_audience_update** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md)|  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

