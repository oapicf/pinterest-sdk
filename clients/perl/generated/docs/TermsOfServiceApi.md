# WWW::OpenAPIClient::TermsOfServiceApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::TermsOfServiceApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terms_of_service_get**](TermsOfServiceApi.md#terms_of_service_get) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


# **terms_of_service_get**
> TermsOfService terms_of_service_get(ad_account_id => $ad_account_id, include_html => $include_html, tos_type => $tos_type)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TermsOfServiceApi;
my $api_instance = WWW::OpenAPIClient::TermsOfServiceApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $include_html = false; # boolean | Return HTML in TOS text.
my $tos_type = "tos_type_example"; # string | Request type.

eval {
    my $result = $api_instance->terms_of_service_get(ad_account_id => $ad_account_id, include_html => $include_html, tos_type => $tos_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TermsOfServiceApi->terms_of_service_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **include_html** | **boolean**| Return HTML in TOS text. | [optional] [default to false]
 **tos_type** | **string**| Request type. | [optional] 

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

