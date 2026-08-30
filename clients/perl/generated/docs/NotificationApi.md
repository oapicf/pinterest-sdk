# WWW::OpenAPIClient::NotificationApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::NotificationApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notification_post**](NotificationApi.md#notification_post) | **POST** /notifications | Receive notifications from external partners.


# **notification_post**
> NotificationResponse notification_post(notification_post_request => $notification_post_request)

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::NotificationApi;
my $api_instance = WWW::OpenAPIClient::NotificationApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $notification_post_request = WWW::OpenAPIClient::Object::NotificationPostRequest->new(); # NotificationPostRequest | 

eval {
    my $result = $api_instance->notification_post(notification_post_request => $notification_post_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling NotificationApi->notification_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_post_request** | [**NotificationPostRequest**](NotificationPostRequest.md)|  | 

### Return type

[**NotificationResponse**](NotificationResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

