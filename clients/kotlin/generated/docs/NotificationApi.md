# NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**notificationPost**](NotificationApi.md#notificationPost) | **POST** /notifications | Receive notifications from external partners. |


<a id="notificationPost"></a>
# **notificationPost**
> NotificationResponse notificationPost(notificationPostRequest)

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **notificationPostRequest** | [**NotificationPostRequest**](NotificationPostRequest.md)|  | |

### Return type

[**NotificationResponse**](NotificationResponse.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

