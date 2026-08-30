# WWW::OpenAPIClient::ConversionsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ConversionsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_defined_events_create**](ConversionsApi.md#advertiser_defined_events_create) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**advertiser_defined_events_delete**](ConversionsApi.md#advertiser_defined_events_delete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**advertiser_defined_events_get**](ConversionsApi.md#advertiser_defined_events_get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**advertiser_defined_events_update**](ConversionsApi.md#advertiser_defined_events_update) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


# **advertiser_defined_events_create**
> AdvertiserDefinedEventsCreate200Response advertiser_defined_events_create(ad_account_id => $ad_account_id, advertiser_defined_events_create_request => $advertiser_defined_events_create_request)

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

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
my $advertiser_defined_events_create_request = WWW::OpenAPIClient::Object::AdvertiserDefinedEventsCreateRequest->new(); # AdvertiserDefinedEventsCreateRequest | 

eval {
    my $result = $api_instance->advertiser_defined_events_create(ad_account_id => $ad_account_id, advertiser_defined_events_create_request => $advertiser_defined_events_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionsApi->advertiser_defined_events_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events_delete**
> AdvertiserDefinedEventsCreate200Response advertiser_defined_events_delete(ad_account_id => $ad_account_id, event_names => $event_names)

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

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
my $event_names = [("null")]; # ARRAY[string] | List of event names to delete

eval {
    my $result = $api_instance->advertiser_defined_events_delete(ad_account_id => $ad_account_id, event_names => $event_names);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionsApi->advertiser_defined_events_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **event_names** | [**ARRAY[string]**](string.md)| List of event names to delete | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events_get**
> AdvertiserDefinedEventsGet200Response advertiser_defined_events_get(ad_account_id => $ad_account_id)

Get advertiser defined events

Get advertiser defined events for the given ad account.

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

[**AdvertiserDefinedEventsGet200Response**](AdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events_update**
> AdvertiserDefinedEventsCreate200Response advertiser_defined_events_update(ad_account_id => $ad_account_id, advertiser_defined_events_create_request => $advertiser_defined_events_create_request)

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

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
my $advertiser_defined_events_create_request = WWW::OpenAPIClient::Object::AdvertiserDefinedEventsCreateRequest->new(); # AdvertiserDefinedEventsCreateRequest | 

eval {
    my $result = $api_instance->advertiser_defined_events_update(ad_account_id => $ad_account_id, advertiser_defined_events_create_request => $advertiser_defined_events_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionsApi->advertiser_defined_events_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

