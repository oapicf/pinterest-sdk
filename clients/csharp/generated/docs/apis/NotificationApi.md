# Org.OpenAPITools.Api.NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**NotificationPost**](NotificationApi.md#notificationpost) | **POST** /notifications | Receive notifications from external partners. |

<a id="notificationpost"></a>
# **NotificationPost**
> NotificationResponse NotificationPost (NotificationPostRequest notificationPostRequest)

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **notificationPostRequest** | [**NotificationPostRequest**](NotificationPostRequest.md) | notification event. |  |

### Return type

[**NotificationResponse**](NotificationResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully received notification |  -  |
| **400** | Invalid request parameter. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

