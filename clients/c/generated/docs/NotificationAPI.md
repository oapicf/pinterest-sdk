# NotificationAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**NotificationAPI_notificationPost**](NotificationAPI.md#NotificationAPI_notificationPost) | **POST** /notifications | Receive notifications from external partners.


# **NotificationAPI_notificationPost**
```c
// Receive notifications from external partners.
//
// Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.
//
notification_response_t* NotificationAPI_notificationPost(apiClient_t *apiClient, notification_post_request_t *notification_post_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**notification_post_request** | **[notification_post_request_t](notification_post_request.md) \*** |  | 

### Return type

[notification_response_t](notification_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

