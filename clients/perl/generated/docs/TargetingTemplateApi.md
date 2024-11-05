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
> TargetingTemplateGetResponseData targeting_template_create(ad_account_id => $ad_account_id, targeting_template_create => $targeting_template_create)

Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TargetingTemplateApi;
my $api_instance = WWW::OpenAPIClient::TargetingTemplateApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $targeting_template_create = WWW::OpenAPIClient::Object::TargetingTemplateCreate->new(); # TargetingTemplateCreate | targeting template creation entity

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
 **targeting_template_create** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md)| targeting template creation entity | 

### Return type

[**TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_template_list**
> TargetingTemplateList200Response targeting_template_list(ad_account_id => $ad_account_id, order => $order, include_sizing => $include_sizing, search_query => $search_query, page_size => $page_size, bookmark => $bookmark)

List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TargetingTemplateApi;
my $api_instance = WWW::OpenAPIClient::TargetingTemplateApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $order = ASCENDING; # string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
my $include_sizing = false; # boolean | Include audience sizing in result or not
my $search_query = gaming; # string | Search keyword for targeting templates
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->targeting_template_list(ad_account_id => $ad_account_id, order => $order, include_sizing => $include_sizing, search_query => $search_query, page_size => $page_size, bookmark => $bookmark);
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
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **include_sizing** | **boolean**| Include audience sizing in result or not | [optional] [default to false]
 **search_query** | **string**| Search keyword for targeting templates | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_template_update**
> targeting_template_update(ad_account_id => $ad_account_id, targeting_template_update_request => $targeting_template_update_request)

Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TargetingTemplateApi;
my $api_instance = WWW::OpenAPIClient::TargetingTemplateApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $targeting_template_update_request = WWW::OpenAPIClient::Object::TargetingTemplateUpdateRequest->new(); # TargetingTemplateUpdateRequest | Operation type and targeting template ID

eval {
    $api_instance->targeting_template_update(ad_account_id => $ad_account_id, targeting_template_update_request => $targeting_template_update_request);
};
if ($@) {
    warn "Exception when calling TargetingTemplateApi->targeting_template_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **targeting_template_update_request** | [**TargetingTemplateUpdateRequest**](TargetingTemplateUpdateRequest.md)| Operation type and targeting template ID | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

