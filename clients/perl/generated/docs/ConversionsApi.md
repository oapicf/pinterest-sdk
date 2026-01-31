# WWW::OpenAPIClient::ConversionsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ConversionsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_defined_events_get**](ConversionsApi.md#advertiser_defined_events_get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events


# **advertiser_defined_events_get**
> AdvertiserDefinedEventsResponse advertiser_defined_events_get(ad_account_id => $ad_account_id)

Get advertiser defined events

<p>Get advertiser defined events for the given ad account.</p>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConversionsApi;
my $api_instance = WWW::OpenAPIClient::ConversionsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->advertiser_defined_events_get(ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionsApi->advertiser_defined_events_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**AdvertiserDefinedEventsResponse**](AdvertiserDefinedEventsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

