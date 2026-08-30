# WWW::OpenAPIClient::CustomerListsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CustomerListsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_lists_create**](CustomerListsApi.md#customer_lists_create) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**customer_lists_get**](CustomerListsApi.md#customer_lists_get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**customer_lists_list**](CustomerListsApi.md#customer_lists_list) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**customer_lists_update**](CustomerListsApi.md#customer_lists_update) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list


# **customer_lists_create**
> CustomerList customer_lists_create(ad_account_id => $ad_account_id, customer_list_create => $customer_list_create)

Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomerListsApi;
my $api_instance = WWW::OpenAPIClient::CustomerListsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | 
my $customer_list_create = WWW::OpenAPIClient::Object::CustomerListCreate->new(); # CustomerListCreate | 

eval {
    my $result = $api_instance->customer_lists_create(ad_account_id => $ad_account_id, customer_list_create => $customer_list_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CustomerListsApi->customer_lists_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**|  | 
 **customer_list_create** | [**CustomerListCreate**](CustomerListCreate.md)|  | 

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_lists_get**
> CustomerList customer_lists_get(ad_account_id => $ad_account_id, customer_list_id => $customer_list_id)

Get customer list

Gets a specific customer list given the customer list ID.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomerListsApi;
my $api_instance = WWW::OpenAPIClient::CustomerListsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | 
my $customer_list_id = "customer_list_id_example"; # string | Customer list ID.

eval {
    my $result = $api_instance->customer_lists_get(ad_account_id => $ad_account_id, customer_list_id => $customer_list_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CustomerListsApi->customer_lists_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**|  | 
 **customer_list_id** | **string**| Customer list ID. | 

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_lists_list**
> CustomerListsList200Response customer_lists_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, exclude_nca => $exclude_nca)

Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomerListsApi;
my $api_instance = WWW::OpenAPIClient::CustomerListsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | 
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
my $order = new WWW::OpenAPIClient.PinterestLibPaginationOrder(); # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
my $exclude_nca = false; # boolean | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).

eval {
    my $result = $api_instance->customer_lists_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, exclude_nca => $exclude_nca);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CustomerListsApi->customer_lists_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**|  | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **exclude_nca** | **boolean**| When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[**CustomerListsList200Response**](CustomerListsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_lists_update**
> CustomerList customer_lists_update(ad_account_id => $ad_account_id, customer_list_id => $customer_list_id, customer_list_update_with_required_body => $customer_list_update_with_required_body)

Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomerListsApi;
my $api_instance = WWW::OpenAPIClient::CustomerListsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | 
my $customer_list_id = "customer_list_id_example"; # string | Customer list ID.
my $customer_list_update_with_required_body = WWW::OpenAPIClient::Object::CustomerListUpdateWithRequiredBody->new(); # CustomerListUpdateWithRequiredBody | 

eval {
    my $result = $api_instance->customer_lists_update(ad_account_id => $ad_account_id, customer_list_id => $customer_list_id, customer_list_update_with_required_body => $customer_list_update_with_required_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CustomerListsApi->customer_lists_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**|  | 
 **customer_list_id** | **string**| Customer list ID. | 
 **customer_list_update_with_required_body** | [**CustomerListUpdateWithRequiredBody**](CustomerListUpdateWithRequiredBody.md)|  | 

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

