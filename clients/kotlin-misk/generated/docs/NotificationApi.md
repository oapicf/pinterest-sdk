# NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationPost**](NotificationApi.md#notificationPost) | **Post** /notifications | Receive notifications from external partners.


<a name="notificationPost"></a>
# **notificationPost**
> NotificationResponse notificationPost(notificationPostRequest)

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = NotificationApi()
val notificationPostRequest : NotificationPostRequest =  // NotificationPostRequest | 
try {
    val result : NotificationResponse = apiInstance.notificationPost(notificationPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationApi#notificationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationApi#notificationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationPostRequest** | [**NotificationPostRequest**](NotificationPostRequest.md)|  |

### Return type

[**NotificationResponse**](NotificationResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

