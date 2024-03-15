# WWW::OpenAPIClient::OrderLinesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::OrderLinesApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**order_lines_get**](OrderLinesApi.md#order_lines_get) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**order_lines_list**](OrderLinesApi.md#order_lines_list) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines


# **order_lines_get**
> OrderLine order_lines_get(ad_account_id => $ad_account_id, order_line_id => $order_line_id)

Get order line

Get a specific existing order line associated with an ad account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OrderLinesApi;
my $api_instance = WWW::OpenAPIClient::OrderLinesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $order_line_id = "order_line_id_example"; # string | Unique identifier of an order line.

eval {
    my $result = $api_instance->order_lines_get(ad_account_id => $ad_account_id, order_line_id => $order_line_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderLinesApi->order_lines_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **order_line_id** | **string**| Unique identifier of an order line. | 

### Return type

[**OrderLine**](OrderLine.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_lines_list**
> OrderLinesList200Response order_lines_list(ad_account_id => $ad_account_id, page_size => $page_size, order => $order, bookmark => $bookmark)

Get order lines

List existing order lines associated with an ad account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OrderLinesApi;
my $api_instance = WWW::OpenAPIClient::OrderLinesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $order = ASCENDING; # string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->order_lines_list(ad_account_id => $ad_account_id, page_size => $page_size, order => $order, bookmark => $bookmark);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderLinesApi->order_lines_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OrderLinesList200Response**](OrderLinesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

