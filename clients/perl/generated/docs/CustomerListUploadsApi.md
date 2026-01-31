# WWW::OpenAPIClient::CustomerListUploadsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CustomerListUploadsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_list_uploads_create**](CustomerListUploadsApi.md#customer_list_uploads_create) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customer_list_uploads_get**](CustomerListUploadsApi.md#customer_list_uploads_get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customer_list_uploads_run**](CustomerListUploadsApi.md#customer_list_uploads_run) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


# **customer_list_uploads_create**
> CustomerListUploadCreateResponse customer_list_uploads_create(ad_account_id => $ad_account_id, customer_list_id => $customer_list_id, customer_list_upload_create_request => $customer_list_upload_create_request)

Create customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomerListUploadsApi;
my $api_instance = WWW::OpenAPIClient::CustomerListUploadsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $customer_list_id = "customer_list_id_example"; # string | Unique identifier of a customer list
my $customer_list_upload_create_request = WWW::OpenAPIClient::Object::CustomerListUploadCreateRequest->new(); # CustomerListUploadCreateRequest | Parameters to create a customer list upload request

eval {
    my $result = $api_instance->customer_list_uploads_create(ad_account_id => $ad_account_id, customer_list_id => $customer_list_id, customer_list_upload_create_request => $customer_list_upload_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CustomerListUploadsApi->customer_list_uploads_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **customer_list_id** | **string**| Unique identifier of a customer list | 
 **customer_list_upload_create_request** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)| Parameters to create a customer list upload request | 

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_list_uploads_get**
> CustomerListUploadResponse customer_list_uploads_get(ad_account_id => $ad_account_id, customer_list_id => $customer_list_id, customer_list_upload_id => $customer_list_upload_id)

Get customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomerListUploadsApi;
my $api_instance = WWW::OpenAPIClient::CustomerListUploadsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $customer_list_id = "customer_list_id_example"; # string | Unique identifier of a customer list
my $customer_list_upload_id = "customer_list_upload_id_example"; # string | Unique identifier of a customer list upload

eval {
    my $result = $api_instance->customer_list_uploads_get(ad_account_id => $ad_account_id, customer_list_id => $customer_list_id, customer_list_upload_id => $customer_list_upload_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CustomerListUploadsApi->customer_list_uploads_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **customer_list_id** | **string**| Unique identifier of a customer list | 
 **customer_list_upload_id** | **string**| Unique identifier of a customer list upload | 

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_list_uploads_run**
> CustomerListUploadResponse customer_list_uploads_run(ad_account_id => $ad_account_id, customer_list_id => $customer_list_id, customer_list_upload_id => $customer_list_upload_id)

Run customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomerListUploadsApi;
my $api_instance = WWW::OpenAPIClient::CustomerListUploadsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $customer_list_id = "customer_list_id_example"; # string | Unique identifier of a customer list
my $customer_list_upload_id = "customer_list_upload_id_example"; # string | Unique identifier of a customer list upload

eval {
    my $result = $api_instance->customer_list_uploads_run(ad_account_id => $ad_account_id, customer_list_id => $customer_list_id, customer_list_upload_id => $customer_list_upload_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CustomerListUploadsApi->customer_list_uploads_run: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **customer_list_id** | **string**| Unique identifier of a customer list | 
 **customer_list_upload_id** | **string**| Unique identifier of a customer list upload | 

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

