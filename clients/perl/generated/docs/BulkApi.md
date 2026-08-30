# WWW::OpenAPIClient::BulkApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BulkApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulk_download_create**](BulkApi.md#bulk_download_create) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulk_request_get**](BulkApi.md#bulk_request_get) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulk_upsert_create**](BulkApi.md#bulk_upsert_create) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


# **bulk_download_create**
> BulkDownload bulk_download_create(ad_account_id => $ad_account_id, bulk_download_create => $bulk_download_create)

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BulkApi;
my $api_instance = WWW::OpenAPIClient::BulkApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bulk_download_create = WWW::OpenAPIClient::Object::BulkDownloadCreate->new(); # BulkDownloadCreate | 

eval {
    my $result = $api_instance->bulk_download_create(ad_account_id => $ad_account_id, bulk_download_create => $bulk_download_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BulkApi->bulk_download_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bulk_download_create** | [**BulkDownloadCreate**](BulkDownloadCreate.md)|  | 

### Return type

[**BulkDownload**](BulkDownload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulk_request_get**
> BulkJobData bulk_request_get(ad_account_id => $ad_account_id, bulk_request_id => $bulk_request_id, include_details => $include_details)

Download advertiser entities in bulk

Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BulkApi;
my $api_instance = WWW::OpenAPIClient::BulkApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bulk_request_id = "bulk_request_id_example"; # string | Bulk request ID that is from one of the entities bulk endpoints
my $include_details = false; # boolean | If set to True then attach the errors/details to all the requests

eval {
    my $result = $api_instance->bulk_request_get(ad_account_id => $ad_account_id, bulk_request_id => $bulk_request_id, include_details => $include_details);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BulkApi->bulk_request_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bulk_request_id** | **string**| Bulk request ID that is from one of the entities bulk endpoints | 
 **include_details** | **boolean**| If set to True then attach the errors/details to all the requests | [optional] [default to false]

### Return type

[**BulkJobData**](BulkJobData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulk_upsert_create**
> BulkUpsertResponse bulk_upsert_create(ad_account_id => $ad_account_id, bulk_upsert_request => $bulk_upsert_request)

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BulkApi;
my $api_instance = WWW::OpenAPIClient::BulkApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bulk_upsert_request = WWW::OpenAPIClient::Object::BulkUpsertRequest->new(); # BulkUpsertRequest | Parameters to get create/update ad entities in bulk

eval {
    my $result = $api_instance->bulk_upsert_create(ad_account_id => $ad_account_id, bulk_upsert_request => $bulk_upsert_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BulkApi->bulk_upsert_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bulk_upsert_request** | [**BulkUpsertRequest**](BulkUpsertRequest.md)| Parameters to get create/update ad entities in bulk | 

### Return type

[**BulkUpsertResponse**](BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

