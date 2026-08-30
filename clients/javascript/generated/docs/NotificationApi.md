# PinterestSdk.NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationPost**](NotificationApi.md#notificationPost) | **POST** /notifications | Receive notifications from external partners.



## notificationPost

> NotificationResponse notificationPost(notificationPostRequest)

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';
// Configure OAuth2 access token for authorization: client_credentials
let client_credentials = defaultClient.authentications['client_credentials'];
client_credentials.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.NotificationApi();
let notificationPostRequest = new PinterestSdk.NotificationPostRequest(); // NotificationPostRequest | 
apiInstance.notificationPost(notificationPostRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

- **Content-Type**: application/json
- **Accept**: application/json

