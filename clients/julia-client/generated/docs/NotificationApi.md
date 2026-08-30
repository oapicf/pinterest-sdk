# NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notification_post**](NotificationApi.md#notification_post) | **POST** /notifications | Receive notifications from external partners.


# **notification_post**
> `notification_post`(_api::`NotificationApi`, `notification_post_request`::`NotificationPostRequest`; _mediaType=nothing) -> `NotificationResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `notification_post`(_api::`NotificationApi`, response_stream::`Channel`, `notification_post_request`::`NotificationPostRequest`; _mediaType=nothing) -> `Channel`{ `NotificationResponse` }, `OpenAPI.Clients.ApiResponse`

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`NotificationApi`** | API context | 
**`notification_post_request`** | [**`NotificationPostRequest`**](NotificationPostRequest.md) |  |

### Return type

[**`NotificationResponse`**](NotificationResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

