# NotificationAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationPost**](NotificationAPI.md#notificationpost) | **POST** /notifications | Receive notifications from external partners.


# **notificationPost**
```swift
    open class func notificationPost(notificationPostRequest: NotificationPostRequest, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> NotificationResponse
```

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let notificationPostRequest = NotificationPostRequest() // NotificationPostRequest | 

// Receive notifications from external partners.
do {
    let response = try await NotificationAPI.notificationPost(notificationPostRequest: notificationPostRequest)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationPostRequest** | [**NotificationPostRequest**](NotificationPostRequest.md) |  | 

### Return type

[**NotificationResponse**](NotificationResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

