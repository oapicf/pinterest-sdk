# WWW::OpenAPIClient::TargetingTemplateApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::TargetingTemplateApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targeting_template_create**](TargetingTemplateApi.md#targeting_template_create) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targeting_template_list**](TargetingTemplateApi.md#targeting_template_list) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targeting_template_update**](TargetingTemplateApi.md#targeting_template_update) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


# **targeting_template_create**
> TargetingTemplate targeting_template_create(ad_account_id => $ad_account_id, targeting_template_create => $targeting_template_create)

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TargetingTemplateApi;
my $api_instance = WWW::OpenAPIClient::TargetingTemplateApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $targeting_template_create = WWW::OpenAPIClient::Object::TargetingTemplateCreate->new(); # TargetingTemplateCreate | 

eval {
    my $result = $api_instance->targeting_template_create(ad_account_id => $ad_account_id, targeting_template_create => $targeting_template_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TargetingTemplateApi->targeting_template_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **targeting_template_create** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md)|  | 

### Return type

[**TargetingTemplate**](TargetingTemplate.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_template_list**
> TargetingTemplateList200Response targeting_template_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, include_sizing => $include_sizing, search_query => $search_query)

List targeting templates

Get a list of the targeting templates in the specified `ad_account_id`

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TargetingTemplateApi;
my $api_instance = WWW::OpenAPIClient::TargetingTemplateApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
my $order = new WWW::OpenAPIClient.PinterestLibPaginationOrder(); # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
my $include_sizing = false; # boolean | Include audience sizing in result or not
my $search_query = "search_query_example"; # string | Search query. Can contain pin description keywords or comma-separated pin IDs.

eval {
    my $result = $api_instance->targeting_template_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, include_sizing => $include_sizing, search_query => $search_query);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TargetingTemplateApi->targeting_template_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **include_sizing** | **boolean**| Include audience sizing in result or not | [optional] [default to false]
 **search_query** | **string**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_template_update**
> targeting_template_update(ad_account_id => $ad_account_id, targeting_template_update_request_read_or_update => $targeting_template_update_request_read_or_update)

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TargetingTemplateApi;
my $api_instance = WWW::OpenAPIClient::TargetingTemplateApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $targeting_template_update_request_read_or_update = WWW::OpenAPIClient::Object::TargetingTemplateUpdateRequestReadOrUpdate->new(); # TargetingTemplateUpdateRequestReadOrUpdate | 

eval {
    $api_instance->targeting_template_update(ad_account_id => $ad_account_id, targeting_template_update_request_read_or_update => $targeting_template_update_request_read_or_update);
};
if ($@) {
    warn "Exception when calling TargetingTemplateApi->targeting_template_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **targeting_template_update_request_read_or_update** | [**TargetingTemplateUpdateRequestReadOrUpdate**](TargetingTemplateUpdateRequestReadOrUpdate.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

