# NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notification/post**](NotificationApi.md#notification/post) | **POST** /notifications | Receive notifications from external partners. |


<a name="notification/post"></a>
# **notification/post**
> NotificationResponse notification/post(NotificationPostRequest)

Receive notifications from external partners.

    Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **NotificationPostRequest** | [**NotificationPostRequest**](../Models/NotificationPostRequest.md)|  | |

### Return type

[**NotificationResponse**](../Models/NotificationResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

