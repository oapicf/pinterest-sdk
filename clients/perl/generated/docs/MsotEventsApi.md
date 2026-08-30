# WWW::OpenAPIClient::MsotEventsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::MsotEventsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**msot_events_create**](MsotEventsApi.md#msot_events_create) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events


# **msot_events_create**
> msot_events_create(ad_account_id => $ad_account_id, conversion_msot_events_create => $conversion_msot_events_create)

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MsotEventsApi;
my $api_instance = WWW::OpenAPIClient::MsotEventsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $conversion_msot_events_create = WWW::OpenAPIClient::Object::ConversionMSOTEventsCreate->new(); # ConversionMSOTEventsCreate | 

eval {
    $api_instance->msot_events_create(ad_account_id => $ad_account_id, conversion_msot_events_create => $conversion_msot_events_create);
};
if ($@) {
    warn "Exception when calling MsotEventsApi->msot_events_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **conversion_msot_events_create** | [**ConversionMSOTEventsCreate**](ConversionMSOTEventsCreate.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

