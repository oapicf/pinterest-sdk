# \NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notification_slash_post**](NotificationApi.md#notification_slash_post) | **POST** /notifications | Receive notifications from external partners.



## notification_slash_post

> models::NotificationResponse notification_slash_post(notification_post_request)
Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**notification_post_request** | Option<[**NotificationPostRequest**](NotificationPostRequest.md)> |  | [required] |

### Return type

[**models::NotificationResponse**](NotificationResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

