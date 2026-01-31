# NotificationController

All URIs are relative to `"/v5"`

The controller class is defined in **[NotificationController.java](../../src/main/java/org/openapitools/controller/NotificationController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationPost**](#notificationPost) | **POST** /notifications | Receive notifications from external partners.

<a id="notificationPost"></a>
# **notificationPost**
```java
Mono<NotificationResponse> NotificationController.notificationPost(notificationPostRequest)
```

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**notificationPostRequest** | [**NotificationPostRequest**](../../docs/models/NotificationPostRequest.md) | notification event. |

### Return type
[**NotificationResponse**](../../docs/models/NotificationResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `user_accounts:read`
* **client_credentials**, scopes: `user_accounts:read`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

