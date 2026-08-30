# WWW::OpenAPIClient::ConversionDeletionRequestsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ConversionDeletionRequestsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_deletion_request_create**](ConversionDeletionRequestsApi.md#conversion_deletion_request_create) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**conversion_deletion_request_delete**](ConversionDeletionRequestsApi.md#conversion_deletion_request_delete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**conversion_deletion_request_get**](ConversionDeletionRequestsApi.md#conversion_deletion_request_get) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**conversion_deletion_request_list**](ConversionDeletionRequestsApi.md#conversion_deletion_request_list) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests


# **conversion_deletion_request_create**
> ConversionDeletionRequest conversion_deletion_request_create(ad_account_id => $ad_account_id, conversion_deletion_request_create => $conversion_deletion_request_create)

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConversionDeletionRequestsApi;
my $api_instance = WWW::OpenAPIClient::ConversionDeletionRequestsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $conversion_deletion_request_create = WWW::OpenAPIClient::Object::ConversionDeletionRequestCreate->new(); # ConversionDeletionRequestCreate | 

eval {
    my $result = $api_instance->conversion_deletion_request_create(ad_account_id => $ad_account_id, conversion_deletion_request_create => $conversion_deletion_request_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionDeletionRequestsApi->conversion_deletion_request_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **conversion_deletion_request_create** | [**ConversionDeletionRequestCreate**](ConversionDeletionRequestCreate.md)|  | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversion_deletion_request_delete**
> ConversionDeletionRequest conversion_deletion_request_delete(request_id => $request_id, ad_account_id => $ad_account_id)

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConversionDeletionRequestsApi;
my $api_instance = WWW::OpenAPIClient::ConversionDeletionRequestsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $request_id = "request_id_example"; # string | Unique identifier of the conversion deletion request
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->conversion_deletion_request_delete(request_id => $request_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionDeletionRequestsApi->conversion_deletion_request_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_id** | **string**| Unique identifier of the conversion deletion request | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversion_deletion_request_get**
> ConversionDeletionRequest conversion_deletion_request_get(request_id => $request_id, ad_account_id => $ad_account_id)

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConversionDeletionRequestsApi;
my $api_instance = WWW::OpenAPIClient::ConversionDeletionRequestsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $request_id = "request_id_example"; # string | Unique identifier of the conversion deletion request
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->conversion_deletion_request_get(request_id => $request_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionDeletionRequestsApi->conversion_deletion_request_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_id** | **string**| Unique identifier of the conversion deletion request | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversion_deletion_request_list**
> ConversionDeletionRequestList200Response conversion_deletion_request_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order)

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConversionDeletionRequestsApi;
my $api_instance = WWW::OpenAPIClient::ConversionDeletionRequestsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
my $order = new WWW::OpenAPIClient.PinterestLibPaginationOrder(); # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.

eval {
    my $result = $api_instance->conversion_deletion_request_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionDeletionRequestsApi->conversion_deletion_request_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**ConversionDeletionRequestList200Response**](ConversionDeletionRequestList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

