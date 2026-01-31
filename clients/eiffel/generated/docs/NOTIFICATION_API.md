# NOTIFICATION_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**notification_post**](NOTIFICATION_API.md#notification_post) | **Post** /notifications | Receive notifications from external partners.


# **notification_post**
> notification_post (notification_post_request: NOTIFICATION_POST_REQUEST ): detachable NOTIFICATION_RESPONSE


Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_post_request** | [**NOTIFICATION_POST_REQUEST**](NOTIFICATION_POST_REQUEST.md)| notification event. | 

### Return type

[**NOTIFICATION_RESPONSE**](NotificationResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

