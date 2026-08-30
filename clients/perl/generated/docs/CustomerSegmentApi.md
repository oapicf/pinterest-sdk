# WWW::OpenAPIClient::CustomerSegmentApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CustomerSegmentApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_segment_create**](CustomerSegmentApi.md#customer_segment_create) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**customer_segment_list**](CustomerSegmentApi.md#customer_segment_list) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**customer_segment_update**](CustomerSegmentApi.md#customer_segment_update) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


# **customer_segment_create**
> CustomerSegment customer_segment_create(ad_account_id => $ad_account_id, customer_segment_create => $customer_segment_create)

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomerSegmentApi;
my $api_instance = WWW::OpenAPIClient::CustomerSegmentApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $customer_segment_create = WWW::OpenAPIClient::Object::CustomerSegmentCreate->new(); # CustomerSegmentCreate | 

eval {
    my $result = $api_instance->customer_segment_create(ad_account_id => $ad_account_id, customer_segment_create => $customer_segment_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CustomerSegmentApi->customer_segment_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **customer_segment_create** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md)|  | 

### Return type

[**CustomerSegment**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_segment_list**
> CustomerSegmentList200Response customer_segment_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, include_sizing => $include_sizing, search_query => $search_query)

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomerSegmentApi;
my $api_instance = WWW::OpenAPIClient::CustomerSegmentApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
my $order = new WWW::OpenAPIClient.PinterestLibPaginationOrder(); # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
my $include_sizing = false; # boolean | Include audience sizing in result or not
my $search_query = "search_query_example"; # string | Search query. Can contain pin description keywords or comma-separated pin IDs.

eval {
    my $result = $api_instance->customer_segment_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, include_sizing => $include_sizing, search_query => $search_query);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CustomerSegmentApi->customer_segment_list: $@\n";
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

[**CustomerSegmentList200Response**](CustomerSegmentList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_segment_update**
> customer_segment_update(ad_account_id => $ad_account_id, customer_segment_update_request_update_with_required_body => $customer_segment_update_request_update_with_required_body)

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomerSegmentApi;
my $api_instance = WWW::OpenAPIClient::CustomerSegmentApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $customer_segment_update_request_update_with_required_body = WWW::OpenAPIClient::Object::CustomerSegmentUpdateRequestUpdateWithRequiredBody->new(); # CustomerSegmentUpdateRequestUpdateWithRequiredBody | 

eval {
    $api_instance->customer_segment_update(ad_account_id => $ad_account_id, customer_segment_update_request_update_with_required_body => $customer_segment_update_request_update_with_required_body);
};
if ($@) {
    warn "Exception when calling CustomerSegmentApi->customer_segment_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **customer_segment_update_request_update_with_required_body** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

